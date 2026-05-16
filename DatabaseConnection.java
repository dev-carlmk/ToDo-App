import java.sql.Connection;
import java.sql.DriverManager;
import java.io.BufferedReader;
import java.io.FileReader;

public class DatabaseConnection{
    public static Connection getConnection(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(".env"));
            String line;
            String url = "";
            String user= "";
            String password="";

            while((line = reader.readLine()) != null){
                if(line.startsWith("DB_URL=")){
                    url = line.substring(7);
                
                } else if(line.startsWith("DB_USER=")){
                    user = line.substring(8);
                
                } else if(line.startsWith("DB_PASSWORD=")){
                    password = line.substring(12);
                }
            }
            reader.close();
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);
        
        } catch (Exception e){
            System.out.println("DB Connection Error: " + e.getMessage());
            return null;
        }
    }
}