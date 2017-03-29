package homework7.task3;

import homework7.*;
import homework7.task1.Order;
import homework7.task1.User;

import java.util.*;

public class MainTreeSet {

    private static final int COUNT_OF_ORDER = 10;
    private static final Random RAND = new Random();
    public static final String LASTNAME_FOR_FIND = "Petrov";
    public static final String MESSAGE_WHEN_NOT_FIND = "In the set there is no order with the user by the lastname %s";
    public static final String MESSAGE_WHEN_FIND = "In the set there is an order with the user by the lastname %s";

    public static void main(String[] args) {
        TreeSet<Order> orderTreeSet = initOrders();
        System.out.println(orderTreeSet);
        findOrderWithUserByLastName(orderTreeSet.iterator());

        System.out.println();
        orderTreeSet = initOrders();
        System.out.println(orderTreeSet);
        System.out.println(orderTreeSet.first());

        System.out.println();
        orderTreeSet = initOrders();
        System.out.println(orderTreeSet);
        deleteOrderWithCurrency(orderTreeSet.iterator(),Currency.getInstance("USD"));
        System.out.println(orderTreeSet);

    }

    private static void deleteOrderWithCurrency(Iterator<Order> orderIterator, Currency currency) {

        while (orderIterator.hasNext()) {
            Order order = orderIterator.next();
            if (order!=null){
                if(currency.equals(order.getCurrency())){
                    orderIterator.remove();
                }
            }
        }

    }

    private static void findOrderWithUserByLastName(Iterator<Order> orderIterator) {

        while (orderIterator.hasNext()) {
            Order order = orderIterator.next();
            if (order!=null){
                if(order.getUser()!=null && LASTNAME_FOR_FIND.equals(order.getUser().getLastName())){
                    System.out.println(String.format(MESSAGE_WHEN_FIND,LASTNAME_FOR_FIND));
                    return;
                }
            }
        }
        System.out.println(String.format(MESSAGE_WHEN_NOT_FIND,LASTNAME_FOR_FIND));

    }

    private static TreeSet<Order> initOrders(){

        TreeSet<Order> orderTreeSet = new TreeSet<Order>(Comparators.COMPARE_BY_PRICE);

        for (int i = 0; i < COUNT_OF_ORDER-2; i++) {

            int randIndexUser = RAND.nextInt(100) /10;
            int randIndexOrder = RAND.nextInt(500) /10;

            User user = new User(i,"FN"+randIndexUser,randIndexUser<2?"Petrov":"LN"+randIndexUser, "city"+randIndexUser,5000+randIndexUser);
            Order order = new Order(i,100+randIndexOrder, Currency.getInstance(randIndexOrder<25?"UAH":"USD"), "itemName"+randIndexOrder, "shopID"+randIndexOrder,user );
            orderTreeSet.add(order);

        }

        orderTreeSet.add(orderTreeSet.first());
        orderTreeSet.add(orderTreeSet.last());

        return orderTreeSet;

    }


}
