import java.util.Arrays;
import java.util.Scanner;

public class Greedy_보물 {
	
	public static int N;
	public static int A[];
	public static int B[];
	public static int total;

	public static void main(String[] args) {
		//배열 A의 가장 작은 숫자를 배열 B의 가장 큰 숫자와 매칭
		
		// 남은 배열 A의 가장 작은 숫자를 배열 B의 가장 큰 숫자와 매칭
		
		
		// 처음 입력받은 배열의 순서를 복사 해놓고 오름차순 정리로 정렬 후 각각 매칭?
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();
		
		A = new int[N];
		B = new int[N];
		
		
		for(int i=0;i<N;i++) {
			A[i] = in.nextInt();
		}
		
		
		Arrays.sort(A);
		
		
		for(int i=0;i<N;i++) {
			B[i] = in.nextInt();
		}
		
		Arrays.sort(B);
		
		
		for(int i=0;i<N;i++) {
			total += A[i]*B[N-1-i]; // += 까지 빼먹었네  
		}
		
		System.out.println(total);
		
		 
	}

}
