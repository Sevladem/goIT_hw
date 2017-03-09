package homework6.task2;

public final class User {

    private long id;
    private String firstName;
    private String lastName;
    private int salary;
    private int balance;

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==null || obj==null){
            return false;
        }
        if(obj instanceof User){
            return (this.firstName.equals(((User) obj).getFirstName()) && this.lastName.equals(((User) obj).getLastName())
                    && this.salary == ((User) obj).getSalary() && this.balance == ((User) obj).getBalance());
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return String.format("User{id=%d, firstName=%s, lastName=%s, salary=%d, balance=%d}",id,firstName,lastName,salary,balance);
    }
}
