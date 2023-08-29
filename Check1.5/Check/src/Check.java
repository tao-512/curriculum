/**
 * バブルソート
 * チェックテスト-Java2章
 *
 */
public class Check {
	public static void main(String[] args) {
		/*
		* 問1
		* int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
		*/
		int[] data = { 3, 1, 2, 7, 5 };

		/*
		* 問2
		* 以下のfor文を完成させなさい
		* 
		*並び変え前の配列dataを表示
		*/
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		/*
		 * 要素数5
		 *[01234]
		 *31275
		 *13257
		 *12357
		 *            
		 */
		System.out.println();
		//外側のループ            
		for (int i = 0; i < data.length - 1; i++) {
			//内側のループ
			for (int j = data.length - 1; j > i; j--) {

				/*
				 * 問3
				 * 以下、配列の添字を入れてソートを完成させなさい
				 */
				if (data[j - 1] > data[j]) {
					int box = data[j];
					data[j] = data[j - 1];
					data[j - 1] = box;
				}
			}
		}
		//並び変え後表示             
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}
}
