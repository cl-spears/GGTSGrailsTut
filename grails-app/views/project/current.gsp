<html>
<head>
</head>
	<title>Current Projects</title>

<body>
<table border="1">
	<g:each in="${allProjects}" status="i" var="thisProject" >	
		<tr>
				<td>${allProjects.name}</td>  
				<td>${allProjects.description}</td> 
				<td>${allProjects.dueDate}</td> 
		</tr>
	</g:each>
</body>
</html>