package uk.ac.qub.agile.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import uk.ac.qub.agile.entry.User;
import uk.ac.qub.agile.service.UserService;
import uk.ac.qub.agile.utils.ResponseMessage;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login/auth")
    @ResponseBody //serialize to json
    public ResponseMessage login(@RequestParam String Email, @RequestParam String password ){

        System.out.println("Receive request /user/login/auth");

        User user = new User();
        user.setEmail(Email);
        user.setPassword(password);

        boolean result = userService.findUserWithEmailAndPassword(user);

        return result? ResponseMessage.success() : ResponseMessage.error();
    }


    @PostMapping("/register")
    @ResponseBody
    public ResponseMessage register(@RequestParam String Email, @RequestParam String password ){

        System.out.println("Receive request /user/register");

        User user = new User();
        user.setEmail(Email);
        user.setPassword(password);

        String result = userService.register(user);

        if(result.contains("register successfully!")){
            return ResponseMessage.success();
        }

        return ResponseMessage.error().addObject("Msg",result);
    }
}
