package homework7.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestListMetods {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        listAdd(arrayList,1000);
        listAdd(linkedList,1000);

        listSet(arrayList);
        listSet(linkedList);

        listGet(arrayList);
        listGet(linkedList);

        listRemove(arrayList);
        listRemove(linkedList);


        arrayList.clear();
        linkedList.clear();

        listAdd(arrayList,10000);
        listAdd(linkedList,10000);

        listSet(arrayList);
        listSet(linkedList);

        listGet(arrayList);
        listGet(linkedList);

        listRemove(arrayList);
        listRemove(linkedList);

    }


    private static long getTime(){
        return System.nanoTime();
    }


    private static void listAdd(List<Integer> innerList, int length){

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

    private static void listSet(List<Integer> innerList){

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

    private static void listGet(List<Integer> innerList){

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

        int tmp;
        long start = getTime();
        for (int i = 0; i < length; i++) {
            tmp = innerList.get(i);
        }
        long finish = getTime();
        System.out.println(finish - start);

    }

    private static void listRemove(List<Integer> innerList){

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
