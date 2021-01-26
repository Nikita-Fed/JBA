import java.util.Arrays;

class Application {

    String name;

    void run(String[] args) {
        // implement me
//        name = "SimpleApplication";
        System.out.println(name);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}