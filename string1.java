public class string1 {
    public static void main(String[] args) {
        System.out.println("Hello Strings");
        String a="Param";
        String b="Param";
        System.out.println(a==b);
        b="Rajput";
        System.out.println(a==b);
   //     String b="not allowed";
        //This will throw an error
        String name1=new String("Kunal");
        String name2=new String("Kunal");
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
        //Only cares about the value hence will give us true
        System.out.println(name1.charAt(4));
    }
}
