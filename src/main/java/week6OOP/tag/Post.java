package week6OOP.tag;

import java.util.HashSet;
import java.util.Set;

public class Post implements Tagable{

    private String title;
    private String author;
    private Set<Tag> tagList;

    public Post(String title, String author) {
        this.title = title;
        this.author = author;
        this.tagList = tagList = new HashSet<>();
    }

    @Override
    public void addTag(Tag tag){
        boolean index = false;
        for (Tag tag1 : tagList){
            if (tag1.getTitle().equals(tag.getTitle())){
                index = true;
            }
        }

        if (!index){
            tagList.add(tag);
        }
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", tagList=" + tagList +
                '}';
    }
}
