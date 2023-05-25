public class Finra {

    public static void main(String[] args) {

        int numbers = 0;

        for(int i = 1; i <= 30; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Finra");
            } else if (i % 3 == 0) {
                System.out.println("Fin");
            } else if (i % 5 == 0) {
                System.out.println("Ra");
            }else{
                System.out.println(i);
            }
        }

    }
}
