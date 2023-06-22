package curriculum_B;
public class Qes5 {

	public static void main(String[] args) {
		
		System.out.println("課題５");
		System.out.println("\n");

		// 掛けられる数字を変数宣言し9まで順番に配列から呼び込む。
		for (int a = 1; a < 10; a++){
			// 掛ける数字を変数宣言し、20まで順番に配列から順番に呼び込む
			for (int b = 1; b < 21; b++){
				// 掛け算の式を変数宣言し、変数同士で順番に掛け算を行う。100の位まで出力させる。
				int kuku = b * a;
				System.out.print(String.format("%03d", b) + " * " + String.format("%03d", a) + " ＝ " + String.format("%03d", kuku));
				
				// 最後の繰り返しの時以外に｜｜をつける
				if(b != 21-1){
			        System.out.print(" || ");
			    }
			}
			System.out.println("\n");
		}
	}
}
