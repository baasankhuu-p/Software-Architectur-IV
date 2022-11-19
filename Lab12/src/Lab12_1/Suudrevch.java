package Lab12_1;

public class Suudrevch extends TohijiltDecorator{
    private final ITohijilt iTohijilt;

    public Suudrevch(ITohijilt iTohijilt) {
        this.iTohijilt = iTohijilt;
    }

    @Override
    public String getTohjilt() {
        return iTohijilt.getTohjilt()+" \n\tСүүдрэвч хийе 800000";
    }

    @Override
    public long getPayment() {
        return iTohijilt.getPayment()+800000;
    }
}
