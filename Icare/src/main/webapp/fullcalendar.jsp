<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/resources/css/fullcalendar/fullcalendar.css"/>
	<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/resources/css/fullcalendar/timegrid.css"/>
	<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/resources/css/fullcalendar/daygrid.css"/>

<meta charset="UTF-8">
<title>full calendar</title>
</head>
<script type="text/javascript" src="<c:url value='/resources/js/fullcalendar/fullcalendar.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resources/js/fullcalendar/daygrid.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resources/js/fullcalendar/interaction.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resources/js/fullcalendar/timegrid.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resources/js/fullcalendar/locales-all.js'/>"></script>

<script>
	document.addEventListener('DOMContentLoaded', function() {
		  var calendarEl = document.getElementById('calendar');
		  
		  var calendar = new FullCalendar.Calendar(calendarEl, {
		    plugins: [ 'interaction', 'dayGrid', 'timeGrid' ],
		    defaultView: 'dayGridMonth',
		    defaultDate: new Date(),
		    header: {
		      left: 'prev,next today',
		      center: 'title',
		      right: ''
		    },
		  });
		  calendar.render();
			
	});
</script>

<body>
<div id='calendar'>


</div>



</body>
</html>