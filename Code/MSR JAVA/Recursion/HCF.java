public class HCF {
    public static void main(String[] args) {
        int x = 9;
        int y = 16;
        
        // Create an empty bucket to hold our highest common factor
        int highestCommon = 1; 
        
        // Find the smaller number to use as our stopping point
        int limit = Math.min(x, y); // For 9 and 16, the limit is 9
        
        // Start 'i' at 1, and test every number up to 9
        for(int i = 1; i <= limit; i++) {
            
            // 1 & 2. Find factors for BOTH x and y at the same time
            if (x % i == 0 && y % i == 0) {
                
                // 3 & 4. If 'i' goes into both perfectly, it's a common factor!
                // Because we are counting UP, every new match we find is bigger than the last one.
                highestCommon = i; 
            }
        }
        
        // Print the final result
        System.out.println("The HCF is: " + highestCommon);
    }
}