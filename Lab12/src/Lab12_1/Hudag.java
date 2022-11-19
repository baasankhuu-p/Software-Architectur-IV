package Lab12_1;

public class Hudag extends TohijiltDecorator{
    private final ITohijilt iTohijilt;

    public Hudag(ITohijilt iTohijilt) {
        this.iTohijilt = iTohijilt;
    }

    @Override
    public String getTohjilt() {
        return iTohijilt.getTohjilt()+" \n\tХудаг малтуулья 30м*300000";
    }
    @Override
    public long getPayment() {
        return iTohijilt.getPayment()+(30*300000);
    }
}
