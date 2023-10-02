package org.selcuk.spring06springbootdemo;

import org.Selcuk.model.Comment;
import org.selcuk.spring06springbootdemo.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CydeoApplication {

	public static void main(String[] args) {
		Comment comment = new Comment();
		comment.setAuthor("Johnson");
		comment.setText("Spring Framework");
		ApplicationContext context = SpringApplication.run(CydeoApplication.class, args);
		CommentService commentService = context.getBean(CommentService.class);
		commentService.publishComment(comment);
	}

}
