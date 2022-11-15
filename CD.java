/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pichayseanproject2;

/**
 *
 * @author seanpichay
 */
public class CD extends Product {
    /**
     * CD constructor
     * @param pID
     * @param price
     * @param description 
     */
    public CD(int pID, double price, String description) {
        super(pID, price, description);
    }

    @Override
    /**
     * Returns string of CD
     */
    public String toString() {
        return "CD (ID= " + getID() + ", " + getDescription() + ", " + String.format("$%,.2f", getPrice()) + ") ";
    }
    
    @Override
    /**
     * Compares one product to another
     */
    public int compareTo(Object o) {
        return (super.compareTo(o));
    }
}
