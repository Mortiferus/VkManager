package ru.netology.domain;

Public class RepostsInfo {

    private int repostsCount;
    private boolean userReposted;
    
     public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public int getRepostsCount() {
        return repostsCount;
    }

    public void setRepostsCount(int repostsCount) {
        this.repostsCount = repostsCount;
    }

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
    }
 }
