<%@ page import="java.util.*, java.text.*" %>
<%@ page contentType="text/html; charset=windows-1251" %>
<html>
<head>
    <title>
        ������� �������������
    </title>
</head>
 
<body>
    <h1>Hello world!!!</h1>
    <h1>������� � �������</h1>

    <h2>�������� ������������</h2>
    <%-- ����� ���������� ������ --%>
    <FORM name="form1" method="post">
        ���: <INPUT type="text" name="name" size="20" maxlength="20"><BR>
        E-mail: <INPUT type="text" name="email" size="20" maxlength="20">
        <BR><BR><BR>       
        <INPUT type="submit" name="submit" value="��������"><BR>
    </FORM>

    <h2>������� � ��������������</h2>

    <%-- ������������� --%>
    <%! boolean flagStart = true; %>
    <%! List<String> name_array = new ArrayList<String>(); %>
    <%! List<String> email_array = new ArrayList<String>(); %>
    <%! List<Date> reg_date_array = new ArrayList<Date>(); %>

    <table border="1px" cellpadding="8px">
        <%-- �������� ������� � ������� --%>
        <tr>
            <th>���</th>
            <th>E-mail</th>
            <th>���� �����������</th>
        </tr>
        <%-- ��������� ��������� ������� --%>
        <% if(!flagStart){ %>
            <%  name_array.add(request.getParameter("name"));
                email_array.add(request.getParameter("email"));
                reg_date_array.add(new Date()); %>      
             
                <%-- ��������� ������� --%>
                <% for(int i = 0; i < name_array.size(); ++i){
                    out.println("<tr>");
                    out.println("<td>" + name_array.get(i) + "</td>");
                    out.println("<td>" + email_array.get(i) + "</td>");
                    out.println("<td>" + reg_date_array.get(i) + "</td>"); 
                    out.println("</tr>");
                } %>
        <% } else
                flagStart = false; %>
    </table>
</body>
</html>