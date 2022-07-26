import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greedy_보물 {
	
	public static int N;
	public static int A[];
	public static Integer B[];
	public static int total;

	public static void main(String[] args) {
		//배열 A의 가장 작은 숫자를 배열 B의 가장 큰 숫자와 매칭
		
		// 남은 배열 A의 가장 작은 숫자를 배열 B의 가장 큰 숫자와 매칭
		
		
		// 처음 입력받은 배열의 순서를 복사 해놓고 오름차순 정리로 정렬 후 각각 매칭?
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();
		
		A = new int[N];
		B = new Integer[N];
		
		
		for(int i=0;i<N;i++) {
			A[i] = in.nextInt();
		}
		
		int[] A2 = A.clone();
		
		Arrays.sort(A2);
		
		
		for(int i=0;i<N;i++) {
			B[i] = in.nextInt();
		}
		
		Integer[] B2 = B.clone(); //배열 B는 순서 바꾸면 안되니까 
		Integer[] B22  = B2;
		Arrays.sort(B22,Collections.reverseOrder()); // 내림 차순으로 정렬 성공 Integer로 배열 만들어야 
		
		
		for(int i=0;i<N;i++) {
			total = A2[i]*B22[i]; //뭔가 하자 total이 정상적으로 움직이지 않네  
		}
		
		System.out.println(total);
		
		 
	}

}
