package curriculum_New_question;

public class curriculum_new_1_5 {
	
    // Q1 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
    //  好きな食べ物のみインスタンス変数にして、他の項目はローカル変数に代入し○○に入れてください
    // 『山田太郎 18歳 170.5cm 62.2kg 寿司』

    // ↓↓format↓↓
    // 「初めまして○○です」
    // 「年齢は○○歳です」
    // 「身長は○○cmです」
    // 「体重は○○kgです」
    // 「好きな食べ物は○○です」

	// Q1を下記に記載	
	//クラス変数の宣言
		public static String name;
		public static byte old;
		public static double height,weight;
		
		//インスタンス変数の宣言
		public String like;
		
//		Q2のクラス変数を宣言
		public static double BMI;
		

		
	public static void main(String[] args) {
		//ローカル変数に代入
		name = "山田太郎";
		old = 18;
		height = 170.5f;
		weight = 62.2f;
		//questionクラスのインスタンスを生成
		curriculum_new_1_5 	c1 = new curriculum_new_1_5();
		//インスタンス変数に値を代入
		c1.like = "寿司";
		
		//クラス変数を出力
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+old+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+String.format("%.1f",weight)+"kgです");
		//インスタンス変数を出力
		System.out.println("好きな食べ物は"+c1.like+"です");
	
		
	//　Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
    // 「BMIは○○です」
	// ただし計算は数値を直書きせず、全て変数を使ってすること
    // Q2を下記に記載
		//BMIの計算式を代入
		BMI = weight/((height/100)*(height/100));
		//BMIを出力
		System.out.println("BMIは"+String.format("%.1f",BMI)+"です");
		
		
	    // Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
    	// 初めまして鈴木一郎です
    	// 年齢は24歳です
    	// 身長168.5cmです
    	// 体重は64.2kgです
    	// 好きな食べ物はオムライスです
    	// BMIは22.6です

        // Q3を下記に記載
		//変数に再代入
		name = "鈴木一郎";
		old = 24;
		height = 168.5f;
		weight = 64.2f;
				//インスタンス変数に値を代入
		c1.like = "オムライス";
		
		//クラス変数を出力
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+old+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+String.format("%.1f",weight)+"kgです");
		//インスタンス変数を出力
		System.out.println("好きな食べ物は"+c1.like+"です");
		//BMIの計算式を代入
		BMI = weight/((height/100)*(height/100));
		//BMIを出力
		System.out.println("BMIは"+String.format("%.1f",BMI)+"です");		
		
	}
}



