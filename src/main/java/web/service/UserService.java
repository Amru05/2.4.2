package web.service;

import web.dao.RoleDAO;
import web.model.Role;
import web.model.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    List<User> allUsers();
    void save(User user);
    void delete(User user);
    void update (User user);
    User getById(Long id);
    User getUserByName(String username);

}
