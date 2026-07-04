public static void main(String arg[]){

    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int elem[] = new int[size];

    System.out.println("ENTER THE ELEMENT ");

    for(int i =1 ; i<size; i++){

        elem[i] = sc.nextInt();
    }

    System.out.println("ARRAY CONTAINS ");                 // print("the num is ",x"and ",y)

   


    for(int i = 1 ; i<size; i++){
        System.out.println(elem[i]);
    }



    System.out.println("SEARCHING FROM THE LIST ");

    int x = sc.nextInt();

    for(int i = 0; i<elem.length; i++){

        if(elem[i] == x){
            System.out.println(x+ " FOUND AT INDEX "+ i);

        }

        
    }







}