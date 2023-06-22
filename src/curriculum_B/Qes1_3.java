package curriculum_B;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		String[] hands = {"グー", "チョキ", "パー"};
		// 処理を行った回数を変数宣言し、0を代入
		int count = 0;
		boolean janken = true;
		
		while(janken) {
			// ユーザー名を入力し、値を取得
			String user = scn.nextLine();
			int num1 =user.length();

			if(num1 <= 0 || user.isEmpty() || user == null) {
				//取得した値が空白、nullになっていた場合に行う出力
				System.out.println("「名前を入力してください」");
				
			} else if(!user.matches("^[A-Za-z0-9]+$")) {
				// 取得した値が半角英数にマッチしている場合に行う出力
				System.out.println("「半角英数字のみで名前を入力してください」");
				
			} else if(num1 > 10 ) {
				// 取得したユーザー名の文字数が10よりも大きい場合に行う出力
				System.out.println("「名前を１０文字以内にしてください」");
				
			} else {
				
				// ランダムにじゃんけんを行う条件を設定
				while(janken) {
					// 出す手の番号をそれぞれランダムに発行し、私の手と相手の手に代入
					Random ran = new Random();
					int me = ran.nextInt(3);
					int you = ran.nextInt(3);
					// ユーザー名が正しかったらユーザー名を出力
					System.out.println("ユーザー名「" + user +  "」を登録しました");
					// 私の手は何を出したかを出力
					System .out .println(user + "の手は「" + hands[me] + "」");
					// 相手の手は何を出したかを出力
					System.out.println("相手の手は「" + hands[you] + "」");
					// 処理を行った回数を自己代入
					count++;

					// 私の手がグー相手の手がチョキ、私の手がチョキ相手の手がパー、私の手がパー相手の手がグーの時の処理
					if((me == 0 && you == 1) || (me == 1 && you == 2) || (me == 2 && you == 0)) {	
						System.out.println("\n" + "やるやん。" + "\n" + "次は俺にリベンジさせて");					
						// 私が勝負に勝つまでに処理を行った回数をカウントして出力
						System.out.println("\n" + "勝つまでにかかった合計回数は" + count + "回です");
						// 私がじゃんけんに勝った場合は処理を終える
						break;

					// 私の手がチョキで相手の手に負けた時の処理
					} else if(me == 1 && you == 0) {
						System.out.println("\n" + "俺の勝ち！" + "\n" + "負けは次につながるチャンスです！" + "\n" + "ネバーギブアップ！" + "\n");

					// 私の手がパーを出して相手の手に負けた時の処理
					} else if(me == 2 &&	you == 1) {
						System.out.println("\n" + "俺の勝ち！" + "\n" + "たかがじゃんけん、そう思ってないですか？" + "\n" + "それやったら次も、俺が勝ちますよ" + "\n");

					// 私の手がグーを出して相手の手に負けた時の処理
					} else if(me == 0 && you == 2) {
						System.out.println("\n" + "俺の勝ち！" + "\n" + "なんで負けたか、明日まで考えといてください。" + "\n" + "そしたら何かが見えてくるはずです。" + "\n");

					// あいこの場合の設定
					} else {
						System.out.println("\n" + "DRAW あいこ　もう一回しましょう！" + "\n");
					}
				}
				break;
			}
		}
	}
}
