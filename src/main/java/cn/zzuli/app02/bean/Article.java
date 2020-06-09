package cn.zzuli.app02.bean;


public class Article {

    private long id;
    private String title;
    private long publishTime;
    private String content;
    private long readTimes;
    private long thumbUp;
    private long thumbDown;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(long publishTime) {
        this.publishTime = publishTime;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public long getReadTimes() {
        return readTimes;
    }

    public void setReadTimes(long readTimes) {
        this.readTimes = readTimes;
    }


    public long getThumbUp() {
        return thumbUp;
    }

    public void setThumbUp(long thumbUp) {
        this.thumbUp = thumbUp;
    }


    public long getThumbDown() {
        return thumbDown;
    }

    public void setThumbDown(long thumbDown) {
        this.thumbDown = thumbDown;
    }

}
