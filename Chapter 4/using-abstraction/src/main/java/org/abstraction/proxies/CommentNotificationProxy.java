package org.abstraction.proxies;

import org.abstraction.models.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
