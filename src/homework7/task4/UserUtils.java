package homework7.task4;

import homework6.task2.User;

import java.util.*;

public final class UserUtils {

    private UserUtils(){

    }

    public static ArrayList<User> uniqueUsers(ArrayList<User> users){
        Set<User> set = new HashSet<>(users);
        return new ArrayList<>(set);
    }

    public static ArrayList<User> usersWithContitionalBalance(ArrayList<User> users, int balance){
        ArrayList<User> tmpUsers = new ArrayList(users);
        Iterator<User> iterator = tmpUsers.iterator();

        if(iterator.hasNext()){
            if(iterator.next().getBalance()!=balance){
                iterator.remove();
            }
        }
        return tmpUsers;
    }


    public static final ArrayList<User> paySalaryToUsers(ArrayList<User> users){

        Iterator<User> iterator = users.iterator();
        User tmpUser;

        if(iterator.hasNext()){
            tmpUser = iterator.next();
            tmpUser.setBalance(tmpUser.getBalance()+tmpUser.getSalary());
        }

        return users;
    }

    public static final ArrayList<Integer> getUsersId(ArrayList<User> users){
        ArrayList<Integer> usersId = new ArrayList<>();

        Iterator<User> iterator = users.iterator();
        User tmpUser;

        if(iterator.hasNext()){
            usersId.add((int) iterator.next().getId());
        }

        return usersId;
    }

    public static ArrayList<User> deleteEmptyUsers(ArrayList<User> users){

        users.trimToSize();

        return users;
    }

}
