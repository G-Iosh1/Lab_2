import java.util.Scanner;

void main() {
    final double KM = 1.852;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите морские мили");
    double ml = scanner.nextDouble();
    double km = ml * KM;
    System.out.println(ml + " морских миль = "+ km + " километров");
    scanner.close();
}

