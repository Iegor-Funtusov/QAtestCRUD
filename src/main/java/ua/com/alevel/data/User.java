package ua.com.alevel.data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Iehor Funtusov, created 23/12/2020 - 7:47 PM
 */

@Getter
@Setter
public class User extends AbstractData {

    private String name;
    private String email;
    private int age;

    public User() {
        super();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + super.getId() + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
