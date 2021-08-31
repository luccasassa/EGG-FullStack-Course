package persistencia;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class DAO {
    //OBJETO CONNECTION --> encargado de INICIAR-TENER-MANTENER la conexion
    protected Connection conexion = null;
    
    //OBJETO RESULSET ---> guarda todos los datos que llegan de la DB (las filas de la query)
    protected ResultSet resultado = null;
    
    //OBJETO STATEMENT ---> "TIENE" las consultas.. es donde generamos las sentencias a ejecutar
    protected Statement sentencia = null;
    
    private final String user = "root";
    private final String password = "admin";
    private final String database = "usuario";
    
    
    protected void conectarBase() throws Exception{
        try {
            //registrar el Driver de MySQL
            Class.forName("com.mysql.jdbc.Driver");
            //URL de la DB
            String urlDataBase = "jdbc:mysql://localhost:3306/" + database + "?useSSL=false";
            
            //establecemos la conexion!
            conexion = (Connection) DriverManager.getConnection(urlDataBase,user,password);
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error de sistemas");
        }
    }
    
    protected void consultarBase(String sql) throws Exception{
        try {
            //conectamos a la base
            conectarBase();
            
            //creamos la sentencia!
            sentencia = (Statement) conexion.createStatement();
            
            //ejecutamos la sentencia, y guardamos en el resultset:
            resultado = sentencia.executeQuery(sql);            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error de Consultar Base!");
        }
    }
    
    protected void desconectarBase() throws Exception{
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error de Cierre de conexion!");
        }
    }
    
}
