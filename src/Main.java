public class Main {
    public static void main(String[] args) {

        int numToexamine = 4;
        int numTodetermine = 2;
        int module = (numToexamine % numTodetermine);
        System.out.println("The result of the modulo operation is " + module);
        System.out.println("The number " + numToexamine + " is " + ((module == 0) ? "even" : "odd"));
    }
}