public class BuiltMeth {
    public static void main(String[] args) {
        String s = "Sohaib Rashid";
                
        // Print toUpperCase
        // Print contains("Rashid")
        // Print indexOf("Rashid")
        // Compare "Sohaib" aur "Rashid" using compareTo

        String upper = s.toUpperCase();
        System.out.println(upper);

        boolean hasRashid = s.contains("Rashid");
        System.out.println(hasRashid);

        int idx = s.indexOf("Rashid");
        System.out.println(idx);

        int cmp = "Sohaib".compareTo("Rashid");
        System.out.println(cmp);


    }
}
