import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class PropertiesFileRead {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Kuldeep\\Framework\\src\\test\\resources\\environment.properties";
        Properties pros;
        String url;
        String browser;
        pros = new Properties();
        FileInputStream ip = new FileInputStream(filePath);
        pros.load(ip);
        url= pros.getProperty("url");
        System.out.println("****"+url+"****");
    }
}
