package org.lifecycle.repositories;

import org.lifecycle.models.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
