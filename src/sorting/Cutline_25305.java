package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Cutline_25305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 총 응시자 수
        int k = scanner.nextInt(); // 상을 받을 인원 수

        int[] scores = new int[N];

        for (int i = 0; i < N; i++) {
            scores[i] = scanner.nextInt(); // 각 학생의 점수 입력
        }

        Arrays.sort(scores); // 오름차순 정렬

        // 커트라인은 상을 받는 k번째로 높은 점수
        // 정렬된 배열에서 뒤에서 k번째 점수 (가장 높은 점수는 맨 뒤에 위치)
        System.out.println(scores[N - k]);
    }
}
