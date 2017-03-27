package homework7;

import homework7.task1.Order;

import java.util.Comparator;

public final class Comparators {

    private Comparators() {
    }

    public static final Comparator<Order> COMPARE_BY_PRICE = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            if(o1==null || o2==null){
                return 0;
            }
            return o2.getPrice() - o1.getPrice();
        }
    };

    public static final Comparator<Order> COMPARE_BY_PRICE_AND_CITY = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            if(o1==null || o2==null){
                return 0;
            }
            int result = o2.getPrice() - o1.getPrice();
            if (result==0){
                result = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return result;
        }
    };

    public static final Comparator<Order> COMPARE_BY_NAME_AND_ID_AND_CITY = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            if(o1==null || o2==null){
                return 0;
            }
            int result = o1.getItemName().compareTo(o2.getItemName());
            if (result==0){
                result = (int) (o1.getId()-o2.getId());
                if (result==0){
                    result = o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
            }
            return result;
        }
    };

}
