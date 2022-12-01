<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<center>
			<h1>Customer registration </h1>
		</center>
		<div class="card">
			<div class="card-body">
				<form action="<%=request.getContextPath()%>/Register"
					method="post">

					<div class="form-group row">
						<label for="firstName" class="col-sm-2 col-form-label">First
							Name</label>
						<div class="col-sm-7">
							<input type="text" name="txtFname" class="form-control"
								name="firstName" placeholder="Enter first name">
						</div>
					</div>

					<div class="form-group row">
						<label for="lastName" class="col-sm-2 col-form-label">Last
							Name</label>
						<div class="col-sm-7">
							<input type="text" class="form-control"
								name="lastName" placeholder="Enter last name">
						</div>
					</div>
					<div class="form-group row">
						<label for="phoneNo" class="col-sm-2 col-form-label">Phone No</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="txtPhone"
								placeholder="Enter Contact Address">
						</div>
					</div>
					<div class="form-group row">
						<label for="address" class="col-sm-2 col-form-label">Address</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="address"
								placeholder="Enter Address">
						</div>
					</div>


					<div class="form-group row">
						<label for="username" class="col-sm-2 col-form-label">Username</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="username"
								placeholder="Enter user name">
						</div>
					</div>

					<div class="form-group row">
						<label for="password" class="col-sm-2 col-form-label">Password</label>
						<div class="col-sm-7">
							<input type="password" class="form-control" name="password"
								placeholder="Enter Password">
						</div>
					</div>
					<button type="submit" class="btn btn-primary">Register Customer</button>
				</form>
			</div>
		</div>
	</div>


</body>
</html>