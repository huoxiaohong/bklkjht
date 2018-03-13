<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>添加用户</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!-- 
    <link rel="stylesheet" type="text/css" href="styles.css"> 
    -->
<!-- 引入jQuery文件 -->
<script src="/ssmpo/js/jquery-1.11.2.min.js" language="javascript"></script>
<script type="text/javascript">  
    // 控制onsubmit提交的方法，方法名是vform()  
        function vform(){  
            //获取下面的id值  
            var ln = $("#id").val();  
            var lp = $("#businessID").val();  
            var un = $("#businessNameame").val();  
            var up = $("#businessPhone").val();  
            var bir = $("#BusinessAddress").val();  
            var bir = $("#logo").val();
            var bir = $("#businessIntroduce").val();
            //判断上面的变量，如果为空字符串不能提交  
            if(ln == ""){  
                alert("请输入登录名！");  
                return false;  
            }  
            if(lp == ""){  
                alert("请输入密码！");  
                return false;  
            }  
            if(un == ""){  
                alert("请输入用户名！");  
                return false;  
            }  
            if(up == -1){  
                alert("请选择权限！");  
                return false;  
            }  
            if(bir == ""){  
                alert("请输入生日！");  
                return false;  
            }             
            //除以上结果的可以提交，返回true  
            return true;  
        }  
    </script>

</head>

<body>
	<!-- 用onsubmit调用上面的方法 -->
	<form action="uc/insert" method="post" onsubmit="return vform()">
		<table width="1000" border="1">
			<tr>
				<th>序号</th>
				<th>商家ID</th>
				<th>商家名称</th>
				<th>商家电话</th>
				<th>商家地址</th>
				<th>商家logo</th>
				<th>商家简介</th>
			</tr>
			<tr>
				<td><input type="text" id="id" name="id" /></td>
				<td><input type="text" id="BusinessID" name="businessID" /></td>
				<td><input type="text" id="BusinessName" name="businessNameame" /></td>
				<td><input type="text" id="BusinessPhone" name="businessPhone" /></td>
				<td><input type="text" id="BusinessAddress"
					name="BusinessAddress" /></td>
				<td><input type="text" id="Logo" name="logo" /></td>
				<td><input type="text" id="BusinessIntroduce"
					name="businessIntroduce" /></td>
			</tr>
		</table>
		<input type="submit" value="提交"> ${inserUser }<br> <a
			href="uc/user">返回</a>
	</form>
</body>
</html>
