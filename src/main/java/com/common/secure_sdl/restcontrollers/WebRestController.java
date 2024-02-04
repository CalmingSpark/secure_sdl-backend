package com.common.secure_sdl.restcontrollers;

import com.common.secure_sdl.entities.Topic;
import com.common.secure_sdl.topics.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebRestController {

    @Autowired
    TopicService topicService;

    @GetMapping("/secure_sdl")
    public List<Topic> getAll() {
        return topicService.getAll();
    }
}
