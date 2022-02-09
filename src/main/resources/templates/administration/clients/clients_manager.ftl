<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Clients Manager</title>
</head>
<body>
    <#if allClients??>
        <#list allClients as client>
           <tr>
               <td>${client.email}</td>
               <td>${client.firstName}</td>
               <td>${client.lastName}</td>
               <td>${client.password}</td>
           </tr>
        </#list>
    </#if>
</body>
</html>