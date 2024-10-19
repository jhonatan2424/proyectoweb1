package com.unu.proyectoweb1.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.apache.tomcat.util.modeler.modules.ModelerSource;

import com.unu.proyectoweb1.models.Autoresmodel;

/**
 * Servlet implementation class AutoresController
 */
public class AutoresController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Autoresmodel modelo=new Autoresmodel();	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutoresController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
    	if(request.getParameter("op")==null) {
    		//Listar 
    		return;
    	}
    	String operacion=request.getParameter("op");
    	switch (operacion) {
    		
    	case "listar":
    		listar(request,response);
    		break;
    		
    	case "nuevo":
    		//nuevo()
    		break;
    	}
    }
    
    private void listar(HttpServletRequest request, HttpServletResponse response) {
    	request.setAttribute("listaAutores", modelo.listarAutores());
		request.getRequestDispatcher("/autores/listaAutores.jsp");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
