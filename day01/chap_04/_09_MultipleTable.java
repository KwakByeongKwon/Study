package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%02d x %02d = %02d \t",j,i,(i*j));
            }
            System.out.println();
        }
    }
}
