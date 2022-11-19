package Lab12_1;

public class Mod  extends TohijiltDecorator{
    private final ITohijilt iTohijilt;

    public Mod(ITohijilt iTohijilt) {
        this.iTohijilt = iTohijilt;
    }

    @Override
    public String getTohjilt() {
        return iTohijilt.getTohjilt()+" \n\tМод тарья 10ш*30000";
    }
    @Override
    public long getPayment() {
        return iTohijilt.getPayment()+(10*30000);
    }
}
