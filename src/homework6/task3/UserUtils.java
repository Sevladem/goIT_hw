package homework6.task3;

import homework6.task2.User;

import java.util.Arrays;

public final class UserUtils {

    private UserUtils(){

    }

    public static User[] uniqueUsers(User[] users){
        User[] returnUsers = new User[users.length];
        boolean uniqueUsers;
        int k = 0;

        for (int i = 0; i < users.length; i++) {
            if(users[i]==null){
                continue;
            }
            uniqueUsers = true;
            for (int j = 0; j < users.length; j++) {
                if (i==j || users[j]==null){
                    continue;
                }
                if(users[i].equals(users[j])) {
                    uniqueUsers = false;
                    break;
                }
            }
            if (uniqueUsers){
                returnUsers[k] = users[i];
                k++;
            }
        }

        returnUsers = deleteEmptyUsers(returnUsers);
        return returnUsers;
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance){
        User[] returnUsers = new User[users.length];
        int i = 0;

        for (User user : users) {
            if(user.getBalance() == balance){
                returnUsers[i] = user;
                i++;
            }
        }

        returnUsers = deleteEmptyUsers(returnUsers);
        return returnUsers;
    }


    public static final User[] paySalaryToUsers(User[] users){

        for (User user : users) {
            user.setBalance(user.getBalance()+user.getSalary());
        }

        return users;

    }

    public static final long[] getUsersId(User[] users){
        long[] usersId = new long[users.length];

        for (int i = 0; i < users.length; i++) {
            usersId[i] = users[i].getId();
        }

        return usersId;
    }

    public static User[] deleteEmptyUsers(User[] users){
        User[] returnUsers = new User[0];

        for (User user : users) {
            if(user!=null){
                returnUsers = Arrays.copyOf(returnUsers,returnUsers.length+1);
                returnUsers[returnUsers.length-1]=user;
            }
        }

        return returnUsers;
    }

}
