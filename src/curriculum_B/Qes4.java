package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		//  TODO 自動生成されたメソッド・スタブ
		
		System.out.println("課題４");
		// 改行
		System.out.println();
		// 掛け算をする数を配列に設定
		int num[] = {1,2,3,4,5,6,7,8,9};
		
		// 掛けられる数字をa変数宣言し０から８まで順番に配列から呼び込む。
		for (int a = 0 ; a < num.length ; a++ ){
			// 掛ける数字をbに変数宣言し、０から８まで順番に配列から順番に呼び込む
			for (int b = 0 ; b < num.length ; b++ ){
				// 掛け算の式をkukuに変数宣言し、配列から数字を呼び込んだaとbを掛ける式を代入し、出力
				int kuku = num[a] * num[b];
				System.out.print(String.format("%02d",num[a])+" * " + String.format("%02d",num[b])+" ＝ "+String.format("%02d",kuku) );
			
				// 最後の繰り返しの時以外に｜｜をつける
				if(b != num.length-1){
			        System.out.print(" || ");
			    }
			}
			// 改行
			System .out .println();

			
		}

	}

}
