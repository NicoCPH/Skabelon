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

public class ResetPassword extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, ServletException, IOException {
        String id = request.getParameter("id");
        resetPass(id);
        return "resetpassword";
    }
    public static void resetPass(String id) {
        try {
            Connection con = Connector.connection();
            String SQL = "update users SET password = '123456' where id = ?;";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, Integer.parseInt(id));
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
        }
    }
}
