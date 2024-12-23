package org.aop.service;

import org.aop.aspect.ToLog;
import org.aop.models.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publish Comment : " + comment.getText());
    }

    public void editComment(Comment comment) {
        logger.info("Edit Comment : " + comment.getText());
    }

    @ToLog
    public void deleteComment(Comment comment) {
        logger.info("Delete Comment : " + comment.getText());
    }
}
