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
  <span>${dto}</span>
<form action="isro" method="post" onsubmit="return validateForm()">
  <div class="row">
    <div class="col">
      <label for="name">Name</label>
      <input type="text" class="form-control" name="name" id="name" placeholder="Name" value="${dto.name}">
    </div>
    
    <div class="form-group">
    <label for="field">Field</label>
    <select class="form-control" id="field" name="field">
    <option selected value=" ">Selected</option>
      <option value="biologist" <c:if test="${dto.field=='biologist'}">selected="selected"</c:if>>Biologist</option>
      <option value="chemist" <c:if test="${dto.field=='chemist'}">selected="selected"</c:if>>Chemist</option>
       <option value="physicist" <c:if test="${dto.field=='physicist'}">selected="selected"</c:if>>Physicist</option>
      <option value="geologist"<c:if test="${dto.field=='geologist'}">selected="selected"</c:if>>Geologist</option>
        <option value="ecologist" <c:if test="${dto.field=='ecologist'}">selected="selected"</c:if>>Ecologist</option>
    </select>
  </div><br>

  <div class="form-group">
    <label for="exp">Experience</label>
    <input type="number" name="exp" class="form-control" id="exp" placeholder="Your exp" value="${dto.exp}" >
  </div>
  
<div class="form-group">
    <label for="country">Country</label>
    <select class="form-control" id="country" name="country">
    <option selected value=" ">Selected</option>
      <option value="India" <c:if test="${dto.country=='India'}">selected="selected"</c:if>>India</option>
      <option value="Sri lanka" <c:if test="${dto.country=='Sri lanka'}">selected="selected"</c:if>>Sri lanka</option>
       <option value="Australia" <c:if test="${dto.country=='Australia'}">selected="selected"</c:if>>Australia</option>
      <option value="South africa"<c:if test="${dto.country=='South africa'}">selected="selected"</c:if>>South africa</option>
        <option value="USA" <c:if test="${dto.country=='USA'}">selected="selected"</c:if>>USA</option>
    </select>
  </div>
    <div class="form-group">
    <label for="achievement">Achievement</label>
    <input type="text" name="achievement" class="form-control" id="achievement" placeholder="Your achievement" value="${dto.achievement}" >
  </div>

  <button type="submit" value="save" class="btn btn-success">Submit</button>
</form>
	
</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</html>