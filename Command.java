public class Command{
		static void putCommand0() throws java.io.IOException{

		part01.put("1. ミルクを与える");
		part01.put("2. 寝る");
		part01.put("3. あやす");
		switch(part01.inputCommand()){
			case '1':{
				part01.good += 2;
				part01.getYutoStatus();
				part01.putStageClear();
				putCommand0();
				break;
			}
			case '2':{
				part01.good += 5;
				part01.getYutoStatus();
				part01.putStageClear();
				putCommand0();
				break;
			}
			case '3':{
				part01.good += 7;
				part01.getYutoStatus();
				part01.putStageClear();
				putCommand0();
				break;
			}
			
		}

	}

	static void putCommand1() throws java.io.IOException{

		part01.put("1. ご飯をあげる");
		part01.put("2. 遊ぶ");
		part01.put("3. お菓子をあげる");
		switch(part01.inputCommand()){
			case '1':{
				part01.good += 2;
				part01.getYutoStatus();
				part01.putStageClear();
				putCommand1();
				break;
			}
			case '2':{
				part01.good += 5;
				part01.getYutoStatus();
				part01.putStageClear();
				putCommand1();
				break;
			}
			case '3':{
				part01.good += 10;
				part01.ikuji();
				part01.getYutoStatus();
				part01.putStageClear();
				putCommand1();
				break;
			}
		}

	}

	static void putCommand2() throws java.io.IOException{

		part01.put("1. ご飯をあげる");
		part01.put("2. 遊ぶ");
		part01.put("3. おもちゃをあげる");
		switch(part01.inputCommand()){
			case '1':{
				part01.good += 2;
				part01.getYutoStatus();
				part01.putStageClear();
				putCommand2();
				break;
			}
			case '2':{
				part01.good += 5;
				part01.getYutoStatus();
				part01.putStageClear();
				putCommand2();
				break;
			}
			case '3':{
				part01.good += 10;
				part01.ikuji();
				part01.getYutoStatus();
				part01.putStageClear();
				putCommand2();
				break;
			}
		}

	}
}