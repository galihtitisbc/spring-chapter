package org.aop.service;

import org.aop.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        logger.info("Publish Comment : " + comment.getText());
        return "SUCCESS";
    }
}
