package org.relationship;

import org.relationship.config.ProjectConfig;
import org.relationship.entity.Parrot;
import org.relationship.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = ctx.getBean(Parrot.class);
        Person person = ctx.getBean(Person.class);

        System.out.println(parrot.toString());
        System.out.println(person.toString());
    }
}
