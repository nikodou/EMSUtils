# EMSUtils
快递100查询接口
/**
 * 快递100查询接口
 * @author nikodou
 * @emil shampoo_dou@163.com
 * types 快递物流的类型 如：申通 -> shentong
 * postid  快递物流编码  
 */
	public static void main(String[] args) throws IOException {
		EMSUtils util = new EMSUtils();
		String type="shentong";
		String postId = "3378237498354";
		String info = util.getEmsMethod(type, postId);
		System.out.println(info);
		
	}
  
  //返回参数 并解析即可
  {"message":"ok","nu":"3378237498354","ischeck":"1","condition":"F00","com":"shentong","status":"200","state":"3","data":[{"time":"2018-10-05 12:46:15","ftime":"2018-10-05 12:46:15","context":"前台签收-已签收","location":""},{"time":"2018-10-05 10:18:42","ftime":"2018-10-05 10:18:42","context":"浙江温岭公司-牧屿马家(15557680611,)-派件中","location":""},{"time":"2018-10-05 07:35:31","ftime":"2018-10-05 07:35:31","context":"已到达-浙江温岭公司","location":""},{"time":"2018-10-04 23:44:44","ftime":"2018-10-04 23:44:44","context":"浙江临海转运中心-已装袋发往-浙江温岭公司","location":""},{"time":"2018-10-03 23:53:10","ftime":"2018-10-03 23:53:10","context":"广东深圳罗湖中转部-已装袋发往-浙江临海中转部","location":""},{"time":"2018-10-03 22:22:55","ftime":"2018-10-03 22:22:55","context":"广东龙岗公司-已进行装袋扫描","location":""},{"time":"2018-10-03 22:22:54","ftime":"2018-10-03 22:22:54","context":"广东龙岗公司-已发往-浙江临海中转部","location":""},{"time":"2018-10-03 19:59:10","ftime":"2018-10-03 19:59:10","context":"平湖营业点-莫佳旺(18126234487,18776828445)-已收件","location":""},{"time":"2018-10-03 17:29:23","ftime":"2018-10-03 17:29:23","context":"平湖营业点-莫佳旺(18126234487,18776828445)-已收件","location":""}]}
