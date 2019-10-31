package com.satyen.springboot.topic.service;

import com.satyen.springboot.topic.Topic;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "second")
public class SecondService implements TopicService {

    @Override
    public List<Topic> getAllTopics() {
        return null;
    }

    @Override
    public Topic getTopic(String id) {
        return null;
    }

    @Override
    public void addTopic(Topic topic) {

    }

    @Override
    public void updateTopic(Topic topic, String id) {

    }
}
