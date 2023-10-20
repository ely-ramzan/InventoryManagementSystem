import java.util.*;
import java.io.*;

public class Inventory {
    private Products listProducts[];
    private int counter = 0;
    private double[] monthlySales;
    private int index = 0;
    public Inventory(int size) {
        if (size > 0)
            this.listProducts = new Products[size];
        monthlySales = new double[12];
    }

    public boolean addProduct(Object o) {
        if((Products) o != null)
            if (counter < listProducts.length) {
                listProducts[counter] = (Products) o;
                counter++;
                return true;
            }
        return false;
    }

    public boolean removeProduct(Object o) {
        for (int i = 0; i < listProducts.length; i++) {
            if (listProducts[i] != null) {
                if (listProducts[i].equals((Products) o)) {
                    monthlySales[index++] = listProducts[i].getPrice();
                    listProducts[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeProduct(String id) {
        for (int i = 0; i < listProducts.length; i++) {
            if (listProducts[i] != null){
                if (listProducts[i].getProductID().equals(id)) {
                    monthlySales[index++] = listProducts[i].getPrice();
                    listProducts[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public String searchProduct(String id) {
        for (int i = 0; i < listProducts.length; i++) {
            if (listProducts[i] != null) {
                if (listProducts[i].getProductID().equals(id)) {
                    return "Product found at index " + i + " of listProducts";
                }
            }
        }
        return "Product not found";
    }

    public String searchProduct(Object o) {
        for (int i = 0; i < listProducts.length; i++) {
            if (listProducts[i] != null) {
                if (listProducts[i].equals((Products) o)) {
                    return "Product found at index " + i + " of listProducts";
                }
            }
        }
        return "Product not found";
    }

    public Products retrieveProduct(Object o) {
        for (int i = 0; i < listProducts.length; i++) {
            if (listProducts[i] != null) {
                if (listProducts[i].equals((Products) o)) {
                    return listProducts[i];
                }
            }
        }
        return null;
    }

    public Products retrieveProduct(String id) {
        for (int i = 0; i < listProducts.length; i++) {
            if (listProducts[i] != null) {
                if (listProducts[i].getProductID().equals(id)) {
                    return listProducts[i];
                }
            }
        }
        return null;
    }

    public void displayList() {
        for (Products p : listProducts) {
            int i = 0;
            if (p != null)
                System.out.println(p + "at index: " + i++);
        }
    }

    public void displayList(int minStockQuantity) {
        for (Products p : listProducts) {
            if (p != null)
                if (p.getStockQuantity() > minStockQuantity) {
                    System.out.println(p + ":\nStock present: " + p.getStockQuantity());
                    if(p.getStockQuantity() == 0)
                        System.out.println("This Product is out of Stock");
                }
        }
    }

    public boolean updateProduct(String id, double price) {
        for (int i = 0; i < listProducts.length; i++) {
            if (listProducts[i] != null) {
                if (listProducts[i].getProductID().equals(id)) {
                        listProducts[i].updateProductPrice(price);
                        return true;
                }
            }
        }
        return false;
    }
    public boolean updateProduct(String id, int stocks) {
        for (int i = 0; i < listProducts.length; i++) {
            if (listProducts[i] != null) {
                if (listProducts[i].getProductID().equals(id)) {
                    listProducts[i].updateProductStock(stocks);
                    return true;
                }
            }
        }
        return false;
    }

    public void displayMonthlyExpenses(){
        int count = 0;
        double sum = 0;
        for(double i:monthlySales){
            if(i != 0.0) {
                System.out.println("Month " + (count + 1) + "has sale of " + monthlySales[count]);
                sum += monthlySales[count];
            }
            count ++;
        }
        System.out.println("Total revenue for all months = " + sum);
    }
    @Override
    public String toString() {
        return "Inventory{" +
                "listProducts=" + Arrays.toString(listProducts) +
                ", counter=" + counter +
                '}';
    }
    public int checkProducts(){
        int counter = 0;
        for(Products p:listProducts){
            if(p != null)
                counter++;
        }
        return counter;
    }
}

