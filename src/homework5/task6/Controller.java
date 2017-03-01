package homework5.task6;

import homework5.task1.Room;
import homework5.task3.API;
import homework5.task4.BookingComAPI;
import homework5.task4.GoogleAPI;
import homework5.task4.TripAdvisorAPI;
import homework5.task5.DAO;
import homework5.task5.DAOImpl;

import java.text.ParseException;

public class Controller{

    private API apis[] = new API[3];
    private DAO dao = new DAOImpl();

    public Controller() throws ParseException {
        apis[0] = new BookingComAPI();
        apis[1] = new TripAdvisorAPI();
        apis[2] = new GoogleAPI();
    }

    public Room[] requstRooms(int price, int persons, String city, String hotel){
        Room[] returnRooms = new Room[15];
        Room[] roomsFromAPI;
        int i = 0;
        for (API api : apis) {
            roomsFromAPI = api.findRooms(price, persons, city, hotel);
            for (Room room : roomsFromAPI) {
                if (room != null){
                dao.save(room);
                returnRooms[i] = room;
                i++;
                } else {
                    break;
                }
            }
        }
        return returnRooms;
    }

    public Room[] check(API api1, API api2){
        Room[] returnRooms = new Room[5];

        Room[] roomsFromAPI1;
        Room[] roomsFromAPI2;

        roomsFromAPI1 = api1.findRooms(2,4,"City2","Hotel2");
        roomsFromAPI2 = api2.findRooms(2,4,"City2","Hotel2");
        int j = 0;
        for (int i = 0; i < returnRooms.length; i++) {
            if (roomsFromAPI1[i] != null && roomsFromAPI2[i] != null){

                if (roomsFromAPI1[i].equals(roomsFromAPI2[i])){
                    returnRooms[j] = roomsFromAPI1[i];
                    j++;
                }
            }
        }
        return returnRooms;
    }

}
