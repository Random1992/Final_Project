package com.fishbook.jdbc.test;

import com.fishbook.util.JDBCUtil;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCCRUDTests {
    @Test
    void test_jdbcutil_query() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtil.getConn();
            statement = connection.createStatement();
            String sql = "SELECT * from userInfo";
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("id :" + id + "; name :" + name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(connection, statement, resultSet);
        }
    }

    @Test
    void test_jdbcutil_insert() {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = JDBCUtil.getConn();
            statement = connection.createStatement();
            String sql = "INSERT INTO userInfo (name) VALUES ('Random')";
            int result = statement.executeUpdate(sql);

            if(result>0){
                System.out.println("Success");
            }else{
                System.out.println("Fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(connection, statement);
        }
    }

    @Test
    void test_jdbcutil_delete() {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = JDBCUtil.getConn();
            statement = connection.createStatement();
            String sql = "DELETE FROM userInfo WHERE name='Random'";
            int result = statement.executeUpdate(sql);

            if(result>0){
                System.out.println("Success");
            }else{
                System.out.println("Fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(connection, statement);
        }
    }

    @Test
    void test_jdbcutil_update() {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = JDBCUtil.getConn();
            statement = connection.createStatement();
            String sql = "UPDATE userInfo SET name='Tai' WHERE id=1";
            int result = statement.executeUpdate(sql);

            if(result>0){
                System.out.println("Success");
            }else{
                System.out.println("Fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(connection, statement);
        }
    }
}
