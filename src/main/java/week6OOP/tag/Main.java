package week6OOP.tag;

public class Main {

    public static void main(String[] args) {

        Post post = new Post("Programowanie jest super", "Pavel");
        post.addTag(new Tag("programowanie"));
        post.addTag(new Tag("java"));
        post.addTag(new Tag("programowanie"));

        System.out.println(post);
    }
}
