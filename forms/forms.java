    <form:form  method="post" action="/user.jsp" modelAttribute="user">
        <div>
            <form:label path="firstName">Name:</form:label>
            <form:input path="firstName"/>
            <form:errors path="firstName" />
        </div>
        <div>
            <form:label path="password">Password:</form:label>
            <form:input path="password" />
            <form:errors path="password" />
        </div>
        <div>
            <input type="submit" value="  OK  "/>
        </div>
    </form:form>

--------------------------------------------------------
<form:form  method="post" commandName="user">
------------------------------------------
model.addAttribute("**userLogin**", userForm); // in controller
return "form"; //in controller
in JSP you should give

form:form  method="post" action="/user.jsp" modelAttribute="userLogin"
(instead of modelAttribute/commandName="user")
