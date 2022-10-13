import java.util.Scanner;
public class TrianglePatterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of rows: ");
        int row = sc.nextInt();
        System.out.print("\nEnter number of columns: ");
        int column = sc.nextInt();
        System.out.print("\n--- Pattern 1 ---\n\n");
        Half_Triangle(row,column);
        System.out.print("\n--- Pattern 2 ---\n\n");
        Half_Triangle_Mirror(row,column);
        System.out.print("\n--- Pattern 3 ---\n\n");
        Half_Triangle_Inverted(row,column);
        System.out.print("\n--- Pattern 4 ---\n\n");
        Half_Triangle_Inverted_Mirror(row,column);
        System.out.print("\n");
    }
    public static void Half_Triangle(int r, int c){
        for(int i=1;i<=r;i++){
            for(int j=1; j<=i;j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
    public static void Half_Triangle_Mirror(int r, int c){
        for(int i=1;i<=r;i++){
            for(int j=1; j<=c-i;j++){
                System.out.print("   ");
            }
            for(int j=c-i; j<c;j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
    public static void Half_Triangle_Inverted(int r, int c){
        for(int i=1;i<=r;i++){
            for(int j=c; j>=i;j--){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
    public static void Half_Triangle_Inverted_Mirror(int r, int c){
        for(int i=1;i<=r;i++){
          for(int j=c-1;j>=c-i+1;j--){
            System.out.print("   ");
          }
          for(int j=c-i+1; j>=1;j--){
            System.out.print(" * ");
        }
            System.out.print("\n");
        }
    }
}