/**
 * Hoàn thiện các phương thức trong lớp Ontap_mang2D_3 theo các yêu cầu 
 * như trong phần mô tả và đề bài. Các phương thức cần được giữ nguyên dạng
 * tên / danh sách tham đối/ kiểu trả về/ mẫu khai báo ....
 * Có thể bổ sung các phương thức khác nếu cần.
 * */
import java.util.Scanner;

public class Ontap_mang2D_3{

    /* thực hiện nhập số nguyên m, n và trả lại mảng hai chiều m x n số nguyên nhập từ bàn phím */
    public static int[][] readMatrix(Scanner reader) {
    	int N,M;
    	M = reader.nextInt();
    	N = reader.nextInt();
    	int[][] A = new int[M][N];
    	for(int i = 0; i < M; ++i){
    		for(int j = 0; j < N; ++j){
    			A[i][j] = reader.nextInt();
    		}
    	}
        // bổ sung mã lệnh - có thể thay đổi giá trị trả về nhưng cần đúng kiểu 
        return A;
    }
    
    /* thực hiện việc in mảng hai chiều Mtr ra màn hình dạng ma trận */
    public static void printMatrix(int[][] Mtr) {
        // bổ sung mã lệnh
        for(int i = 0; i < Mtr.length; ++i){
        	for(int j = 0; j < Mtr[0].length; ++j){
        		System.out.printf("%d ", Mtr[i][j]);
        	}
        	System.out.println();
        }
    }
    public static boolean isPerfectNum(int A){
		if(A <= 1) return false;
    	int ans = 0;
    	for(int i = 1; i < A; ++i){
    		if(A % i == 0) ans += i;
    	}
    	return ans == A;
    }
    /* liệt kê chỉ số dòng của các phần tử là số hoàn thiện trong cột thứ k ma trận Mtr */
    public static void listPerfectNum(int[][] Mtr, int k) {
        // bổ sung mã lệnh  
        for(int i = 0; i < Mtr.length; ++i){
        	if(isPerfectNum(Mtr[i][k])){
        		System.out.printf("%d ", i);
        	}
        }
        System.out.println();
    }
    
    /*  thực hiện tính và chuẩn 2 của dòng thứ k của Mtr */
    public static double normRows(int[][] Mtr, int k) {
    	double A = 0;
    	for(int i = 0; i < Mtr[0].length; ++i){
    		A = A + (Mtr[k - 1][i] * Mtr[k - 1][i]);
    	}
         // bổ sung mã lệnh - có thể thay đổi giá trị trả về nhưng cần đúng kiểu 
         return Math.sqrt(A);
    }

    /* thực hiện việc tính và in chuẩn 2 của các dòng trong Mtr ra màn hình */
    public static void printRowsNorm(int[][] Mtr)  {
         // bổ sung mã lệnh
    	for(int i = 0; i < Mtr.length; ++i){
			double ans = (Math.round(normRows(Mtr,i + 1)*10000.0))/10000.0;
    		System.out.print( ans + " ");
    	}
		System.out.println();
    }
    public static void main(String[] args){
    	// Scanner sc = new Scanner(System.in);
    	// int[][] A = readMatrix(sc);
		// listPerfectNum(A,1);
    	// printMatrix(A);
    	// printRowsNorm(A);
    	// sc.close();
    }
    
}

