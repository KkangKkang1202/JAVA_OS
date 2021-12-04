package finalProject.terms;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.*;
import java.util.TreeMap;


public class WineTermDAO
{
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private String DB_URL;


    private final String UserName = "project";
    private final String Password = "kami@@1202";

    private String getClientIP()
    {
        String ip;
        try
        {
            InetAddress local = InetAddress.getLocalHost();
            ip=local.getHostAddress();
        }
        catch (UnknownHostException ignored)
        {
            ip=null;
        }
        return ip;
    }

    public WineTermDAO()
    {
        this.DB_URL="jdbc:mysql://"+this.getClientIP()+":3306/wine_term?useSSl=false&allowPublicKeyRetrieval=true";
    }


    public void getData(TreeMap<String,String> hashMap)
    {
        Connection connection = null;
        Statement statement = null;

        try
        {
            Class.forName(this.JDBC_DRIVER);
            connection = DriverManager.getConnection(this.DB_URL,this.UserName,this.Password);
            statement = connection.createStatement();

            String sql = "SELECT * FROM wine_terms";
            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next())
            {
                hashMap.put(resultSet.getString("term"), resultSet.getString("mean"));

            }

            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(statement!=null)
                {
                    statement.close();
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }

            try
            {
                if(connection!=null)
                {
                    connection.close();
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }

}
