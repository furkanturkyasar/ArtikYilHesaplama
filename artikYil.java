import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int year;

        System.out.print("Yil giriniz: ");
        year = input.nextInt();

        if(year%4==0){
            if(year%100==0&&year%400==0){
                System.out.print(year+" bir artik yildir hem de ozel olan bir artik yil!");
            }else{
                System.out.print(year+" bir artik yildir!");
            }
        }else{
            System.out.print("Artik yil degildir!");
        }


    }
    
}
