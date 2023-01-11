import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int fibonnaci(int n){
        return fibonnaci(n, 1, 1);
    }

    public static int fibonnaci(int n, int prev, int prev2){
        if(n == 0){
            return prev + prev2;
        }
        return fibonnaci(n-1, prev2, prev+prev2);
    }

    // 19 boards
    public static ArrayList<int[]> allBoardsFor3x3Chomp() {
        ArrayList<int[]> result = new ArrayList<>();
        allBoardsFor3x3ChompHelper(result, new int[]{1, 0, 0});
        return result;
    }

    private static void allBoardsFor3x3ChompHelper(ArrayList<int[]> result, int[] current) {
        if (current[0] > 3) return;
        result.add(current.clone());
        for (int i = current[0]; i <= 3; i++) {
            for (int j = current[1]; j <= i; j++) {
                for (int k = current[2]; k <= j; k++) {
                    allBoardsFor3x3ChompHelper(result, new int[]{i, j, k});
                }
            }
        }
    }


    /*
    public static ArrayList<int[]> allBoardsFor3x3Chomp(){
        ArrayList<int[]> result = new ArrayList<>();
        for(int i = 1; i <= 3; i++){
            for(int j = 0; j <= i; j++){
                for(int k = 0; k <= j; k++){
                    result.add(new int[]{i, j, k});

                }
            }
        }
    }
    */







}
