package ru.netology.domain;

Public class CommentsInfo {
   
    private String commentButton;
    private int commentCount;
    private boolean commentCanPost;
    private boolean commentCanClose;
    private boolean commentCanOpen;
    
    public String getCommentButton() {
        return commentButton;
    }

    public void setCommentButton(String commentButton) {
        this.commentButton = commentButton;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public boolean isCommentCanPost() {
        return commentCanPost;
    }

    public void setCommentCanPost(boolean commentCanPost) {
        this.commentCanPost = commentCanPost;
    }

    public boolean isCommentCanClose() {
        return commentCanClose;
    }

    public void setCommentCanClose(boolean commentCanClose) {
        this.commentCanClose = commentCanClose;
    }

    public boolean isCommentCanOpen() {
        return commentCanOpen;
    }

    public void setCommentCanOpen(boolean commentCanOpen) {
        this.commentCanOpen = commentCanOpen;
    }
}
