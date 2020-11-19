package uk.ac.qub.agile.service;

import org.springframework.beans.factory.annotation.Autowired;
import uk.ac.qub.agile.dao.UserMapper;
import uk.ac.qub.agile.entry.User;
import uk.ac.qub.agile.entry.UserExample;

import java.util.List;

public class UserService {

    @Autowired
    private UserMapper userMapper;

    public boolean findUserWithEmailAndPassword(User user){
        UserExample ue = new UserExample();
        ue.createCriteria().andEmailEqualTo(user.getEmail()).andPasswordEqualTo(user.getPassword());

        List<User> userList = userMapper.selectByExample(ue);

        return userList != null && userList.size() == 1;
    }

    public String register(User user){
        UserExample ue = new UserExample();
        ue.createCriteria().andEmailEqualTo(user.getEmail());

        List<User> userList = userMapper.selectByExample(ue);
        if(userList != null && userList.size()>0){
            return "user register failed, please use another email ";
        }

        userMapper.insertSelective(user);

        return "register successfully!";
    }





}
