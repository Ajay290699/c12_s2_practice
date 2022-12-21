package org.niit.domain;

public class Product {

    private int id;
    private String productName;
    private String productType;
    private String productManufactured;

    public Product(int id, String productName, String productType, String productManufactured) {
        this.id = id;
        this.productName = productName;
        this.productType = productType;
        this.productManufactured = productManufactured;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductManufactured() {
        return productManufactured;
    }

    public void setProductManufactured(String productManufactured) {
        this.productManufactured = productManufactured;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", productManufactured='" + productManufactured + '\'' +
                '}';
    }
}
