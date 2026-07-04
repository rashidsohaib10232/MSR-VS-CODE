public class RotateArrayM1 {
    public static void main(String[] args) {
        int [] arr = {6,8,1,2,4,9,0};
        //Rotate d = 3
        int n = arr.length;
        int i=0; 
        int j = 2;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
         }

        // for(int ele : arr){
        //     System.out.print(ele + " ");
        // }
        int k =3;
        int l =n-1;

        while(k<l){
            int temp = arr[k];
            arr[k] = arr[l];
            arr[l] = temp;
            k++;
            l--;
         }
        

        //  for(int ele : arr){
        //     System.out.print(ele + " ");}
        

        int m =0;
        int p =n-1;

        while(m<p){
            int temp = arr[m];
            arr[m] = arr[p];
            arr[p] = temp;
            m++;
            p--;
         }

         for(int ele : arr){
            System.out.print(ele + " ");}

        

    }
}
