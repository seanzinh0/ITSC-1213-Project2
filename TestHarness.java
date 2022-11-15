/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pichayseanproject2;

/**
 *
 * @author seanpichay
 */
import java.util.ArrayList;
import java.util.Scanner;

public class TestHarness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventory i = new Inventory();
        Scanner sc = new Scanner(System.in);

        ArrayList<Customer> members = new ArrayList<>();
        ArrayList<Customer> premiumMembers = new ArrayList<>();
        int pause = 1000;
        boolean isMenuRunning = true;

        //Start displaying menu
        while (isMenuRunning) {
            System.out.println("Please Type The Number that Corresponds With Your Selection");
            System.out.println("\t 1. Make a Purchase");
            System.out.println("\t 2. View Catalog");
            System.out.println("\t 3. Cancel Premium Membership");
            System.out.println("\t 4. View Membership Status");
            System.out.println("\t 5. Restock Product");
            System.out.println("\t 6. Inventory Total Value");
            System.out.println("\t 7. Compare Products");
            System.out.println("\t 8. Exit");

            int menuNum = sc.nextInt();
            switch (menuNum) {
                //Sets up membership and allows for purchase to be made.
                case 1:
                    System.out.println("Please Enter First Name");
                    String fName = sc.next();
                    System.out.println("Please Enter Last Name");
                    String lName = sc.next();
                    System.out.println("Please enter your Membership ID");
                    int cID = sc.nextInt();
                    System.out.println("Would you like to register as a Premium Member for a $15 monthly fee(y/n)");
                    String mem = sc.next();
                    int fee = 15;
                    if (mem.equalsIgnoreCase("Y")) {
                        boolean isCorrect = false;
                        while (!isCorrect) {
                            System.out.println("Please enter desired payment method(debit/credit)");
                            String method = sc.next();
                            if (method.equalsIgnoreCase("credit") || method.equalsIgnoreCase("debit")) {
                                isCorrect = true;
                                i.display();
                                Customer c = new Customer(fName, lName, cID, fee, true, true, "");
                                boolean correctItem = false;
                                while (!correctItem) {
                                    System.out.println("Would you like to purchase a Book, a CD, or a DVD");
                                    String itemChoice = sc.next();
                                    if (itemChoice.equalsIgnoreCase("Book")) {
                                        correctItem = true;
                                        System.out.println("Please enter the Books ID: ");
                                        int bID = sc.nextInt();
                                        System.out.println("Please enter the price of the Book: $ ");
                                        double bPrice = sc.nextDouble();
                                        i.removeProduct(bID);
                                        c.setMoneySpent(bPrice + fee);
                                    } else if (itemChoice.equalsIgnoreCase("CD")) {
                                        correctItem = true;
                                        System.out.println("Please enter the CDs ID:");
                                        int cDID = sc.nextInt();
                                        System.out.println("Please enter the price of the CD: $ ");
                                        double cPrice = sc.nextDouble();
                                        i.removeProduct(cDID);
                                        c.setMoneySpent(cPrice + fee);
                                    } else if (itemChoice.equalsIgnoreCase("DVD")) {
                                        correctItem = true;
                                        System.out.println("Please enter the DVDs ID: ");
                                        int dID = sc.nextInt();
                                        System.out.println("Please enter the price of the DVD: $ ");
                                        double dPrice = sc.nextDouble();
                                        i.removeProduct(dID);
                                        c.setMoneySpent(dPrice + fee);
                                    } else {
                                        System.out.println("Please Enter One of The Listed Numbers.");
                                    }
                                }
                                c.setPaymentMethod(method);
                                premiumMembers.add(c);
                            } else {
                                System.out.println("Please enter either debit or credit.");
                            }
                        }
                    } else if (mem.equalsIgnoreCase("N")) {
                        i.display();
                        Customer c = new Customer(fName, lName, cID, 0.0, false, false, "");
                        System.out.println("Would you like to purchase a Book, a CD, or a DVD");
                        String itemChoice = sc.next();
                        if (itemChoice.equalsIgnoreCase("Book")) {
                            System.out.println("Please enter the Books ID: ");   
                            int bID = sc.nextInt();
                            System.out.println("Please enter the price of the Book: $ ");                            
                            double bPrice = sc.nextDouble();
                            i.removeProduct(bID);
                            c.setMoneySpent(bPrice);
                        } else if (itemChoice.equalsIgnoreCase("CD")) {
                            System.out.println("Please enter the CDs ID:");                            
                            int cDID = sc.nextInt();
                            System.out.println("Please enter the price of the CD: $ ");
                            double cPrice = sc.nextDouble();                            
                            i.removeProduct(cDID);
                            c.setMoneySpent(cPrice);
                        } else if (itemChoice.equalsIgnoreCase("DVD")) {
                            System.out.println("Please enter the DVDs ID: ");                            
                            int dID = sc.nextInt();
                            System.out.println("Please enter the price of the DVD: $ ");                            
                            double dPrice = sc.nextDouble();
                            i.removeProduct(dID);
                            c.setMoneySpent(dPrice);
                        }
                        c.setPaymentMethod("null");
                        members.add(c);
                    }
                    System.out.println("Members: " + members);                    
                    System.out.println("Premium Members" + premiumMembers);                    
                    break;
                //Displays inventory.
                case 2:
                    i.display();
                    i.display();
                    break;
                //Cancels premium membership.
                case 3:
                    System.out.println("Members" + members);                    
                    System.out.println("Premium Members" + premiumMembers);                    
                    boolean correctID = false;
                    while (!correctID) {
                        System.out.println("Please enter an ID for your Premium Membership");                       
                        int mID = sc.nextInt();
                        for (int m = 0; m < premiumMembers.size(); m++) {
                            if (mID == premiumMembers.get(m).getID()) {
                                correctID = true;
                                members.add(premiumMembers.get(m));
                                premiumMembers.remove(m);
                                members.get(m).setIsPremiumMember(false);
                                members.get(m).setIsPaid(false);
                            } else {
                                System.out.println("Please enter an ID for your Premium Membership");                                
                            }
                        }
                    }
                    System.out.println("Members: " + members);                    
                    System.out.println("Premium Members: " + premiumMembers);                    
                    break;
                //View status of memberships.
                case 4:
                    System.out.println("Members: ");                    
                    if (members.size() <= 0) {
                        System.out.println("There are not currently any members!");                        
                    } else {
                        for (Customer member : members) {
                            System.out.println(members);                            
                        }
                    }
                    System.out.println("Premium Members: ");                    
                    if (premiumMembers.size() <= 0) {
                        System.out.println("There are not currently any Premium Memberships Open!");
                    } else {
                        for (Customer pMembers : premiumMembers) {
                            System.out.println(pMembers);
                        }
                    }
                    break;
                //Restock product.    
                case 5:
                    System.out.println("Restock Menu:");
                    System.out.println("Restocking Adds One Item at a Time");
                    i.restockProduct();
                    break;
                //Total Inventory Value.    
                case 6:
                    System.out.println("Total value of inventory is: ");
                    i.inventoryValue();
                    break;
                //Compare Products.    
                case 7:
                    i.display();
                    System.out.println("Please enter Product One ID");
                    int temp = sc.nextInt();

                    System.out.println("Please enter Product Two ID");
                    int temp2 = sc.nextInt();
                    int t = 0;
                    for (int p = 0; p < i.getSize(); p++) {
                        if (temp == i.getProduct(p).getID()) {
                            t = p;
                            p += i.getSize();
                        }
                    }
                    int f = 0;

                    for (int b = 0; b < i.getSize(); b++) {
                        if (temp2 == i.getProduct(b).getID()) {
                            f = b;
                            b += i.getSize();
                        }
                    }
                    int compared = i.getProduct(t).compareTo(i.getProduct(f));
                    if (compared == -1) {
                        System.out.println("Product One Is Less Expensive Than Product Two");
                    } else if (compared == 1) {
                        System.out.println("Product Two Is Less Expensive Than Product One");
                    } else {
                        System.out.println("Product Ones Value is Equal to Product Twos Value");
                    }
                    break;  
                //Exit program
                case 8:
                    System.exit(0);
                    break;
                default:
                   System.out.println("Please enter 1,2,3,4, or 5.");
            }
        }
    }

}
