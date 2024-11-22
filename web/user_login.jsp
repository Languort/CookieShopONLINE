<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录页面</title>
</head>
<body>


<%--header--%>
<jsp:include page="header.jsp">
    <jsp:param name="flag" value="9"/>
</jsp:include>

<div class="account">
    <div class="container">
        <div class="register">
            <c:if test="${!empty msg}">
                <div class="alert alert-success">${msg}</div>
            </c:if>
            <c:if test="${!empty failMsg}">
                <div class="alert alert-danger">${failMsg}</div>
            </c:if>

            <form action="/user_login.jsp" method="post">
                <div class="register-top-grid"></div>
                <h3>用户登录</h3>
                <div class="input">
                    <span>用户名/邮箱 <label style="color:red;">*</label> </span>
                    <input type="text" name="ue" placeholder="请输入用户名" required="required">
                </div>
                <div class="input">
                    <span>密码 <label style="color:red;">*</label></span>
                    <input type="password" name="password" placeholder="请输入密码" required="required">
                </div>


                <div class="clearfix"></div>

                <div class="register-but text-center">
                    <input type="submit" value="提交">
                    <div class="clearfix"></div>
                </div>
            </form>
        </div>
    </div>
</div>
<%--//account--%>

<%--footer--%>
<jsp:include page="footer.jsp"></jsp:include>
<%--//footer--%>
</body>
</html>
