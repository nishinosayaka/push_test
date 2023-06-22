package curriculum_B;
import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	private static Scanner scn;

	public static void main(String[] args) {

		while(true) {
			scn = new Scanner(System.in);
			
			// 取得した値を”、”で区切って配列に代入する
			String[] values = scn.nextLine().split("、");
			
			// 引数を宣言し、配列の数だけ繰り返し処理を行う
			for(String item : values) {
				// 在庫の数をランダムに作る
				Random ran = new Random();
				int i = ran.nextInt(12);
				int dis = ran.nextInt(12);

				// 配列の引数を受け取った時のそれぞれの処理
				switch(item) {
				case "パソコン":
				case "冷蔵庫":
				case "扇風機":
				case "洗濯機":
				case "加湿器":
					System.out.println(item + "の残り台数は" + i + "台です。" + "\n");
					break;
				case "テレビ", "ディスプレイ":
					System.out.println(item.matches("テレビ")?
							"テレビの残り台数は" + i + "台です。" + "\n" :
								"ディスプレイの残り台数は" + (i - dis) + "台です。" + "\n");
				break;
				default:
					System.out.println(item + "は指定の商品ではありません。"+ "\n");
				}
			}
		}
	}
}
