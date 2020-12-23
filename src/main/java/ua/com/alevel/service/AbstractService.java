package ua.com.alevel.service;

import ua.com.alevel.data.AbstractData;

/**
 * @author Iehor Funtusov, created 23/12/2020 - 8:39 PM
 */

public interface AbstractService<DATA extends AbstractData> {

    void create(DATA data);
    DATA read(int id);
    void update(DATA data);
    void delete(int id);
}
