package string;

/**]
 * 在系统开发中，有时会将多个图片url放在一个数据库字段中，用";"隔开，
 * 这个方法用来分隔以及合并url
 * @author hzsunguanjun
 *
 */
public class UrlFormater {
	public static void main(String[] args){
		String url = "aaa.jpg;bbb.jpg;ssss.jpg";
		String[] urlArray = spiltUrls(url);
		System.out.println(urlArray[1]);
		String urlb = mergeUrls(urlArray);
		System.out.println(urlb);
	}
	
	//将用分号隔开的一个字符串转换成一个String数组
	public static String[] spiltUrls(String urls){
		if (urls == null){
			return null;
		}
		else{
			String[] urlArray = urls.split(";");
			return urlArray;
		}
	}
	
	//将一个String[]转换成一个用分号隔开的字符串
	public static String mergeUrls(String[] urlArray){
		if (urlArray == null){
			return null;
		}
		else{
			int len = urlArray.length;
			StringBuffer sb = new StringBuffer();
			for (int i=0; i<len; i++){
				if (urlArray[i] != null && !urlArray[i].equals("")){
					sb.append(urlArray[i]);
				}
				if (i < len-1){
					sb.append(";");
				}
			}
			return new String(sb);
		}
	}
}
