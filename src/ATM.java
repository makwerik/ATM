import java.util.Scanner;

public class ATM {
    private static double balance = 1000.00; // Переменная достапная только внутри текущего класса
    private static final int pincode = 1234; //Константа, которая не может быть изменена

    public static void main(String[] args){
        //Главный метод
        Scanner scanner = new Scanner(System.in); // Объект сканера, для считывания ввода с консоли

        System.out.print("Введите PIN-код: ");
        int enteredPin = scanner.nextInt(); //Считываем введённый код

        // String.valueOf(enteredPin) - преобразовываем в строку значение
        if ( String.valueOf(enteredPin).length() < 4){
            System.out.println("PIN-код меньше 4 цифр");
            return;
        }else if(String.valueOf(enteredPin).length() > 4){
            System.out.println("PIN-код больше 4 цифр");
            return;
        }else{
            if (enteredPin != pincode) {
                System.out.println("Вход запрещён. Неверный PIN-код. ");
                return;
            }else {
                System.out.println("Успешный вход");

                boolean exit = false; // Переменная для выхода из системы

                // Пока exit == false выполняется цикл
                while (!exit){

                    System.out.println("Выберите операцию:");
                    System.out.println("1: Посмотреть баланс");
                    System.out.println("2: Снять наличные");
                    System.out.println("3: Внести наличные");
                    System.out.println("4: Стать миллионером");
                    System.out.println("5: Выход");

                    int choice = scanner.nextInt(); // Считываю выбор пользователя

                    switch (choice){
                        case 1:
                            System.out.println("В разработке");
                            break;
                        case 2:
                            System.out.println("В разработке");
                            break;
                        case 3:
                            System.out.println("В разработке");
                            break;
                        case 4:
                            System.out.println("В разработке");
                            break;
                        case 5:
                            System.out.println("Спасибо за то, что воспользовались нашим банкоматом!");
                            exit = true;
                            break;
                        default:
                            System.out.println("Неверный выбор. Поробуйте снова!");
                    }
                }
            }
        }


    }

}