public class OOP2 {
    public static void main(String[] args) {

    }
}
abstract class parent{
    abstract void career(String name);
    abstract void partner(String name, int age);
}
class son extends parent{

    @Override
    void career(String name) {
        System.out.println("I am going to be a ");
    }

    @Override
    void partner(String name, int age) {
        System.out.println("Name"+name+""+"Age"+age);
    }
}


