<%--
  Created by IntelliJ IDEA.
  User: INC
  Date: 2024/11/4
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>用户注册</title>
    <meta name="viewport" content="width=device-width,initial-scale=1">

  </head>
  <body>

  <%--  header  --%>
    <jsp:include page="/header.jsp">
    <jsp:param name="flag" value="10"/>
    </jsp:include>
  <%--  //header--%>

  <%--  account--%>
  <div class="account">
    <div class="container">
      <div class="register">
        <c:if test="${msg}">
          <div class="alert alert-danger">${msg}</div>
        </c:if>
        <form action="/user_register.jsp" method="post">

        </form>


      </div>
    </div>
  </div>






  </body>
</html>
