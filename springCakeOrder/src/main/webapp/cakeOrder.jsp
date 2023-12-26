<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Contact</title>
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
<c:forEach var="objectErrors" items="${errors}"> ${objectErrors.defaultMessage}</c:forEach>
</span>
<h1 style='color:green;'>${msg}</h1>
  <span>${dto}</span>
<form action="info" method="post">
  <div class="row">
    <div class="col">
      <label for="customer">Customer</label>
      <input type="text" class="form-control" name="customer" id="customer" placeholder="Customer Name" value="${dto.customer}">
    </div>

  <div class="form-group">
    <label for="email">Email</label>
    <input type="email" name="email" class="form-control" id="email" placeholder="Your email" value="${dto.email}" >
  </div>
  
<div class="form-group">
    <label for="flavour">Flavour</label>
    <select class="form-control" id="flavour" name="flavour">
    <option selected value=" ">Selected</option>
      <option value="chocolate" <c:if test="${dto.flavour=='chocolate'}">selected="selected"</c:if>>Chocolate</option>
      <option value="venilla" <c:if test="${dto.flavour=='venilla'}">selected="selected"</c:if>>Venilla</option>
       <option value="strawberry" <c:if test="${dto.flavour=='strawberry'}">selected="selected"</c:if>>Strawberry</option>
      <option value="pista"<c:if test="${dto.flavour=='pista'}">selected="selected"</c:if>>Pista</option>
        <option value="butterscotch" <c:if test="${dto.flavour=='butterscotch'}">selected="selected"</c:if>>Butterscotch</option>
    </select>
  </div>

  <div class="form-group">
    <label for="tickets">Weight</label>
    <select class="form-control" id="weight" name="weight">
   <option selected value=" ">Selected</option>
      <option value="500g" <c:if test="${dto.weight=='500g'}">selected="selected"</c:if>>500g</option>
      <option value="1kg" <c:if test="${dto.weight=='1kg'}">selected="selected"</c:if>>1kg</option>
       <option value="2kg" <c:if test="${dto.weight=='2kg'}">selected="selected"</c:if>>2kg</option>
      <option value="5kg"<c:if test="${dto.weight=='5kg'}">selected="selected"</c:if>>5kg</option>
        <option value="10kg" <c:if test="${dto.weight=='10kg'}">selected="selected"</c:if>>10kg</option>
    </select>
  </div>
   <div class="form-group">
    <label for="price">Price</label>
    <input type="number" name="price" class="form-control" id="price" placeholder="Price" value="${dto.price}">
  </div>
  
      <div class="form-group">
        <label>Take away</label><br>
        <input type="radio" name="takeaway" value="true"> Yes
        <input type="radio" name="takeaway" value="false"> No
    </div><br>
 
  <button type="submit" value="save" class="btn btn-success">Order</button>
</form>
	
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</html>