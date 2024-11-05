package servlet;

import service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@WebServlet(name = "user_register",urlPatterns = "/user_register")
public class UserRegisterServlet extends HttpServlet {

   private UserService uService = new UserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
         try {
             BeanUtils.copyProperties(user,request.getParameterMap());

         } catch (InvocationTargetException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         } catch (IllegalAccessException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }

         if (uService.register(user)){
             request.setAttribute("msg","注册成功");
             request.getRequestDispatcher("/user_login.jsp").forward(request,response);
         }
         else {
            request.setAttribute("msg","用户名或邮箱重复，请重新填写");
            request.getRequestDispatcher("/user_register.jsp").forward(request,response);
         }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}


}
