package curriculum_New_question;

//Q1.下記9個をクラス変数として宣言のみしてください
class test{
//バイト型
	public static byte b;
	//短整数型
	public static short s;
	//整数型
	public static int i;
	//長整数型
	public static long l;
	//単精度浮動小数点数型
	public static float f;
	//倍精度浮動小数点数型
	public static double d;	
	//文字型
	public static char c;
	//文字列型
	public static String str;
	//ブーリアン型 
	public static boolean boo;
}


public class Curriculum_New_1_4 {
	public static void main(String[] args) {
//		Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
		//バイト型
		test.b= 0 ;
		//短整数型
		test.s = 0;
		//整数型
		test.i = 0;
		//長整数型
		test.l = 0;
		//単精度浮動小数点数型
		test.f = 0.0f;
		//倍精度浮動小数点数型
		test.d = 0.0d;	
		//文字型
		test.c = '\u0000';
		//文字列型
		test.str = null;
		//ブーリアン型 
		test.boo = false;
		
//		Q3初期化をしたそれぞれの変数に下記の値を代入してください
	     // ・バイト型                 10
		test.b = 10;
	     // ・短整数型                 100
		test.s = 100;
	     // ・整数型                	 1000
		test.i = 1000;
	     // ・長整数型                 10000
		test.l = 10000;
	     // ・単精度浮動小数点数型   	 9.5
		test.f = 9.5f;
	     // ・倍精度浮動小数点数型		 10.5
		test.d = 10.5d;
	     // ・文字型                   a
		test.c = 'a';
	     // ・文字列型              	 ハロー
		test.str = "ハロー";
	     // ・ブーリアン型          	 true
		test.boo = true;
		
	 	 
	     // Q4 下記の通りにコンソール出力されるようにしてください
	     // 必ず変数を使用すること
	
	     // 11110
		System.out.println(test.l +test. i + test.s + test.b);
	     // 20.0
		System.out.println(test.f + test.d);
	     // a ハロー true
		System.out.println(test.c +test.str +test.boo);
	     // 11130.0                    数字を全て足す
		System.out.println(test.l+test.i+test.s+test.b+test.f+test.d);
	     // 10000000000                小数点以外の数字を全てかける
		System.out.println(test.b*test.s*test.i*test.l);
	     // 0.105                      10.5割る100をする
		System.out.println(test.d/test.s);
	     // -90                        10引く100をする
		System.out.println(test.b-test.s);
		
		
//		Q5次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
    	//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
//		String num = "20";
// 		int num1 = 23;
// 		System.out.println("ハローJAVA" + (num + num1));
 		 
		int num = 20;
 		int num1 = 23;
 		System.out.println("ハローJAVA" + (num + num1));
 		 
	}
}
