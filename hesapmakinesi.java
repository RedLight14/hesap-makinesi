import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a,b;
        String islem;

        System.out.print("1.sayiyi giriniz : ");
        a=inp.nextInt();

        System.out.print("2.sayiyi giriniz : ");
        b=inp.nextInt();

        System.out.print("Yapmak istediginiz Islemi seciniz :  \ntoplama(+) , cıkarma(-) , carpma(x) , bolme(/) : ");
        islem=inp.next();

        switch (islem)
        {
            case "+":
                System.out.print("Sonuc : "+(a+b));
                break;
            case "-":
                System.out.print("Sonuc : "+(a-b));
                break;
            case "x":
                System.out.print("Sonuc : "+(a*b));
                break;
            case "/":
                System.out.print("Sonuc : "+(a/b));
                break;
            default:
                System.out.print("Gecerli bir islem giriniz...");
                break;
        }
    }
    }
