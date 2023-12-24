package day04.IOT공부;
import day04.IOT공부.org.opentutorials.iot.DimmingLights;
import day04.IOT공부.org.opentutorials.iot.Elevator;
import day04.IOT공부.org.opentutorials.iot.Lighting;
import day04.IOT공부.org.opentutorials.iot.Security;
import javax.swing.JOptionPane;
public class _input_ {
    public static void main(String[] args) {

//        // String[] args = {"Java_ART_507", "15.0"}
//        String id = args[0]; // 값을 넣을 수 있게 창이 하나 나옴
//        String bright = args[1];

        String id = JOptionPane.showInputDialog("Enter a ID"); // 값을 넣을 수 있게 창이 하나 나옴
        String bright = JOptionPane.showInputDialog("Enter a Bright level");

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

        DimmingLights moodLamp = new DimmingLights(id + " mood Lamp");
        moodLamp.setBright(Double.parseDouble(bright)); // 들어 가는 값이 더블형이라 더블로 값을 바꿔줘야 됌
        moodLamp.on();
    }
}
