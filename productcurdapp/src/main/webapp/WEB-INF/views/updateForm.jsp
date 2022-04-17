<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
	
	<form class="mx-auto my-2" action="${pageContext.request.contextPath }/handle-product" method="post"
		style="width: 60%">
		<h1>Update Product Form</h1>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Id</label> 
			<input 
				type="text" class="form-control" id="id" name="id" value="${product.id }" readonly>

		</div>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Name</label> 
			<input 
				type="text" class="form-control" id="email1" name="name" value="${product.name }">

		</div>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Description</label>
			<textarea class="form-control" id="description" name="description" >${product.description }</textarea>

		</div>
		<div class="mb-3">
			<label class="form-label">Price</label> <input type="text" 
				class="form-control" id="price" name="price" value="${product.name }">

		</div>
		<a href="${pageContext.request.contextPath}/" class="btn btn-primary">Back</a>
		<button type="submit" class="btn btn-danger">Update</button>
	</form>
</body>
</html>