package week3OOP.blok;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    public static void main(String[] args) {

        Post post1 = new Post("Programowanie w Jawie to przygoda", "Programowanie jest super", "Jan");
        Post post2 = new Post("W Ruby wystepuja wszystkie zmienne", "Programowanie w Roby", "Bob");

        List<Post> postList = new ArrayList<>();
        postList.add(post1);
        postList.add(post2);

        Post.findAll(postList);
    }
}
