package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		//  TODO 自動生成されたメソッド・スタブ
		// キーボード入力をする
		Scanner scn = new Scanner(System.in);
		System.out .print("生徒の人数を入力してください。(2以上):");
		int people = scn.nextInt();
		
		// 改行
		System.out.println();
		
		// 教科ごとに格納する配列の初期化
		int[] total = new int[people] ;
		int[] totalen = new int[people];
		int[] totalma = new int[people];
		int[] totalsac = new int[people];
		int[] totalsoc = new int[people];
		
		// 教科を変数宣言して初期化
		int eng =0;
		int math = 0;
		int soc = 0;
		int sac = 0;
		int z = 0;
		
		// 格納した値の教科ごとの初期化
		double sccoreen = 0;
		double sccorema = 0;
		double sccoresac =0;
		double sccoresoc =0;
		double sccoretotal =0;
		
		// peopleの人数分の教科をそれぞれ繰り返して入力を行う
		for(int i = 1 ; i <= people ; i++) {
				System.out.printf(i +"人目の『英語』の点数を入力してください。:");
				eng = scn.nextInt();
				System.out.printf( i +"人目の『数学』の点数を入力してください。:");
				math = scn.nextInt();
				System.out.printf(i +"人目の『理科』の点数を入力してください。:");
				sac = scn.nextInt();
				System.out.printf(i +"人目の『社会』の点数を入力してください。:");
				soc = scn.nextInt();
				System.out.print("\n");
				
				// 各教科ごとに入力した値を全て足した物を格納する（for文で繰り返すごとに０からpeopleの数まで格納させる）
				total[i-1] = eng + math + sac + soc ;
				
				// 各教科ごとに入力した値を各教科ごとに配列に格納（for文で繰り返すごとに０からpeopleの数まで格納させる）
				// i−１で０を指定して、配列に格納する場所は０から順番に格納させる
				totalen[i-1] = eng;
				totalma[i-1] = math;
				totalsac[i-1] = sac;
				totalsoc[i-1] = soc;
		}
		// 一人分の平均点を出力を繰り返して出力
		for ( double sccore : total ) {
			z++;
			double a = sccore / 4;
			System.out.println( z +"人目の平均点は"+ String.format("%.2f",(Math.floor(a*100))/100) + "点です。");
		}
		// 改行
		System.out.print("\n");
		
		// 各教科ごとの平均値を処理
		// 英語
		for ( int b = 0; b < totalen.length ; b++ ) {
			sccoreen += totalen[b];
		}
		System.out.println("英語の平均点は"+String.format("%.2f",(Math.floor(sccoreen/z*100))/100) + "点です。" );
		// 数学
		for ( int c = 0; c < totalma.length ; c++ ) {
			sccorema += totalma[c];
		}
		System.out.println("数学の平均点は"+String.format("%.2f",(Math.floor(sccorema/z*100))/100) + "点です。" );
		// 理科
		for ( int d = 0; d < totalsac.length ; d++ ) {
			sccoresac += totalsac[d];
		}
		System.out.println("理科の平均点は"+String.format("%.2f",(Math.floor(sccoresac/z*100))/100) + "点です。" );
		// 社会
		for ( int e = 0; e < totalsoc.length ; e++ ) {
			sccoresoc += totalsoc[e];
		}
		System.out.println("社会の平均点は" + String.format("%.2f",(Math.floor(sccoresoc/z*100))/100) + "点です。" );
		// 全体
		for ( int f = 0; f < total.length ; f++ ) {
			sccoretotal += total[f];
		}
		System.out.println("全体の平均点は" + String.format("%.2f",(Math.floor(sccoretotal/4/z*100))/100) + "点です。" );	
	}
}
