package org.abstraction.repositories;

import org.abstraction.models.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing Comment : " + comment.getText());
    }
}
