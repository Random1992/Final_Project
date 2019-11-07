package co.jp.bizreach.training.fishbook;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.sql. *;

@SpringBootTest
class FishbookApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test_com_mysql_jdbc_Driver_ava() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Good to Go");
        } catch (Exception e) {
            System.out.println("JDBC Driver error");;
        }
    }

    @Test
    void test_hello() {

        Hello hello=new Hello();
        hello.connectToDB();
        hello.excuteSQL();
    }
}
