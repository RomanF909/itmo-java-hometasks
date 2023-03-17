package hw2;

public class Task6 {
    public static void main(String[] args) {
        int sum = 550, saleCode = 7647;
        switch (saleCode) {
            case 4525 :
                System.out.println(sum * 0.7);
                break;
            case 6424 :
                System.out.println(sum * 0.8);
                break;
            case 7012 :
                System.out.println(sum * 0.8);
                break;
            case 7647 :
                System.out.println(sum * 0.9);
                break;
            case 9011 :
                System.out.println(sum * 0.9);
                break;
            case 6612 :
                System.out.println(sum * 0.9);
                break;
            default :
                System.out.println(sum);

        }

    }
}
