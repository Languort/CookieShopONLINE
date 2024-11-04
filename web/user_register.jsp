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
            <c:if test="${!empty msg}">
                <div class="alert alert-danger">${msg}</div>
            </c:if>
            <form action="/user_register.jsp" method="post">
                <div class="register-top-grid">
                    <h3>注册新用户</h3>
                    <div class="input">
                        <span>用户名<label style="color:red">*</label></span>
                        <input type="text" name="username" placeholder="请输入用户名" required="required">
                    </div>

                    <div>
                        <span>邮箱<label style="color:red">*</label> </span>
                        <input type="text" name="email" placeholder="请输入邮箱" required="required">
                    </div>
       
                    <div>
                        <span>密码<label style="color:red">*</label> </span>
                        <input type="password" name="password" placeholder="请输入密码" required="required">
                    </div>

                    <div>
                        <span>收货人<label style="color:red">*</label> </span>
                        <input type="text" name="name" placeholder="请输入收货人姓名" required="required">
                    </div>

                    <div>
                        <span>收货电话<label style="color:red">*</label> </span>
                        <input type="text" name="phone" placeholder="请输入收货电话" required="required">
                    </div>

                    <div>
                        <span>收货地址<label style="color:red">*</label> </span>
                        <input type="text" name="address" placeholder="请输入收货地址" required="required">
                    </div>

                    <div class="register-but text-center">
                        <input type="submit" value="提交">
                        <div class="clearfix"></div>
                    </div>

                </div>
            </form>

            <div class="clearfix"></div>


        </div>
    </div>
</div>






</body>
</html>
