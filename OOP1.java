public class OOP1 {
    public static void main(String[] args) {
           shape s1 =new shape();
           circle c1=new circle();
           square s=new square();
           triangle t1=new triangle();
           System.out.println(s1.area(1,2,4));
          System.out.println(c1.area(1,2,4));
          System.out.println(s.area(1,2,4));
          System.out.println(t1.area(1,2,4));
    } 
}
class shape{
    int area(int r,int s,int h){
        return 0;
    }
}
class square extends shape{
    int area(int r,int s,int h){
        return s*s;
    }
}
class circle extends shape{
    @Override
    int area(int r, int s, int h){
        return (int) (Math.PI*r*r);
    }
}
class triangle extends shape{
    int area(int r,int s,int h){
        return (int)(0.5*s*h);
    }
}