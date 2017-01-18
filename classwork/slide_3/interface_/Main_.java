public class Main_ {
    public static void main(String[] args) {

        Bank_ nabil = new Nabil_();
        System.out.println(nabil.getBankName());
        System.out.println(nabil.getRate());
        System.out.println();

        Bank_ global = new Global_();
        printName(global.getBankName(), global.getRate());

    }

    /*public static void printName(Bank_ b){
        System.out.println(b.getBankName());
        System.out.println(b.getRate());

    }*/

    public static void printName(String bankName, double rate){
        System.out.println(bankName + " " + rate);

    }

}
