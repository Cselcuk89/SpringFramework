package org.Selcuk;

import org.Selcuk.config.ProjectConfig;
import org.Selcuk.model.Comment;
import org.Selcuk.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService commentService1 = context.getBean(CommentService.class);
        CommentService commentService2 = context.getBean(CommentService.class);
        System.out.println(commentService1 == commentService2);// this will be false unless we use scope annotation

    }
}
