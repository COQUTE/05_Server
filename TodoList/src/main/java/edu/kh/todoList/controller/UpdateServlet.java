package edu.kh.todoList.controller;

import java.io.IOException;
import java.util.List;

import edu.kh.todoList.model.service.TodoListService;
import edu.kh.todoList.model.service.TodoListServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/todo/update")
public class UpdateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			TodoListService service = new TodoListServiceImpl();
			
			int todoNo = Integer.parseInt(req.getParameter("todoNo"));
			
			List<String> content = service.todoUpdate(todoNo);
			
			req.setAttribute("title", content.get(0));
			req.setAttribute("content", content.get(1));
			
			req.getRequestDispatcher("/WEB-INF/views/update.jsp").forward(req, resp);

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
