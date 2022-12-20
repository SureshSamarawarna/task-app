package lk.ijse.dep9.app.dao.custom.impl;

import lk.ijse.dep9.app.dao.custom.TaskDAO;
import lk.ijse.dep9.app.dao.custom.UserDAO;
import lk.ijse.dep9.app.entity.Task;
import lk.ijse.dep9.app.entity.User;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

public class TaskDAPImpl implements TaskDAO {
    private Connection connection;

    public TaskDAPImpl(Connection connection) {
        this.connection=connection;
    }



    @Override
    public Task save(Task task) {
        return null;
    }

    @Override
    public void update(Task task) {

    }

    @Override
    public void deleteById(String pk) {

    }

    @Override
    public Optional<Task> findById(String pk) {
        return Optional.empty();
    }

    @Override
    public List<Task> findAll() {
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
