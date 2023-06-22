package curriculum_B;

public class Qes4 {
	
	public static void main(String[] args) {
		
		System.out.println("課題４");
		System.out.println("\n");
		// 掛けられる数字を変数宣言し9回処理を行う
		for (int a = 1; a < 10; a++){
			// 掛ける数字を変数宣言し、９回処理を行う
			for (int b = 1; b < 10; b++){
				// 掛け算の式を変数宣言し、変数同士で順番に掛け算を行う。１０の位までを出力させる
				int kuku = a * b;
				System.out.print(String.format("%02d", a) + " * " + String.format("%02d", b) + " ＝ " + String.format("%02d", kuku));
			
				// 最後の繰り返しの時以外に｜｜をつける
				if(b != 10 - 1){
			        System.out.print(" || ");
			    }
			}
			System.out.println("\n");
		}
	}
}
