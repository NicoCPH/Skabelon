package PresentationLayer;

import FunctionLayer.LoginSampleException;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new Login() );
        commands.put( "register", new Register() );
        commands.put("oversigt", new oversigt());
        commands.put("registeremployee", new registerEmployee());
        commands.put("deleteemployee", new deleteEmployee());
        commands.put("logout", new logout());
        commands.put("changepassword", new ChangePassword());
        commands.put("resetpassword", new ResetPassword());
    }

    static Command from( HttpServletRequest request ) {
        String TagetName = request.getParameter( "taget" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(TagetName, new UnknownCommand() );   // unknowncommand er default.
    }

    abstract String execute( HttpServletRequest request, HttpServletResponse response )
            throws LoginSampleException, ServletException, IOException;

}
