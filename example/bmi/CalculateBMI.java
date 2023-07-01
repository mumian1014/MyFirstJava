import java.util.Scanner;

public class CalculateBMI {
public static void main(String[] args) {
    // コマンド上から対話式で値を受け取るおまじない
    Scanner stdIn = new Scanner(System.in);
    System.out.println("BMIを計算して肥満度を表示します。");

    System.out.print("・身長(m)を入力してください：");
    double height = stdIn.nextDouble(); 
    
    System.out.print("・体重(Kg)を入力してください：");
    double weight = stdIn.nextDouble(); // 体重を入力

    // インスタンスの生成（呼び出すメソッドにstaticがついていないのでインスタンスの生成が必要）
    // それぞれのメソッドにstaticをつければ不要になります。
    // staticにしていないのは…興味がある方はstaticおじさんで検索してみてください。
    CalculateBMI calculateBMI = new CalculateBMI();

    // BMIの計算
    double bmi = calculateBMI.calculate(weight, height);
    // メッセージ作成
    String resultMessage = calculateBMI.createMessage(bmi);
    // 結果表示
    calculateBMI.print(bmi, resultMessage);     
  }

  /**
   * BMIを計算します。
   * 
   * @param weight 体重
   * @param height 身長
   * @return BMI
   */
  private double calculate(double weight, double height) {
    // BMI = 体重(Kg) × (身長(m))2
    return weight / Math.pow(height, 2);
  }

  /**
   * BMIの値を下に解析を行い、メッセージを作成します。
   * 
   * @param bmi BMI
   * @return 表示するメッセージ
   */
  private String createMessage(double bmi){
    String result = "";

    if (bmi < 18.5) {
      result = "低体重（やせ型）";
    } else if (bmi >= 18.5 && bmi < 25) {
      result = "普通体重";
    } else if (bmi >= 25 && bmi < 30) {
      result = "肥満(level1)";
    } else if (bmi >= 30 && bmi < 35) {
      result = "肥満(level2)";
    } else if (bmi >= 35 && bmi < 40) {
      result = "肥満(level3)";
    } else {
      result = "肥満(level4)";
    }

    return result;

  }  


  /**
   * 結果を表示します。
   * 
   * @param bmi BMI
   * @param message 表示するメッセージ
   */
  private void print(double bmi, String message) {
    System.out.println("------------------------------");
    System.out.println("BMI値は" + bmi + "です。");
    System.out.println("診断結果：" + message);
    System.out.println("------------------------------");

  }

  
}