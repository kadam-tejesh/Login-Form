package org.example;

import java.sql.*;
public class LoginDao {
    String url="jdbc:mysql://localhost:3306/tejesh";
    String username="root";
    String password="tejesh@07";
    String query="select * from Login where UserName=? and Password=?";
    public boolean checkCredentials(String uname,String pass){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,username,password);
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1,uname);
            ps.setString(2,pass);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                return true;
            }
        }
        catch(Exception e){
            e.getStackTrace();
        }
        return false;
    }
}
