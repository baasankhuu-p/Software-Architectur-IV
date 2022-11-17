package lab11_5;

public abstract class AlbanBichig {
    abstract public void start();
    abstract public void signature();
    abstract public void end();
    public void doPrinting(){
        start();
        signature();
        end();
    }
}
