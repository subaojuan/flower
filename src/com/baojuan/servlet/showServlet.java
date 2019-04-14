package com.baojuan.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.baojuan.pojo.Flower;
import com.baojuan.service.FlowerService;
import com.baojuan.service.imp.FlowerServiceImp;

@WebServlet("/show")
public class showServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FlowerService flowerservice = new FlowerServiceImp();

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		List<Flower> list = flowerservice.show();
		req.setAttribute("list", list);
		req.getRequestDispatcher("/index.jsp").forward(req, res);
	}

}
