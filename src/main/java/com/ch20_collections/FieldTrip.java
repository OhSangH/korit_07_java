package com.ch20_collections;

import java.util.*;

/*
    1. 학생의 수를 입력받아 해당 횟수만큼 반복문을 사용
    2. 1 ~ 5번 학생의 응답을 fieldTrips List에 저장할 것
    3. 중복을 제거하기 위해서 filedTripSet에 이상의 element들을 옮겨 받을 것
    4. 맨 마지막 출력문을 Set -> List로 재 이동 하여 finalFieldTrips List에서 element를 출력할 것


    몇 명의 학생이 수학여행지를 입력하시겠습니까? 5명
    1 번 학생의 수학여행지를 입력하세요 >>> 제주
    2 번 학생의 수학여행지를 입력하세요 >>> 제주
    3 번 학생의 수학여행지를 입력하세요 >>> 민속촌
    4 번 학생의 수학여행지를 입력하세요 >>> 민속촌
    5 번 학생의 수학여행지를 입력하세요 >>> 제주

    1 번 학생의 후보지 : 제주
    2 번 학생의 후보지 : 제주
    3 번 학생의 후보지 : 민속촌
    4 번 학생의 후보지 : 민속촌
    5 번 학생의 후보지 : 제주

    수학 여행 후보지는
    제주
    민속촌
    입니다.
 */
public class FieldTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 명의 학생이 수학여행지를 입력하시겠습니까? ");
        int stuNum = sc.nextInt();
        sc.nextLine();
        List<String> fieldTrips = new ArrayList<>();
        Set<String> fieldTripSet = new HashSet<>();
        List<String> finalFieldTrips = new ArrayList<>();

        for (int i = 0; i < stuNum; i++) {
            System.out.print((i + 1) + " 번 학생의 수학여행지를 입력하세요 >>> ");
            fieldTrips.add(sc.nextLine());
        }

        System.out.println();

        for (int i = 0; i < fieldTrips.size(); i++) {
            System.out.println((i + 1) + " 번 학생의 후보지 :" + fieldTrips.get(i));
        }

        System.out.println();

        fieldTripSet.addAll(fieldTrips);
        finalFieldTrips.addAll(fieldTripSet);

        String fieldResult = "수학 여행 후보지는";
        for (String fieldTrip : finalFieldTrips) {
            fieldResult += "\n" + fieldTrip;
        }
        fieldResult += "\n입니다.";
        System.out.println(fieldResult);

    }
}
