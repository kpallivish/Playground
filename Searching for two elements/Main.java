import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
       
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        
        for(int i = 0; i <= arr_size - 1; i++)
        {
            arr[i] = in.nextInt();
        }
       
        int search_elem_1 = in.nextInt();
        
        int search_elem_2 = in.nextInt();
        
        int elem_1_idx = -1;
        int elem_2_idx = -1;
        
        for(int i = 0; i <= arr_size - 1; i++)
        {
            if(search_elem_1 == arr[i])
            {
                elem_1_idx = i;
            }
            if(search_elem_2 == arr[i]){
                elem_2_idx = i;
            }
        }
        System.out.println(elem_1_idx);
        System.out.println(elem_2_idx);
    }
}