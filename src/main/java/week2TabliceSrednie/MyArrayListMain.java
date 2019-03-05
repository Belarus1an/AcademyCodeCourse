package week2TabliceSrednie;

public class MyArrayListMain {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList(6);

        for (int i = 0; i < myArrayList.size(); i++) {
            myArrayList.put(i);
        }

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get());
        }
    }
}
