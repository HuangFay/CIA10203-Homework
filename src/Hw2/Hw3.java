package xxx;
import java.util.Scanner;

public class Hw3 {
	public static void main(String[] args) {
//		請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形
//		(提示:Scanner,三角形成立條件,判斷式if else)
//		(進階功能:加入直角三角形的判斷)
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入第一個邊長");
		int data1 = sc.nextInt();
		System.out.println("請輸入第二個邊長");
		int data2 = sc.nextInt();
		System.out.println("請輸入第三個邊長");
		int data3 = sc.nextInt();
		
		System.out.println(data1 +"\t"+ data2+"\t"+ data3);
		if(data1 == data2 || data2 == data3 ||data3==data1) {
			System.out.println("此三角形為等腰三角形");
		}else if(data1 == data2 && data2 == data3) {
		    System.out.println("此三角形為正三角形");
			}else if(data1 +data3 <= data2 || data1+ data2 <= data3 ||data2+data3<=data1) {
				System.out.println("這不是三角形");
					}
		
		
//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:
//			(提示:Scanner,亂數方法,無窮迴圈)
//			(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
		
		
		
		
		
//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數
//		(提示:Scanner)
//		(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
		
	
	
		
	}

}
