package PadobanSequence;

import java.util.*;

/*오른쪽 그림과 같이 삼각형이 나선 모양으로 놓여져 있다. 첫 삼각형은 정삼각형으로 변의 길이는 1이다. 그 다음에는 다음과 같은 과정으로 정삼각형을 계속 추가한다. 나선에서 가장 긴 변의 길이를 k라 했을 때, 그 변에 길이가 k인 정삼각형을 추가한다.

파도반 수열 P(N)은 나선에 있는 정삼각형의 변의 길이이다. P(1)부터 P(10)까지 첫 10개 숫자는 1, 1, 1, 2, 2, 3, 4, 5, 7, 9이다.

N이 주어졌을 때, P(N)을 구하는 프로그램을 작성하시오.*/

// 처음 int형으로 했지만 범위를 넘어서는 문제가 발생해 long타입으로 바꿈

public class PadobanSequence {
	
	static long[] arr = new long[101];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		
		for(int i = 0; i < Num; i++) {
			int dfs = sc.nextInt();
			System.out.println(back(dfs));
		}
		
		
	}
	
	public static long back(int Num) {
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		
		if(Num == 1) return arr[1];
		if(Num == 2) return arr[2];
		
		if(arr[Num] == 0) return arr[Num] = (back(Num - 2) + back(Num - 3));
		
		return arr[Num];
	}

}
