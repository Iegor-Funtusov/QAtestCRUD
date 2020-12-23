package ua.com.alevel.data;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Iehor Funtusov, created 23/12/2020 - 8:00 PM
 */

@Getter
@Setter
public abstract class AbstractData {

    private int id;
    private Date created;

    public AbstractData() {
        this.created = new Date();
    }
}
