import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greedy_���� {
	
	public static int N;
	public static int A[];
	public static Integer B[];
	public static int total;

	public static void main(String[] args) {
		//�迭 A�� ���� ���� ���ڸ� �迭 B�� ���� ū ���ڿ� ��Ī
		
		// ���� �迭 A�� ���� ���� ���ڸ� �迭 B�� ���� ū ���ڿ� ��Ī
		
		
		// ó�� �Է¹��� �迭�� ������ ���� �س��� �������� ������ ���� �� ���� ��Ī?
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
		
		Integer[] B2 = B.clone(); //�迭 B�� ���� �ٲٸ� �ȵǴϱ� 
		Integer[] B22  = B2;
		Arrays.sort(B22,Collections.reverseOrder()); // ���� �������� ���� ���� Integer�� �迭 ������ 
		
		
		for(int i=0;i<N;i++) {
			total = A2[i]*B22[i]; //���� ���� total�� ���������� �������� �ʳ�  
		}
		
		System.out.println(total);
		
		 
	}

}
