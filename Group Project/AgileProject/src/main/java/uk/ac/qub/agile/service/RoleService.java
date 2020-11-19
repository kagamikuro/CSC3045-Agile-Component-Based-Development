package uk.ac.qub.agile.service;

import org.springframework.beans.factory.annotation.Autowired;
import uk.ac.qub.agile.dao.RoleMapper;
import uk.ac.qub.agile.entry.Role;
import uk.ac.qub.agile.entry.RoleExample;
import uk.ac.qub.agile.entry.User;

import java.util.List;

public class RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public String findUsersRole(User user){
        RoleExample re = new RoleExample();
        re.createCriteria().andIdEqualTo(user.getId());

        List<Role> roleList = roleMapper.selectByExample(re);

        return roleList.get(0).toString();
    }
}
