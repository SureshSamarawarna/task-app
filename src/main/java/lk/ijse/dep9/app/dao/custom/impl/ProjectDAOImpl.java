package lk.ijse.dep9.app.dao.custom.impl;

import lk.ijse.dep9.app.dao.custom.ProjectDAO;
import lk.ijse.dep9.app.dao.custom.UserDAO;
import lk.ijse.dep9.app.entity.Project;
import lk.ijse.dep9.app.entity.User;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class ProjectDAOImpl implements ProjectDAO {
    private Connection connection;

    public ProjectDAOImpl(Connection connection) {
        this.connection=connection;
    }


    @Override
    public Project save(Project project) {
        try {
            PreparedStatement stm = connection.
                    prepareStatement("INSERT INTO Project (username, name) VALUES ( ?, ?)", Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, project.getUsername());
            stm.setString(2, project.getName());
            stm.executeUpdate();
            ResultSet generatedKeys = stm.getGeneratedKeys();
            generatedKeys.next();
            project.setId(generatedKeys.getInt(1));
            return project;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Project project) {

        try {
            PreparedStatement stm = connection.prepareStatement("UPDATE Project " +
                    "SET name = ? AND username = ? WHERE id=?");
            stm.setString(1,project.getName());
            stm.setString(2,project.getUsername());
            stm.setInt(3,project.getId());


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void deleteById(String pk) {

    }

    @Override
    public Optional<Project> findById(Integer id) {
        try {
            PreparedStatement stm = connection.prepareStatement("SELECT * FROM Project WHERE id = ?");
            stm.setInt(1,id);
            ResultSet rst = stm.executeQuery();
            if (rst.next()){
                return Optional.of(new Project(rst.getInt("id"),
                        rst.getString("name"),
                        rst.getString("username") ));
            }
            return  Optional.empty();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return Optional.empty();
    }

    @Override
    public List<Project> findAll() {
        return null;
    }

    @Override
    public long count() {
        try {
            PreparedStatement stm = connection.prepareStatement("SELECT COUNT(id) FROM Project");
            ResultSet rst = stm.executeQuery();
            return rst.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean existsById(String pk) {
        return false;
    }
}
