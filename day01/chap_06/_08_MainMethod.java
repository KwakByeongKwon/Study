package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        // 위에 입력값의 길이에 따라 나눌 수 있음

        // Program argument 에 확인해보고싶은값 넣어주고 코드 실행
        if (args.length == 1){
            switch (args[0]){
                case "1":
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2":
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "3":
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        } else {
            System.out.println("사용법) 1~3 메뉴 중 하나를 입력하세요.");
        }
    }
}

// 상단에서 Run -> Edit Configurations -> 왼쪽 상단 +
// -> Application 선택 -> Name(이름정해줌)
// -> Choose Main Class(사용할 메서드 선택)
// ->  Program argument(내가 전달하고자 할 전달 값 넣기)
// 그 메서드의 args 안에 Program argument 에 넣었던 값이 공백을 기준으로 나뉘어서 들어가게 됌
// 값에 따라 프로그램을 만들어줄 수 있음
