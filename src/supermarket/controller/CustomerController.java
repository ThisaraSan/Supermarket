/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.controller;

import supermarket.db.DBConnection;
import supermarket.model.CustomerModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class CustomerController {
    public String saveCustomr(CustomerModel customerModel) throws SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        
        String query = "INSERT INTO customer VALUES (?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,customerModel.getCustId());
        preparedStatement.setString(2,customerModel.getCustTitle());
        preparedStatement.setString(3,customerModel.getCustName());
        preparedStatement.setString(4,customerModel.getCustDob());
        preparedStatement.setDouble(5,customerModel.getCustSalary());
        preparedStatement.setString(6,customerModel.getCustAddress());
        preparedStatement.setString(7,customerModel.getCustCity());
        preparedStatement.setString(8,customerModel.getCustProvince());
        preparedStatement.setString(9,customerModel.getCustZip());
        
        if(preparedStatement.executeUpdate()>0){
            return "Succuss";
        } else { return "Fail";}
        

    }
}
