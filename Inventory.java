/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pichayseanproject2;

/**
 *
 * @author seanpichay
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory implements BookStoreSpecification {

    public ArrayList<Product> inventory = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    /**
     * Inventory constructor
     */
    public Inventory() {
        inventory.add(new Book(1212, 7.99, "The Giver"));
   
        inventory.add(new Book(1201, 15.99, "Lord of the Rings"));

        inventory.add(new Book(2336, 10.99, "Narnia"));

        inventory.add(new CD(2321, 12.99, "Nevermind"));

        inventory.add(new CD(2323, 8.99, "Meteora"));

        inventory.add(new CD(6366, 10.99, "In Utero"));

        inventory.add(new DVD(2343, 20.99, "Ironman"));

        inventory.add(new DVD(2322, 22.99, "The Dark Knight"));

        inventory.add(new DVD(1213, 16.99, "Star Wars"));
    }
    /**
     * Removes product from inventory
     * @param id
     * @return 
     */
    public boolean removeProduct(int id) {
        for (int i = 0; i < inventory.size(); i++) {
            if (id == inventory.get(i).getID()) {
                inventory.remove(inventory.get(i));
                return true;
            }
        }
        return false;
    }
    /**
     * Displays inventory
     */
    public void display() {
        System.out.println("");
        System.out.println("Catalog");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i));
        }

    }
    /**
     * Returns size of inventory
     * @return 
     */
    public int getSize() {
        return inventory.size();
    }
    /**
     * Returns product
     * @param tempID
     * @return 
     */
    public Product getProduct(int tempID) {
        return inventory.get(tempID);
    }
    
    @Override
    /**
     * Restocks product
     */
    public void restockProduct() { 
        System.out.println("Please enter the Product ID of one of the following that you would like to restock: ");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i));
        }
        int productID = sc.nextInt();
        for (int i = 0; i < inventory.size(); i++) {
            if (productID == inventory.get(i).getID()) {
                (inventory.get(i)).amount++;
            }
        }
        System.out.println("The Item Has Been Added");
    }

    @Override
    /**
     * Prints total value of inventory
     */
    public void inventoryValue() {
        int totalValue = 0;
        for (int i = 0; i < inventory.size(); i++) {
            totalValue += inventory.get(i).getPrice();
        }
        System.out.println(totalValue);
    }

}
