package homework8.task2;

import homework8.task1.IdGenerator;

public class Food {

    private String id;
    private String name;
    private String country;
    private int expiration;

    public Food(String name, String country, int expiration) {
        this.id = IdGenerator.getUID();
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }

    public Food(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return this.id==((Food) o).id;
    }

    @Override
    public String toString() {
        return String.format("Food{id='%s', name='%s', country='%s', expiration=%d}",id,name,country,expiration);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
