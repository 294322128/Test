package com.it.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userServlet
 */
@WebServlet({ "/userServlet", "/user.do" })
public class userServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		String opt=request.getParameter("opt");
		String user_id=request.getParameter("user_id");
		if("check".equals(opt)){
			String flag="0";
			if("admin".equals(user_id)){
				flag="1";
			}
			out.print(flag);
		}
		if("login".equals(opt)){
			String user_pwd=request.getParameter("user_pwd");
			StringBuffer strbuff=new StringBuffer();
			if("admin".equals(user_id) && "admin".equals(user_pwd)){
				
				strbuff.append("{");
				strbuff.append("user_id:'admin',");
				strbuff.append("user_pwd:'admin'");
				strbuff.append("}");
			}else{
				strbuff.append("1");
			}
			out.print(strbuff);
		}
	}

}
