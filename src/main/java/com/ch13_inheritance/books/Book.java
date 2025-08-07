package com.ch13_inheritance.books;

/*
    Book
    1. private title,author
    2. AllArgsConstruct
    3. Setter/Getter
    4. showInfo()

    예)
    제목 :
    저자 :

    EBook
    1. private double fileSize / String format
    2. showInfo call1()

    예)
    제목 :
    저자 :
    파일 크기 :
    파일 형식 : PDF / EPUB


    BookMain
    1. Book 객체 생성
        Getter 활용 출력
        "이 책의 제목은 자바의 정석입니다."
        "이 책의 저자는 남궁성입니다."
        showInfo()
        제목 : 자바의 정석
        저자 : 남궁성
    2. EBook 객체 생성
        스프링 입문 / 이강준 / 5.2 / EPUB
        Setter 활용 파일 타입 PDF로 수정
        Getter 활용 출력
        "이 전자책의 포맷은 PDF입니다."
        eBook1.showInfo()
        제목 : 스프링 입문
        저자 : 이강준
        파일 크기 : 5.2
        파일 형식 : PDF


 */
public class Book {
    private String title, author;

    public Book(String title, String author) {
        this.author = author;
        this.title = title;
    }


    public String getTitle() {
        System.out.println("이 책의 제목은 " + title + "입니다.");
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        System.out.println("이 책의 저자는 " + author + "입니다.\n");
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public void showInfo() {
        System.out.println("제목 : " + this.title);
        System.out.println("저자 : " + this.author);
    }
}
