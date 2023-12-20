<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Saloon Appointment Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>
<body>
<style>
  body {
    font-family: Arial, sans-serif;
  }

  .container {
    margin-top: 20px;
    width: 50%;
  }

  .design {
    margin-bottom: 15px;
  }

  label {
    font-weight: bold;
  }
   button {
    padding: 10px 20px;
    background-color: #28a745;
    color: #fff;
    border: none;
    border-radius: 4px;
    cursor: pointer;
  }

  button:hover {
    background-color: #218838;
  }
</style>
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
	<form action="barber" class="container" method="post">
    <div class="design">
        <label for="name">Name</label><br>
        <input type="text" name="name" id="userName" placeholder="Enter name">
    </div><br>
    <div class="design">
        <label for="date">Date</label><br>
        <input type="text" name="date" id="date" placeholder="Select date">
    </div><br>
    <div class="design">
        <label for="time">Time</label><br>
        <select name="time" id="time">
         <option value="choose">Choose</option>
            <option value="morning">Morning</option>
            <option value="afternoon">Afternoon</option>
            <option value="evening">Evening</option>
        </select>
    </div><br>
    <div class="design">
        <label for="email">Email</label><br>
        <input type="email" name="email" class="form-control" id="email" placeholder="Ex- xyz@gmail.com">
    </div><br>
    <div class="design">
        <label for="mobileNo">Mobile Number</label><br>
        <input type="number" name="mobileNo" class="form-control" id="mobileNo" placeholder="Ex- 9000000000">
    </div><br>
    <div class="design">
        <label for="location">Location</label><br>
        <select name="location" id="location">
                 <option value="choose">Choose</option>
            <option value="city1">Rajajinagar</option>
            <option value="city2">Magadi</option>
            <option value="city3">Malleshwaram</option>
            <option value="city4">Vijaynagar</option>
            <option value="city5">Majestic</option>
            <option value="city6">Mahalakshmi layout</option>
        </select>

    <div class="design">
        <label for="purpose">Purpose</label><br>
        <select name="purpose" id="purpose">
            <option value="choose">Choose</option>
            <option value="haircut">Haircut</option>
            <option value="shaving">Shaving</option>
            <option value="setting">Setting</option>
             <option value="facial">Facial</option>
            <option value="massages">Massages</option>
            <option value="coloring">Coloring</option>
        </select>
    </div><br>
    <div class="design">
        <label>Gender</label><br>
        <input type="radio" name="gender" value="male"> Male
        <input type="radio" name="gender" value="female"> Female
    </div><br>
    <div class="design">
        <label>Member</label><br>
        <input type="radio" name="member" value="yes"> Yes
        <input type="radio" name="member" value="no" checked> No
    </div><br>
    <label>Age</label>
    <select>
    <option>SELECT</option>
    <c:forEach items="${number}" var="num" >
    <option>${num}</option>
    </c:forEach>
    </select>
    <div class="design">
        <label for="payment">Payment</label><br>
        <select name="payment" id="payment">
            <option value="choose">Choose</option>
            <option value="credit">Credit Card</option>
            <option value="debit">Debit Card</option>
            <option value="upi">UPI</option>
            <option value="neft">NEFT/RTGS</option>
            <option value="cash">Cash </option>
            <option value="loan">Loan</option>
            <option value="free">Free</option>
        </select>
    </div><br>
    <div class="design">
        <button type="submit" class="btn btn-success" value="send">Send</button>
    </div>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>