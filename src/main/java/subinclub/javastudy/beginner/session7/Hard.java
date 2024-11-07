package subinclub.javastudy.beginner.session7;

import java.util.ArrayList;
import java.util.Scanner;

public class Hard {
    /**
     * ## 고급(간단한 텍스트 기반 도서 관리 시스템)
     *
     * 사용자가 도서를 등록, 조회, 삭제할 수 있는 간단한 도서 관리 프로그램을 작성하세요.
     *
     * - **사용자 메뉴:** "도서 등록", "도서 조회", "도서 삭제", "종료" 메뉴를 제공하고, 사용자가 원하는 기능을 선택할 수 있게 합니다.
     * - **도서 등록:** 책 제목과 저자를 입력받아 도서를 목록에 추가합니다.
     * - **도서 조회:** 현재 등록된 모든 도서를 목록으로 보여줍니다.
     * - **도서 삭제:** 삭제할 도서의 제목을 입력받아 해당 도서를 목록에서 삭제합니다.
     * - **데이터 구조:** 도서 정보를 저장할 수 있는 ArrayList 등을 활용합니다.
     * - **종료 기능:** "종료" 메뉴를 선택하면 프로그램이 종료됩니다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> title = new ArrayList<>();
        ArrayList<String> author = new ArrayList<>();
        while (true) {
            System.out.println();
            System.out.println("**사용자 메뉴**");
            System.out.println();
            System.out.println("도서 등록을 원하시면 1을 입력해주세요.");
            System.out.println("도서 조회를 원하시면 2를 입력해주세요.");
            System.out.println("도서 삭제를 원하시면 3을 입력해주세요.");
            System.out.println("종료를 원하시면 \"종료\"를 입력해주세요.");
            System.out.print("입력: ");
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println();
                System.out.println("등록하실 책 제목을 입력해주세요.");
                String name = scanner.next();
                System.out.println();
                System.out.printf("등록하신 %s 책의 저자를 입력해주세요. \n",name);
                String inputAuthor = scanner.next();
                System.out.println();
                System.out.printf("%s-%s 도서가 등록되었습니다.",name,inputAuthor);
                title.add(name);
                author.add(inputAuthor);
                continue;
            }
            if (input == 2) {
                System.out.println("**도서 목록**");
                for (int i = 0; i < title.size(); i++) {
                    System.out.printf("%s - %s \n", title.get(i), author.get(i));
                }
                System.out.println();
            }
            if (input == 3) {
                System.out.println();
                System.out.println("**도서 목록**");
                for (int i = 0; i < title.size(); i++) {
                    System.out.printf("%s - %s \n", title.get(i), author.get(i));
                }
                System.out.println();
                System.out.print("삭제하실 책 제목을 입력하세요:");
                String book = scanner.next();
                int index = title.indexOf(book);
                if (index != -1) {
                    title.remove(index);
                    author.remove(index);
                    System.out.printf("%s 이 목록에서 삭제되었습니다.",book);
                }else {
                    System.out.println("존재하지 않는 제목의 책입니다. (제목만 입력해주세요.)");
                }
            }
            if (input == 4) {
                System.out.println();
                System.out.println("종료되었습니다.");
                break;
            }
        }
    }
}
