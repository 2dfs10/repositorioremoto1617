<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<style>
      #map {
        width: 500px;
        height: 400px;
        background-color: #CCC;
      }
    </style>
<title>Insert title here</title>
</head>
     <div id="map"></div>
     <script>
      function initMap() {
        var mapDiv = document.getElementById('map');
        var map = new google.maps.Map(mapDiv, {
          center: {lat: 44.540, lng: -78.546},
          zoom: 8
        });
      }
    </script>
   
   <script src="https://maps.googleapis.com/maps/api/js"
    async defer></script>
</body>
</html>