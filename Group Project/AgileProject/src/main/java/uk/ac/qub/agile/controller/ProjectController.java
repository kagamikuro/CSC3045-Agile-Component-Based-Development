package uk.ac.qub.agile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import uk.ac.qub.agile.entry.Project;
import uk.ac.qub.agile.service.ProjectService;
import uk.ac.qub.agile.utils.ResponseMessage;

@Controller
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/project/search")
    @ResponseBody //serialize to json
    public ResponseMessage searchProject(@RequestParam String projectName ){

        System.out.println("Receive request /project/search");

        Project project = new Project();
        project.setTitle(projectName);

        boolean result = projectService.findProjectByTitle(project);

        return result? ResponseMessage.success() : ResponseMessage.error();
    }


    @PostMapping("/addProject")
    @ResponseBody
    public ResponseMessage addProject(@RequestParam String projectName ){

        System.out.println("Receive request /addProject");

        Project project = new Project();
        project.setTitle(projectName);


        String result = projectService.addProject(project);

        if(result.contains("add project successfully!")){
            return ResponseMessage.success();
        }

        return ResponseMessage.error().addObject("Msg",result);
    }


    @PostMapping("/removeProject")
    @ResponseBody
    public ResponseMessage removeProject(@RequestParam String projectName ){

        System.out.println("Receive request /removeProject");

        Project project = new Project();
        project.setTitle(projectName);


        String result = projectService.removeProject(project);

        if(result.contains("remove project successfully!")){
            return ResponseMessage.success();
        }

        return ResponseMessage.error().addObject("Msg",result);
    }
}