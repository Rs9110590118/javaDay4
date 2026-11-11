class Secondary{
    private int id=0;
    void getter(){
        System.out.println(id);
    }
    void setter(int num){
        id=num;
    }

}
class Classroom{
    public static void main(String []args){
        Secondary sc=new Secondary();
        sc.setter(101);
        sc.getter();
    }

}