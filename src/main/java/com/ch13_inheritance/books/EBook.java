package com.ch13_inheritance.books;

public class EBook extends Book {
    private double fileSize;
    private String format;

    public EBook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }


    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        System.out.println("이 전자책의 포맷은 " + format + "입니다.");
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("파일 크기 : " + this.fileSize + "MB");
        System.out.println("파일 형식 : " + this.format);
    }
}
