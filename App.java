import java.sql.*;


public class App {
    public static void main(String[] args) {
        System.out.println("Conectando ao banco de dados...");
        conectar();
    }
    public static Connection conectar() {

        String status = "Nada aconteceu ainda";
        String mysqlHost = "127.0.0.1";
        String mysqlDb = "mysql_connector";
        String mysqlUser = "root";
        String mysqlPassword = "123456";
        String mysqlUrl = "jdbc:mysql://" + mysqlHost + "/" + mysqlDb + "?user=" + mysqlUser + "&password=" + mysqlPassword;
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(mysqlUrl);
            status = "Conexão realizada com sucesso";
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            status = "Ops! Algo de errado não está certo com o servidor. Mensagem do servidor" + e;
        }
        System.out.println(status);
        return conn;
    }
}
