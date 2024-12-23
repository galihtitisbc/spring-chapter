package org.lifecycle.proxies;

import org.lifecycle.models.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
