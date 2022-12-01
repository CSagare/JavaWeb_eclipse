package dao;

import model.Customer;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.DbConnection;
public class CustomerController {

    DbConnection db;

      public int createAccount(Customer customer){
//        String query;
    	  try {
        PreparedStatement stmt=db.con.prepareStatement("insert into customer(fname,lname,address,phNumber,username,password) values(?,?,?,?,?,?)");
        		
                  		
        	stmt.setString(1,customer.getFName());

        	stmt.setString(2,customer.getLName());
            stmt.setString(3,customer.getAddress());
            stmt.setString(4,customer.getPhoneno());
            stmt.setString(5,customer.getUsername());
            stmt.setString(6,customer.getPassword());  
            return db.manipulate(stmt);
//        query="insert into customer(fName,lName,address,phNumber,accTypeId,balance) values('"+
//         customer.getFName()+"','"+
//          customer.getLName()+"',"+
//          customer.getAddress()+"','"+
//         customer.getPhoneno()+"','"+
////         customer.getAccTypeId()+"','"+
//         customer.getUsername()+"','"+
//         customer.getPassword()+"');";
    	  }catch(SQLException e){
    		  e.printStackTrace();
    		  return 0;

      }
      }

    


    
}
