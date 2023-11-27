<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>MemberMain페이지</h1>

<button onclick="location.href='MemberJoinPage.do'">회원가입</button>
<button onclick="memberListAsync()"> Ajax로 MemberList 조회 </button>
<button onclick="location.href='MemberList.do'"> MemberList 조회</button>


	
<script type="text/javascript">
function memberListAsync(){




	$.ajax({
		url : "memberListAsync.do", /* 어디로 보낼지 */
		data : {check : "멤버리스트 요청" }
		type : "get", /* get, post */
		dataType : "text", /* 응답 데이터의 형식 (text, json 등) */
		success : function(res){ /*Ajax통신 성공*/
			console.log(res)
			
		},
		error : function (){ /* Ajax 통신 실패 */
			alert("Ajax 통신 실패")
		}
	})
}
</script>

</body>
</html>