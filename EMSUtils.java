package com.base.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;
/**
 * 快递100查询接口
 * @author 豆香波
 * @emil shampoo_dou@163.com
 * types 快递物流的类型 如：申通 -> shentong
 * postid  快递物流编码  
 */
public class EMSUtils {

	public String  getEmsMethod(String types,String postid) throws IOException{
		 String content = null;
		try
		{
			URL url= new URL("http://www.kuaidi100.com/query?type="+types+"&postid="+postid);
			URLConnection con=url.openConnection();
			 con.setAllowUserInteraction(false);
			   InputStream urlStream = url.openStream();
			   String type = con.guessContentTypeFromStream(urlStream);
			   String charSet=null;
			   if (type == null)
			    type = con.getContentType();

			   if (type == null || type.trim().length() == 0 || type.trim().indexOf("text/html") < 0)
			    return null;

			   if(type.indexOf("charset=") > 0)
			    charSet = type.substring(type.indexOf("charset=") + 8);

			   byte b[] = new byte[10000];
			   int numRead = urlStream.read(b);
			  content = new String(b, 0, numRead);
			   while (numRead != -1) {
			    numRead = urlStream.read(b);
			    if (numRead != -1) {
			     //String newContent = new String(b, 0, numRead);
			     String newContent = new String(b, 0, numRead, charSet);
			     content += newContent;
			    }
			   }
			   urlStream.close();
			   return content;
		} catch (MalformedURLException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		return content;
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		EMSUtils util = new EMSUtils();
		String type="yunda";
		String postId = "3918421093450";
		String info = util.getEmsMethod(type, postId);
		System.out.println(info);
		
	}
}
