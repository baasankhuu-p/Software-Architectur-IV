package Lab12_1;

public class NogooTarih extends TohijiltDecorator{
    private final ITohijilt iTohijilt;

    public NogooTarih(ITohijilt iTohijilt) {
        this.iTohijilt = iTohijilt;
    }

    @Override
    public String getTohjilt() {
        return iTohijilt.getTohjilt()+" \n\tМод тарья 20ш*15000";
    }
    @Override
    public long getPayment() {
        return iTohijilt.getPayment()+(20*15000);
    }
}
