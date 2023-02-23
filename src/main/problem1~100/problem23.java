/*
* 문제
2022 연세대학교 미래캠퍼스 슬기로운 코딩생활에
$N$명의 학생들이 응시했다.

이들 중 점수가 가장 높은
$k$명은 상을 받을 것이다. 이 때, 상을 받는 커트라인이 몇 점인지 구하라.

커트라인이란 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수를 말한다.

입력
첫째 줄에는 응시자의 수
$N$과 상을 받는 사람의 수
$k$가 공백을 사이에 두고 주어진다.

둘째 줄에는 각 학생의 점수
$x$가 공백을 사이에 두고 주어진다.

출력
상을 받는 커트라인을 출력하라.

제한
 
$1 ≤ N ≤ 1\,000$ 
 
$1 ≤ k ≤ N$ 
 
$0 ≤ x ≤ 10\,000$ 
예제 입력 1
5 2
100 76 85 93 98
예제 출력 1
98
시험 응시자들 가운데 1등은 100점, 2등은 98점, 3등은 93점이다. 2등까지 상을 받으므로 커트라인은 98점이다.
* */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class problem23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int cutLine = in.nextInt();

        // 래퍼럴 타입으로 해야 Collections.reverse 사용가능
        Integer [] array = new Integer[number];

        for (int i = 0; i < number; i++) {
            array[i] = in.nextInt();
        }
        // 배열을 내림차순으로 정렬하기위해 reverse
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(array[cutLine-1]);

    }
}