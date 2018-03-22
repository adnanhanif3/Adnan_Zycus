package customKeywords

import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

import com.kms.katalon.core.annotation.Keyword




public class database {
	
	private static Connection connection = null;
	
   /**
	
   * Open and return a connection to database
	
   * @param dataFile absolute file path
	
   * @return an instance of java.sql.Connection
	
   */
	
   //Establishing a connection to the DataBase
	
   @Keyword
	
  def connectDB(){
    Class.forName("oracle.jdbc.driver.OracleDriver")
    //String connectionString = "jdbc:oracle:thin:username/password@ipaddress:port/servicename"
    if(connection != null && !connection.isClosed()){
        connection.close()
    }
    connection = DriverManager.getConnection("jdbc:oracle:thin:IREQUEST_QA/IREQUEST_QA@192.168.1.187:1522:oratest1")
    return connection
}
  
  
  @Keyword
  
 def executeQuery(String queryString) {
  
 Statement stm = connection.createStatement()
  
 ResultSet rs = stm.executeQuery(queryString)
 String value
 while(rs.next())
 
  value=rs.getString(1)
 
 
 return value
  
 }
 
 @Keyword
 
def closeDatabaseConnection() {
 
if(connection != null && !connection.isClosed()){
 
connection.close()
 
}
 
}
}
