<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시글 목록</title>
</head>
<body>
    <h1>게시글 목록</h1>
    
    <table border="1">
        <tr>
            <th>게시글 번호</th>
            <th>제목</th>
            <th>조회수</th>
            <th>작성일시</th>
        </tr>
        <c:forEach var="board" items="${list}">
            <tr>
                <td>${board.boardIdx}</td>
                <td>${board.title}</td>
                <td>${board.hitCnt}</td>
                <td><fmt:formatDate value="${board.createdDateTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
