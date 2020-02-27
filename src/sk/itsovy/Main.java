package sk.itsovy;

public class Main {
    public static void main(String[] args) {

        Context context = new Context(new Binary());
        System.out.println("From decimal to binary: " + context.executeConvert(150));

        context = new Context(new Octal());
        System.out.println("From decimal to octal: " + context.executeConvert(150));

        context = new Context(new Hexadecimal());
        System.out.println("From decimal to hexadecima.: " + context.executeConvert(150));
    }
}
