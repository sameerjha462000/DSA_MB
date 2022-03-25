class Main{
    public static void main(String[] args){
        int a = 10, b = 20, c = 30;

        //program to calculate max of three numbers

        if(a >= b){
            if(a >=c){
                // a is larger than b and a is larger than c-->so a is the largest
                System.out.println("a is the largest");
            }else{
                // a is larger than b but a is not larger than c-->this means that c is the largest
                System.out.println("c is largest");
            }
        }else{
            if(b >= c){
                // b is larger than a and b is larger than c-->this means that b is the largest
                System.out.println("b is largest");
            }else{
                // b is larger than a but not larger than c
                System.out.println("c is largest");
            }

        }

    }
}
