package com.communityfeedservice.post.domain.comment;

import com.communityfeedservice.post.domain.Post;
import com.communityfeedservice.post.domain.content.Content;
import com.communityfeedservice.user.domain.User;

public class Comment {
    private final Long id;
    private final Post post;
    private final User author;
    private Content content;

    public Comment(Long id, Post post, User author, Content content) {
        if (author == null) {
            throw new IllegalArgumentException();
        }

        if (post == null) {
            throw new IllegalArgumentException();
        }

        if (content == null) {
            throw new IllegalArgumentException();
        }

        this.id = id;
        this.post = post;
        this.author = author;
        this.content = content;
    }
}
