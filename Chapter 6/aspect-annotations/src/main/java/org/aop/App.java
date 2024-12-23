package org.aop;

import org.aop.config.ProjectConfig;
import org.aop.models.Comment;
import org.aop.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService commentService = ctx.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setAuthor("Koko");
        comment.setText("Another Message");
        commentService.deleteComment(comment);
    }
}
