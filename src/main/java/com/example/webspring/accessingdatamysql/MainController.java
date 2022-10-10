package com.example.webspring.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/demo")
public class MainController {
    @Autowired

    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewSessions (@RequestParam String name) {

        Sessions n = new Sessions();
        n.setName(name);
        userRepository.save(n);
        return "Save";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Sessions> getAllSessions() {
        return userRepository.findAll();
    }

}
