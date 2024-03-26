package hw1;

public class Hw1 {
	public static void main(String[] args) {
//	•請設計一隻Java程式，計算12，6這兩個數值的和與積
	int num1 = 12,num2 = 6;
	System.out.println("第一題");
	System.out.println("和="+(int) (num1+num2));
	System.out.println("積="+(int) (num1*num2));
	System.out.println("---------------------------------------------------");
	
//	• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
	int eggs = 200;
	System.out.println("第二題");
	System.out.println("總共是"+(eggs/12)+"顆"+"還剩下"+(int)(eggs % 12)+"顆");
	System.out.println("---------------------------------------------------");

//	• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	int second = 256559;
	int dtos = 60*60*24;//一天幾秒
	int htos = 60*60;//一小時幾秒
	int mtos = 60;//一分鐘幾秒
	

	
	System.out.println("第三題");
	System.out.print((second/dtos)+"天又");
	System.out.print(((second%dtos)/htos)+"小時又");
	System.out.print(((second%dtos)%htos)/mtos+"分又");
	System.out.print(((second%dtos)%htos)%mtos+"秒");
	



//	• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
	
	double pi = 3.1415;
	int r = 5;
	
	System.out.println("第四題");
	System.out.println("面積為:"+pi* r *r);//半徑*半徑*pi
	System.out.println("圓周常為:"+pi * r*2);//直徑*pi
	System.out.println("---------------------------------------------------");

	
	
//	• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//	金加利息共有多少錢 (用複利計算，公式請自行google)
	
	System.out.println("第五題");
	int money1 = 1_500_000;
	double rate = 0.02;
	double save;
	double tenyear = money1*(rate+1);
	for(int sav =1;sav <= 10 ;sav++ ) {
		tenyear *= (rate+1);
	}
	System.out.println("存到的錢有:"+(int)tenyear);
	System.out.println("---------------------------------------------------");

	
//	• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//	5 + 5
//	5 + ‘5’
//	5 + “5”
//	並請用註解各別說明答案的產生原因
	
	System.out.println("第六題");
	System.out.println(5 + 5);
	//雙方均為數字所以為數字總和10

	System.out.println(5+'5');
	//第二位'5'為字元  轉成數字為unicode號碼 53號
//	相加為(int)5+53
	
	System.out.println(5+"5");
	//第二位為字串5
	//相加為(String)5串接5  故為55
	
	
	}
}
