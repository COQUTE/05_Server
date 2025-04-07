package edu.kh.jsp2.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.kh.jsp2.dto.Book;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/book/list")
public class BookServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 요청 처리
		
		// Book으로 타입이 제한된 List 생성
		List<Book> bookList = new ArrayList<Book>();
		
		// bookList에 데이터 추가(Service <-> DAO <-> DB)
		bookList.add(new Book("자바란 무엇인가", "둘리", 10000));
		bookList.add(new Book("HTML란 무엇인가", "이완용", 20000));
		bookList.add(new Book("CSS란 무엇인가", "이순신", 40000));
		bookList.add(new Book("JS란 무엇인가", "권율", 30000));
		bookList.add(new Book("Servlet이란 무엇인가", "홍길동", 60000));
		bookList.add(new Book("JSP란 무엇인가", "홍범도", 80000));
		bookList.add(new Book("Spring란 무엇인가", "윤봉길", 70000));
		
		// bookList를 요청 위임된 JSP에서도 유지하여 사용할 수 있도록
		// request scopre 객체에 속성으로 추가(세팅)
		req.setAttribute("bookList", bookList);
		
		// 응답 처리
		// JSP로 요청 위임 (webapp 폴더 기준)
		req.getRequestDispatcher("/WEB-INF/views/book/bookList.jsp").forward(req, resp);
		
	}
}
