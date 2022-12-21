package lk.ijse.dep9.app.service.custom;

import lk.ijse.dep9.app.dao.DAOFactory;
import lk.ijse.dep9.app.dao.DAOTypes;
import lk.ijse.dep9.app.dao.custom.UserDAO;
import lk.ijse.dep9.app.dto.UserDTO;

public class UserServiceImpl implements UserService{
    private UserDAO userDAO;

    public UserServiceImpl() {
        userDAO = DAOFactory.getInstance().getDAO(null, DAOTypes.USER,UserDAO.class)
    }

    @Override
    public void createNewUserAccount(UserDTO userDTO) {

    }
}
