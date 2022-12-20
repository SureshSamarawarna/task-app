package lk.ijse.dep9.app.dao.custom.impl;

import lk.ijse.dep9.app.dao.custom.UserDAO;
import lk.ijse.dep9.app.entity.User;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

public class UserDAPImpl implements UserDAO {
    private Connection connection;

    public UserDAPImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void deleteById(String pk) {

    }

    @Override
    public Optional<User> findById(String pk) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public boolean existsById(String pk) {
        return false;
    }
}
