/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.model;

/**
 *
 * @author Dell
 */
public class CustomerModel {
    private String custId;
    private String custTitle;
    private String custDob;
    private Double custSalary;
    private String custAddress;
    private String custCity;
    private String custProvince;
    private String custZip;

    public CustomerModel() {
    }

    public CustomerModel(String custId, String custTitle, String custDob, Double custSalary, String custAddress, String custCity, String custProvince, String custZip) {
        this.custId = custId;
        this.custTitle = custTitle;
        this.custDob = custDob;
        this.custSalary = custSalary;
        this.custAddress = custAddress;
        this.custCity = custCity;
        this.custProvince = custProvince;
        this.custZip = custZip;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the custTitle
     */
    public String getCustTitle() {
        return custTitle;
    }

    /**
     * @param custTitle the custTitle to set
     */
    public void setCustTitle(String custTitle) {
        this.custTitle = custTitle;
    }

    /**
     * @return the custDob
     */
    public String getCustDob() {
        return custDob;
    }

    /**
     * @param custDob the custDob to set
     */
    public void setCustDob(String custDob) {
        this.custDob = custDob;
    }

    /**
     * @return the custSalary
     */
    public Double getCustSalary() {
        return custSalary;
    }

    /**
     * @param custSalary the custSalary to set
     */
    public void setCustSalary(Double custSalary) {
        this.custSalary = custSalary;
    }

    /**
     * @return the custAddress
     */
    public String getCustAddress() {
        return custAddress;
    }

    /**
     * @param custAddress the custAddress to set
     */
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    /**
     * @return the custCity
     */
    public String getCustCity() {
        return custCity;
    }

    /**
     * @param custCity the custCity to set
     */
    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    /**
     * @return the custProvince
     */
    public String getCustProvince() {
        return custProvince;
    }

    /**
     * @param custProvince the custProvince to set
     */
    public void setCustProvince(String custProvince) {
        this.custProvince = custProvince;
    }

    /**
     * @return the custZip
     */
    public String getCustZip() {
        return custZip;
    }

    /**
     * @param custZip the custZip to set
     */
    public void setCustZip(String custZip) {
        this.custZip = custZip;
    }

    @Override
    public String toString() {
        return "CustomerController{" + "custId=" + custId + ", custTitle=" + custTitle + ", custDob=" + custDob + ", custSalary=" + custSalary + ", custAddress=" + custAddress + ", custCity=" + custCity + ", custProvince=" + custProvince + ", custZip=" + custZip + '}';
    }
    
    
}
