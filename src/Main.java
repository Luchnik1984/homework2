public class Main {
    public static void main(String[] args) {
       // задание №1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
       // задание №2
        dog = dog+4;
        cat = cat+4;
        paper = paper+4;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
        // задание №3
        dog = dog-3.5;
        cat = cat-1.6;
        paper = paper-7639;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
        // задание №4
        var friend = 19;
        System.out.println (friend);
        friend = friend+2;
        System.out.println (friend);
        friend = friend / 7;
        System.out.println (friend);
        // задание №5
        var frog = 3.5;
        System.out.println (frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog +4;
        System.out.println (frog);
        // задание №6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println ("общая масса двух бойцов = " + totalWeight + " кг");
        var differenceWeight = Math.abs(boxer1-boxer2); // посчитал что возвращение абсолютного значения из вычитания здесь больше подходит.
        System.out.println ("разница между массами бойцов = " + differenceWeight + " кг");
        //задание №7
        var remainder = boxer2 % boxer1;
        System.out.println ("остаток от деления большего веса "+ boxer2 + " на меньший вес " + boxer1+ " = " + remainder);
        // задание №8.1
        var totalWorkTime = 640;
        var onePersonWorkTime = 8;
        var totalWorkers = totalWorkTime / onePersonWorkTime;
        System.out.println ("всего работников в компании - "+ totalWorkers+ " человек");
        // задание №8.2
        totalWorkers = totalWorkers + 94;
        totalWorkTime = totalWorkers*onePersonWorkTime ;
        System.out.println ("Если в компании работает " + totalWorkers + " человек, то всего " + totalWorkTime + " часов работы может быть поделено между сотрудниками");




    }
}