package com.project.accountbook.user.member;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.accountbook.user.member.repository.MemberInfoDAO;
import com.project.accountbook.user.model.UserDTO;

@WebServlet("/user/member/edit-info.do")
public class EditInfo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/user/member/edit-info.jsp");
		dispatcher.forward(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
	    String id = (String) session.getAttribute("id"); 
	    
	    String name = req.getParameter("name");
	    String nickname = req.getParameter("nickname");
	    String phonenumber = req.getParameter("phonenumber");
	    String ssn = req.getParameter("ssn");
	    
	   
	    HashMap<String, String> map = new HashMap<>();
	    MemberInfoDAO dao = new MemberInfoDAO();
	    UserDTO dto = new UserDTO();
	    
	    String beforePhoneNumber = dao.getPhoneNumber(id);

	    if (name != null && !name.isEmpty()) {
	    	map.put("name", name);
	    }

	    if (nickname != null && !nickname.isEmpty()) {
	    	map.put("nickname", nickname);
	    }

	    if (phonenumber != null && !phonenumber.isEmpty()) {
	    	
	    	String newPhoneNumber = phonenumber;
	    	boolean isPhoneNumberUnique = dao.isPhoneNumberUnique(newPhoneNumber, id);
	        
	        if (isPhoneNumberUnique) {
	            map.put("phonenumber", newPhoneNumber);
	        } else {
	            System.out.println("중복된 전화번호가 있습니다.");
	            map.put("phonenumber", beforePhoneNumber);
	        }
	    } else {
	    	map.put("phonenumber", beforePhoneNumber);
	    }
	    
	    if (ssn != null && !ssn.isEmpty()) {
	    	map.put("ssn", ssn);
	    }

	    // DAO를 사용하여 업데이트 수행
	    dao = new MemberInfoDAO();
	    dao.updateUserInfo(id, map);
	    
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/user/member/info.jsp");
		dispatcher.forward(req, resp);

	}

	

}
