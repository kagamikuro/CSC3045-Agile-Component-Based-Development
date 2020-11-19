package uk.ac.qub.agile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import uk.ac.qub.agile.entry.Sprint;
import uk.ac.qub.agile.service.SprintService;
import uk.ac.qub.agile.utils.ResponseMessage;

@Controller
@RequestMapping("/sprint")
public class SprintController {

    @Autowired
    private SprintService sprintService;

    @PostMapping("/sprint/search")
    @ResponseBody //serialize to json
    public ResponseMessage searchSprint(@RequestParam String sprintName ){

        System.out.println("Receive request /sprint/search");

        Sprint sprint = new Sprint();
        sprint.setSptinttitle(sprintName);

        boolean result = sprintService.findSprintByTitle(sprint);

        return result? ResponseMessage.success() : ResponseMessage.error();
    }


    @PostMapping("/addSprint")
    @ResponseBody
    public ResponseMessage addSprint(@RequestParam String sprintName ){

        System.out.println("Receive request /addSprint");

        Sprint sprint = new Sprint();
        sprint.setSptinttitle(sprintName);


        String result = sprintService.addSprint(sprint);

        if(result.contains("add sprint successfully!")){
            return ResponseMessage.success();
        }

        return ResponseMessage.error().addObject("Msg",result);
    }


    @PostMapping("/removeSprint")
    @ResponseBody
    public ResponseMessage removeSprint(@RequestParam String sprintName ){

        System.out.println("Receive request /removeSprint");

        Sprint sprint = new Sprint();
        sprint.setSptinttitle(sprintName);


        String result = sprintService.removeSprint(sprint);

        if(result.contains("remove sprint successfully!")){
            return ResponseMessage.success();
        }

        return ResponseMessage.error().addObject("Msg",result);
    }
}