<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Road</title>
</head>
<body>
<#if allRoads??>
    <table class ="datatable">
        <h2>Road List:</h2>
        <tr>
            <td>id</td>
            <td>city form</td>
            <td>range</td>
            <td>city to</td>
        </tr>
        <#list allRoads as road>
            <tr>
                <td>${road.id}</td>
                <td>${road.cityFrom.name}</td>
                <td>${road.range} km</td>
                <td>${road.cityTo.name}</td>
                <br>
            </tr>
        </#list>
    </table>
</#if>


<br>

<form action="saveCity" method="post">
    City Name:<br>
    <input type="text" name="range" placeholder="road range"><br>
    <input type="text" name="city_from" placeholder="id"><br>
    <input type="text" name="city_to" placeholder="id"><br>
    <tr>
        <td></td>
        <td><input type="submit" value="Save Road"></td>
    </tr>
</form>

</body>
</html>