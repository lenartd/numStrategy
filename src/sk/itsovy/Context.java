package sk.itsovy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public String executeConvert(int num){
        return strategy.convert(num);
    }
}
