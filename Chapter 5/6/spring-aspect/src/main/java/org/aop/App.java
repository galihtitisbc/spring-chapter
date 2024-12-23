package org.aop;

import org.aop.config.ProjectConfig;
import org.aop.model.Comment;
import org.aop.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class App {
    private static Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService service = ctx.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setAuthor("Koko");
        comment.setText("Hello Test World");
        String value = service.publishComment(comment);
        logger.info(value);
    }
}
