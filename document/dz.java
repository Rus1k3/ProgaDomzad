import java.util.Scanner;

public class dz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double n = scanner.nextDouble();
        System.out.println("Округленное число: " + Math.round(n));
    }
}


public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество долларов: ");
        double dollars = scanner.nextDouble();

        double pounds = dollars / 1.487;
        double francs = dollars / 0.172;
        double marks = dollars / 0.584;
        double yen = dollars / 0.00955;

        System.out.printf("Эквивалент в фунтах: %.2f\n", pounds);
        System.out.printf("Эквивалент в франках: %.2f\n", francs);
        System.out.printf("Эквивалент в марках: %.2f\n", marks);
        System.out.printf("Эквивалент в йенах: %.2f\n", yen);
    }
}



public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Эквивалент по Фаренгейту: %.2f\n", fahrenheit);
    }
}


public class InvestmentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальный вклад: ");
        double initialAmount = scanner.nextDouble();
        System.out.print("Введите число лет: ");
        int years = scanner.nextInt();
        System.out.print("Введите процентную ставку: ");
        double interestRate = scanner.nextDouble();

        for (int i = 1; i <= years; i++) {
            initialAmount += initialAmount * (interestRate / 100);
            System.out.printf("Через %d год(а) вы получите %.2f долларов.\n", i, initialAmount);
        }
    }
}


public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 25; i <= 62; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}


public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("ДА");
        } else {
            System.out.println("НЕТ");
        }
    }
}


public class TicketCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество поездок: ");
        int n = scanner.nextInt();

        int count60 = n / 60;
        n %= 60;
        int count20 = n / 20;
        n %= 20;
        int count10 = n / 10;
        n %= 10;
        int count5 = n / 5;
        int count1 = n % 5;

        System.out.printf("%d %d %d %d %d\n", count1, count5, count10, count20, count60);
    }
}


public class LinearEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("INF");
        } else if (a == 0) {
            System.out.println("NO");
        } else {
            System.out.println("Решение: " + (-b / (double) a));
        }
    }
}

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int n = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Факториал равен: " + factorial);
    }
}

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Сумма цифр: " + sum);
    }
}


public class EvenNumbersBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        System.out.println("Наибольшее число: " + Math.max(a, b));
    }
}

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

public class SignFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число x: ");
        int x = scanner.nextInt();

        if (x > 0) {
            System.out.println("1");
        } else if (x < 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
    }
}


public class ChangeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите стоимость товара (рубли и копейки): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("Введите уплаченную сумму (рубли и копейки): ");
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int totalPrice = a * 100 + b;
        int totalPaid = c * 100 + d;
        int change = totalPaid - totalPrice;

        int rubles = change / 100;
        int kopecks = change % 100;

        System.out.printf("Сдача: %d руб. и %d коп.\n", rubles, kopecks);
    }
}

public class IceCreamPurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество шариков: ");
        int k = scanner.nextInt();

        if (k % 3 == 0 || k % 5 == 0 || (k % 3 == 2 && k >= 5)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
