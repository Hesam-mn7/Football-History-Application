package com.example.footballihesam.entity;

public class More {


    private int img;
    private String title;
    private String namefile;
    private String fileUrll;
    private String detail;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNamefile() {
        return namefile;
    }

    public void setNamefile(String namefile) {
        this.namefile = namefile;
    }

    public String getFileUrll() {
        return fileUrll;
    }

    public void setFileUrll(String fileUrll) {
        this.fileUrll = fileUrll;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public More(int img, String title, String namefile, String fileUrll, String detail) {
        this.img = img;
        this.title = title;
        this.namefile = namefile;
        this.fileUrll = fileUrll;
        this.detail = detail;
    }
}
