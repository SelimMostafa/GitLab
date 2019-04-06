/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;

/**
 *
 * @author solo & hend
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;
import com.mysql.cj.jdbc.MysqlDataSource;

public class MyDataSourceFactory {


    public static DataSource getMySQLDataSource() {
        Properties properties = new Properties();
        FileInputStream fileinput = null;
        MysqlDataSource mysqlDS = null;

        try {
            fileinput = new FileInputStream("db.properties");
            properties.load(fileinput);
            mysqlDS = new MysqlDataSource();
            // get the properties value
            mysqlDS.setURL(properties.getProperty("MYSQL_DB_URL"));
            mysqlDS.setUser(properties.getProperty("MYSQL_DB_USERNAME"));
            mysqlDS.setPassword(properties.getProperty("MYSQL_DB_PASSWORD"));
        } catch (IOException e) {
            e.printStackTrace();
        }
            return mysqlDS;
    }

}

