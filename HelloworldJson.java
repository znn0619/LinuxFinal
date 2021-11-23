import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.google.gson.*;

public class HelloworldJson extends HttpServlet {

   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("application/json;charset=UTF-8");
      response.setCharacterEncoding("UTF-8");
      PrintWriter out = response.getWriter();
      Gson gson = new Gson();
      Student stu = new Student("ZhangNianNian","7190764169");
      String json = gson.toJson(stu);
      out.println(json);
      out.flush();
      out.close();
   }
}

class Student{
	private String name;
	private String stuId;
	
	public Student(String name, String stuId) {
		super();
		this.name = name;
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	
}
