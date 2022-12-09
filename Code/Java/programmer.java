class employee{
    float salary=40000;
}
class programmer extends employee{
    int bonus=10000;
    public static void main(String[] args) {
        programmer p=new programmer();
        System.out.println(p.salary);
        System.out.println(p.bonus);
        
    }
}