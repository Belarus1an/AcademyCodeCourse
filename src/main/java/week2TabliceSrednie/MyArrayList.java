package week2TabliceSrednie;

public class MyArrayList {

    private int mr[];
    private int putloc, getloc, size;

    MyArrayList(int size){

        this.size = size;
        mr = new  int[size];
        putloc = getloc = 0;
    }

    void put(int num){
        if (putloc == mr.length){
            System.out.println(" -- kolejka pelna");
            return;
        }
        mr[putloc++] = num;
    }

    int get(){
        if (getloc == putloc){
            System.out.println(" -- kolejka pusta");
            return 0;
        }
        return mr[getloc++];
    }

    int size(){
        return size;
    }
}
