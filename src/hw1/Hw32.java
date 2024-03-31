package xxx;
import java.util.Scanner;
public class Hw32 {
	
//	請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//	對則顯示正確訊息,如圖示結果:
//	(提示:Scanner,亂數方法,無窮迴圈)
//	(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
  public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	int answer = (int)(Math.random()*10);
	System.out.println(answer);
	System.out.println("請輸入0~9的數字");
	
	for(int i=0 ;i != -1;) {
		if(sc.hasNextInt()) {i = sc.nextInt();
		}else {break;}
		if(i == answer) {System.out.println("答對了!");
		break;	}
		else {System.out.println("猜錯了繼續猜!");}
	}
	
	
	
	}
 }
