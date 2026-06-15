public class TwoSum {
    public static void main(String arg[]){
        int [] arr = {2,3,5,2,1,4,-1};
        int n =3;
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]+ arr[j]==n){
                    System.out.println("ELEM : "+ i);
                    System.out.println("ELEM : "+ j);
                }
                else{
                    System.out.println("not in array ");
                }
            }
        }
    }
    
}
