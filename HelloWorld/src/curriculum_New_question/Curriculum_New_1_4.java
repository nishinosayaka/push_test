package curriculum_New_question;

public class Curriculum_New_1_4 {

	
	public static void main(String[] args) {
//		Q1.下記9個をクラス変数として宣言のみしてください
//		Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
		//バイト型
		byte b= 0 ;
		//短整数型
		short s = 0;
		//整数型
		int i = 0;
		//長整数型
		long l = 0;
		//単精度浮動小数点数型
		float f = 0.0f;
		//倍精度浮動小数点数型
		double d = 0.0d;	
		//文字型
		char c = '\u0000';
		//文字列型
		String str = null;
		//ブーリアン型 
		boolean boo = false;
		
//		Q3初期化をしたそれぞれの変数に下記の値を代入してください
	     // ・バイト型                 10
		b = 10;
	     // ・短整数型                 100
		s = 100;
	     // ・整数型                	 1000
		i = 1000;
	     // ・長整数型                 10000
		l = 10000;
	     // ・単精度浮動小数点数型   	 9.5
		f = 9.5f;
	     // ・倍精度浮動小数点数型		 10.5
		d = 10.5d;
	     // ・文字型                   a
		c = 'a';
	     // ・文字列型              	 ハロー
		str = "ハロー";
	     // ・ブーリアン型          	 true
		boo = true;
		
	 	 
	     // Q4 下記の通りにコンソール出力されるようにしてください
	     // 必ず変数を使用すること
	
	     // 11110
		System.out.println(l + i + s + b);
	     // 20.0
		System.out.println(f + d);
	     // a ハロー true
		System.out.println(c + str + boo);
	     // 11130.0                    数字を全て足す
		System.out.println(l+i+s+b+f+d);
	     // 10000000000                小数点以外の数字を全てかける
		System.out.println(b*s*i*l);
	     // 0.105                      10.5割る100をする
		System.out.println(d/s);
	     // -90                        10引く100をする
		System.out.println(b-s);
		
		
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
