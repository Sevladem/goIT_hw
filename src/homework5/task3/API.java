package homework5.task3;


import homework5.task1.Room;

public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

}
