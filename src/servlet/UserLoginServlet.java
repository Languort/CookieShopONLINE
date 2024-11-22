package servlet;


import model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.UserService;

import java.io.IOException;


@WebServlet(name = "user_servlet",urlPatterns = "/user_login")
public class UserLoginServlet extends HttpServlet {
    private UserService uService = new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ue = request.getParameter("ue");
        String password = request.getParameter("password");
        User user = uService.login(ue,password);
        if(user != null){
            request.setAttribute("failMsg","用户名邮箱密码有个输错了请重新输入");
            request.getRequestDispatcher("/user_login.jsp").forward(request,response);
        }else {
            request.getSession().setAttribute("user",user);
            request.getRequestDispatcher("/user_login.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
}
