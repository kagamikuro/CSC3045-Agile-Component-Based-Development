package uk.ac.qub.agile.service;

import org.springframework.beans.factory.annotation.Autowired;
import uk.ac.qub.agile.dao.UserStoryMapper;
import uk.ac.qub.agile.entry.UserStory;
import uk.ac.qub.agile.entry.UserStoryExample;

import java.util.List;

public class UserStoryService {

    @Autowired
    private UserStoryMapper userStoryMapper;
    public boolean findUserStoryByTitle(UserStory userStory){
        UserStoryExample ue = new UserStoryExample();
        ue.createCriteria().andTitleEqualTo(userStory.getTitle());

        List<UserStory> userStoryList = userStoryMapper.selectByExample(ue);

        return userStoryList != null && userStoryList.size() == 1;
    }

    public String addUserStory(UserStory userStory){
        UserStoryExample ue = new UserStoryExample();
        ue.createCriteria().andTitleEqualTo(userStory.getTitle());

        List<UserStory> userStoryList = userStoryMapper.selectByExample(ue);

        if(userStoryList != null && userStoryList.size()>0){
            return "this UserStory has already been created, please try another one ";
        }

        userStoryMapper.insertSelective(userStory);

        return "add userStory successfully!";
    }

    public String removeUserStory(UserStory userStory){
        UserStoryExample ue = new UserStoryExample();
        ue.createCriteria().andTitleEqualTo(userStory.getTitle());

        List<UserStory> userStoryList = userStoryMapper.selectByExample(ue);

        if(userStoryList != null && userStoryList.size()>0){
            userStoryMapper.deleteByExample(ue);
            return "UserStory delete successfully ";
        }

        return "no such UserStory!";
    }
}
