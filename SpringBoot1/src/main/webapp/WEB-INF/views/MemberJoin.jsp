<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<h1>회원가입</h1>
<form action="MemberJoin.do" method="post">

	<table>
		<caption>회원가입</caption>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id"></td>
			<td><button type="button" onclick="idCheck()">아이디 중복확인</button> </td>
		</tr>
		<!-- 중복확인메세지를 남길 행 -->
		<tr>
			<td colspan="2" id="idCheck"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="text" name="pw"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="회원가입"></td>
		</tr>
	</table>
</form>

<script type= "text/javascript">
<!-- select name from member where id = 사용자 입력 id -->
	function idCheck(){
		<!--1. 사용자가 입력한 id 가져오기 -->
		let id = $('input[name=id]').eq('0').val();
		console.log(id);
		<!--2. Ajax 비동기 통신으로 id 중복 체크하기 -->
		$.ajax({
			url : "IdCheck.do", /* 어디로 보낼지 */
			data :{/* 보낼 데이터 */
				id : id 
			},
			type : "get", /* get, post */
			dataType : "text", /* 응답 데이터의 형식 (text, json 등) */
			success : function(res){ /*Ajax통신 성공*/
				console.log(res)
				
				$('#idCheck').empty();
				$('#idCheck').append(res);
				$('#idCheck').css('color', 'red');
			},
			error : function(){ /* Ajax 통신 실패 */
				alert("Ajax 통신 실패")
			}
		})
	}
	
	
</script>
</body>
</html>