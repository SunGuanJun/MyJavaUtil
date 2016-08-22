package web;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * �ڿ���web��Ŀ�У��������õ�Json���ݣ����������������������Json�ַ���
 * ʹ��ʱ��Ҫ������Ӧ��jar��
 * 
 * @author hzsunguanjun
 *
 */
public class JsonPrinter {
	//�������Json����
	public static void print(HttpServletResponse response, String jsonStr){
		PrintWriter out = null;
		try {
			response.setHeader("Cache-Control", "no-cache");
			response.setContentType("text/json;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			out = response.getWriter();
			out.write(jsonStr);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (out != null)
				out.close();
		}
	}
	
	//�������Json����
	public static void print(HttpServletResponse response, Map<String, Object> gsonMap){
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonStr = gson.toJson(gsonMap);
		
		PrintWriter out = null;
		try {
			response.setHeader("Cache-Control", "no-cache");
			response.setContentType("text/json;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			out = response.getWriter();
			out.write(jsonStr);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (out != null)
				out.close();
		}
	}
}
