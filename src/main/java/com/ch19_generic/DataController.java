package com.ch19_generic;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date();

        ResponseData<String> responseData1 = new ResponseData("날짜 저장 성공", now.toString());
        System.out.println(responseData1);

        ResponseData<Integer> responseData2 = new ResponseData("나이 저장 성공", 38);
        System.out.println(responseData2);

        ResponseData<Date> responseData3 = new ResponseData("객체 저장 성공", now);
        System.out.println(responseData3);

    }
}
