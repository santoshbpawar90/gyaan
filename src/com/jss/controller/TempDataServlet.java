package com.jss.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jss.db.TempDataModel;
import com.jss.entity.TempData;

/**
 * Servlet implementation class TempDataServlet
 */
public class TempDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TempDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		proccessRequest(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		proccessRequest(request,response);
	}
	
	protected void proccessRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String subject="";
		 String body="";
		 String author="";
		 String imgURL="";
		 String email="";
		 
		 
		 if(request.getParameter("txtSubject")!=null && !request.getParameter("txtSubject").equalsIgnoreCase(""))
		 {
			 subject =request.getParameter("txtSubject").trim();
		 }
		 
		 if(request.getParameter("txtBody")!=null && !request.getParameter("txtBody").equalsIgnoreCase(""))
		 {
			 body =request.getParameter("txtBody").trim();
		 }
		 
		 if(request.getParameter("txtAuthor")!=null && !request.getParameter("txtAuthor").equalsIgnoreCase(""))
		 {
			 author =request.getParameter("txtAuthor").trim();
		 }
		 
		 if(request.getParameter("txtImage")!=null && !request.getParameter("txtImage").equalsIgnoreCase(""))
		 {
			 imgURL =request.getParameter("txtImage").trim();
		 }
		 
		 if(request.getParameter("txtEmail")!=null && !request.getParameter("txtEmail").equalsIgnoreCase(""))
		 {
			 email =request.getParameter("txtEmail").trim();
		 }
		 
		 	
		TempData tempData=new TempData();
		TempDataModel tempDataModel=new TempDataModel();
		
		
		tempData.setSubject(subject);
		tempData.setAuthor(author);
		tempData.setBody(body);
		tempData.setImgURL(imgURL);
		tempData.setEmail(email);
		
		tempDataModel.addData(tempData);
		
		response.sendRedirect("index.jsp");

		
	}


}
