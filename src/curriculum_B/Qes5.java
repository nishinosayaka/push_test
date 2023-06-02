package curriculum_B;



public class Qes5 {

	public static void main(String[] args) {
		//  TODO 自動生成されたメソッド・スタブ
		
		System.out.println("課題５");
		// 改行
		System.out.println();
		// 掛け算をする数を配列に設定
		int num1[] = {1,2,3,4,5,6,7,8,9};
		int num2[] = {1,2,3,4,5,6,7,8,9,10,11};
		
		// 掛けられる数字をa変数宣言し０から８まで順番に配列から呼び込む。
		for (int a = 0 ; a < num1.length ; a++ ){
			// 掛ける数字をbに変数宣言し、０から８まで順番に配列から順番に呼び込む
			for (int b = 0 ; b < num2.length ; b++ ){
				// 掛け算の式をkukuに変数宣言し、配列から数字を呼び込んだaとbを掛ける式を代入し、出力
				int kuku = num2[b] * num1[a];
				System.out.print(String.format("%03d",num2[b])+" * " + String.format("%03d",num1[a])+" ＝ "+String.format("%03d",kuku));
				
				// 最後の繰り返しの時以外に｜｜をつける
				if(b != num2.length-1){
			        System.out.print(" || ");
			    }
			}
			// 改行
			System.out.println();

		}

	
		
	}

}
