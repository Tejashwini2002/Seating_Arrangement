import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class SeatingArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_students = sc.nextInt();
        int[] choice_arr = new int[num_of_students];
        int[] result_arr = new int[num_of_students];
        int[] wait_arr = new int[num_of_students];
        for (int i = 0; i < num_of_students; i++) {
            choice_arr[i] = sc.nextInt();
        }
        // for(int i = 0;i<num_of_students;i++){
        // System.out.print(choice_arr[i]+" ");
        // }
       
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 1; i <= num_of_students; i++) {
            hashMap.put(i, 0);
        }
        
        int j = 0;
        int w = 0;
        while (j < result_arr.length) {
            int ch = choice_arr[j];
            if (hashMap.get(ch) == 0) {
                hashMap.put(ch, ch);
                result_arr[j] = ch;
                j++;
            } else {
                wait_arr[w] = j;
                w++;
                j++;
                
            }
        }
         /*
        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
        System.out.println("Result Array: ");
        for (int i = 0; i < num_of_students; i++) {
            System.out.println(result_arr[i]);
        }
        */
        int index = 0 ; // Always remember to declare the variable outside loop, else you will be getting same value in every iteration!!
        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
                // System.out.println(entry.getKey()+": "+entry.getValue());
                if(entry.getValue() == 0){
                    result_arr[wait_arr[index]] = entry.getKey();
                    hashMap.put(entry.getKey(), entry.getKey());
                    index++;
                }
            
        }
       
        // System.out.println("Result Array: ");
        for (int i = 0; i < num_of_students; i++) {
            System.out.print(result_arr[i]+" ");
        }

    }
}
/*
SAMPLE OUTPUT 1:
3
3 2 2
3 2 1 

*/
/*
SAMPLE OUTPUT 2:
4
3 2 2 1
3 2 4 1

*/
/*
SAMPLE OUTPUT 3:
4
2 2 2 2
2 1 3 4 
*/