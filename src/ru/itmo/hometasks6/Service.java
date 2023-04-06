package ru.itmo.hometasks6;
public class Service {
    private Transport[] transports;
    private int transportIndex;
    private String[] colors = {"blue", "green", "red", "yellow", "black", "white"};

    public Service() {
        transports = new Transport[3];
    }

    public void addTransport(Transport transport){ // ���������� ���������� � ����������
        // ���������� �������� �������� ������ (transport)
        if (transportIndex == transports.length) {
            System.out.println("� ���������� ��� ����� ��� ������������� �������� " + transport.getNumber());
            return;
        }
        transports[transportIndex] = transport; // �������� ��������� � ������
        transportIndex++;
        System.out.println("������������ �������� " + transport.getNumber() + " ���������");
    }

    public void startRepair(){
        for (int i = 0; i < transports.length; i++) {
            if (transports[i] == null) continue;

            transports[i].repair(); // ������ ������������� ��������
            System.out.println("������������ �������� " + transports[i].getNumber() + " ���������������");

            if (transports[i] instanceof RePaintAble) { // ���� ������������ �������� ����� �����������
                int colorIndex = (int) (Math.random() *  colors.length); // ��������� ������
                ((RePaintAble) transports[i]).changeColor(colors[colorIndex]); // �������� � ������� ����, �������� �����
                System.out.println("������������ �������� " + transports[i].getNumber() + " �����������");
            }

            System.out.println("������������ �������� " + transports[i].getNumber() + " �������� ������");
            transports[i] = null;
            transportIndex--;
        }
    }

}
