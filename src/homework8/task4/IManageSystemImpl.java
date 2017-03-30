package homework8.task4;

import homework8.task2.Food;
import homework8.task3.IManageSystem;

import java.util.*;

public class IManageSystemImpl implements IManageSystem<Food> {

    private Map<Food, Double> database;

    public IManageSystemImpl(Map<Food, Double> database) {
        this.database = database;
    }

    @Override
    public Food save(Food obj, double price) {
        database.put(obj,price);
        return obj;
    }

    @Override
    public Food save(Food obj) {
        database.put(obj,0.0);
        return obj;
    }

    @Override
    public void delete(Food obj) {
        database.remove(obj);
    }

    @Override
    public void deleteById(String id) {
        Food food = new Food(id);
        database.remove(food);
    }

    @Override
    public Food get(String id) {

        Iterator<Food> foodIterator = database.keySet().iterator();
        while(foodIterator.hasNext()){
            Food food = foodIterator.next();
            if (id.equals(food.getId())){
                return food;
            }
        }
        return null;
    }

    @Override
    public Double getPrice(Food obj) {
        return database.get(obj);
    }

    @Override
    public Set<Food> getProducts() {
        return database.keySet();
    }

    @Override
    public List<Double> getPrices() {
        return new ArrayList<>(database.values());
    }

    @Override
    public String toString() {
        return "IManageSystemImpl{" +
                "database=" + database +
                '}';
    }
}
