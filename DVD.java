/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pichayseanproject2;

/**
 *
 * @author seanpichay
 */
public class DVD extends Product {
    /**
     * DVD constructor
     * @param pID
     * @param price
     * @param description 
     */
    public DVD(int pID, double price, String description) {
        super(pID, price, description);
    }

    @Override
    /**
     * toString method that prints parameters of DVD
     */
    public String toString() {
        return "DVD(ID: " + getID() + ", " + getDescription() + ", " + String.format("$%,.2f", getPrice()) + ") ";
    }
    
    @Override
    /**
     * Compares one product to another
     */
    public int compareTo(Object o) {
        return (super.compareTo(o));
    }
}
