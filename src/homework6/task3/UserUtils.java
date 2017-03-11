package homework6.task3;

import homework6.task2.User;

import java.util.Arrays;

public final class UserUtils {

    private UserUtils(){

    }

    public static User[] uniqueUsers(User[] users){
        User[] returnUsers = users.clone();
        User currentUser;

        for (int i = 0; i < returnUsers.length-1; i++) {
            if(returnUsers[i]==null){
                continue;
            }
            currentUser = returnUsers[i];
            for (int j = i+1; j < returnUsers.length; j++) {
                if (returnUsers[j]==null){
                    continue;
                }
                if(currentUser.equals(returnUsers[j])) {
                    returnUsers[i] = null;
                    returnUsers[j] = null;
                }
            }
         }
        return deleteEmptyUsers(returnUsers);

    }

    public static User[] usersWithContitionalBalance(User[] users, int balance){
        User[] returnUsers = new User[users.length];
        int i = 0;

        for (User user : users) {
            if(user!=null && user.getBalance() == balance){
                returnUsers[i] = user;
                i++;
            }
        }

        return deleteEmptyUsers(returnUsers);
    }


    public static final User[] paySalaryToUsers(User[] users){
        for (User user : users) {
            if (user!=null){
                user.setBalance(user.getBalance()+user.getSalary());
            }
        }

        return users;
    }

    public static final long[] getUsersId(User[] users){
        long[] usersId = new long[users.length];

        for (int i = 0; i < users.length; i++) {
            if(users[i]!=null){
                usersId[i] = users[i].getId();
            }
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
