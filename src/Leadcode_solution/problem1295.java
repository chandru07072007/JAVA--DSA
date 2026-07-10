package Leadcode_solution;

public class problem1295 {
    static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int ans = 0;
        int even =0;

        for (int i = 0; i < arr.length; i++) {
            ans = arr[i];
            int count =0;
           while (ans > 0){
               ans = ans/10;
              count++;


            }

            if(count%2 == 0){
                even++;
            }

        }
        System.out.println(even);
    }
}
