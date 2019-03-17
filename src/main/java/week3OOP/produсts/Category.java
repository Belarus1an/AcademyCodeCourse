package week3OOP.produсts;

import java.util.List;

public class Category {

    private int idCategory;

    public Category(int idCategory) {
        this.idCategory = idCategory;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public static void showCategory(List<Category> categories){

        for (Category value: categories){
            System.out.println("Kategoria: " + value.getIdCategory());
        }
    }
}
