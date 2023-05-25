<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp"%>
 <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
</head>
<body >
	<h1 class="text-center-mb-3 text-white"><b>FILL THE STUDENT DETAILES</b></h1>
	<div class="alert alert-danger text-center" role="alert">
			  <h5>${msg }</h5>
	</div>	
	<div class="container mt-3">
	
		<div class="row">
		
		<div class="col-md-8 offset-md-2">
		
			
			  <form:form action="save" method="post" modelAttribute="student">
            <table class="col-md-8 offset-md-2">
                <tr class="form-group text-white">
                    <td>STUDENT NAME: </td>
                    <td><form:input path="sname"
                    type="text" 
				       class="form-control"
				      placeholder="Enter the Student name"/>
				     </td>
                </tr><br>
                <tr class="form-group text-white">
                    <td>STUDENT ADDRESS: </td>
                    <td><form:input path="saddress"
                    type="text" 
				       class="form-control"
				      placeholder="Enter the Student address"/></td>
                </tr>
                <tr class="form-group text-white">
                    <td>STUDENT BRANCH: </td>
                    <td><form:input path="sbranch"
                    type="text" 
				       class="form-control"
				      placeholder="Enter the Student branch"/></td>
                </tr>
                <tr class="form-group text-white">
                    <td>STUDENT EMAIL: </td>
                    <td><form:input path="semail"
                    type="text" 
				       class="form-control"
				      placeholder="Enter the Student email"/></td>
                </tr>
                <tr class="form-group text-white">
                    <td>STUDENT MOBILE:</td>
                    <td><form:input path="smobile"
                     type="tel" 
				       class="form-control"
				      placeholder="Enter the Student mobile"/></td>
                </tr>
            </table>
            <br><br>
             <div class="container text-center">
					<a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger">Back</a>
					<button type="submit" class="btn btn-primary">Add</button>
				</div>
        </form:form>   
		</div>
		</div>
	</div>
</body>
</html>
