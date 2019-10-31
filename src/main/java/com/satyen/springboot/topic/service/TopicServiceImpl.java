package com.satyen.springboot.topic.service;

import com.satyen.springboot.topic.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service(value = "topic")
public class TopicServiceImpl implements TopicService {

    private static final List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("as", "dsfdfds", "this is first topic"),
            new Topic("asa", "dsfdfdsdd", "this is second topic"),
            new Topic("asb", "dsfdfdsbb", "this is third topic")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for (int i = 0; i < topics.size(); i++) {

            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

}
