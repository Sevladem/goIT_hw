package homework5.task5;

import homework5.task1.Room;

public interface DAO {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);

}
