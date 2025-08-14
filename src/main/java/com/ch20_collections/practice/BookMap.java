package com.ch20_collections.practice;

import java.util.*;

/*
    서첨에서 판매하는 책 재고를 관리하는 프로그램
    지시사항
    1. Map을 사용하여 도서명(String)을 key로, 재고를 Integer로 하여 value로 사용
    2. 사용자로부터 새 도서명과 수량을 입력 받아서 Map에 추가
        - 이미 존재하는 도서라면 "이미 재고에 있는 도서입니다." 출력
    3. 사용자로부터 수량을 변경 할 도서명과 새로운 재고 수량을 입력 받아 Map의 값을 '수정'
        - 존재하지 않는 도서라면 "해당 도서가 재고에 없습니다." 출력
    4. Map에 있는 모든 도서명과 재고 수량을 출력하도록 작성.

    예시)
    --- 도서 재고 관리 프로그램---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 1
    새 도서명을 입력하세요 >>> 자바의 정석
    재고 수량을 입력하세요 >>> 10
    자바의 정석 도서가 10 권 추가되었습니다.

    --- 도서 재고 관리 프로그램---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 2
    재고를 변경할 도서명을 입력하세요 >>> 자바의 정석
    새로운 재고 수량을 입력하세요 >>> 9
    자바의 정석 도서가 9권으로 변경되었습니다.

    --- 도서 재고 관리 프로그램---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 3
    --- 현재 재고 목록
    도서명 : 자바의 정석, 재고수량 : 9 권

    --- 도서 재고 관리 프로그램---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 4
    프로그램이 종료합니다.

 */
public class BookMap {
    private final Map<String, Integer> bookMap = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    private boolean loopFlag = true;

    public void mainMenu() {
        while (loopFlag) {
            System.out.println("--- 도서 재고 관리 프로그램---");
            System.out.println("1. 도서 추가");
            System.out.println("2. 재고 수정");
            System.out.println("3. 재고 목록");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            checkMenu(sc.nextInt());
            System.out.println();
        }
    }

    private void checkMenu(int inputNum) {
        sc.nextLine();
        if (inputNum == 1) {
            addBook();
        } else if (inputNum == 2) {
            changeBookStock();
        } else if (inputNum == 3) {
            checkBookList();
        } else if (inputNum == 4) {
            System.out.println("프로그램이 종료되었습니다.");
            loopFlag = false;
        } else {
            System.out.println("잘못된 번호입니다.");
        }

    }

    private void addBook() {
        System.out.print("새 도서명을 입력하세요 >>> ");
        String bookName = sc.nextLine();
        if (bookMap.containsKey(bookName)) {
            System.out.println("이미 재고에 있는 도서입니다.");
            return;
        }
        System.out.print("재고 수량을 입력하세요 >>> ");
        int bookStock = sc.nextInt();
        bookMap.put(bookName, bookStock);
    }

    private void changeBookStock() {
        System.out.print("재고를 변경할 도서명을 입력하세요 >>> ");
        String bookName = sc.nextLine();
        if (bookMap.containsKey(bookName)) {
            System.out.print("새로운 재고 수량을 입력하세요 >>> ");
            int bookStock = sc.nextInt();
            bookMap.put(bookName, bookStock);
        } else {
            System.out.println("해당 도서가 재고에 없습니다.");
        }
    }

    private void checkBookList() {
        System.out.println("--- 현재 재고 목록---");
        Set<String> bookKeySet = bookMap.keySet();
        List<String> bookKeyList = new LinkedList<>(bookKeySet);
        for (int i = 0; i < bookKeyList.size(); i++) {
            System.out.println("도서명 : " + bookKeyList.get(i) + ", 재고수량 : " + bookMap.get(bookKeyList.get(i)) + " 권");
        }
        for (String key : bookKeySet) {
            System.out.println("도서명 : " + key + ", 재고수량 : " + bookMap.get(key) + " 권");
        }
    }

    public static void main(String[] args) {
        BookMap bookMap = new BookMap();
        bookMap.mainMenu();
    }
}
