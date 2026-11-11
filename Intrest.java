import java.util.Scanner;
class Loan{
    double calculateinterest(double p){
        return p*5/100;
    }
     double calculateinterest(double p,int y){
        return p*7/100;
    }
    double calculateinterest(double p,int y,double r){
        return p*r*y/100;

}
}
class Intrest{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Loan obj=new Loan();
        System.out.println("ENTER PRINCIPAL:");
        double p=sc.nextDouble();
        System.out.println("5% intrest:"+obj.calculateinterest(p));
        System.out.println("enter years");
        int y=sc.nextInt();
        System.out.println("7% intrest:"+obj.calculateinterest(p,y));
        System.out.println("enter rate");
        double r=sc.nextDouble();
        System.out.println("given rate"+obj.calculateinterest(p,y,r));



    }
    
}