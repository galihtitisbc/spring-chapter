package org.prototype;

import org.prototype.config.ProjectConfig;
import org.prototype.service.CommentService;
import org.prototype.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService c = ctx.getBean(CommentService.class);
        UserService c2 = ctx.getBean(UserService.class);
        System.out.println(c.getCommentRepository() == c2.getCommentRepository());
    }
}
