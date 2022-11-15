/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pichayseanproject2;

/**
 *
 * @author seanpichay
 */
public abstract class Product implements Comparable {

    private int productID = 0;
    private String description = "";
    private double price;
    private int quantity;
    /**
     * Product constructor
     * @param productID
     * @param price
     * @param description 
     */
    public Product(int productID, double price, String description) {
        this.productID = productID;
        this.description = description;
        this.price = price;
    }
    /**
     * Returns productID
     * @return 
     */
    public int getID() {
        return productID;
    }
    /**
     * Returns price
     * @return 
     */
    public double getPrice() {
        return price;
    }
    /**
     * Sets price of product
     */
    public void setPrice() {
        this.price = price;
    }
    /**
     * Returns description
     * @return 
     */
    public String getDescription() {
        return description;
    }
    /**
     * Set productID of product
     * @param productID 
     */
    public void setID(int productID) {
        this.productID = productID;
    }
    /**
     * Sets description of product
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    /**
     * returns product in string form
     */
    public String toString() {
        return "Product: " + ", ID: " + getID() + ", " + getDescription() + ", " + getPrice();
    }

    int amount;
    
    @Override
    /**
     * Compares one product to another
     */
    public int compareTo(Object o){
        if (((Product) o).getPrice() > this.getPrice()) {
            return -1;
        } else if (((Product) o).getPrice() < this.getPrice()) {
            return 1;
        }
        return 0;
    }
}
