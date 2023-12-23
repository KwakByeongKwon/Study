package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 115;

        String ret = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";

        System.out.printf("키가 %dcm 이므로 %s",height,ret);
    }
}
