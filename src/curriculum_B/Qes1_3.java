package curriculum_B;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		//  TODO 自動生成されたメソッド・スタブ

		// コンソールにユーザー名を入力できるようにする
		Scanner sc12 = new Scanner(System.in);
		// 入力した値を取得
		String line11 = sc12.nextLine();

		if(line11.matches("^[A-Za-z0-9]+$")){
			// 取得した値が半角英数にマッチしている場合に行う出力
			System.out.println("OK");
		}else {
			// 取得した値が半角英数にマッチしていない場合に行う出力
			System.out.println("半角英数字のみで名前を入力してください。");
		}

		// 改行
		System.out.println("\n");

		// コンソールにユーザー名を入力できるようにする
		Scanner sc1 = new Scanner(System.in);
		// 入力した値を取得
		String line1 = sc1.nextLine();
		// 取得した文字数を数える
		int line2 =line1.length();

		if(line2 > 10){
			// 取得したユーザー名の文字数が10よりも大きい場合に行う出力
			System.out.println("名前を１０文字以内にしてください。");
		}else {
			System.out.println("ok");
		}
		// 改行
		System.out.println("\n");

		// コンソールにユーザー名を入力できるようにする
		Scanner sc2 = new Scanner(System.in);
		// 入力した値を取得
		String line21 = sc2.nextLine();
		// 取得した文字数を数える
		int line22 = line21.length();

		if(line22 <= 0 || line21 == null) {
			// 取得したユーザー名の文字数が0文字以下か、nullだった場合に行う出力
			System.out.println("名前を入力してください。");
		}else {
		}


		// 問題1−３
		// じゃんけんで出した手をjankenに変数宣言し、0はグー、1はチョキ、2はパーを代入
		String[] janken = {"グー","チョキ","パー"};
		// 処理を行った回数をcountに変数宣言し、１を代入
		int count = 0;

		// ランダムにじゃんけんを行う条件を設定
		while(true) {
			// コンソールにユーザー名を入力できるようにする
			Scanner sc4 = new Scanner(System.in);
			// 入力した値を取得
			String user = sc4.nextLine();
			// 取得した文字数を数える
			int line = user.length();
			// 取得したユーザー名の文字数が半角英数の10文字だったらじゃんけんを行うが、それ以外はじゃんけんをしない
			if(line == 10 && line11.matches("^[A-Za-z0-9]+$")) {

				// 出す手の番号をそれぞれランダムに発行
				Random ran = new Random();
				// 私の手をmeに変数宣言し、ランダムに発行した番号を代入
				int me = ran.nextInt(3);
				// 相手の手をyouに変数宣言し、ランダムに発行した番号を代入
				int you = ran.nextInt(3);

				// 私の手がグー相手の手がチョキ、私の手がチョキ相手の手がパー、私の手がパー相手の手がグーの時の処理
				if((me == 0 && you == 1)|| (me == 1 && you == 2) || (me == 2 && you == 0)){	
					// ユーザー名が正しかったらユーザー名を出力
					System.out.println("ユーザー名「"+user+"」を登録しました。");
					// 私の手は何を出したかを出力
					System .out .println(user+"の手は「"+janken[me]+"」");
					// 相手の手は何を出したかを出力
					System.out.println("相手の手は「"+janken[you]+"」");
					System.out.println("\n"+"やるやん"+"\n"+"次は俺にリベンジさせて");
					// 処理を行った回数を自己代入
					count++;
					// 私が勝負に勝つまでに処理を行った回数をカウントして出力
					System.out.println("\n"+"勝つまでにかかった合計回数は"+count+"回です");
					// 私がじゃんけんに勝った場合は処理を終える
					break;

					// 私の手がチョキで相手の手に負けた時の処理
				}else if(me == 1 && you == 0){
					// ユーザー名が正しかったらユーザー名を出力
					System.out.println("ユーザー名「"+user+"」を登録しました。");
					// 私の手は何を出したかを出力
					System .out .println(user+"の手は「"+janken[me]+"」");
					// 相手の手は何を出したかを出力
					System.out.println("相手の手は「"+janken[you]+"」");
					System.out.println("\n"+"俺の勝ち！"+"\n"+"負けは次につながるチャンスです！"+"\n"+"ネバーギブアップ！");
					// 処理を行った回数を自己代入
					count++;

					// 私の手がパーを出して相手の手に負けた時の処理
				}else if(me == 2 &&	you == 1){
					// ユーザー名が正しかったらユーザー名を出力
					System.out.println("ユーザー名「"+user+"」を登録しました。");
					// 私の手は何を出したかを出力
					System .out .println(user+"の手は「"+janken[me]+"」");
					// 相手の手は何を出したかを出力
					System.out.println("相手の手は「"+janken[you]+"」");
					System.out.println("\n"+"俺の勝ち！"+"\n"+"たかがじゃんけん、そう思ってないですか？"+"\n"+"それやったら次も、俺が勝ちますよ");
					// 処理を行った回数を自己代入
					count++;

					// 私の手がグーを出して相手の手に負けた時の処理
				}else if(me == 0 && you == 2){
					// ユーザー名が正しかったらユーザー名を出力
					System.out.println("ユーザー名「"+user+"」を登録しました。");
					// 私の手は何を出したかを出力
					System .out .println(user+"の手は「"+janken[me]+"」");
					// 相手の手は何を出したかを出力
					System.out.println("相手の手は「"+janken[you]+"」");
					System.out.println("\n"+"俺の勝ち！"+"\n"+"なんで負けたか、明日まで考えといてください。"+"\n"+"そしたら何かが見えてくるはずです。");
					// 処理を行った回数を自己代入
					count++;

					// あいこの場合の設定
				}else {
					// ユーザー名が正しかったらユーザー名を出力
					System.out.println("ユーザー名「"+user+"」を登録しました。");
					// 私の手は何を出したかを出力
					System .out .println(user+"の手は「"+janken[me]+"」");
					// 相手の手は何を出したかを出力
					System.out.println("相手の手は「"+janken[you]+"」");
					System.out.println("\n"+"DRAW あいこ　もう一回しましょう！");
					// 処理を行った回数を自己代入
					count++;

				}
			}else {
				System.out.println("半角英数の10文字以内で名前を入力してください。");				
			}
		}

	}

}
