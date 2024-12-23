package org.abstraction;

import org.abstraction.config.ProjectConfig;
import org.abstraction.models.Comment;
import org.abstraction.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        DBCommentRepository dbCommentRepository = new DBCommentRepository();
//        EmailCommentNotificationProxy emailCommentNotificationProxy = new EmailCommentNotificationProxy();
//        CommentService commentService = new CommentService(dbCommentRepository, emailCommentNotificationProxy);
//        Comment comment = new Comment();
//        comment.setAuthor("Koko");
//        comment.setText("Hello Parrot");
//        commentService.publishComment(comment);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Comment comment = new Comment();
        comment.setAuthor("Kokorr");
        comment.setText("Hello Parrotrr");
        CommentService commentService = ctx.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
