public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println ();
        System.out.println ("Задание 1");
        System.out.println ("dog = " + dog);
        System.out.println ("cat = " + cat);
        System.out.println ("paper = " + paper);

        dog = dog+4;
        cat = cat+4;
        paper = paper+4;
        System.out.println ();
        System.out.println ("Задание 2");
        System.out.println ("dog = " + dog);
        System.out.println ("cat = " + cat);
        System.out.println ("paper = " + paper );

        dog = dog-3.5;
        cat = cat-1.6;
        paper = paper-7639;
        System.out.println ();
        System.out.println ("Задание 3 ");
        System.out.println ("dog = " + dog );
        System.out.println ("cat = " + cat);
        System.out.println ("paper = " + paper);

        var friend = 19;
        System.out.println ();
        System.out.println ("Задание 4");
        System.out.println (friend);
        friend = friend+2;
        System.out.println (friend);
        friend = friend/7;
        System.out.println (friend);

        var frog = 3.5;
        System.out.println ();
        System.out.println ("Задание 5");
        System.out.println (frog);
        frog = frog*10;
        System.out.println (frog);
        frog = frog/3.5;
        System.out.println (frog);
        frog = frog+4;
        System.out.println (frog);

        var boxerMass1 = 78.2;
        var boxerMass2 = 82.7;
        var totalMass = boxerMass1 + boxerMass2;
        var difference = totalMass - boxerMass1;
        System.out.println ();
        System.out.println ("Задание 6");
        System.out.println ("boxerMass1 = " + boxerMass1);
        System.out.println ("boxerMass2 = " + boxerMass2);
        System.out.println ("totalMass = " + totalMass);
        System.out.println ("difference = " + difference);

        var remainder = boxerMass2 % boxerMass1;
        System.out.println ();
        System.out.println ("Задание 7");
        System.out.println ("remainder = " + remainder);

        var ollTime= 640;
        var employeeTime1 = 8;
        var employee1 = ollTime/employeeTime1;
        var employee2 = employee1+94;
        var employeeTime2 =ollTime/employee2;
        System.out.println ();
        System.out.println ("Задание 8");
        System.out.println ("Всего работников в компании  = " + employee1 + " человек");
        System.out.println ("Если в компании работает " + employee2 + " человек, то всего " + employeeTime2 + " часа работы может быть поделено между сотрудниками ");

    }}





