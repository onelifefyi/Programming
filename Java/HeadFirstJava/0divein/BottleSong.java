public class BottleSong {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "bottles";
        while (bottlesNum > 0) {
            if (bottlesNum == 1){
                word = "bottle";
            }
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidently fall,");
            bottlesNum = bottlesNum - 1;

            if (bottlesNum > 0){
                System.out.println("There will be " + bottlesNum + " green " + word + " on the wall");
            }
            else{
                System.out.println("There will be no bottles in the wall");
            }
        }
    }
}