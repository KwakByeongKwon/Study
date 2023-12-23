package chap_03;

public class _01_String {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);
        System.out.println("-----------------");

        // 문자열의 길이
        System.out.println(s.length());
        System.out.println("-----------------");
        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println("-----------------");

        // 소문자로 변환
        System.out.println(s.toLowerCase());
        System.out.println("-----------------");

        // 포함관계
        System.out.println(s.contains("Java"));
        System.out.println(s.contains("C#"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.indexOf("C#"));
        System.out.println(s.indexOf("and"));
        System.out.println(s.lastIndexOf("and"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.endsWith("."));
        System.out.println("-----------------");
    }
}
