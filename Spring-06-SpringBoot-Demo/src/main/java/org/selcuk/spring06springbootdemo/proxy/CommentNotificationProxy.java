package org.selcuk.spring06springbootdemo.proxy;

import org.Selcuk.model.Comment;


public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
