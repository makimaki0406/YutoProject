public class part01{
	static String name = "Yuto"; //キャラクターの名前
	static int age;			 //キャラクターの年齢
	static int good = 5;		 //キャラクターの育成ポイント
	static int wagamama = 0;	 //キャラクターのマイナスポイント

	public static void main (String[] args) throws java.io.IOException{

		if(good >= 60){
			return;
		}

		putOpening();
		
		putCommand0();

		putStageClear();

	}

	public static void putCommand0() throws java.io.IOException{

		put("1. ミルクを与える");
		put("2. 寝る");
		put("3. あやす");
		switch(inputCommand()){
			case '1':{
				good += 2;
				getYutoStatus();
				putStageClear();
				putCommand0();
				break;
			}
			case '2':{
				good += 5;
				getYutoStatus();
				putStageClear();
				putCommand0();
				break;
			}
			case '3':{
				good += 7;
				getYutoStatus();
				putStageClear();
				putCommand0();
				break;
			}
			
		}

	}

	public static void putCommand1() throws java.io.IOException{

		put("1. ご飯をあげる");
		put("2. 遊ぶ");
		put("3. お菓子をあげる");
		switch(inputCommand()){
			case '1':{
				good += 2;
				getYutoStatus();
				putStageClear();
				putCommand1();
				break;
			}
			case '2':{
				good += 5;
				getYutoStatus();
				putStageClear();
				putCommand1();
				break;
			}
			case '3':{
				good += 10;
				ikuji();
				getYutoStatus();
				putStageClear();
				putCommand1();
				break;
			}
		}

	}

	public static void putCommand2() throws java.io.IOException{

		put("1. ご飯をあげる");
		put("2. 遊ぶ");
		put("3. おもちゃをあげる");
		switch(inputCommand()){
			case '1':{
				good += 2;
				getYutoStatus();
				putStageClear();
				putCommand2();
				break;
			}
			case '2':{
				good += 5;
				getYutoStatus();
				putStageClear();
				putCommand2();
				break;
			}
			case '3':{
				good += 10;
				ikuji();
				getYutoStatus();
				putStageClear();
				putCommand2();
				break;
			}
		}

	}


	/**
	* オープニングを表示
	*/
	public static void putOpening(){
		System.out.println(name + "君、こんにちは！！");
		System.out.println(name + "君は今" + age + "才です");
		System.out.println("頑張って育てよう");
	}

	public static void getYutoStatus(){
		put("------------------------------------------------");
		put(name + "君は" + "育成ポイント" + good + "で" + "マイナスポイント" + wagamama);
		put("------------------------------------------------");
	}

	/**
	*ゲームオーバー画面を表示しまうs
	*/
	public static void putGameOver(){
	put("GAME終了");
	}

	/**
	* ステージクリア画面を表示
	*/

	public static void putStageClear() throws java.io.IOException{

		if(good >= 20 && good < 30){
			age = 1;
			put(name + "君は" + age + "才になりました!!");
			putCommand1();
		}
		if(good >= 30 && good < 60){
			age = 2;
			put(name + "君は" + age + "才になりました!!");
			putCommand2();
		}
		if(good >= 60){
			age = 3;
			put(name + "君は" + age + "才になりました!!");
			putGameOver();
		}
		
		
	}

	/**
	* 育児を行う
	*/
	static void ikuji(){
	//育児ポイントの上昇
	//わがまま・マイナスポイント
		java.util.Random r = new java.util.Random();
		int d = r.nextInt(6);
		good -= d;
    }
  
    
    public static int inputCommand() throws java.io.IOException{

			int c = System.in.read();
			if(c == 10 || c == 13){
				return(inputCommand());
			}
			return(c);
	}

	public static void put(String str){
		System.out.println(str);
	}

}