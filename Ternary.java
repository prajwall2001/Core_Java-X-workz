class Ternary {
    public static void main(String[] args)
    {
        int n1 = 15, n2 = 23, res;
 
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);
 
        res = (n1 > n2) ? (n1 + n2) : (n1 - n2);
        System.out.println("Result = " + res);
    }
}