package com.tasks;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class YouTubeMateFillo {
	
	public static void filloexcel(String path,String userData) throws Exception{
	Fillo fillo=new Fillo();
	Connection conn=fillo.getConnection(path);
	String strQuery="select * from urlData";
    Recordset resultSet=conn.executeQuery(strQuery);
    System.out.println("No Of Rows :: "+resultSet.getCount());
    System.out.println("No Of Columns :: "+resultSet.getFieldNames().size());
    
    
    while(resultSet.next()){
    	String data=resultSet.getField("Url Path-Rangastalam");
    	System.out.println(data);
    }
  }
}
