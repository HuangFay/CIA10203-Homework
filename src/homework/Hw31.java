package xxx;
import java.util.Scanner;

public class Hw31 {
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
		

		
	
	
		
	}

}
