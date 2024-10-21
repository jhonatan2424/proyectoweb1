package com.unu.proyectoweb1.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;


import org.apache.tomcat.util.modeler.modules.ModelerSource;

import com.unu.proyectoweb1.beans.Autor;
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
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	if(request.getParameter("op")==null) {
    		listar(request,response); 
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
    
    private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	request.setAttribute("listaAutores", modelo.listarAutores());
    	Iterator<Autor>it=modelo.listarAutores().iterator();
    	while (it.hasNext()) {
			Autor a=it.next();
			System.out.println(a.getIdAutor()+" "+a.getNacionalidad()+" "+a.getNombre());
			
		}
		request.getRequestDispatcher("/autores/listaAutores.jsp").forward(request, response);
    	/*try {
    		request.setAttribute("listaAutores", modelo.listarAutores());
    		request.getRequestDispatcher("/autores/listaAutores.jsp");
		} catch (ServletException | IOException ex) {
			// TODO: handle exception
			Logger.getLogger(AutoresController.class.getName()).log(Level.SEVERE,null,ex);
		}*/
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
