import java.util.*;
import javax.swing.*;
public class d26277B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String RA;
        int DV1, DV2, DV3, DV, numRA;

        RA = JOptionPane.showInputDialog( null,
                "insira seu RA: ",
                "RA",
                JOptionPane.QUESTION_MESSAGE);

        numRA = Integer.valueOf(RA);

        DV1 = (numRA / 10000) * 3;
        DV2 = ((numRA / 1000) % 10) * 6;
        DV3 = (numRA % 1000) * 9;
        DV = (DV1 + DV2 + DV3) % 5;

        JOptionPane.showMessageDialog(null,
                "seu DV: "+DV,
                "DV",
                JOptionPane.INFORMATION_MESSAGE);

        input.close();
    }
}
