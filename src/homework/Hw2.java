package xxx;

public class Hw2 {
	public static void main(String[] args) {
	
//	• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
	System.out.println("第一題");
	int sum1 = 0 ;
	for(int i   = 1 ; i<1000 ;i++) {
		if((i%2) == 0 ) {
//	     System.out.println(i);
		}
	   sum1 +=  i ;
	}
	System.out.println("1~1000偶數總合為" +sum1);
		
	System.out.println("===============================================");

//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
	System.out.println("第二題");
	int product1 = 1;
	for(int i=1;i<=10;i++) {
		product1 *= i ;
		
	}
	System.out.println("1~10連乘積"+product1);
	System.out.println("===============================================");
	
//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
	System.out.println("第三題");
	int product2 = 1;
	int a = 1;
			while( a <10) {
				product2 *=a;
				a++;
			}
	System.out.println("1~10連乘積"+product2);
	System.out.println("===============================================");
//	• 請設計一隻Java程式,輸出結果為以下:
//	1 4 9 16 25 36 49 64 81 100
	System.out.println("第四題");
	int squ = 1;
	for(int i =1;i <=10; i++) {
		squ=i*i;
		System.out.print(squ+"  ");
	}
	System.out.println("===============================================");


//	• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//	輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
	System.out.println("第五題");
	int sum2 = 0, mul1 = 10; 
	 for (int lot = 1; lot <= 49 ; lot++) {
	 if (lot % mul1 == 4) { //剔除14 24 34 44
	 }
	 else if (lot / mul1 == 4) { 
	 }                     //剔除40 41 42 43 44 45 46 47 48 49
	 else {
	 System.out.print(lot + " ");
	 sum2++; //總號碼數
	 }
	 }
	 System.out.println();
	 System.out.println("共" + sum2 + "個號碼");
	 System.out.println();
	
	
	System.out.println("===============================================");
	
	
	
//	• 請設計一隻Java程式,輸出結果為以下:
//	1 2 3 4 5 6 7 8 9 10
//	1 2 3 4 5 6 7 8 9
//	1 2 3 4 5 6 7 8
//	1 2 3 4 5 6 7
//	1 2 3 4 5 6
//	1 2 3 4 5
//	1 2 3 4
//	1 2 3
//	1 2
//	1
	
	for(int x = 1; x<=10; x++) {
		for(int y=1 ;y <=10-x+1;y++) {
			System.out.print(y+" ");
			
			
	    }
	   System.out.println();
	}
	


	

//	• 請設計一隻Java程式,輸出結果為以下:
//	A
//	BB
//	CCC
//	DDDD
//	EEEEE
//	FFFFFF
	

	for(char i = 'A'; i <= (char)'F'; i++) {
		for(int j =0;j <= i- 'A';j++) {
		System.out.print(i);
		}
	System.out.println();
		
	}
	
	
	
}
}