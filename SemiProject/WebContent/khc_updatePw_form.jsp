<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<%
	response.setContentType("text/html; charset=UTF-8");
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/KHC.css">
<title>PW 찾기</title>
</head>
<!-- 부트스트랩이 선언되기전에 jquery가 선언되어야한다. -->
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<link rel="stylesheet"
	href="css/bootstrap.min.css">
<link rel="stylesheet"
	href="css/bootstrap-theme.min.css">
<script
	src="js/bootstrap.min.js"></script>
	
	<script type="text/javascript">
	function PwSameCheck(PW){
		var pw = document.getElementById("pw").value;
		var pw_check = document.getElementById("pw_check").value;
		/* alert(pw);
		alert(pw_check); */
		
		if(pw != pw_check){
			//alert("비밀번호가 일치하지 않습니다.");
			document.getElementById("notsame").innerHTML = "비밀번호가 일치하지 않습니다.";
			return false;
		}else if(pw = pw_check){
			location.href="khc_updatePw_result.jsp";
			return true;
		}
	}
	</script>
<body>

	<div class="layout-container">
		<div id="main">
			<!-- sidebar를 include해준다. -->
			<jsp:include page="sidebar.jsp" />
			<div class="form">
				<h2>비밀번호변경</h2>
			</div>
			<div class="container" >
				<div class="col-lg-4"></div>
				<div class="col-lg-4"></div>
				<div class="jumbotron" style="padding-top: 20px;">
					<h3 style="text-align: center">비밀번호 변경</h3>
<!-- 					<form method="post" onsubmit="return PwSameCheck()"> -->
						<form action="controller.do?category=update_pw" method="post" onsubmit="return PwSameCheck()">
					
						<input type="hidden" id="user_email" name="user_email" value="${user_email }">
						<input type="password" class="form-control" name="user_pw" id="pw" placeholder="변경할 비밀번호" >
						<input type="password" class="form-control" id="pw_check" placeholder="변경할 비밀번호 재입력" >
						<p id="notsame" style="color:red;"></p>
						<input type="submit" class="btn btn-primary form-control" value="비밀번호 변경">
					</form>
				</div>
			</div>
			
			<footer class="footer">Team.진선이와 아이들 1, 2, 3, 4, 5, 6 </footer>
		</div>
	</div>

	<div id="pasingInfo" style="text-align: center;"></div>
	<br>
	<script type="text/javascript" src="js/search.js"></script>
	<script type="text/javascript" src="js/pasing.js"></script>
	<hr>
</body>
</html>