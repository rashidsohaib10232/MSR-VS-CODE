public class HCF1 {
    public static void main(String[] args) {
        int x = 9;
        int y =8;
        int HCF = 1;
        
        int n = Math.min(x,y);

        for(int i =1; i<=n; i++){
            if(x%i ==0 && y%i==0){
                HCF = i;
            }
        }

        System.out.println(HCF);
    }
}
