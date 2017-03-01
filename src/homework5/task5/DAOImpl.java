package homework5.task5;

import homework5.task1.Room;
import homework5.task5.DAO;

public class DAOImpl implements DAO {

    @Override
    public Room save(Room room) {
        System.out.println("Method: save");
        System.out.println(room.toString());
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Method: delete");
        System.out.println(room.toString());
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Method: update");
        System.out.println(room.toString());
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println("Method: findById");
        return null;
    }
}
