package sample;
import java.sql.*;

public class DatabaseHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://"
                + dbHost
                + ":"
                + dbPort
                + "/"
                + dbName;
        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPassword);

        return dbConnection;
    }

    public ResultSet getTheaters() {
        ResultSet resultSet = null;

        String thtr = "SELECT " + Const.THEATER_NAME + " FROM " + Const.THEATER_TABLE;
        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(thtr);
            resultSet = preparedStatement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public ResultSet getTheatername(String b) {
        ResultSet resultSet1 = null;
        String thtr1 = "SELECT " + Const.THEATER_NAME + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_NAME + "=?";
        PreparedStatement preparedStatement1 = null;
        try {
            preparedStatement1 = getDbConnection().prepareStatement(thtr1);
            preparedStatement1.setString(1, b);
            resultSet1 = preparedStatement1.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return resultSet1;
    }

    public ResultSet getTheateradress(String b) {
        ResultSet resultSet2 = null;
        String thtr2 = "SELECT " + Const.THEATER_ADRESS + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_NAME + "=?";
        PreparedStatement preparedStatement2 = null;
        try {
            preparedStatement2 = getDbConnection().prepareStatement(thtr2);
            preparedStatement2.setString(1, b);
            resultSet2 = preparedStatement2.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resultSet2;
    }

    public ResultSet getTheaterdistrict(String b) {
        ResultSet resultSet2 = null;
        String thtr3 = "SELECT " + Const.THEATER_DISTRICT + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_NAME + "=?";
        PreparedStatement preparedStatement2 = null;
        try {
            preparedStatement2 = getDbConnection().prepareStatement(thtr3);
            preparedStatement2.setString(1, b);
            resultSet2 = preparedStatement2.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resultSet2;
    }

    public ResultSet getTheaterstation(String b) {
        ResultSet resultSet2 = null;
        String thtr3 = "SELECT " + Const.THEATER_STATION + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_NAME + "=?";
        PreparedStatement preparedStatement2 = null;
        try {
            preparedStatement2 = getDbConnection().prepareStatement(thtr3);
            preparedStatement2.setString(1, b);
            resultSet2 = preparedStatement2.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resultSet2;
    }

    public ResultSet getTheaterphone(String b) {
        ResultSet resultSet2 = null;
        String thtr3 = "SELECT " + Const.THEATER_PHONE + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_NAME + "=?";
        PreparedStatement preparedStatement2 = null;
        try {
            preparedStatement2 = getDbConnection().prepareStatement(thtr3);
            preparedStatement2.setString(1, b);
            resultSet2 = preparedStatement2.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resultSet2;
    }

    public ResultSet getTheatertype(String b) {
        ResultSet resultSet2 = null;
        String thtr3 = "SELECT " + Const.THEATER_TYPE + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_NAME + "=?";
        PreparedStatement preparedStatement2 = null;
        try {
            preparedStatement2 = getDbConnection().prepareStatement(thtr3);
            preparedStatement2.setString(1, b);
            resultSet2 = preparedStatement2.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resultSet2;
    }

    public ResultSet getTheatertime(String b) {
        ResultSet resultSet2 = null;
        String thtr3 = "SELECT " + Const.THEATER_TIME + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_NAME + "=?";
        PreparedStatement preparedStatement2 = null;
        try {
            preparedStatement2 = getDbConnection().prepareStatement(thtr3);
            preparedStatement2.setString(1, b);
            resultSet2 = preparedStatement2.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resultSet2;
    }


    public ResultSet getTheatershow(String b) {
        ResultSet resultSet2 = null;
        String thtr3 = "SELECT " + Const.THEATER_2D + " ," + Const.THEATER_3D + " ," + Const.THEATER_SUB + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_NAME + "=?";
        PreparedStatement preparedStatement2 = null;
        try {
            preparedStatement2 = getDbConnection().prepareStatement(thtr3);
            preparedStatement2.setString(1, b);
            resultSet2 = preparedStatement2.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resultSet2;
    }


    public ResultSet getTheaterspecies(String b) {
        ResultSet resultSet2 = null;
        String thtr3 = "SELECT " + Const.THEATER_CAFE + " ," + Const.THEATER_INV + " ," + Const.THEATER_VIP + " ," + Const.THEATER_WIFI + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_NAME + "=?";
        PreparedStatement preparedStatement2 = null;
        try {
            preparedStatement2 = getDbConnection().prepareStatement(thtr3);
            preparedStatement2.setString(1, b);
            resultSet2 = preparedStatement2.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resultSet2;

    }


    public ResultSet getByText(String b) {
        ResultSet resultSet1 = null;
        String thtr1 = "SELECT " + Const.THEATER_NAME + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_NAME + "=?";
        PreparedStatement preparedStatement1 = null;
        try {
            preparedStatement1 = getDbConnection().prepareStatement(thtr1);
            preparedStatement1.setString(1, b);
            resultSet1 = preparedStatement1.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return resultSet1;
    }

    public ResultSet getByCriteries(String sstreet, String sdistr, String sstation, String stype, String stime, String s2d, String s3d, String ssub, String scafe, String sinv, String svip, String swifi){
        ResultSet resultSet3 =null;

        String thtr1 = "SELECT " + Const.THEATER_NAME + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_STREET + "=? AND " + Const.THEATER_DISTRICT + "=? AND "
                + Const.THEATER_STATION + "=? AND " + Const.THEATER_TYPE + "=? AND " + Const.THEATER_TIME + "=? AND " + Const.THEATER_2D + "=? AND " + Const.THEATER_3D
                + "=? AND " + Const.THEATER_SUB + "=? AND " + Const.THEATER_CAFE + "=? AND " + Const.THEATER_INV + "=? AND " + Const.THEATER_VIP + "=? AND " + Const.THEATER_WIFI + "=?";
        PreparedStatement preparedStatement1 = null;
        try {
            preparedStatement1 = getDbConnection().prepareStatement(thtr1);
            preparedStatement1.setString(1, sstreet);
            preparedStatement1.setString(2, sdistr);
            preparedStatement1.setString(3, sstation);
            preparedStatement1.setString(4, stype);
            preparedStatement1.setString(5, stime);
            preparedStatement1.setString(6, s2d);
            preparedStatement1.setString(7, s3d);
            preparedStatement1.setString(8,ssub);
            preparedStatement1.setString(9,scafe);
            preparedStatement1.setString(10,sinv);
            preparedStatement1.setString(11,svip);
            preparedStatement1.setString(12,swifi);
            resultSet3 = preparedStatement1.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resultSet3;
    }

    public ResultSet serch2d(){
        ResultSet resultSet = null;
        String s  = "SELECT " + Const.THEATER_NAME + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_2D + "=?";
        PreparedStatement preparedStatement1 = null;
        try {
            preparedStatement1 = getDbConnection().prepareStatement(s);
            preparedStatement1.setString(1, "да");
            resultSet = preparedStatement1.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


         return resultSet;
    }

    public ResultSet serch3d(){
        ResultSet resultSet = null;
        String s  = "SELECT " + Const.THEATER_NAME + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_3D + "=?";
        PreparedStatement preparedStatement1 = null;
        try {
            preparedStatement1 = getDbConnection().prepareStatement(s);
            preparedStatement1.setString(1, "да");
            resultSet = preparedStatement1.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return resultSet;
    }

    public ResultSet serchsub(){
        ResultSet resultSet = null;
        String s  = "SELECT " + Const.THEATER_NAME + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_SUB + "=?";
        PreparedStatement preparedStatement1 = null;
        try {
            preparedStatement1 = getDbConnection().prepareStatement(s);
            preparedStatement1.setString(1, "да");
            resultSet = preparedStatement1.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return resultSet;
    }

    public ResultSet serchinv(){
        ResultSet resultSet = null;
        String s  = "SELECT " + Const.THEATER_NAME + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_INV + "=?";
        PreparedStatement preparedStatement1 = null;
        try {
            preparedStatement1 = getDbConnection().prepareStatement(s);
            preparedStatement1.setString(1, "да");
            resultSet = preparedStatement1.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resultSet;
    }

    public ResultSet serchcafe(){
        ResultSet resultSet = null;
        String s  = "SELECT " + Const.THEATER_NAME + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_CAFE + "=?";
        PreparedStatement preparedStatement1 = null;
        try {
            preparedStatement1 = getDbConnection().prepareStatement(s);
            preparedStatement1.setString(1, "да");
            resultSet = preparedStatement1.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resultSet;
    }

    public ResultSet serchvip(){
        ResultSet resultSet = null;
        String s  = "SELECT " + Const.THEATER_NAME + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_VIP + "=?";
        PreparedStatement preparedStatement1 = null;
        try {
            preparedStatement1 = getDbConnection().prepareStatement(s);
            preparedStatement1.setString(1, "да");
            resultSet = preparedStatement1.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resultSet;
    }

    public ResultSet serchwifi(){
        ResultSet resultSet = null;
        String s  = "SELECT " + Const.THEATER_NAME + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_WIFI + "=?";
        PreparedStatement preparedStatement1 = null;
        try {
            preparedStatement1 = getDbConnection().prepareStatement(s);
            preparedStatement1.setString(1, "да");
            resultSet = preparedStatement1.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resultSet;
    }

    public ResultSet serchstreet(String m){
        ResultSet resultSet = null;
        String s  = "SELECT " + Const.THEATER_NAME + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_STREET + "=?";
        PreparedStatement preparedStatement1 = null;
        try {
            preparedStatement1 = getDbConnection().prepareStatement(s);
            preparedStatement1.setString(1, m);
            resultSet = preparedStatement1.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resultSet;
    }

    public ResultSet serchdistr(String m){
        ResultSet resultSet = null;
        String s  = "SELECT " + Const.THEATER_NAME + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_DISTRICT + "=?";
        PreparedStatement preparedStatement1 = null;
        try {
            preparedStatement1 = getDbConnection().prepareStatement(s);
            preparedStatement1.setString(1, m);
            resultSet = preparedStatement1.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resultSet;
    }

    public ResultSet serchstation(String m){
        ResultSet resultSet = null;
        String s  = "SELECT " + Const.THEATER_NAME + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_STATION + "=?";
        PreparedStatement preparedStatement1 = null;
        try {
            preparedStatement1 = getDbConnection().prepareStatement(s);
            preparedStatement1.setString(1, m);
            resultSet = preparedStatement1.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resultSet;
    }

    public ResultSet serchtype(String m){
        ResultSet resultSet = null;
        String s  = "SELECT " + Const.THEATER_NAME + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_TYPE + "=?";
        PreparedStatement preparedStatement1 = null;
        try {
            preparedStatement1 = getDbConnection().prepareStatement(s);
            preparedStatement1.setString(1, m);
            resultSet = preparedStatement1.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resultSet;
    }

    public ResultSet serchtime(String m){
        ResultSet resultSet = null;
        String s  = "SELECT " + Const.THEATER_NAME + " FROM " + Const.THEATER_TABLE + " WHERE " + Const.THEATER_TIME + "=?";
        PreparedStatement preparedStatement1 = null;
        try {
            preparedStatement1 = getDbConnection().prepareStatement(s);
            preparedStatement1.setString(1, m);
            resultSet = preparedStatement1.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resultSet;
    }

    public void setTheater(String name, String type, String street, String district, String station, String time, String s2d, String s3d, String ssub, String scafe, String sinv, String svip, String swifi,
                           String house, String phone){

        System.out.println(name);
        System.out.println(phone);
        System.out.println(house);

        String loc = "г. Минск, " + street + ", " + house;
       String in = "INSERT INTO " + Const.THEATER_TABLE + "(" + Const.THEATER_NAME + "," + Const.THEATER_ADRESS + "," + Const.THEATER_PHONE + "," + Const.THEATER_STREET + "," + Const.THEATER_DISTRICT
               + "," + Const.THEATER_STATION + "," + Const.THEATER_TYPE + "," + Const.THEATER_TIME + "," + Const.THEATER_2D + "," + Const.THEATER_3D + "," + Const.THEATER_SUB + "," + Const.THEATER_INV
               + "," + Const.THEATER_CAFE + "," + Const.THEATER_VIP + "," + Const.THEATER_WIFI + ")" + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(in);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,loc);
            preparedStatement.setString(3,phone);
            preparedStatement.setString(4,street);
            preparedStatement.setString(5,district);
            preparedStatement.setString(6,station);
            preparedStatement.setString(7,type);
            preparedStatement.setString(8,time);
            preparedStatement.setString(9,s2d);
            preparedStatement.setString(10,s3d);
            preparedStatement.setString(11,ssub);
            preparedStatement.setString(12,sinv);
            preparedStatement.setString(13,scafe);
            preparedStatement.setString(14,svip);
            preparedStatement.setString(15,swifi);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
