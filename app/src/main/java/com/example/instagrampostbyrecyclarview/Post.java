package com.example.instagrampostbyrecyclarview;

public class Post {
    private int id;
    private String title;
    private int likes;
    private int imageId;
    private int likeImageId;


    public Post(int id ,String title,int likes,int imageId,int likeImageId)
    {
        this.id=id;
        this.title=title;
        this.likes=likes;
        this.imageId=imageId;
        this.likeImageId=likeImageId;

    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public int getLikes()
    {
        return likes;
    }
    public void setLikes(int likes)
    {
        this.likes=likes;
    }
    public int getImageId()
    {
        return imageId;
    }
    public void setImageId(int imageId)
    {
        this.imageId = imageId;
    }
    public int getLikeImageId()
    {
        return likeImageId;
    }

    public void setLikeImageId(int likeImageId) {
        this.likeImageId = likeImageId;
    }
}
