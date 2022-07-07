package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
public Configuration_Reader() throws IOException {


	File f = new File("C:\\Users\\Vanitha\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties\\inputs.properties");
	FileInputStream fis = new FileInputStream(f);
	
	p = new Properties();
	p.load(fis);

}

public String getUrl() {

String url = p.getProperty("url");
return url;

}

public String getUname() {

String uname = p.getProperty("uname");
return uname;

}

public String getPass() {

String pass = p.getProperty("pass");
return pass;

}

public String getLocation() {

String location = p.getProperty("location");
return location;

}

public String getHotels() {

String hotels = p.getProperty("hotels");
return hotels;

}

public String getRoom_type() {

String room_type = p.getProperty("room_type");
return room_type;

}

public String getRoom_nos() {

String room_nos = p.getProperty("room_nos");
return room_nos;

}

public String getAdult_room() {

String adult_room = p.getProperty("adult_room");
return adult_room;

}

public String getChild_room() {

String child_room = p.getProperty("child_room");
return child_room;

}

public String getFname() {

String fname = p.getProperty("fname");
return fname;

}

public String getLname() {

String lname = p.getProperty("lname");
return lname;

}

public String getAddress() {

String address = p.getProperty("address");
return address;

}

public String getCno() {

String cno = p.getProperty("cno");
return cno;

}

public String getCtype() {

String ctype = p.getProperty("ctype");
return ctype;

}

public String getExpmon() {

String expmon = p.getProperty("expmon");
return expmon;

}

public String getExpyear() {

String expyear = p.getProperty("expyear");
return expyear;

}

public String getCvv() {

String cvv = p.getProperty("cvv");
return cvv;

}

public String getReportConfigPath(){
	String reportConfigPath = p.getProperty("reportConfigPath");
	if(reportConfigPath!= null) return reportConfigPath;
	else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
}
	
}
