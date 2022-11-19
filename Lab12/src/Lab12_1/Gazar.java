package Lab12_1;

public class Gazar implements ITohijilt{
    @Override
    public String getTohjilt() {
        return "Газрын үнэ 0.7га (20,000,000₮)";
    }

    @Override
    public long getPayment() {
        return (long)20000000;
    }
}
