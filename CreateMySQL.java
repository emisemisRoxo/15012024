import java.sql.*;

public class CreateMySQL {
    public static void main(String[] args) {
        String status = "Nada aconteceu ainda";
        try {    
        String strCreateTable = "CREATE TABLE `mysql_conector`.`new_table` (`ID` INT NOT NULL AUTO_INCREMENT,`nome` VARCHAR(45) NULL, PRIMARY KEY (`ID`));";
            Connection conn = App.conectar();
            Statement stmSql = conn.createStatement();
            stmSql.addBatch(strCreateTable);
            stmSql.executeBatch();
            stmSql.close();
            status = "Ok! Tabela criada com sucesso.";
         } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
         }
         System.out.println(status);
    }
}
