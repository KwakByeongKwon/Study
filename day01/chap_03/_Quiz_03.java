package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "901231-1234567";// 주민등록번호 13자리
        System.out.println("주민등록번호: " + id.substring(0,id.indexOf("-")+2));
    }
}
