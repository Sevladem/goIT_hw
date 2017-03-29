package homework8;

import java.util.*;

public class IManageSystemImpl implements IManageSystem<Food> {

    private Map<Food, Double> database;

    public IManageSystemImpl(Map<Food, Double> database) {
        this.database = database;
    }

    @Override
    public Food save(Food obj, double price) {
        return null;
    }

    @Override
    public Food save(Food obj) {
        return null;
    }

    @Override
    public void delete(Food obj) {
        database.remove(obj);
    }

    @Override
    public void deleteById(String id) {
        Iterator<Food> foodIterator = database.keySet().iterator();
        while(foodIterator.hasNext()){
            Food food = foodIterator.next();
            if (id.equals(food.getId())){
                database.remove(food);
            }
        }
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
}
