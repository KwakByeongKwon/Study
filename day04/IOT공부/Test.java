package day04.IOT공부;
import day04.IOT공부.org.opentutorials.iot.Elevator;
import day04.IOT공부.org.opentutorials.iot.Lighting;
import day04.IOT공부.org.opentutorials.iot.Security;

public class Test {
    public static void main(String[] args) {
        String id = "JAVA APT 507"; // 자주 사용하는 값은 이렇게 변수로 지정 한 뒤 사용해줌
        // Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);

        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();

        // Light on
        Lighting hallLamp = new Lighting(id + " / Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(id + " / floor Lamp");
        floorLamp.on();
    }
}


/**
 * 버그 : 우리가 짠 코드의 의도하지 않는 오류
 * 디버깅 : 그 버그를 찾기 위한 행위
 *              내 코드를 한 줄 한 줄 실행해주며 값들이 어떻게 변해가는지 확인 가능
 */