package com.baojuan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.baojuan.pojo.Flower;
import com.baojuan.service.FlowerService;
import com.baojuan.service.imp.FlowerServiceImp;
@WebServlet("/insert")
public class insertServlet extends HttpServlet {
	private FlowerService flowerservice = new FlowerServiceImp();

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		String num = req.getParameter("num");
		Flower flower = new Flower();
		flower.setName(name);
		flower.setPrice(price);
		flower.setNum(Integer.parseInt(num));
		int index = flowerservice.add(flower);
		if (index > 0) {
			res.sendRedirect("show");
		} else {
			res.sendRedirect("add.jsp");
		}
	};
}
