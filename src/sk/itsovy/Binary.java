package sk.itsovy;

public class Binary implements Strategy{
    @Override
    public String convert(int num) {
        return Integer.toBinaryString(num);
    }
}
