public class Main {

    public static void main(String[] args) {
    Main hello = new Main();
    int number = 0;
    if(args.length != 0)
        number = hello.sayHello(args[0]);
    System.out.println("Anzahl der ausgegebenen Zeichen: " + number);
}

    public int sayHello(String name) {
        String msg = "Hello " + name + "!";
        System.out.println(msg);
        return msg.length();
    }
}
