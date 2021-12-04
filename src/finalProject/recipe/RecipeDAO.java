package finalProject.recipe;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.*;
import java.util.Vector;


public class RecipeDAO
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

    public RecipeDAO()
    {
        this.DB_URL="jdbc:mysql://"+this.getClientIP()+":3306/recipe?useSSl=false&allowPublicKeyRetrieval=true";
    }


    public void getDataRed(Vector<String> redWineVector)
    {
        Connection connection = null;
        Statement statement = null;

        try
        {
            Class.forName(this.JDBC_DRIVER);
            connection = DriverManager.getConnection(this.DB_URL,this.UserName,this.Password);
            statement = connection.createStatement();

            String sql = "SELECT * FROM recipes_red";
            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next())
            {
                redWineVector.add(resultSet.getString("dish"));
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

    public void getDataWhite(Vector<String> whiteWineVector)
    {
        Connection connection = null;
        Statement statement = null;

        try
        {
            Class.forName(this.JDBC_DRIVER);
            connection = DriverManager.getConnection(this.DB_URL,this.UserName,this.Password);
            statement = connection.createStatement();

            String sql = "SELECT * FROM recipes_white";
            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next())
            {
                whiteWineVector.add(resultSet.getString("dish"));
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

    public void getDataRose(Vector<String> roseWineVector)
    {
        Connection connection = null;
        Statement statement = null;

        try
        {
            Class.forName(this.JDBC_DRIVER);
            connection = DriverManager.getConnection(this.DB_URL,this.UserName,this.Password);
            statement = connection.createStatement();

            String sql = "SELECT * FROM recipes_rose";
            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next())
            {
                roseWineVector.add(resultSet.getString("dish"));
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
