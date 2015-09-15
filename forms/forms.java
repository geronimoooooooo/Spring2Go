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
