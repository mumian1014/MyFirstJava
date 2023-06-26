public class OutputProduct {
   public static void main(String[] args) {
    // スーパークラスを使う
    Product otherProduct = new Product();
    otherProduct.setName("氷");
    otherProduct.setPrice(100);
    // 氷は100円です
    System.out.println(otherProduct.getName() + "は" + otherProduct.getPrice() + "円です");

    // サブクラスを使う
    Liquor syochu = new Liquor();
    syochu.setName("いいちこ");
    syochu.setPrice(1800);
    syochu.setAlcholContent(20d);
    // いいちこは度数が20.0度で3600円です。 (たかいな。買えねえ。)
    System.out.println(syochu.getName() + "は度数が" + syochu.getAlcholContent() + "度で" + syochu.getPrice() + "円です");
  }
}