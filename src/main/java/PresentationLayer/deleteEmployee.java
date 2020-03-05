package PresentationLayer;

import DBAccess.Connector;
import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.Scanner;

public class deleteEmployee extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
            String id = request.getParameter( "id" );
            removeKunde(id);
        return "deleteemployee";
    }
    public static void removeKunde(String kunde) {
        try {
            Connection con = Connector.connection();
            String SQL = "DELETE From useradmin.users Where id = ?";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt(1, Integer.parseInt(kunde));
            ps.executeUpdate();
            oversigt.list.remove(Integer.parseInt(kunde));
    } catch ( SQLException | ClassNotFoundException ex ) {
    }

    }
}
