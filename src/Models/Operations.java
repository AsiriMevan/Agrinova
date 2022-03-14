/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import DatabaseLayer.DB_connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mevan
 */
public class Operations {

    public static boolean isLogin(String email, String password, String role, JFrame frame) {
        try {
            Connection c = DB_connection.getDB();
            String mySqlQuery
                    = "SELECT userId, userName, role FROM user WHERE email = '"
                    + email
                    + "' AND password = '"
                    + password
                    + "' AND role = '" + role
                    + "'";

            PreparedStatement preparedStatement = c.prepareStatement(mySqlQuery);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                User.userID = rs.getString("userId");
                User.userName = rs.getString("userName");
                User.role = rs.getString("role");

                return true;
            }

        } catch (Exception exception) {
            JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
        }
        return false;
    }

}
