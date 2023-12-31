package org.Selcuk.service;

import org.Selcuk.model.Comment;
import org.Selcuk.proxy.CommentNotificationProxy;
import org.Selcuk.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")// will create a different bean in the container. If we dont use this annotation, the spring container will create the same bean
@Scope(BeanDefinition.SCOPE_PROTOTYPE)// this is another way doing the same thing

public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, @Qualifier("Push") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }
    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
