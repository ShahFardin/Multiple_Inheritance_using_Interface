package OOP;

public class Main implements Bangladesh,Hungary{

    public static void main(String[] args) {
        Main main = new Main();
        main.capital1();
        main.capital2();

    }

    @Override
    public void capital1() {
        System.out.println("Capital of Bangladesh is Dhaka");
    }

    @Override
    public void capital2() {
        System.out.println("Capital of Hungary is Budapest");
    }
}


