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

<form action="info" method="post">
  <div class="row">
    <div class="col">
      <label for="first-name">Name</label>
      <input type="text" class="form-control" name="name" id="name" placeholder="Name" >
    </div>

  <div class="form-group">
    <label for="email">Email</label>
    <input type="email" name="email" class="form-control" id="email" placeholder="Your email" >
  </div>
  
  <div>
   <label>Age</label>
    <select name="age">
    <option>SELECT</option>
    <c:forEach items="${number}" var="num" >
    <option>${num}</option>
    </c:forEach>
    </select>
    </div>
    
<div class="form-group">
    <label for="city">City</label>
    <select class="form-control" id="city" name="city">
    <option value="choose">Choose</option>
      <option value="kundapur">Kundapur</option>
      <option value="electronic">Electronic city</option>
       <option value="harihar">Harihar</option>
      <option value="ujire">Ujire</option>
        <option value="maravanthe">Maravanthe</option>
 
    </select>
  </div>

 <div class="form-group">
    <label for="district">District</label>
    <select class="form-control" id="district" name="district">
    <option value="choose">Choose</option>
      <option value="udupi">Udupi</option>
      <option value="banglore">Banglore</option>
      <option value="davanagere">Davanagere</option>
      <option value="manglore">Manglore</option>
      <option value="udupi">Udupi</option>
    </select>
  </div>


  <div class="form-group">
    <label for="state">State</label>
    <select class="form-control" id="state" name="state">
    <option value="choose">Choose</option>
      <option value="karnataka">Karnataka</option>
      <option value="kelrala">Kerala</option>  
          <option value="andra pradesh">Andra pradesh</option>
                <option value="uttar pradesh">Uttar pradesh</option>
            <option value="tamilnadu">Tamilnadu</option>  
           <option value="Assam">Assam</option>
         
    </select>
  </div>
  
<div class="form-group">
    <label for="country">Country</label>
    <select class="form-control" id="country" name="country">
          <option value="choose">Choose</option>
      <option value="india">India</option>
      <option value="australia">Australia</option>
            <option value="west_indies">West indies</option>
      <option value="south_africa">South africa</option>
            <option value="srilanka">Sri lanka</option>
      <option value="ireland">Ireland</option>
    </select>
  </div>


  <div class="form-group">
    <label for="pincode">Pincode</label>
    <input type="text" name="pincode" class="form-control" id="pincode" placeholder="Pincode" >
  </div>
  <button type="submit" value="save" class="btn btn-primary">Submit</button>
</form>
	
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</html>