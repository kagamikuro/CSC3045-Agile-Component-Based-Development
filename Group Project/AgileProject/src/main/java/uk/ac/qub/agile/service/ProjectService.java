package uk.ac.qub.agile.service;

import org.springframework.beans.factory.annotation.Autowired;
import uk.ac.qub.agile.dao.ProjectMapper;
import uk.ac.qub.agile.entry.Project;
import uk.ac.qub.agile.entry.ProjectExample;


import java.util.List;

public class ProjectService {
    @Autowired
    private ProjectMapper projectMapper;

    public boolean findProjectByTitle(Project project){
        ProjectExample pe = new ProjectExample();
        pe.createCriteria().andTitleEqualTo(project.getTitle());

        List<Project> projectList = projectMapper.selectByExample(pe);

        return projectList != null && projectList.size() == 1;
    }

    public String addProject(Project project){
        ProjectExample pe = new ProjectExample();
        pe.createCriteria().andTitleEqualTo(project.getTitle());

        List<Project> projectList = projectMapper.selectByExample(pe);

        if(projectList != null && projectList.size()>0){
            return "this project has already been created, please try another one ";
        }

        projectMapper.insertSelective(project);

        return "add project successfully!";
    }

    public String removeProject(Project project){
        ProjectExample pe = new ProjectExample();
        pe.createCriteria().andTitleEqualTo(project.getTitle());

        List<Project> projectList = projectMapper.selectByExample(pe);

        if(projectList != null && projectList.size()>0){
            projectMapper.deleteByExample(pe);
            return "project delete successfully ";
        }

        return "no such project!";
    }

}
