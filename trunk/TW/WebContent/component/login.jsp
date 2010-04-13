<s:form action="LoginAction.do">
	<table align="center" cellpadding="1" cellspacing="1" class="form">
		<tr>
			<td width="50%"><s:textfield name="userName" label="UserName"
				labelposition="top"></s:textfield></td>
		</tr>
		<tr>
			<td width="50%"><s:password name="password" label="Password"
				labelposition="top"></s:password></td>
		</tr>
		<tr>
			<td>

			<button type="submit" class="positive" name="Submit"><img
				src="<%=request.getContextPath()%>/images/key.png"
				alt="Announcement" />Login</button>

			</td>
		</tr>
	</table>

</s:form>