package com.communityfeedservice.post.domain;

import com.communityfeedservice.post.domain.content.PostContent;
import com.communityfeedservice.user.domain.User;

public class Post {
    private final Long id;
    private final User author;
    private final PostContent content;

    public Post(Long id, User author, PostContent content) {
        if (author == null) {
            throw new IllegalArgumentException();
        }

        this.id = id;
        this.author = author;
        this.content = content;
    }
}
