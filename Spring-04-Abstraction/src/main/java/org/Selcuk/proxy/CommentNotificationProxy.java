package org.Selcuk.proxy;

import org.Selcuk.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
