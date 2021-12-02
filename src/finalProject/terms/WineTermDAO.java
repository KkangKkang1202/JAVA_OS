package finalProject.terms;


import java.sql.*;
import java.util.TreeMap;


public class WineTermDAO
{
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DB_URL ="jdbc:mysql://localhost:3306/wine_term?useSSL=false&allowPublicKeyRetrieval=true";


    private final String UserName = "root";
    private final String Password = "kami@@1202";


    public WineTermDAO()
    {

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
