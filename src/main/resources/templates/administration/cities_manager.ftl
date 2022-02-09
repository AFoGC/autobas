<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>City manager</title>
</head>
<body>
<#if allCities??>
    <table class ="datatable">
        <h2>City List:</h2>
        <tr>
            <td>id</td>
            <td>name</td>
            <td>country</td>
        </tr>
        <#list allCities as city>
            <tr>
                <td>${city.id}</td>
                <td>${city.name}</td>
                <td>${city.countryInCity.name}</td>
                <br>
            </tr>
        </#list>
    </table>
</#if>


<br>

<form action="saveCity" method="post">
    City Name:<br>
    <input type="text" name="name" placeholder="City"><br>
    <input type="text" name="country" placeholder="id"><br>
    <tr>
        <td></td>
        <td><input type="submit" value="Save City"></td>
    </tr>
</form>
</body>
</html>