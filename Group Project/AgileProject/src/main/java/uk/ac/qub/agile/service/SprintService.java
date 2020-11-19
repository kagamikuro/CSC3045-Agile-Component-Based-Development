package uk.ac.qub.agile.service;

import org.springframework.beans.factory.annotation.Autowired;
import uk.ac.qub.agile.dao.SprintMapper;
import uk.ac.qub.agile.entry.Sprint;
import uk.ac.qub.agile.entry.SprintExample;


import java.util.List;

public class SprintService {

    @Autowired
    private SprintMapper sprintMapper;

    public boolean findSprintByTitle(Sprint sprint){
        SprintExample se = new SprintExample();
        se.createCriteria().andSptinttitleEqualTo(sprint.getSptinttitle());

        List<Sprint> sprintList = sprintMapper.selectByExample(se);

        return sprintList != null && sprintList.size() == 1;
    }

    public String addSprint(Sprint sprint){
        SprintExample se = new SprintExample();
        se.createCriteria().andSptinttitleEqualTo(sprint.getSptinttitle());

        List<Sprint> sprintList = sprintMapper.selectByExample(se);

        if(sprintList != null && sprintList.size()>0){
            return "this sprint has already been created, please try another one ";
        }

        sprintMapper.insertSelective(sprint);

        return "add sprint successfully!";
    }

    public String removeSprint(Sprint sprint){
        SprintExample se = new SprintExample();
        se.createCriteria().andSptinttitleEqualTo(sprint.getSptinttitle());

        List<Sprint> sprintList = sprintMapper.selectByExample(se);

        if(sprintList != null && sprintList.size()>0){
            sprintMapper.deleteByExample(se);
            return "sprint delete successfully ";
        }

        return "no such sprint!";
    }

}
