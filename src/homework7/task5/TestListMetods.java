package homework7.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestListMetods {

    public static void main(String[] args) {
        System.out.println("Integer:");
        ArrayList<Integer> integerArrayList = initList(1000);
        LinkedList<Integer> integerLinkedList = new LinkedList<>(integerArrayList);

        testAdd(integerArrayList);
        testAdd(integerLinkedList);

        testSet(integerArrayList);
        testSet(integerLinkedList);

        testGet(integerArrayList);
        testGet(integerLinkedList);

        testRemove(integerArrayList);
        testRemove(integerLinkedList);

        integerArrayList = initList(10000);
        integerLinkedList = new LinkedList<>(integerArrayList);

        testAdd(integerArrayList);
        testAdd(integerLinkedList);

        testSet(integerArrayList);
        testSet(integerLinkedList);

        testGet(integerArrayList);
        testGet(integerLinkedList);

        testRemove(integerArrayList);
        testRemove(integerLinkedList);

        System.out.println("String");
        ArrayList<String> stringArrayList = initList(1000);
        LinkedList<String> stringLinkedList = new LinkedList<>(stringArrayList);

        testAdd(stringArrayList);
        testAdd(stringLinkedList);

        testSet(stringArrayList);
        testSet(stringLinkedList);

        testGet(stringArrayList);
        testGet(stringLinkedList);

        testRemove(stringArrayList);
        testRemove(stringLinkedList);

        stringArrayList = initList(10000);
        stringLinkedList = new LinkedList<>(stringArrayList);

        testAdd(stringArrayList);
        testAdd(stringLinkedList);

        testSet(stringArrayList);
        testSet(stringLinkedList);

        testGet(stringArrayList);
        testGet(stringLinkedList);

        testRemove(stringArrayList);
        testRemove(stringLinkedList);

    }

    private static ArrayList initList(int lengts){

        ArrayList returnList = new ArrayList();
        for (int i = 0; i < lengts; i++) {
            returnList.add(i,i);
        }

        return returnList;
    }

    private static long getTime(){
        return System.nanoTime();
    }

    private static void testAdd(List innerList){
        if(innerList instanceof ArrayList){
            System.out.println("ArrayList add");
        }

        if(innerList instanceof LinkedList){
            System.out.println("LinkedList add");
        }
        long start = getTime();
        innerList.add(777);
        long finish = getTime();
        System.out.println(finish - start);
    }

    private static void testSet(List innerList){
        if(innerList instanceof ArrayList){
            System.out.println("ArrayList set");
        }

        if(innerList instanceof LinkedList){
            System.out.println("LinkedList set");
        }
        long start = getTime();
        innerList.set(777,777);
        long finish = getTime();
        System.out.println(finish - start);
    }

    private static void testGet(List innerList){
        if(innerList == null){
            return;
        }

        if(innerList instanceof ArrayList){
            System.out.println("ArrayList get");
        }

        if(innerList instanceof LinkedList){
            System.out.println("LinkedList get");
        }

        long start = getTime();
        innerList.get(777);
        long finish = getTime();
        System.out.println(finish - start);

    }

    private static void testRemove(List innerList){
        if(innerList == null){
            return;
        }

        if(innerList instanceof ArrayList){
            System.out.println("ArrayList remove");
        }

        if(innerList instanceof LinkedList){
            System.out.println("LinkedList remove");
        }

        long start = getTime();
        innerList.remove(777);
        long finish = getTime();
        System.out.println(finish - start);

    }

}
