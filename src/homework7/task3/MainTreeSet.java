package homework7.task3;

import homework7.task1.Order;
import homework7.task1.User;

import java.util.*;

public class MainTreeSet {

    private static final int COUNT_OF_ORDER = 10;
    private static final Random rand = new Random();

    public static void main(String[] args) {
        TreeSet<Order> orderTreeSet = initOrder();
        System.out.println(orderTreeSet);
        Iterator<Order> orderIterator = orderTreeSet.iterator();
        String message = "In the set there is no order with the user by the lastname Petrov";

        while (orderIterator.hasNext()) {
            if(orderIterator.next().getUser().getLastName().equals("Petrov")){
                message = "In the set there is an order with the user by the lastname Petrov";
            }
        }
        System.out.println(message);

        orderTreeSet = initOrder();
        System.out.println(orderTreeSet.last());

        System.out.println();
        orderTreeSet = initOrder();
        System.out.println(orderTreeSet);
        orderIterator = orderTreeSet.iterator();

        while (orderIterator.hasNext()) {
            if(orderIterator.next().getCurrency()==Currency.getInstance("USD")){
                orderIterator.remove();
            }
        }
        System.out.println(orderTreeSet);

    }

    private static TreeSet<Order> initOrder(){

        User user;
        Order order;
        int randIndexUser;
        int randIndexOrder;
        TreeSet<Order> orderTreeSet = new TreeSet<Order>();

        for (int i = 0; i < COUNT_OF_ORDER-2; i++) {

            randIndexUser = rand.nextInt(100) /10;
            randIndexOrder = rand.nextInt(500) /10;

            user = new User(i,"FN"+randIndexUser,randIndexUser<2?"Petrov":"LN"+randIndexUser, "city"+randIndexUser,5000+randIndexUser);
            order = new Order(i,100+randIndexOrder, Currency.getInstance(randIndexOrder<25?"UAH":"USD"), "itemName"+randIndexOrder, "shopID"+randIndexOrder,user );
            orderTreeSet.add(order);

        }

        orderTreeSet.add(orderTreeSet.first());
        orderTreeSet.add(orderTreeSet.last());

        return orderTreeSet;

    }


}
