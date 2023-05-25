<html>
<head>
	<%@include file="./base.jsp"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
</head>
<body>
	
	<div class="container mt-3">
		
		<div class="row">
		
			<div class="cal-md-12">
			
			<h1 class="text-center  text-white"><b>WELCOM TO STUDENT MANAGEMENT SYSTEM</b></h1>
			
				<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">STD_ID</th>
      <th scope="col">STUD NAME</th>
      <th scope="col">ADDRESS</th>
      <th scope="col">BRANCH</th>
      <th scope="col">EMAIL</th>
      <th scope="col">MOBILE</th>
      <th scope="col">ACTION</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${studentList }" var="s">
    <tr class="text-white">
      <th scope="row">STUD${s.sid }</th>
      <td>${s.sname }</td>
      <td>${s.saddress }</td>
      <td>${s.sbranch }</td>
      <td>${s.semail }</td>
       <td>${s.smobile }</td>
       <td>
       <a href="edit?id=${s.sid }"><i class="fa-solid fa-pen-nib text-primary" style="font-size:23px;"></i></a>
       &nbsp;
       <a href="delete?id=${s.sid }"><i class="fa-solid fa-trash text-danger" style="font-size:23px;"></i></a>
      </td>
    </tr>
   </c:forEach>
    
  </tbody>
</table>
	<div class="container text-center">
		<a href="add" class="btn btn-outline-success">Add Employee</a>
		<a href="showemp" class="btn btn-outline-danger">See Employee Detailes by Using ID</a>
	
	</div>	
	</div>
	</div>		
	</div>
	
</body>
</html>

