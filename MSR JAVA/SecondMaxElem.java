public class SecondMaxElem {
    public static void main(String arg[]){
        int [] arr = {-3,4,23,24,5,99};
        int max = arr[0];
        int smax = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
               
            }
        
        }
        System.out.println("MAX ELEM IS "+ max);
        for(int i =0; i<arr.length; i++){
            if(arr[i]>smax && arr[i] != max){
                smax = arr[i];
                


            }
        }
        System.out.println(smax);
    }
    
}
