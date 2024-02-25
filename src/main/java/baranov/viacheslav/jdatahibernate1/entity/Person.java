package baranov.viacheslav.jdatahibernate1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PERSONS")
public class Person {
    @Id
    @Column(nullable = false, length = 15)
    private String name;

    @Id
    @Column(nullable = false, length = 25)
    private String surname;

    @Id
    @Column(nullable = false)
    private int age;

    @Column(name = "phone_number", nullable = false, length = 12)
    private String phoneNumber;

    @Column(name = "city_of_living", nullable = false, length = 30)
    private String city;

    @Override
    public String toString() {
        return "\nPerson {name= " + name
                + ", surname= " + surname
                + ", age= " + age
                + ", phoneNumber= " + phoneNumber
                + ", city= " + city
                + "}";
    }
}
