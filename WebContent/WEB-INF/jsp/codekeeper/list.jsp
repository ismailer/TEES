
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VRaptor Blank Project</title>
</head>
<body>
	<ul>
		<c:forEach items="${codeList}" var="code">
    	<li> ${code.name} - ${code.text} </li>
		</c:forEach>
	</ul>
	form action="<c:url value="/codekeeper/addCode"/>">
    Name:     <input type="text" name="code.name" /><br/>
    Code:     <input type="text" name="code.text" /><br/>
    Language: <input type="text" name="code.language" /><br/>
    Tags:	  <input type="text" name="code.tags" /><br/>
    <input type="submit" value="Salvar" />
</form>
</body>
</html>

<script type="text/javascript" charset="utf-8">
//Cria um novo gasto	
	$('#Salvar').click(function() {
			    			$('html').append(code.name+code.text+code.language+code.tags)			    			
				    			})