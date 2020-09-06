public class Loader {
    public static int factorial(int f) {
        int result = 1;
        if (f == 1 || f == 0) {
            return result;
        }
        result = f * factorial(f - 1);
        return result;
    }
    public static void main(String[] arg) {
        int[] arr = {1, 4, 7, 5, 9, 6, 8, 0, 3, 2};
        int[] arr2 = new int[10];
        int a = 0;
        double c;
        float sum = 0;
        float[] harmonic = new float[10];
        for (int i = 0; i < 10; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма равна = " + sum);
        System.out.println("_________________");

        sum = 0;
        while (a < 10) {
            sum = sum + arr[a];
            a++;
        }
        System.out.println("Сумма равна = " + sum);
        System.out.println("_________________");

        sum = 0;
        a = 0;
        do {
            sum = sum + arr[a];
            a++;
        } while (a < 10);
        System.out.println("Сумма равна = " + sum);
        System.out.println("_________________");

        sum = 0;
        for (int b = 0; b < 10; b++) {
            harmonic[b] = (float) 1 / (b + 1);
            sum += harmonic[b];
            System.out.println(harmonic[b]);
        }
        System.out.println("Сумма равна = " + sum);
        System.out.println("_________________");


        for (int i = 0; i < 10; i++) {
            c = Math.random() * 100;
            arr2[i] = (int) c;
            System.out.println(i + " элемент массива: " + arr2[i]);
        }
        System.out.println("_________________");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr2[i] < arr2[j]) {
                    a = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = a;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " элемент массива после сортировки: " + arr2[i]);
        }
        System.out.println("_________________");
        int f = 6;
        System.out.println("Факториал числа " + f + " = " + factorial(f));
        System.out.println("_________________");
        Book book1 = new Book();
        book1.autor = "Л. В. Толстой";
        book1.name = "Война и мир";
        book1.year = "1873";
        book1.lists = "538";
        System.out.println(book1.toString());
        System.out.println("_______________________");

        Dog[] DogList = new Dog[3];
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        DogList[0]= dog1;
        DogList[1]= dog2;
        DogList[2]= dog3;
        dog1.setName("Шарик");
        dog1.setAge(10);
        dog1.setBreed("Овчарка");
        dog2.setName("Дина");
        dog2.setAge(7);
        dog2.setBreed("Лайка");
        dog3.setName("Мухтар");
        dog3.setAge(4);
        dog3.setBreed("Алабай");
        System.out.println(dog1.toString());
        System.out.println("Возраст собаки в человеческих годах: " + dog1.humanAge());
        System.out.println("_______________________");
        System.out.println(dog2.toString());
        System.out.println("_______________________");
        System.out.println(dog3.toString());
    }
}



