import java.util.Arrays;
import java.util.Scanner;

public class Greedy_���� {
	
	public static int N;
	public static int A[];
	public static int B[];
	public static int total;

	public static void main(String[] args) {
		//�迭 A�� ���� ���� ���ڸ� �迭 B�� ���� ū ���ڿ� ��Ī
		
		// ���� �迭 A�� ���� ���� ���ڸ� �迭 B�� ���� ū ���ڿ� ��Ī
		
		
		// ó�� �Է¹��� �迭�� ������ ���� �س��� �������� ������ ���� �� ���� ��Ī?
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
			total += A[i]*B[N-1-i]; // += ���� ���Ծ���  
		}
		
		System.out.println(total);
		
		 
	}

}
