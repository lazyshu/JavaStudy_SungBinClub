package subinclub.javastudy.beginner.session7;

import java.util.*;

public class Medium {
    /**
     * ## 중급(퀴즈 프로그램)
     *
     * 퀴즈 문제를 사용자에게 제시하고, 정답을 입력받아 점수를 계산하는 프로그램을 만드세요.
     *
     * (깃헙에 작성하여 해당 부분의 깃헙 url을 제출해주세요.)
     *
     * - **문제 구성:** 5개의 퀴즈 문제와 정답을 미리 설정합니다.
     * - **프로그램 동작:** 문제를 하나씩 사용자에게 제시하고 답을 입력받습니다. 각 정답에 맞으면 점수를 부여합니다.
     * - **결과 출력:** 모든 문제를 푼 후 최종 점수를 출력하고, 몇 개를 맞췄는지 표시합니다.
     * - **확장 가능성:** 문제와 답을 배열이나 리스트로 저장해 확장 가능하도록 구성합니다.
     */
    public static void main(String[] args) {
        List<String> questions = new ArrayList<>();
        List<String> answers = new ArrayList<>();
        questions.add("초록");
        questions.add("파랑");
        questions.add("빨강");
        questions.add("노랑");
        questions.add("보라");
        answers.add("green");
        answers.add("blue");
        answers.add("red");
        answers.add("yellow");
        answers.add("purple");

        Scanner scanner = new Scanner(System.in);
        float score=0;
        int correct=0;
        for (int i = 0; i < questions.size(); i++) {
            System.out.printf("%s색을 영어로 입력해주세요 \n", questions.get(i));
            String input = scanner.nextLine();
            if (input.equals(answers.get(i))) {
                System.out.println("정답입니다.");
                System.out.println();
                score += 100f / questions.size();
                correct++;
                continue;
            }
            System.out.println("틀렸습니다. :( ");
            System.out.println();
        }
        System.out.println("점수: "+(int)score);
        System.out.printf("%d문제 중 %d개 맞추셨습니다.",questions.size(),correct);
    }
}
