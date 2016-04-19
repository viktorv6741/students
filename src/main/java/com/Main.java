package com;

import com.models.StudentEntity;
import com.models.SubjectEntity;
import com.service.StudentService;
import com.service.SubjectService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("student.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("studentName");
        String surName = req.getParameter("studentSurName");
        String email = req.getParameter("studentEmail");
        String age = req.getParameter("studentAge");
        String course = req.getParameter("studentCourse");
        String phoneNumber = req.getParameter("studentPhoneNumber");


        StudentService studentService = new StudentService();
        List<StudentEntity> studentList = studentService.getStudents();
        studentService.addStudent(new StudentEntity(name, surName, age, course, phoneNumber, email));

        SubjectService subjectService = new SubjectService();
        List<SubjectEntity> subjectList = subjectService.getSubjects();

        req.setAttribute("students", studentList);
        req.setAttribute("subjects", subjectList);
        req.getRequestDispatcher("student.jsp").forward(req, resp);
    }
}
