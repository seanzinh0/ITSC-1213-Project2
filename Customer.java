/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pichayseanproject2;

/**
 *
 * @author seanpichay
 */
public class Customer {

    private String firstName;
    private String lastName;
    private int ID;
    private double moneySpent;
    private boolean isPaid;
    private boolean isPremiumMember;
    private String paymentMethod;
    /**
     * Customer constructor
     * @param firstName
     * @param lastName
     * @param ID
     * @param moneySpent
     * @param isPaid
     * @param isPremiumMember
     * @param payMethod 
     */
    public Customer(String firstName, String lastName, int ID, double moneySpent, boolean isPaid, boolean isPremiumMember, String payMethod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.moneySpent = moneySpent;
        this.paymentMethod = paymentMethod;
        this.isPaid = isPaid;
        this.isPremiumMember = isPremiumMember;
    }
    /**
     * Returns customer first name
     * @return 
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Returns customer last name
     * @return 
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Returns customer ID
     * @return 
     */
    public int getID() {
        return ID;
    }
    /**
     * Returns money spent
     * @return 
     */
    public double getMoneySpent() {
        return moneySpent;
    }
    /**
     * Sets first name of customer
     * @param firstName 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Sets last name of customer
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Sets money spent
     * @param moneySpent 
     */
    public void setMoneySpent(double moneySpent) {
        this.moneySpent = moneySpent;
    }
    /**
     * Return true or false if customer has paid
     * @return 
     */
    public boolean isPaid() {
        return isPaid;
    }
    /**
     * Return true or false if customer is premium member
     * @return 
     */
    public boolean isPremiumMember() {
        return isPremiumMember();
    }
    /**
     * Return payment method
     * @return 
     */
    public String paymentMethod() {
        return paymentMethod;
    }
    /**
     * Set if customer has paid or not
     * @param isPaid 
     */
    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
    /**
     * Sets whether or not a customer is a premium member
     * @param isPremiumMember 
     */
    public void setIsPremiumMember(boolean isPremiumMember) {
        this.isPremiumMember = isPremiumMember;
    }
    /**
     * Sets payment method
     * @param paymentMethod 
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    /**
     * Converts customer toString
     */
    public String toString() {
        return "Customer (" + "Name: " + firstName + " " + lastName + ", ID: " + ID + ", Money Spent: " + String.format("$%,.2f", getMoneySpent()) + ", Membership Paid?(t/f) " + isPaid + ", Premium Member? " + isPremiumMember + ", Payment Method: " + paymentMethod + ")";
    }

}
