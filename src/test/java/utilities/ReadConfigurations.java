package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigurations {

	Properties pro;
	public ReadConfigurations() {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\AmazonFramework\\Configurations\\config.properties");

		try {

			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getUrl() {
		String url=pro.getProperty("url");
		return url;
	}
	
	public String getUsername() {
		String uname= pro.getProperty("id");
		return uname;
	}
	
	public String getPassword() {
		String passwd= pro.getProperty("pwd");
		return passwd;
	}
}
