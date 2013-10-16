<html>
<head>
</head>
	<title>Current Projects</title>

<body>
<table border="1">
	<g:each in="${allProjects}" status="i" var="thisProject" >	
		<tr>
				<td>${thisProject.name}</td>  
				<td>${thisProject.description}</td> 
				<td>${thisProject.dueDate}</td> 
		</tr>
	</g:each>
</body>
</html>