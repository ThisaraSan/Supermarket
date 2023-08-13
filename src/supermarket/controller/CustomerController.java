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
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Dell
 */
public class CustomerController {

    public String saveCustomr(CustomerModel customerModel) throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();

        String query = "INSERT INTO customer VALUES (?,?,?,?,?,?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, customerModel.getCustId());
        preparedStatement.setString(2, customerModel.getCustTitle());
        preparedStatement.setString(3, customerModel.getCustName());
        preparedStatement.setString(4, customerModel.getCustDob());
        preparedStatement.setDouble(5, customerModel.getCustSalary());
        preparedStatement.setString(6, customerModel.getCustAddress());
        preparedStatement.setString(7, customerModel.getCustCity());
        preparedStatement.setString(8, customerModel.getCustProvince());
        preparedStatement.setString(9, customerModel.getCustZip());

        if (preparedStatement.executeUpdate() > 0) {
            return "Succuss";
        } else {
            return "Fail";
        }

    }

    public ArrayList<CustomerModel> loadAllCustomers() throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String query = "SELECT * FROM customer";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet rst = statement.executeQuery();
        ArrayList<CustomerModel> customerModels = new ArrayList<>();

        while (rst.next()) {
            CustomerModel customerModel = new CustomerModel(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));

            customerModels.add(customerModel);
        }

        return customerModels;
    }

    public CustomerModel getCustomer(String custID) throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String query = "SELECT * FROM customer WHERE custID=?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, custID);
        ResultSet rst = statement.executeQuery();

        while (rst.next()) {
            CustomerModel cm = new CustomerModel(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));

            return cm;
        }
        return null;
    }

}
