package com.communityfeedservice.post.domain;

import com.communityfeedservice.common.domain.PositiveIntegerCounter;
import com.communityfeedservice.post.domain.content.PostContent;
import com.communityfeedservice.user.domain.User;

public class Post {
    private final Long id;
    private final User author;
    private final PostContent content;
    private final PositiveIntegerCounter likeCounter;

    public Post(Long id, User author, PostContent content) {
        if (author == null) {
            throw new IllegalArgumentException();
        }

        this.id = id;
        this.author = author;
        this.content = content;
        this.likeCounter = new PositiveIntegerCounter();
    }

    public void like(User user) {
        if (this.author.equals(user)) {
            throw new IllegalArgumentException();
        }

        this.likeCounter.increase();
    }

    public void unlike(User user) {
        this.likeCounter.decrease();
    }
}
