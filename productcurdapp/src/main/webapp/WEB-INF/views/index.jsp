<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>

	<div class="container mt-3">
		<h2 class="text-center p-2">All Products</h2>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Sr.no</th>
					<th scope="col">Name</th>
					<th scope="col">Description</th>
					<th scope="col">Price</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products}" var="p">
					<tr>
						<th scope="row">${p.id}</th>
						<td>${p.name}</td>
						<td>${p.description}</td>
						<td>${p.price}</td>
						<td>
						<a class="btn btn-danger" href="delete/${p.id}">Delete</a>
						<a class="btn btn-danger" href="update/${p.id}">Update</a>
						</td>
					</tr>
				</c:forEach>
		</table>

		<div class="text-center">
			<a class="btn btn-danger" href="add-product">Add Product</a>
		</div>

	</div>
</body>
</html>
