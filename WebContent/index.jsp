<%@page import="com.jss.entity.TempData"%>
<%@page import="java.util.List"%>
<%@page import="com.jss.db.TempDataModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  
  		<header>
		  <div class="col-md-12"><div class="panel panel-default">
			  <div class="panel-body">
			    Header
			  </div>
			</div></div>		
		</header>
		<div class="row">
		  <div class="col-md-9">
		  <div class="col-md-12"><div class="panel panel-default">
			  <div class="panel-body">
			   	<form action="TempDataServlet" method="post">
  <input type="text" name="txtSubject" placeholder="Subject"></br>
  <input type="text" name="txtBody" placeholder="Body"></br>
  <input type="text" name="txtAuthor" placeholder="Author"></br>
  <input type="text" name="txtImage" placeholder="Image URL"></br>
  <input type="email" name="txtEmail" min="1" max="5" placeholder="email"></br>
  <input type="submit" value="Send">
  
  
  <table class="table table-hover">
  	<tr>
  		<th>Subject</th>
  		<th>Body</th>
  		<th>Author</th>
  		<th>IMG URL</th>
  		<th>Email</th>
  		
  		
  	</tr>
  <%
  	TempDataModel tempDataModel=new TempDataModel();
  	List<TempData> tempDatas=tempDataModel.getListOfData();
  
  	for(TempData tempData:tempDatas)
  	{
  %>
  
  <tr>
  		<td><%=tempData.getSubject() %></td>
  		<td><%=tempData.getBody() %></td>
  		<td><%=tempData.getAuthor() %></td>
  		<td><%=tempData.getImgURL() %></td>
  		<td><%=tempData.getEmail() %></td>
  		  		
  	</tr>
  	<%} %>
  </table>
</form>
			  </div>
			</div></div>		
		  	
		  </div>
		  <div class="col-md-3">
		  <div class="col-md-12"><div class="panel panel-default">
			  <div class="panel-body">
			    Right content
			  </div>
			</div></div>		
		  
		  </div>		  
		</div>
		<footer>
		 		  <div class="col-md-12"><div class="panel panel-default">
			  <div class="panel-body">
			    Footer
			  </div>
			</div></div>		

		</footer>
  
  
   

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>