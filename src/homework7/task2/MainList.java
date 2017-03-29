package homework7.task2;

import homework7.*;
import homework7.task1.Order;
import homework7.task1.User;

import java.util.*;

public class MainList {

    private static final int COUNT_OF_ORDER = 10;
    private static final Random RAND = new Random();

    public static void main(String[] args) {

        List<Order> orderList = initOrders(COUNT_OF_ORDER);

        System.out.println("sort by price:");
        System.out.println(orderList);
        orderList.sort(Comparators.COMPARE_BY_PRICE);
        System.out.println(orderList);

        orderList = initOrders(COUNT_OF_ORDER);

        System.out.println("sort by price and city:");
        System.out.println(orderList);
        orderList.sort(Comparators.COMPARE_BY_PRICE_AND_CITY);
        System.out.println(orderList);

        orderList = initOrders(COUNT_OF_ORDER);

        System.out.println("sort by name,id and city:");
        System.out.println(orderList);
        orderList.sort(Comparators.COMPARE_BY_NAME_AND_ID_AND_CITY);
        System.out.println(orderList);

    }

    private static List<Order> initOrders(int length){
        List<Order> orderList = new ArrayList<>(length);

        for (int i = 0; i < length; i++) {
            int randIndexUser = RAND.nextInt(100) /10;
            int randIndexOrder = RAND.nextInt(500) /10;

            User user = new User(i,"FN"+randIndexUser,"LN"+randIndexUser, "city"+randIndexUser,5000+randIndexUser);
            Order order = new Order(i,100+randIndexOrder, Currency.getInstance("UAH"), "itemName"+randIndexOrder, "shopID"+randIndexOrder,user );
            orderList.add(order);
        }

        return orderList;

    }

}
