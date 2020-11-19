package uk.ac.qub.agile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import uk.ac.qub.agile.entry.UserStory;
import uk.ac.qub.agile.service.UserStoryService;
import uk.ac.qub.agile.utils.ResponseMessage;

@Controller
@RequestMapping("/userStory")
public class UserStoryController {

    @Autowired
    private UserStoryService userStoryService;

    @PostMapping("/userStory/search")
    @ResponseBody //serialize to json
    public ResponseMessage searchUserStory(@RequestParam String projectName) {

        System.out.println("Receive request /project/search");

        UserStory userStory = new UserStory();
        userStory.setTitle(projectName);

        boolean result = userStoryService.findUserStoryByTitle(userStory);

        return result ? ResponseMessage.success() : ResponseMessage.error();
    }

}