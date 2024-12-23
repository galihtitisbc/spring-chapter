package org.lifecycle;

import org.lifecycle.config.ProjectConfig;
import org.lifecycle.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before");
        CommentService c = ctx.getBean(CommentService.class);
    }
}
