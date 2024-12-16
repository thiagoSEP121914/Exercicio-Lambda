package entities;

public class Person {

    private String name;
    private String email;
    private Double value;

    public Person () {
    }

    public Person (String name, String email, Double value) {
        this.name = name;
        this.email = email;
        this.value = value;
    }
    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", value=" + value +
                '}';
    }
}
