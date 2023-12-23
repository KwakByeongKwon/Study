package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String data, int count) {
        String hiddenData = data.substring(count);
        for (int i = 0; i < hiddenData.length(); i++) {
            hiddenData = hiddenData.replace(hiddenData.substring(i,i+1),"*");
        }


        return data.replace(data.substring(count),hiddenData);
    }
    // 위에거나 아래거 둘다 가능
    public static String getHidden(String data,int count){
        String hiddenData = data.substring(0,count);
        for (int i = 0; i < data.length() - count; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        String name = "곽병권";
        String residentRegistrationNumber = "000807-3234567";
        String phoneNumber = "010-1234-5678";

        // 이름 성 빼고 * 로 변경
        // 주민번호 뒷자리 첫번째만 남겨두고 * 로 변경
        // 전화번호 마지막 4자리 * 로 변경
        // 위 기능을하는 메서드 생성

        System.out.println("------ 방법1 ------");
        System.out.println("이름 : " + getHiddenData(name,1));
        System.out.println("주민번호 : " + getHiddenData(residentRegistrationNumber,8));
        System.out.println("전화번호 : " + getHiddenData(phoneNumber,9));

        System.out.println("------ 방법2 ------");
        System.out.println("이름 : " + getHidden(name,1));
        System.out.println("주민번호 : " + getHidden(residentRegistrationNumber,8));
        System.out.println("전화번호 : " + getHidden(phoneNumber,9));

    }
}
