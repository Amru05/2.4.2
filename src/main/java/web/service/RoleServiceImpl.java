package web.service;

import org.springframework.stereotype.Service;
import web.dao.RoleDAO;
import web.model.Role;


@Service
public class RoleServiceImpl implements RoleService{
    RoleDAO roleDAO;

    @Override
    public void save(Role role) {
        roleDAO.save(role);
    }

    @Override
    public void delete(Role role) {
        roleDAO.delete(role);
    }

    @Override
    public Role getById(Long id) {
        return roleDAO.getById(id);
    }

    @Override
    public Role getRoleByName(String rolename) {
        return roleDAO.getRoleByName(rolename);
    }

    @Override
    public Role createRoleIfNotFound(String name, long id) {
        return roleDAO.createRoleIfNotFound(name, id);
    }
}
