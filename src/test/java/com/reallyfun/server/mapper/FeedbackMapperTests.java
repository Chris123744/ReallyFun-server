package com.reallyfun.server.mapper;

import com.reallyfun.server.entity.Feedback;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FeedbackMapperTests {
    @Autowired(required = false)
    private FeedbackMapper feedbackMapper;

    @Test
    public void submitFeedback() {
        Integer gameId = 1;
        String category = "差评";
        String content = "感觉不如...画质";
        Integer rows = feedbackMapper.submitFeedback(gameId,category,content);
        System.out.println("rows=" + rows);
    }
    @Test
    public void findById() {
        Integer id = 10;
        Feedback feedback = feedbackMapper.findById(id);
        System.out.println(feedback);
    }
    @Test
    public void deleteFeedback() {
        Integer id = 10;
        Integer rows = feedbackMapper.deleteFeedback(id);
        System.out.println("rows=" + rows);
    }
    @Test
    public void handleFeedback() {
        Integer id = 5;
        String handleComment = "说得对";
        Integer rows = feedbackMapper.handleFeedback(id,handleComment);
        System.out.println("rows=" + rows);
    }
    @Test
    public void findByUid() {
        Integer userId = 1;
        List<Feedback> list = feedbackMapper.findByUid(userId);
        System.out.println("count=" + list.size());
        for (Feedback item : list) {
            System.out.println(item);
        }
    }
}
