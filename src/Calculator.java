import java.io.*;
import java.util.Scanner;

public class Calculator implements Calculatable {
    String text = "";
    boolean finish = false;
    public Scanner scan = new Scanner(System.in);
    public double firstNumber;
    public double secondNumber;
    public double result;

    public Calculator(double firstNumber, double secondNumber, double result) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public String toString() {
        return getFirstNumber() + " + " + getSecondNumber() + " = " + getResult();
    }

    @Override
    public void calculator() throws IOException {
        System.out.println("Какую операцию вы хотите выполнить:\n1 - операции с процентами.\n2 - сложение.\n3 - вычитание.\n4 - умножение.\n5 - деление." +
                "\nЛюбое другое число - завершить операции.");
        int choice = scan.nextInt();
        while (choice < 6) {
            switch (choice) {
                case 1:
                    prosent();
                    System.out.println("Какую операцию вы хотите выполнить:\n1 - операции с процентами.\n2 - сложение.\n3 - вычитание.\n4 - умножение.\n5 - деление." +
                            "\nЛюбое другое число - завершить операции.");
                    break;
                case 2:
                    add();
                    System.out.println("Какую операцию вы хотите выполнить:\n1 - операции с процентами.\n2 - сложение.\n3 - вычитание.\n4 - умножение.\n5 - деление." +
                            "\nЛюбое другое число - завершить операции.");
                    break;
                case 3:
                    substract();
                    System.out.println("Какую операцию вы хотите выполнить:\n1 - операции с процентами.\n2 - сложение.\n3 - вычитание.\n4 - умножение.\n5 - деление." +
                            "\nЛюбое другое число - завершить операции.");
                    break;
                case 4:
                    multiplicate();
                    System.out.println("Какую операцию вы хотите выполнить:\n1 - операции с процентами.\n2 - сложение.\n3 - вычитание.\n4 - умножение.\n5 - деление." +
                            "\nЛюбое другое число - завершить операции.");
                    break;
                case 5:
                    divide();
                    System.out.println("Какую операцию вы хотите выполнить:\n1 - операции с процентами.\n2 - сложение.\n3 - вычитание.\n4 - умножение.\n5 - деление." +
                            "\nЛюбое другое число - завершить операции.");
                    break;
                default:
                    finish = true;
                    System.out.println("Операция завершена.");
            }
            choice = scan.nextInt();
        }

    }

    @Override
    public void add() throws IOException {
        FileWriter fileWriter = new FileWriter("member.txt");
        FileReader fileReader = new FileReader("member.txt");
        int choiceAdd = 1;
        while (choiceAdd == 1) {
            System.out.print("Введите первое число: ");
            firstNumber = scan.nextInt();
            System.out.print(firstNumber + " + " + "... = " + firstNumber + "\nВведите второе число: ");
            secondNumber = scan.nextInt();
            result = firstNumber + secondNumber;
            if (text != "") {
                fileWriter.write(firstNumber + " + " + secondNumber + " = " + result + "\n" + text);
            } else fileWriter.write(firstNumber + " + " + secondNumber + " = " + result + "\n");
            fileWriter.flush();
            Scanner sc = new Scanner(fileReader);
            if (sc.hasNextLine()) {
                text = text.concat(sc.nextLine() + "\n");
            }
            for (int i = 1; sc.hasNextLine(); i++) {
                System.out.println("\n" + sc.nextLine());
            }
            if (finish) {
                fileWriter.close();
                fileReader.close();
            }
            System.out.print("\n" + firstNumber + " + " + secondNumber + " = " + result + "\n");
            System.out.println("\nВведите 1 - если хотите продолжить вычисления.\nВведите любое другое число - если хотите закончить вычисления");

            choiceAdd = scan.nextInt();
        }
    }
    @Override
    public void substract() throws IOException {
        FileWriter fileWriter = new FileWriter("member.txt");
        FileReader fileReader = new FileReader("member.txt");
        int choiceAdd = 1;
        while (choiceAdd == 1) {
            System.out.print("Введите первое число: ");
            firstNumber = scan.nextInt();
            System.out.print(firstNumber + " - " + "... = " + firstNumber + "\nВведите второе число: ");
            secondNumber = scan.nextInt();
            result = firstNumber - secondNumber;
            if (text != "") {
                fileWriter.write(firstNumber + " - " + secondNumber + " = " + result + "\n" + text);
            } else fileWriter.write(firstNumber + " - " + secondNumber + " = " + result + "\n");
            fileWriter.flush();
            Scanner sc = new Scanner(fileReader);
            if (sc.hasNextLine()) {
                text = text.concat(sc.nextLine() + "\n");
            }
            for (int i = 1; sc.hasNextLine(); i++) {
                System.out.println("\n" + sc.nextLine());
            }
            if (finish) {
                fileWriter.close();
                fileReader.close();
            }
            System.out.print("\n" + firstNumber + " - " + secondNumber + " = " + result + "\n");
            System.out.println("\nВведите 1 - если хотите продолжить вычисления.\nВведите любое другое число - если хотите закончить вычисления");

            choiceAdd = scan.nextInt();
        }
    }

