package web;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 在开发web项目中，经常会用到Json数据，这两个方法可以用于输出Json字符串
 * 使用时需要引用相应的jar包
 * 
 * @author hzsunguanjun
 *
 */
public class JsonPrinter {
	//用于输出Json数组
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
	
	//用于输出Json数组
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
