import java.util.Scanner;

public class Metoder {


    public void Hello32(){
        for(int i=0; i<32; i++){
            System.out.println("Hello world");
        }
    }

    public void Kvadrat(int num){
        int result1 = num * num;
    }

    public double Multi(double num1 , double num2){
        double result2 = num1 * num2;
        return result2;
    }

    public double RightTriangleArea(double hight, double length){
        double areaT = (hight * length)/2;
        return areaT;
    }

    public double RightCircleArea(double r){
        double areaC = r * r * 3.1415926535;    //Pi?
        return areaC;
    }

    public int GetNumberInput(){
        int input;
        while(true) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv ett tal:");

            try {
                input = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Det är inte ett number, försök igen:");
            }
        }
        return input;
    }

    public int GetChoice(String n1, String n2, String n3){
        int val;

        while(true) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Välj ett av alternativen:");

            System.out.println("1. " + n1 + "\n2. " + n2 + "\n3. " + n3);
            try{
                val = sc.nextInt();
                if(val==1 || val==2 || val==3){
                    break;
                }else{
                    System.out.println("Ogiltigt tal, försök igen:");
                }
            } catch (Exception e) {
                System.out.println("Ogilitigt tat, försök igen:");
            }
        }
        return val;
    }
}
