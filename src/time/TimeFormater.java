package time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 格式化时间
 * 
 * @author hzsunguanjun
 *
 */
public class TimeFormater {
	
	/**
	 * 
	 * @param time 时间戳，秒数，int
	 * @return 
	 */
	public static String format(int time){
		Date date = new Date();
		int currentTime = (int) (date.getTime() / 1000);
		int delta = currentTime - time;
		String res = null;
		if (delta < 60){ //delta小于60秒（1分钟）
			res = "刚刚";
		}
		else if (delta < 3600){ //delta小于3600秒（1小时）
			delta /= 60;	//delta变为分钟
			res = delta + "分钟前";
		}
		else if (delta < 1440){ //delta小于1440分钟 （1天，24小时）
			delta /= 60;
			res = delta + "小时前";
		}
		else{
			Date d1 = new Date((long)time * 1000);
			SimpleDateFormat df = new SimpleDateFormat("MM-dd HH:mm:ss");
			res = df.format(d1);
		}
		return res;
	}
}
	
