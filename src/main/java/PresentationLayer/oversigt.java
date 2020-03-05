package PresentationLayer;

import DBAccess.Connector;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class oversigt extends Command {


    public static Map<Integer, allUsers> list = new HashMap();

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        Map<Integer, allUsers> res = null;
        try {
            res = getAllCustomer();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("res",res);
        return "oversigt";
    }
    public static Map<Integer, allUsers> getAllCustomer() throws ClassNotFoundException, SQLException {
        Connection conn = Connector.connection();
        Statement stm;
        stm = conn.createStatement();
        String sql = "Select * From users Where role = 'customer'";
        ResultSet rst;
        rst = stm.executeQuery(sql);
        while (rst.next()) {
            String email = rst.getString("email");
            int id = rst.getInt("id");
            String pass = rst.getString("password");
            String role = rst.getString("role");

            allUsers customer = new allUsers(email, id, pass, role);
            //allUsers customer = new allUsers((rst.getString("email")),
                    //(rst.getInt("id")),(rst.getString("password")),(rst.getString("role")));

            list.put(id, customer);
            //customerList.add(customer);

        }

        return list;
    }

}

