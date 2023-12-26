<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Student</title>
 <style>
    body {
      padding-top: 60px;
    }

    form {
      max-width: 600px;
      margin: auto;
      padding: 20px;
      border: 1px solid #ddd;
      border-radius: 10px;
      margin-top: 20px;
    }

    label {
      margin-top: 10px;
    }

    select,
    input[type="text"],
    input[type="email"] {
      margin-bottom: 15px;
    }

    button {
      margin-top: 15px;
    }
  </style>
  
</head>

<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Xworkz</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="index.jsp">Home</a></li>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	
<body>
<span style='color:red;'>
<c:forEach var="objectErrors" items="${errors}"> ${objectErrors.defaultMessage}<br></c:forEach>
</span>
<h1 style='color:green;'>${msg}</h1><br>
  <span>${dto}</span>
<form action="vtu" method="post">
  <div class="row">
    <div class="col">
      <label for="name">Name</label>
      <input type="text" class="form-control" name="name" id="name" placeholder="Name" value="${dto.name}">
    </div>

  <div class="form-group">
    <label for="usn">USN</label>
    <input type="text" name="usn" class="form-control" id="usn" placeholder="Your usn" value="${dto.usn}" >
  </div>
  
<div class="form-group">
    <label for="branch">Branch</label>
    <select class="form-control" id="branch" name="branch">
    <option selected value=" ">Selected</option>
      <option value="Information Science" <c:if test="${dto.branch=='Information Science'}">selected="selected"</c:if>>Information Science</option>
      <option value="Computer Science" <c:if test="${dto.branch=='Computer Science'}">selected="selected"</c:if>>Computer Science</option>
       <option value="ECE" <c:if test="${dto.branch=='ECE'}">selected="selected"</c:if>>ECE</option>
      <option value="EEE"<c:if test="${dto.branch=='EEE'}">selected="selected"</c:if>>EEE</option>
        <option value="Mech" <c:if test="${dto.branch=='Mech'}">selected="selected"</c:if>>Mech</option>
    </select>
  </div>
  <div class="form-group">
    <label for="semister">Semister</label>
    <input type="number" name="semister" class="form-control" id="semister" placeholder="Your semister" value="${dto.semister}" >
  </div>
    <div class="form-group">
    <label for="cgpa">CGPA</label>
    <input type="text" name="cgpa" class="form-control" id="cgpa" placeholder="Your cgpa" value="${dto.cgpa}" >
  </div>

  <button type="submit" value="save" class="btn btn-success">Submit</button>
</form>
	
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</html>