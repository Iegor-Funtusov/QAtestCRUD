package ua.com.alevel.data;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Iehor Funtusov, created 23/12/2020 - 7:56 PM
 */

@Getter
@Setter
public class Profile extends AbstractData {

    private String phone;
    private int userId;

    public Profile() {
        super();
    }
}
