public class Arr {
    public static void main(String[] args){
        int[] celieChisla2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Четные числа массива: ");
        for (int i = 0; i < celieChisla2.length; i++){
            if (celieChisla2[i] %2 == 0){
            System.out.printf(" Индекс элкемента: %d; Число: %d%n", i, celieChisla2[i]);
            }
        }
    }

}
