package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService;
import service.UserServiceImpl;


@WebServlet({"/index.html","/user/*"})
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UserService userService;
   
    public UserController() {
        super();
        userService = UserServiceImpl.sharedInstance();
   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//공통된 부분을 제거한 주소를 만든다.
		String contextPath = request.getContextPath();
		String requestURI = request.getRequestURI();
		String command = requestURI.substring(contextPath.length());		
		
		String method = request.getMethod();
		
		//요청을 맞게 작성했는지 확인
		//완성되면 주석 처리
		System.out.println("요청주소:" + command);
		
		if(command.equals("/index.html")) {
			response.sendRedirect("./");
		//단순 페이지 이동은 포워딩
		}else if(command.equals("/user/main")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("../resources/member/main.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/user/join")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("../resources/member/join.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/user/login")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("../resources/member/login.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/user/find")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("../resources/member/finduserpw.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/user/useridcheck")) {
			//System.out.println("요청 도달");
			userService.useridCheck(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher("../resources/member/useridcheck.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/user/usernicknamecheck")) {
			userService.usernicknameCheck(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher("../resources/member/usernicknamecheck.jsp");
			dispatcher.forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
