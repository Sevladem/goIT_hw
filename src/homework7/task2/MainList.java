package homework7.task2;

import homework7.*;
import homework7.task1.Order;
import homework7.task1.User;

import java.util.*;

public class MainList {

    private static final int COUNT_OF_ORDER = 10;

    public static void main(String[] args) {

        List<Order> orderList = initOrder();

        System.out.println("sort by price:");
        System.out.println(orderList);
        orderList.sort(Comparators.COMPARE_BY_PRICE);
        System.out.println(orderList);

        orderList = initOrder();

        System.out.println("sort by price and city:");
        System.out.println(orderList);
        orderList.sort(Comparators.COMPARE_BY_PRICE_AND_CITY);
        System.out.println(orderList);

        orderList = initOrder();

        System.out.println("sort by name,id and city:");
        System.out.println(orderList);
        orderList.sort(Comparators.COMPARE_BY_NAME_AND_ID_AND_CITY);
        System.out.println(orderList);

    }

    private static List<Order> initOrder(){
        final Random rand = new Random();
        User user;
        Order order;
        int randIndexUser;
        int randIndexOrder;
        List<Order> orderList = new ArrayList<>(COUNT_OF_ORDER);

        for (int i = 0; i < COUNT_OF_ORDER; i++) {
            randIndexUser = rand.nextInt(100) /10;
            randIndexOrder = rand.nextInt(500) /10;

            user = new User(i,"FN"+randIndexUser,"LN"+randIndexUser, "city"+randIndexUser,5000+randIndexUser);
            order = new Order(i,100+randIndexOrder, Currency.getInstance("UAH"), "itemName"+randIndexOrder, "shopID"+randIndexOrder,user );
            orderList.add(order);
        }

        return orderList;

    }

}
