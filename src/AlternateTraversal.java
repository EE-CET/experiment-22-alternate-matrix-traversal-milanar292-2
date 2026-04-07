import java.util.*;

public class AlternateTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] mat = new int[m][n];
        
        // Input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        StringBuilder result = new StringBuilder();
        
        // Alternate traversal
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    result.append(mat[i][j]).append(" ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    result.append(mat[i][j]).append(" ");
                }
            }
        }
        
        // Print without trailing space
        System.out.print(result.toString().trim());
    }
}
