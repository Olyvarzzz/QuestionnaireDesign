package com.questionnaire.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.questionnaire.bean.Questionnaire;
import com.questionnaire.bean.RegClass;
import com.questionnaire.dao.ClassDao;
import com.questionnaire.dao.QuestionnaireDao;


@WebServlet("/DeleteQuestionnaireByIdServlet")
public class DeleteQuestionnaireByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteQuestionnaireByIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int id=Integer.parseInt(request.getParameter("id"));
		Questionnaire que=new Questionnaire();
		QuestionnaireDao qDao=new QuestionnaireDao();
		que.setId(id);
		qDao.deleteQuestionnaireById(que);
		response.sendRedirect("QuestionnaireManageServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
