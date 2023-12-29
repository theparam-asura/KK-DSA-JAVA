public class car implements engine,brake{
    @Override
    public void start() {
        System.out.println("hannnnnnnnnnnnnnn");
    }

    @Override
    public void stop() {
        System.out.println("Ae ruk na");

    }

    @Override
    public void acc() {
        System.out.println("bhaga gadi bhaga");

    }

    @Override
    public void brakes() {
        System.out.println("Tham Tham Tham Tham");

    }

    public static void main(String[] args) {
        car car =new car();
        car.acc();
        car.brakes();
        car.start();
        car.stop();
    }
}
