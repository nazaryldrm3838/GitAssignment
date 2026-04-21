
public class Main {
    public static void main(String[] args) {
        System.out.println("Git Homework Project Started!");
        // e maddesi: Tablo (Array) oluşturma
        int[] numbers = new int[5];
        System.out.println("Table created.");

        // g maddesi: Rastgele değerlerle doldurma
        System.out.println("Filling table with random values:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}