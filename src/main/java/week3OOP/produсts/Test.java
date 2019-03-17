package week3OOP.produсts;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Product product1 = new Product(1, 1, "Product1");
        Product product2 = new Product(2, 1, "Product2");
        Product product3 = new Product(3, 1, "Product3");

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        Category category1 = new Category(1);
        Category category2 = new Category(2);
        Category category3 = new Category(3);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(category1);
        categoryList.add(category2);
        categoryList.add(category3);

        Product.showProduct(productList);
        Category.showCategory(categoryList);

    }
}
