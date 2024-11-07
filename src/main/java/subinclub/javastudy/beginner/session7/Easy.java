package subinclub.javastudy.beginner.session7;

import java.util.Scanner;

public class Easy {
    /**
     * ## 초급(간단한 계산기)
     *
     * 사용자로부터 두 개의 숫자와 연산자를 입력받아 덧셈, 뺄셈, 곱셈, 나눗셈을 수행하는 계산기 프로그램을 만드세요. (깃헙에 작성하여 해당 부분의 깃헙 url을 제출해주세요.)
     *
     * - **사용자 입력 요구:** 숫자 두 개와 연산자(+, -, *, /)를 입력받습니다.
     * - **프로그램 동작:** 입력된 연산자에 따라 적절한 계산을 수행하고 결과를 출력합니다.
     * - **예외 처리:** 나누기 연산 시 0으로 나누는 경우 오류 메시지를 출력합니다.
     */
    public static void main(String[] args) {
        System.out.println("type them here");
        Scanner scanner = new Scanner(System.in);
        double firstNum = scanner.nextInt();
        String operator = scanner.next();
        double secondNum = scanner.nextInt();

        if (operator.equals("+")) {
            System.out.println(firstNum +" + "+secondNum+" = " +(firstNum+secondNum));
        } else if (operator.equals("-")) {
            System.out.println(firstNum +" - "+secondNum+" = " +(firstNum-secondNum));
        } else if (operator.equals("*")) {
            System.out.println(firstNum +" * "+secondNum+" = " +(firstNum*secondNum));
        } else if (operator.equals("/")) {
            if (firstNum == 0 || secondNum == 0) {
                System.out.println("0을 나눌 수 없습니다.");
            } else {
                System.out.println(firstNum +" / "+secondNum+" = " +(firstNum/secondNum));
            }
        }

    }
}
