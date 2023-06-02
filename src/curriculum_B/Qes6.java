package curriculum_B;
import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {

		while(true) {
			// キーボード入力をする
			Scanner scn = new Scanner(System.in);
			// 入力した値の取得
			String line = scn.nextLine();
			// 取得した値を”、”で区切ってvalueの配列に代入する
			String[] values = line.split("、");
			
			// 区切った一つの値をitemとして、valueの配列の数だけ繰り返し処理を行う
			for(String item : values) {
				// ０〜１２までの在庫の数をランダムに作る
				Random ran = new Random();
				int i = ran.nextInt(12);
				
				switch( item ) {
				// itemがcase””の場合の出力
				case "パソコン":
				case "冷蔵庫":
				case "扇風機":
				case "洗濯機":
				case "加湿器":
					System.out.println(item + "の残り台数は" + i + "台です。"+"\n");
					break;
				// itemがcase"テレビorディスプレイ"と受け取った場合の出力
				case "テレビ","ディスプレイ":
					System.out.println(item.matches("テレビ")?
							"テレビの残り台数は"+i+"台です。"+"\n" :
								"ディスプレイの残り台数は"+i+"台です。"+"\n");
				break;
				// case””以外の文字を受け取った場合の出力
				default:
					System.out.println(item + "は指定の商品ではありません。");
				}
			}
		}
	}
}
