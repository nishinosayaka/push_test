package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out .print("生徒の人数を入力してください。(2以上):");
		// 生徒の人数と、教科の数の変数を宣言し、それぞれ代入
		int people = sc.nextInt(), kyouka = 4;
		// 科目を配列させる
		String kamoku[] = {"英語","数学","理科","社会"};
		// [生徒の人数][4教科]を変数に代入
		int[][] num = new int[people + 1][kyouka + 1];
		System.out.print("\n");

		// 教科ごとに点数を入力
		for (int i = 0; i < people; i++) {
			for (int j = 0; j < kyouka; j++) {
				System.out.print((i + 1) + "人目の" + kamoku[j] + "の点数を入力してください。:");
				num[i][j] = sc.nextInt();
			}
		}
		System.out.print("\n");

		//　列ごとに平均を計算して出力
		for (int i = 0; i < people; i++) {
			int sum = 0;
			for (int j = 0; j < kyouka; j++) {
				sum += (double)num[i][j];
			}
			num[i][kyouka] = sum;
			double totalpeople = sum / (double)kyouka;
			System.out.println((i + 1) + "人目の平均点は" + String.format("%.2f", (Math.floor(totalpeople * 100)) / 100) + "点です。");
		}
		System.out.print("\n");

		// 行ごとの合計の変数を宣言
		int sum1 = 0;
		//　行ごとに平均を計算して出力
		for (int j = 0; j < kyouka; j++) {
			sum1 = 0;
			for (int i = 0; i < people; i++) {
				sum1 += num[i][j];
			}
			num[people][j] = sum1;
			double totalkyouka = sum1 / (double)people;
			System.out.println(kamoku[j] + "の平均点は" + String.format("%.2f", (Math.floor(totalkyouka * 100)) / 100) + "点です。");
		}
		
		// 全体の平均を計算して出力
		// 全体の合計の変数を宣言し初期化
		int sum2 = 0;
		//全体の合計値を割る数字を４教科×人数で計算し、変数に代入
		double z = 4 * people;
		//全体の平均値の変数を宣言し、初期化
		double total = 0;
		// 合計値を計算する
		for (int j = 0; j <= kyouka; j++) {
			sum2 = 0;
			for (int i = 0; i < people; i++) {
				sum2 += num[i][j];
			}
			num[people][j] = sum2;
			total = sum2 / z;
		}
		System.out.println("全体の平均点は" + String.format("%.2f", (Math.floor(total * 100)) / 100) + "点です。");
		System.out.print("\n");
		
	}
}

