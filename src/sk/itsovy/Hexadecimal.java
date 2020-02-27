package sk.itsovy;

public class Hexadecimal implements Strategy{
    @Override
    public String convert(int num) {
        return Integer.toHexString(num);
    }
}
