package org.selcuk.spring06springbootdemo.repository;

import org.Selcuk.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
