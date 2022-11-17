import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoadCamera {
    public static void main(String[] args) throws IOException {
        //��������� ���������
        int maxOncomingSpeed = 60; // km/h
        int speedFineGrade = 20; // km/h
        int finePerGrade = 1000; // RUB
        int criminalSpeed = 180; // km/h

        //=============================================================

        System.out.println("������� �������� ����������:");

        //�������� ����������
        int oncomingSpeed = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        if (oncomingSpeed >= criminalSpeed) {
            System.out.println("����� �������...");
        } else if (oncomingSpeed > maxOncomingSpeed) {
            int overSpeed = oncomingSpeed - maxOncomingSpeed;
            int gradesCount = overSpeed / speedFineGrade;
            int fine = finePerGrade * gradesCount;
            System.out.println("����� ������: " + fine);
        } else {
            System.out.println("�������� �� ���������");
        }
    }
}