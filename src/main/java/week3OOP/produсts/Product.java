package week3OOP.produсts;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private int idProduct;
    private int idCategory;
    private String name;

    public Product(int idProduct, int idCategory, String name) {
        this.idProduct = idProduct;
        this.idCategory = idCategory;
        this.name = name;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public static void showProduct(List<Product> products){

        for (Product value: products){
            System.out.println(value.getName());
        }
    }
}
