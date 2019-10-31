package com.satyen.springboot.topic.service;

import com.satyen.springboot.topic.Topic;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TopicService {

    List<Topic> getAllTopics();

    Topic getTopic(String id);

    void addTopic(Topic topic);

    void updateTopic(Topic topic, String id);

}
