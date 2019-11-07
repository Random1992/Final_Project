package co.jp.bizreach.training.fishbook;

import com.fishbook.util.JDBCUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@SpringBootApplication
@RestController
public class FishbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(FishbookApplication.class, args);
    }

    @RequestMapping("/hello")
    public String greeting() {
        return "Hello World!";
    }
}

class Hello {
    Connection conn;
    private void diaplaySQLErrors (SQLException e){
        System.out.println("SQLException: " + e.getMessage());
        System.out.println("SQLState: "+e.getSQLState());
        System.out.println("VendorError: "+e.getErrorCode());
    }
    public Hello(){
    }

    public void connectToDB(){
        conn = JDBCUtil.getConn();
    }

    public void excuteSQL(){
        try {
            Statement statement= conn.createStatement();
            ResultSet rs= statement.executeQuery(
                    "SELECT * FROM userInfo"
            );
            while (rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                System.out.println("id: "+id+"\nname: "+name);
            }
            JDBCUtil.release(conn,statement,rs);
        }catch (Exception e){
            diaplaySQLErrors((SQLException) e);
        }
    }
}
