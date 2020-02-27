package sk.itsovy;

public class Octal implements Strategy{
    @Override
    public String convert(int num) {
        return Integer.toOctalString(num);
    }
}
