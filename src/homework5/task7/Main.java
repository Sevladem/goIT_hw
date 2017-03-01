package homework5.task7;

import homework5.task1.Room;
import homework5.task3.API;
import homework5.task4.BookingComAPI;
import homework5.task4.GoogleAPI;
import homework5.task4.TripAdvisorAPI;
import homework5.task6.Controller;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {

        Controller controller = new Controller();

        controller.requstRooms(20,4,"City1", "Hotel2");
        controller.requstRooms(10,3,"City4", "Hotel4");
        controller.requstRooms(30,2,"City3", "Hotel1");

        API api1 = new BookingComAPI();
        API api2 = new TripAdvisorAPI();
        API api3 = new GoogleAPI();

        Room[] findRoom;
        findRoom = controller.check(api1,api2);
        int length = 0;
        for (Room room : findRoom) {
            if (room != null){
                length++;
            }
        }
        System.out.println("Booking and TripAdvisor: " + length);

        findRoom = controller.check(api2,api3);
        length = 0;
        for (Room room : findRoom) {
            if (room != null){
                length++;
            }
        }
        System.out.println("TripAdvisor and Google: " + length);

        findRoom = controller.check(api3,api1);
        length = 0;
        for (Room room : findRoom) {
            if (room != null){
                length++;
            }
        }
        System.out.println("Google and Booking: " + length);

    }

}
