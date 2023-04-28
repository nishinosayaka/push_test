package curriculum;

public class curriculum1_7 {
		static int i,integer;
		static double d,p1;
	public static void main(String[] args) {

//		問１）
//		以下のプログラムを作成してください。
//		①int型変数 i に 3 を代入する。
		i = 3;
//		②double型変数 d に i を代入する。
		d = i;		
//		③変数 i と変数 d の値をそれぞれコンソールに表示する。
		System.out.println(i);
		System.out.println(d);

//		問２）
//		以下のプログラムを作成してください。
//		①double型変数 pi に数値「3.14」を代入して下さい。。
		p1 = 3.14;
//		②変数 pi に「3」を掛けた値をコンソールに出力して下さい。
		System.out.println(p1 * 3);
//		④int型の変数 integer を宣言し、変数 pi を int型に型変換しコンソールに出力して下さい。
		integer = (int)p1;
		System.out.println(integer);
		
//		問３）
//		①double型の変数を定義し、「2 + 6.0」を代入して下さい。
		double d3 = 2 + 6.0;
//		double型の変数をコンソールに出力して下さい。
		System.out.println(d3);
//		②int型の変数を定義し、double型の変数をint型に型変換して代入下さい。
		int i3 = (int)d3;
//		int型の変数をコンソールに出力して下さい。
		System.out.println(i3);
//		③String型の変数を定義し、int型の変数をString型に型変換して代入して下さい。
		String s3 = Integer.toString(i3);
//		String型の変数をコンソールに出力して下さい。
		System.out.println(s3);
//		④「②」で定義したint型変数に、String型の変数をint型に型変換して代入して下さい。
		i3 = Integer.parseInt(s3);
//		int型の変数をコンソールに出力して下さい。
		System.out.println(i3);

	}

}
