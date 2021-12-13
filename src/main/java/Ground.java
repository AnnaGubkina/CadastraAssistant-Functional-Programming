
public class Ground {

    private int price;

    public Ground(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Участок по цене " +
                +price + " долларов за квадратный метр ";
    }
}
