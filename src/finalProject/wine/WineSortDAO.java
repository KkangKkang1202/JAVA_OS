package finalProject.wine;

import java.sql.*;
import java.util.TreeMap;

public class WineSortDAO
{
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/red_wine?&useSSL=false&allowPublicKeyRetrieval=true";

    private final String USER_NAME = "root";
    private final String PASSWORD = "kami@@1202";

    public WineSortDAO()
    {

    }
    public void getDataRed(TreeMap<String,String> hashMap)
    {
        Connection connection = null;
        Statement statement = null;

        try
        {
            Class.forName(this.JDBC_DRIVER);
            connection = DriverManager.getConnection(this.DB_URL,this.USER_NAME,this.PASSWORD);
            statement = connection.createStatement();

            String sql = "SELECT * FROM red_wine_sort.red_wine";
            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next())
            {
                hashMap.put(resultSet.getString("Wine"), resultSet.getString("Taste"));

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

    public void getDataWhite(TreeMap<String,String> hashMap)
    {
        Connection connection = null;
        Statement statement = null;

        try
        {
            Class.forName(this.JDBC_DRIVER);
            connection = DriverManager.getConnection(this.DB_URL,this.USER_NAME,this.PASSWORD);
            statement = connection.createStatement();

            String sql = "SELECT * FROM white_wine_sort.white_wine";
            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next())
            {
                hashMap.put(resultSet.getString("Wine"), resultSet.getString("Taste"));

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

    public void getDataRose(TreeMap<String,String> hashMap)
    {
        Connection connection = null;
        Statement statement = null;

        try
        {
            Class.forName(this.JDBC_DRIVER);
            connection = DriverManager.getConnection(this.DB_URL,this.USER_NAME,this.PASSWORD);
            statement = connection.createStatement();

            String sql = "SELECT * FROM rose_wine_sort.rose_wine";
            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next())
            {
                hashMap.put(resultSet.getString("Wine"), resultSet.getString("Taste"));

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
