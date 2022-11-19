package Lab12_1;

public class Ger implements ITohijilt{
    @Override
    public String getTohjilt() {
        return "Гэрийн үнэ (25,000,000₮)";
    }

    @Override
    public long getPayment() {
        return (long)25000000;
    }
}
