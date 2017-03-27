package homework7.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestListMetods {

    public static void main(String[] args) {
        System.out.println("Integer:");
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        listAdd(integerArrayList,1000);
        listAdd(integerLinkedList,1000);

        listSet(integerArrayList);
        listSet(integerLinkedList);

        listGet(integerArrayList);
        listGet(integerLinkedList);

        listRemove(integerArrayList);
        listRemove(integerLinkedList);

        integerArrayList.clear();
        integerLinkedList.clear();

        listAdd(integerArrayList,10000);
        listAdd(integerLinkedList,10000);

        listSet(integerArrayList);
        listSet(integerLinkedList);

        listGet(integerArrayList);
        listGet(integerLinkedList);

        listRemove(integerArrayList);
        listRemove(integerLinkedList);

        System.out.println("String");
        ArrayList<String> stringArrayList = new ArrayList<>();
        LinkedList<String> stringLinkedList = new LinkedList<>();

        listAdd(stringArrayList,1000);
        listAdd(stringLinkedList,1000);

        listSet(stringArrayList);
        listSet(stringLinkedList);

        listGet(stringArrayList);
        listGet(stringLinkedList);

        listRemove(stringArrayList);
        listRemove(stringLinkedList);

        stringArrayList.clear();
        stringLinkedList.clear();

        listAdd(stringArrayList,10000);
        listAdd(stringLinkedList,10000);

        listSet(stringArrayList);
        listSet(stringLinkedList);

        listGet(stringArrayList);
        listGet(stringLinkedList);

        listRemove(stringArrayList);
        listRemove(stringLinkedList);

    }


    private static long getTime(){
        return System.nanoTime();
    }


    private static void listAdd(List innerList, int length){

        if(innerList == null){
            return;
        }

        if(innerList instanceof ArrayList){
            System.out.println(String.format("ArrayList add (%d)",length));
        }

        if(innerList instanceof LinkedList){
            System.out.println(String.format("LinkedList add (%d)",length));
        }

        long start = getTime();
        for (int i = 0; i < length; i++) {
            innerList.add(i);
        }
        long finish = getTime();
        System.out.println(finish - start);

    }

    private static void listSet(List innerList){

        if(innerList == null){
            return;
        }

        int length = innerList.size();
        if(innerList instanceof ArrayList){
            System.out.println(String.format("ArrayList set (%d)",length));
        }

        if(innerList instanceof LinkedList){
            System.out.println(String.format("LinkedList set (%d)",length));
        }

        long start = getTime();
        for (int i = 0; i < length; i++) {
            innerList.set(i,i);
        }
        long finish = getTime();
        System.out.println(finish - start);

    }

    private static void listGet(List innerList){

        if(innerList == null){
            return;
        }

        int length = innerList.size();
        if(innerList instanceof ArrayList){
            System.out.println(String.format("ArrayList get (%d)",length));
        }

        if(innerList instanceof LinkedList){
            System.out.println(String.format("LinkedList get (%d)",length));
        }

        long start = getTime();
        for (int i = 0; i < length; i++) {
            innerList.get(i);
        }
        long finish = getTime();
        System.out.println(finish - start);

    }

    private static void listRemove(List innerList){

        if(innerList == null){
            return;
        }

        int length = innerList.size();
        if(innerList instanceof ArrayList){
            System.out.println(String.format("ArrayList remove (%d)",length));
        }

        if(innerList instanceof LinkedList){
            System.out.println(String.format("LinkedList remove (%d)",length));
        }

        Iterator<Integer> iterator = innerList.iterator();

        long start = getTime();
        if(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        long finish = getTime();
        System.out.println(finish - start);

    }

}
