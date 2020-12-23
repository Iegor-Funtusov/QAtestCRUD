package ua.com.alevel.dao;

import ua.com.alevel.data.AbstractData;

/**
 * @author Iehor Funtusov, created 23/12/2020 - 8:11 PM
 */
public interface AbstractDao<DATA extends AbstractData> {

    void create(DATA data);
    DATA read(int id);
    void update(DATA data);
    void delete(int id);
}