    @Override
    public void divide() throws IOException {
        FileWriter fileWriter = new FileWriter("member.txt");
        FileReader fileReader = new FileReader("member.txt");
        int choiceAdd = 1;
        while (choiceAdd == 1) {
            System.out.print("Введите первое число: ");
            firstNumber = scan.nextInt();
            System.out.print(firstNumber + " / " + "... = " + firstNumber + "\nВведите второе число: ");
            secondNumber = scan.nextInt();
            result = firstNumber / secondNumber;
            if (text != "") {
                fileWriter.write(firstNumber + " / " + secondNumber + " = " + result + "\n" + text);
            } else fileWriter.write(firstNumber + " / " + secondNumber + " = " + result + "\n");
            fileWriter.flush();
            Scanner sc = new Scanner(fileReader);
            if (sc.hasNextLine()) {
                text = text.concat(sc.nextLine() + "\n");
            }
            for (int i = 1; sc.hasNextLine(); i++) {
                System.out.println("\n" + sc.nextLine());
            }
            if (finish) {
                fileWriter.close();
                fileReader.close();
            }
            System.out.print("\n" + firstNumber + " / " + secondNumber + " = " + result + "\n");
            System.out.println("\nВведите 1 - если хотите продолжить вычисления.\nВведите любое другое число - если хотите закончить вычисления");

            choiceAdd = scan.nextInt();
        }
    }

    @Override
    public void multiplicate() throws IOException {
        FileWriter fileWriter = new FileWriter("member.txt");
        FileReader fileReader = new FileReader("member.txt");
        int choiceAdd = 1;
        while (choiceAdd == 1) {
            System.out.print("Введите первое число: ");
            firstNumber = scan.nextInt();
            System.out.print(firstNumber + " * " + "... = " + firstNumber + "\nВведите второе число: ");
            secondNumber = scan.nextInt();
            result = firstNumber * secondNumber;
            if (text != "") {
                fileWriter.write(firstNumber + " * " + secondNumber + " = " + result + "\n" + text);
            } else fileWriter.write(firstNumber + " * " + secondNumber + " = " + result + "\n");
            fileWriter.flush();
            Scanner sc = new Scanner(fileReader);
            if (sc.hasNextLine()) {
                text = text.concat(sc.nextLine() + "\n");
            }
            for (int i = 1; sc.hasNextLine(); i++) {
                System.out.println("\n" + sc.nextLine());
            }
            if (finish) {
                fileWriter.close();
                fileReader.close();
            }
            System.out.print("\n" + firstNumber + " * " + secondNumber + " = " + result + "\n");
            System.out.println("\nВведите 1 - если хотите продолжить вычисления.\nВведите любое другое число - если хотите закончить вычисления");

            choiceAdd = scan.nextInt();
        }
    }

