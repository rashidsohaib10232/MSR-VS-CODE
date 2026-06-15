public class SegregateZeroOne {
    public static void main(String[] args) {
        int arr [] = {1,1,1,0,0,0,1,0,1,1,1,0,0,0,0,0,0,0,1,1,};
        int noZ = 0;
        int noO =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                noZ++;
            
            }
            else{
                noO++;
            }
        }
        for(int i =0; i<noZ; i++){
            arr[i]=0;
        }
        for(int i=noZ; i<arr.length; i++){
            arr[i]=1;
        }
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

       // System.out.println(noZ+" "+noO);

    }
    
}
