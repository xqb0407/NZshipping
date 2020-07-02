<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
</head>
<body>
<script type="text/javascript">
//为给定 ID 的 user 创建请求
axios.get('http://localhost:8891/rest.json')
  .then(function (response) {
    console.log(response);
  })
  .catch(function (error) {
    console.log(error);
  });
</script>
</body>
</html>