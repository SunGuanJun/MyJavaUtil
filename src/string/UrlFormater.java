package string;

/**]
 * ��ϵͳ�����У���ʱ�Ὣ���ͼƬurl����һ�����ݿ��ֶ��У���";"������
 * ������������ָ��Լ��ϲ�url
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
	
	//���÷ֺŸ�����һ���ַ���ת����һ��String����
	public static String[] spiltUrls(String urls){
		if (urls == null){
			return null;
		}
		else{
			String[] urlArray = urls.split(";");
			return urlArray;
		}
	}
	
	//��һ��String[]ת����һ���÷ֺŸ������ַ���
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
