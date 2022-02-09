<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1> Registration </h1>

<@spring.bind "users"/>
<form action="registration" method="post">

    Registration <br>
    <@spring.formInput "users.username"/><br>
    <@spring.showErrors "<br>"/> <br>

    <#if userNameError??>
        ${userNameError}
    </#if>

    Password <br>
    <@spring.formInput "users.password"/><br>
    <@spring.showErrors "<br>"/> <br>

    PasswordConfirm <br>
    <@spring.formInput "users.passwordConfirm"/><br>
    <@spring.showErrors "<br>"/> <br>

    <#if passwordError??>
        ${passwordError}
    </#if>

    <@spring.bind "clients"/>

    FirstName <br>
    <@spring.formInput "clients.firstName"/><br><br>
    LastName <br>
    <@spring.formInput "clients.lastName"/><br><br>

    Email <br>
    <@spring.formInput "clients.email"/><br>
    <@spring.showErrors "<br>"/> <br>



    <@spring.showErrors "<br>"/> <br>

    <input type="submit" value="add">
</form>
</body>
</html>