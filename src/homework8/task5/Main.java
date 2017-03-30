package homework8.task5;

import homework8.task1.Country;
import homework8.task2.Food;
import homework8.task3.IManageSystem;
import homework8.task4.IManageSystemImpl;

import java.util.Comparator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Main {

    private static final int COUNT_FOOD = 6;
    private static final Random RAND = new Random();

    public static void main(String[] args) {

        Map<Food,Double> database = new TreeMap<>(new Comparator<Food>() {
            @Override
            public int compare(Food o1, Food o2) {
                if(o1==null || o2==null) return 0;
                return o1.getId().compareTo(o2.getId());
            }
        });

        IManageSystem manageSystem = new IManageSystemImpl(database);
        String[] foodIds = new String[COUNT_FOOD];

        for (int i = 0; i < COUNT_FOOD; i++) {
            int randIndexFood = RAND.nextInt(100) /10;
            int randIndexCountry = RAND.nextInt(Country.values().length);

            Food food = new Food("Name"+randIndexFood, Country.values()[randIndexCountry].toString(), randIndexFood);
            manageSystem.save(food,1.0*randIndexFood);
            foodIds[i]=food.getId();
        }

        for (int i = 0; i < COUNT_FOOD; i++) {
            Food food = (Food) manageSystem.get(foodIds[i]);
            System.out.println(food);
            System.out.println(manageSystem.getPrice(food));
        }

        manageSystem.delete(manageSystem.get(foodIds[3]));
        System.out.println(manageSystem);
        manageSystem.deleteById(foodIds[2]);
        System.out.println(manageSystem);

        System.out.println(manageSystem.getProducts());
        System.out.println(manageSystem.getPrices());

    }

}
