package finalProject.recipe;

import java.sql.*;
import java.util.Vector;

public class RecipeDAO
{
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/recipe?useSSl=false&allowPublicKeyRetrieval=true";

    private final String UserName = "root";
    private final String Password = "kami@@1202";

    public RecipeDAO()
    {

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
