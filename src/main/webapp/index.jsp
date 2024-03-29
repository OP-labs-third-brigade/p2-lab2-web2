<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%
    Map<String, String> cookieMap = new HashMap<>();
    for(Cookie cookie : request.getCookies()) {
        cookieMap.put(cookie.getName(), cookie.getValue());
    }
    String cookie1A = cookieMap.getOrDefault("param1A", "");
    String cookie1B = cookieMap.getOrDefault("param1B", "");
    String cookie1C = cookieMap.getOrDefault("param1C", "");
    String cookie1D = cookieMap.getOrDefault("param1D", "");

    String cookie2A = cookieMap.getOrDefault("param2A", "");
    String cookie2B = cookieMap.getOrDefault("param2B", "");
    String cookie2C = cookieMap.getOrDefault("param2C", "");
    String cookie2D = cookieMap.getOrDefault("param2D", "");

    String cookie3A = cookieMap.getOrDefault("param3A", "");
    String cookie3B = cookieMap.getOrDefault("param3B", "");
    String cookie3C = cookieMap.getOrDefault("param3C", "");
    String cookie3D = cookieMap.getOrDefault("param3D", "");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formula Calculator</title>
    <style>
        body {
            font-family: Comic Sans MS;
            background-color: #f0f0f0;
            margin: 0;
            padding: 20px;
            box-sizing: border-box;
        }

        h2 {
            font-size: 24px;
            color: #333;
            margin-top: 20px;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            margin-top: 20px;
        }

        label {
            font-size: 16px;
            color: #333;
        }

        input[type="number"] {
            width: 100%;
            padding: 8px;
            margin: 6px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<h2>Enter Parameters for Formula 1</h2>
<form action="/calculation" method="post">
    <input type="hidden" name="formula" value="first">
    <label for="a1">Parameter a:</label>
    <input type="number" id="a1" name="param1A" value="<%= cookie1A %>"><br>
    <label for="b1">Parameter b:</label>
    <input type="number" id="b1" name="param1B" value="<%= cookie1B %>"><br>
    <label for="c1">Parameter c:</label>
    <input type="number" id="c1" name="param1C" value="<%= cookie1C %>"><br>
    <label for="d1">Parameter d:</label>
    <input type="number" id="d1" name="param1D" value="<%= cookie1D %>"><br>
    <input type="submit" value="Calculate">
</form>

<h2>Enter Parameters for Formula 2</h2>
<form action="/calculation" method="post">
    <input type="hidden" name="formula" value="second">
    <label for="a2">Parameter a:</label>
    <input type="number" id="a2" name="param2A" value="<%= cookie2A %>"><br>
    <label for="b2">Parameter b:</label>
    <input type="number" id="b2" name="param2B" value="<%= cookie2B %>"><br>
    <label for="c2">Parameter c:</label>
    <input type="number" id="c2" name="param2C" value="<%= cookie2C %>"><br>
    <label for="d2">Parameter d:</label>
    <input type="number" id="d2" name="param2D" value="<%= cookie2D %>"><br>
    <input type="submit" value="Calculate">
</form>

<h2>Enter Parameters for Formula 3</h2>
<form action="/calculation" method="post">
    <input type="hidden" name="formula" value="third">
    <label for="a3">Parameter a:</label>
    <input type="number" id="a3" name="param3A" value="<%= cookie3A %>"><br>
    <label for="b3">Parameter b:</label>
    <input type="number" id="b3" name="param3B" value="<%= cookie3B %>"><br>
    <label for="c3">Parameter c:</label>
    <input type="number" id="c3" name="param3C" value="<%= cookie3C %>"><br>
    <label for="d3">Parameter d:</label>
    <input type="number" id="d3" name="param3D" value="<%= cookie3D %>"><br>
    <input type="submit" value="Calculate">
</form>
</body>
</html>