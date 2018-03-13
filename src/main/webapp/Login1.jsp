<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="/user/userpicture" method="post" enctype="multipart/form-data">
          <input type="text" required="required" placeholder="用户名" name="userName">
          <input type="password" required="required" placeholder="密码" name="passWord">
          <input type="file" name = "imgFile">
          <div id="bt">
            <input class="but" type="submit" value="注册">
            <a href="register.jsp" rel="external nofollow" ><input class="but" type="button" value="返回登录"></a>
          </div>
        </form>
</body>
</html>