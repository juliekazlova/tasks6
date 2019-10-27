package by.epam.java.kazlova.linkedl;

public class Main {
    public static void main(String args[]){
        LinkedList <Integer> list=new LinkedList<>();
        list.addToEnd(1);
        list.addMassive(new Integer[]{2, 3, 5});
        list.addByIndex(2, 13);
        System.out.println(list.getStringOfList());

        list.deleteByIndex(3);
        list.deleteByData(1);
        System.out.println(list.getStringOfList());


    }
}
