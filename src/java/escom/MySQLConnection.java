/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escom;

/**
 *
 * @author roy
 */
import java.sql.*;
import java.util.ArrayList;

class MySQLConnection {

    private final String user = "admin";
    private final String pass = "admin";
    private Connection connection;

    public MySQLConnection() {
        
    }

    public Club getClub(String id){
        Club newClub = new Club();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/ESCOM.CLUBS", user, pass);
            String query = "select * from CLUB where ID_CLUB = ?";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, id);
            ResultSet rs = preparedStmt.executeQuery();
            
            if (rs.next()) {
                newClub.setID_CLUB(rs.getString(1));
                newClub.setNAME(rs.getString(2));
                newClub.setDESCRIPTION(rs.getString(3));
                newClub.setLOGO(rs.getString(4));
                newClub.setOWNER(rs.getString(5));
                newClub.setMAX_MEMBERS(rs.getString(6));
                newClub.setCURRENT_MEMBERS(rs.getString(7));
                newClub.setPLACE(rs.getString(8));
                newClub.setCREATION_DATE(rs.getString(9));
                newClub.setSTATUS(rs.getString(10));
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return newClub;
    }


    public ArrayList<Club> getClubs() {
        // String[] clubs = new String[10];
        ArrayList<Club> clubs = new ArrayList<Club>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ESCOM.CLUBS", user, pass);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from CLUB limit 4");
            while (rs.next()) {
                Club newClub = new Club();
                newClub.setID_CLUB(rs.getString(1));
                newClub.setNAME(rs.getString(2));
                newClub.setDESCRIPTION(rs.getString(3));
                newClub.setLOGO(rs.getString(4));
                newClub.setOWNER(rs.getString(5));
                newClub.setMAX_MEMBERS(rs.getString(6));
                newClub.setCURRENT_MEMBERS(rs.getString(7));
                newClub.setPLACE(rs.getString(8));
                newClub.setCREATION_DATE(rs.getString(9));
                newClub.setSTATUS(rs.getString(10));
                clubs.add(newClub);
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return clubs;
    }
}
