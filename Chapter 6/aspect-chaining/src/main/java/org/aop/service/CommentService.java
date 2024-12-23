package org.aop.service;

import org.aop.aspect.ToLog;
import org.aop.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment) {
        logger.info("Publishing Comment : " + comment.getText());
        return "SUCCESS";
    }
}
