package configuration;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * in java commonly save configuration file in properties file that java support it by default
 * in other language maybe we save in .env file
 */

public class PropertiesApp {
    public static void main(String[] args) {
        System.out.println("current : " + System.getProperty("user.dir"));

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("./src/configuration/application.properties"));

            // read properties
            String port = properties.getProperty("database.port");
            System.out.println(port);
            String host = properties.getProperty("database.host");
            System.out.println(host);

            // update
            properties.put("database.ssl", "ssl");

            properties.store(new FileOutputStream("./src/configuration/application.properties"),"configuration");
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
