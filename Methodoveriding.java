class User{
    void name(){
        System.out.println("function 1");
    }
}
class User1 extends User{
    void name(){
        System.out.println("function2");
    }
}
class Methodoveriding{
    public static void main(String[]args){
        User us=new User();
        us.name();
        User1 us1=new User1();
        us1.name();
    }
}