package com.tasks;
import java.util.ArrayList;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
public class FilloSelectDemo {
	public static void main(String args[]) throws FilloException{
	Fillo fillo=new Fillo();
	Connection connection=fillo.getConnection("C:/Users/user/Desktop/Students.xlsx");
	String strQuery="select * from UserData";
	Recordset resultSet=connection.executeQuery(strQuery);
	System.out.println("Total No of Rows :: "+resultSet.getCount());
	int i=0;
	ArrayList<String> data=new ArrayList<>();
	
	while(i<resultSet.getFieldNames().size()){
		System.out.println(resultSet.getFieldNames().get(i));
		i++;
	}
	resultSet.getFieldNames().get(0);
	System.out.println("Total No Of Columns :: "+resultSet.getFieldNames().size());
	while(resultSet.next()){
		System.out.println(resultSet.getField("FirstName")+"  "+resultSet.getField("LastName")+" "+resultSet.getField("E-mail"));
	    data.add(resultSet.getField("E-mail"));
	}
	
	resultSet.moveLast();
	System.out.println(resultSet.getField("FirstName")+"  "+resultSet.getField("LastName")+" "+resultSet.getField("E-mail"));

	 for(String list : data){
		 System.out.println(list);
	 }
	 
	resultSet.close();
	connection.close();
	
  }
}
