public class Liquor extends Product{
  private double alcholContent;

  public int getPrice() {
    return super.getPrice();
  }

  public void setPrice(int price) {
    int newPrice = price * 2;
    super.setPrice(newPrice);
  }

  public double getAlcholContent() {
    return alcholContent;
  }

  public void setAlcholContent(double alcholContent) {
    this.alcholContent = alcholContent;
  }
}