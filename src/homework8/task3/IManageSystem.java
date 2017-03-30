package homework8.task3;

import java.util.List;
import java.util.Set;

public interface IManageSystem<T> {

    T save(T obj, double price);
    T save(T obj);
    void delete(T obj) ;
    void deleteById(String id);
    T get(String id);
    Double getPrice(T obj);
    Set<T> getProducts();
    List<Double> getPrices();

}
