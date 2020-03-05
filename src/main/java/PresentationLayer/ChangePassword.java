package PresentationLayer;

import DBAccess.Connector;
import FunctionLayer.LoginSampleException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ChangePassword extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, ServletException, IOException {

        String id = request.getParameter("id");
        String password1 = request.getParameter( "password1" );
        String password2 = request.getParameter( "password2" );

        if(password1.equals(password2)) {
            changePass(password1, id);
            return "customer" + "page";
        } else {
            throw new LoginSampleException( "the two passwords did not match" );
        }
    }
    public static void changePass(String pass, String id) {
        try {
            Connection con = Connector.connection();
            String SQL = "update users SET password = ? where id = ? ;";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pass);
            ps.setInt(2, Integer.parseInt(id));
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
        }
    }
}