    @Override
    public void prosent() throws IOException {
        FileWriter fileWriter = new FileWriter("member.txt");
        FileReader fileReader = new FileReader("member.txt");
        System.out.println("Какую операцию с процентами вы хотите провести, введите число соответствующее с числами данными ниже:\n1 - узнать процент от числа." +
                "\n2 - вычесть процент от числа.\n3 - прибавить процент к числу.");
        int choiceProsent = scan.nextInt();
        while (choiceProsent <= 3) {
            if (choiceProsent == 1) {
                System.out.println("Введите число, от которого хотите узнать процент: ");
                firstNumber = scan.nextInt();
                System.out.println("Сколько процентов от " + firstNumber + " вы хотите узнать: ");
                secondNumber = scan.nextInt();
                result = firstNumber / 100;
                result *= secondNumber;
                if (text != "") {
                    fileWriter.write(secondNumber + "% от " + firstNumber + " = " + result + "\n" + text);
                } else fileWriter.write(secondNumber + "% от " + firstNumber + " = " + result + "\n");
                fileWriter.flush();
                Scanner sc = new Scanner(fileReader);
                if (sc.hasNextLine()) {
                    text = text.concat(sc.nextLine() + "\n");
                }
                for (int i = 1; sc.hasNextLine(); i++) {
                    System.out.println("\n" + sc.nextLine());
                }
                if (finish) {
                    fileWriter.close();
                    fileReader.close();
                }
                System.out.println("\n" + secondNumber + "% от " + firstNumber + " = " + result + "\n");
            } else if (choiceProsent == 2) {
                System.out.println("Введите число от которого вы будете вычитать процент: ");
                firstNumber = scan.nextInt();
                System.out.println("Введите процент который будете вычитать" + firstNumber + " - ...%");
                secondNumber = scan.nextInt();
                result = firstNumber / 100;
                double procents = result * secondNumber;
                result = firstNumber - procents;
                if (text != "") {
                    fileWriter.write(firstNumber + " - " + secondNumber + "% = " + result + "\n" + text);
                } else fileWriter.write(firstNumber + " - " + secondNumber + "% = " + result + "\n");
                fileWriter.flush();
                Scanner sc = new Scanner(fileReader);
                if (sc.hasNextLine()) {
                    text = text.concat(sc.nextLine() + "\n");
                }
                for (int i = 1; sc.hasNextLine(); i++) {
                    System.out.println("\n" + sc.nextLine());
                }
                if (finish) {
                    fileWriter.close();
                    fileReader.close();
                }
                System.out.println("\n" + firstNumber + " - " + secondNumber + "% = " + result + "\n");
            } else if (choiceProsent == 3) {
                System.out.println("Введите число к которому вы будете прибавлять его процент: ");
                firstNumber = scan.nextInt();
                System.out.println("Введите процент от числа, который будете прибавлять" + firstNumber + " + ...%");
                secondNumber = scan.nextInt();
                double procents = firstNumber / 100;
                procents *= secondNumber;
                result = firstNumber + procents;
                if (text != "") {
                    fileWriter.write(firstNumber + " + " + secondNumber + "% = " + result + "\n" + text);
                } else fileWriter.write(firstNumber + " + " + secondNumber + "% = " + result + "\n");
                fileWriter.flush();
                Scanner sc = new Scanner(fileReader);
                if (sc.hasNextLine()) {
                    text = text.concat(sc.nextLine() + "\n");
                }
                for (int i = 1; sc.hasNextLine(); i++) {
                    System.out.println("\n" + sc.nextLine());
                }
                if (finish) {
                    fileWriter.close();
                    fileReader.close();
                }
                System.out.println("\n" + firstNumber + " + " + secondNumber + "% = " + result + "\n");
            }
            System.out.println("Хотите ли вы провести другие операции?\n1 - узнать процент от числа." +
                    "\n2 - вычесть процент от числа.\n3 - прибавить процент к числу.\nЛюбое другое число - закончить операцию с процентами.");
            choiceProsent = scan.nextInt();
        }
    }
}

