package com.communityfeedservice.post.domain.content;

import com.communityfeedservice.common.domain.DateTimeInfo;

public abstract class Content {
    String contentText;
    final DateTimeInfo dateTimeInfo;

    public Content(String contentText) {
        checkText(contentText);
        this.contentText = contentText;
        this.dateTimeInfo = new DateTimeInfo();
    }

    protected abstract void checkText(String contentText);

    public void updateContent(String updateContent) {
        checkText(contentText);
        this.contentText = updateContent;
        this.dateTimeInfo.updateDateTime();
    }

    public String getContentText() {
        return contentText;
    }
}
