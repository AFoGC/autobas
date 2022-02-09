<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Country List</title>
</head>
<body>
<#if allCountries??>
    <table class ="datatable">
        <h2>Country List:</h2>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>in EU</td>
    </tr>
    <#list allCountries as country>
        <#if country.eu>
            <#assign isEu = "True">
            <#else>
            <#assign isEu = "False">
        </#if>
        <tr>
            <td>${country.id}</td>
            <td>${country.name}</td>
            <td>${isEu}</td>
            <br>
        </tr>
    </#list>
    </table>
</#if>


<br>

<form action="saveCountry" method="post">
    Country Name:<br>
    <input type="text" name="name" placeholder="country"><br>
    EU:<br>
    <input type="checkbox" name="checkbox"><br>

    <tr>
        <td></td>
       <td><input type="submit" value="Save Country"></td>
   </tr>
</form>


</body>
</html>