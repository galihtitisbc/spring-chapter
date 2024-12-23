package org.abstraction.repositories;

import org.abstraction.models.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
