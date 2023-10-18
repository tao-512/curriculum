package study;

//① TaskクラスにCalculatorクラスを継承させなさい。

public class Task extends Calculator {
	


/**
 * タスクの実行
 */
public void doTask() {
	
	System.out.println("pulsメソッドの引数が1つの場合：" + plus(10));
	System.out.println("pulsメソッドの引数が2つの場合："+ plus(15, 15));
	System.out.println("pulsメソッドの引数が3つの場合："+ plus(40, 50, 10));
	

    // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
    // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。

}
}
