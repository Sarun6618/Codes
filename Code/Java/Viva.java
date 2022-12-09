class one{
    String sub="JAVA";
}
class two extends one{
    String sub="CPP";
    void psub(){
        System.out.println(sub);
        System.out.println(super.sub);
    }
}
class Viva{
    public static void main(String[] args) {
        two t=new two();
        t.psub();
    }    
}