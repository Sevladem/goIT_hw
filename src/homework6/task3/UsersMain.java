package homework6.task3;

import homework6.task2.User;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Random;

public class UsersMain {

    private static final int COUNT_OF_USER = 5;

    public static void main(String[] args) {

        User[] users = initUsers();

        printArrays(users,"Start array");

        printArrays(UserUtils.uniqueUsers(users),"uniqueUsers");
        printArrays(UserUtils.usersWithContitionalBalance(users,5000),"usersWithContitionalBalance");
        printArrays(UserUtils.paySalaryToUsers(users),"paySalaryToUsers");
        printArrays(UserUtils.getUsersId(users),"getUsersId");


        User[] usersForTestDeleteMethod = Arrays.copyOf(users,users.length+2);
        printArrays(usersForTestDeleteMethod,"Array users for test delete method");
        printArrays(UserUtils.deleteEmptyUsers(usersForTestDeleteMethod),"deleteEmptyUsers");

    }

    private static User[] initUsers(){
        User[] returnUsers = new User[COUNT_OF_USER];
        final Random rand = new Random();

        int randIndex;

        for (int i = 0; i < COUNT_OF_USER; i++) {
            randIndex = rand.nextInt(100) /10;

            returnUsers[i] = new User(i,"FN"+randIndex,"LN"+randIndex,500+randIndex,5000+randIndex);

        }

        return returnUsers;
    }

    private static void printArrays(long[] arrays, String utilMethod){

        System.out.println(String.format("====%s====",utilMethod));
        for (long element : arrays) {
            System.out.println(String.format("id:%d",element));
            System.out.println("-----");
        }

    }

    private static void printArrays(User[] arrays, String utilMethod){

        System.out.println(String.format("====%s====",utilMethod));
        for (User element : arrays) {
            if(element == null){
                System.out.println("null");
            }else{
                System.out.println(element.toString());
            }
            System.out.println("-----");
        }

    }

}
