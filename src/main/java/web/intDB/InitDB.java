package web.intDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Role;
import web.model.User;
import web.service.RoleService;
import web.service.UserService;
import javax.annotation.PostConstruct;
import java.util.HashSet;

@Component
public class InitDB {

    private final UserService userService;
    private final RoleService roleService;



    @Autowired
    public InitDB(UserService userService, RoleService roleService) {

        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void InitUsersDB() {

        Role role1 = new Role(1L, "admin");
        roleService.save(role1);
        Role role2 = new Role(1L, "user");
        roleService.save(role2);


        User user = new User(
                    "Andrey", "Petrov", (byte) 18, "Moscow@mail", "pass",

                    new HashSet<Role>() {{
                        add(role1);
                        add(role2);
                    }});
        userService.save(user);

    }
}
