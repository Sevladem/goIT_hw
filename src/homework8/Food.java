package homework8;

public class Food {

    private String id;
    private String name;
    private String country;
    private int expiration;

    public Food() {
        this.id = IdGenerator.getUID();
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
    public int hashCode() {
        return id.hashCode();
    }
}
