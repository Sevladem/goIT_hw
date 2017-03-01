package homework5.task4;

import homework5.task1.Room;
import homework5.task3.API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class TripAdvisorAPI implements API {
    private Room[] rooms = new Room[5];

    public TripAdvisorAPI() throws ParseException {
        Random random = new Random();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Date date = format.parse("08.03.2017");
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(random.nextInt(50),random.nextInt(2)+i, date,"Hotel"+i,"City"+i);
        }
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] returnRooms = new Room[rooms.length];
        int i = 0;
        for (Room room : rooms) {
            if (room.getPrice() <= price && room.getPersons() <= persons && room.getCityName().equals(city)){
                returnRooms[i] = room;
                i++;
            }
        }

        return returnRooms;
    }
}
