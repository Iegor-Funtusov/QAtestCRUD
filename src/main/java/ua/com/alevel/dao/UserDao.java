package ua.com.alevel.dao;

import ua.com.alevel.data.User;

/**
 * @author Iehor Funtusov, created 23/12/2020 - 8:08 PM
 */
public interface UserDao extends AbstractDao<User> {

    User readUserByEmail(String email);
}
