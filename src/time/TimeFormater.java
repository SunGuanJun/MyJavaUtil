package time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ��ʽ��ʱ��
 * 
 * @author hzsunguanjun
 *
 */
public class TimeFormater {
	
	/**
	 * 
	 * @param time ʱ�����������int
	 * @return 
	 */
	public static String format(int time){
		Date date = new Date();
		int currentTime = (int) (date.getTime() / 1000);
		int delta = currentTime - time;
		String res = null;
		if (delta < 60){ //deltaС��60�루1���ӣ�
			res = "�ո�";
		}
		else if (delta < 3600){ //deltaС��3600�루1Сʱ��
			delta /= 60;	//delta��Ϊ����
			res = delta + "����ǰ";
		}
		else if (delta < 1440){ //deltaС��1440���� ��1�죬24Сʱ��
			delta /= 60;
			res = delta + "Сʱǰ";
		}
		else{
			Date d1 = new Date((long)time * 1000);
			SimpleDateFormat df = new SimpleDateFormat("MM-dd HH:mm:ss");
			res = df.format(d1);
		}
		return res;
	}
}
	
