import com.sun.source.tree.IfTree;

public class Main {
    public static void main(String[] args) {


        /*ciklai:
        for
        foreach
        while
        do while
        (js kalboje)
        forin
        forout
         */

//1.
        System.out.println("----1-----");
        for (int i = 0; i < 10; i++) {
            System.out.println("labas");
        }


//   2a Sukurkite ciklą kuris atspausdintų skaičius nuo 0 iki 9
        System.out.println("____2____");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);


        }

//3
        System.out.println("-----3------");

        String[] plant = new String[10];
        plant[0] = "Berzas";
        plant[1] = "gele";
        plant[2] = "krumas";
        plant[3] = "samana";
        plant[4] = "kerpe";
        plant[5] = "grybas";
        plant[6] = "uosis";
        plant[7] = "pusis";
        plant[8] = "kenis";
        plant[9] = "egle";


//        System.out.println("-----3------");
//
//        String[] plant = new String[12];
//        plant[0] = "Berzas";
//        plant[1] = "gele";
//        plant[2] = "krumas";
//        plant[3] = "samana";
//        plant[4] = "kerpe";
//        plant[5] = "grybas";
//        plant[6] = "uosis";
//        plant[7] = "pusis";
//        plant[8] = "kenis";
//        plant[9] = "egle";
//        plant[10] = "azuolas";
//        plant[11] = "liepa";

//        for (int i =plant.length-1; i >=0; i--) {
//            System.out.println(plant[i]);
//        }

//4.
        System.out.println("-----4------");

        for (int i = 0; i < plant.length; i++) {
            System.out.println(plant[i]);
        }


//            5.Atspausdinkite 3čio uždavinio kiekvieną augalą pradedant nuo paskutinio,
//            ir baigiant pirmuoju. (atvirkščias ciklas)

        System.out.println("-----5------");
        for (int i = 9; i >= 0; i--) {
            System.out.println(plant[i]);
        }

//6.Atspausdinkite kas antrą skaičių nuo 10 iki 50 (porinius).
        System.out.println("-----6------");

        for (int i = 10; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

//        for (int i = 10; i <= 100; i=i*3) {
//                System.out.println(i);
//        }
//7,Atspausdinkite kas antrą skaičių nuo 10 iki 50. (porinius)
// Jei skaičius dalinasi iš 10 be liekanos jo nespausdinkite. ( naudokite continue.)
// (atspausdinti visus porinus skaičius, išskyrus tuos kurie dalinasi iš 10 be liekanos)

//        for (int i = 10; i <= 50; i++) {
//            if (i % 2 == 0 && i%10 !=0 ) {
//                System.out.println(i);
//            }
        System.out.println("-----7------");
        for (int i = 10; i <= 50; i++) {
            if (i % 10 == 0) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }


//        Sukurkite ciklą kuris suktųsi nuo 0 iki 20.
//        Suskaičiuokite, kiek kartų kintamasis i turėjo porinę reikšmę
        System.out.println("-----8------");
        int a=0;

        for (int i = 0; i <=20; i++) {

            if (i % 2 == 0 ) {
                a++;
            }

        }
        System.out.println("poriniu skaiciu reiksme kartais yra " + a);


        System.out.println ("-----savarankiskai--");

        String week="";
        for (int month = 1; month <=12; month++) {
            System.out.println( "menuo" + month);
            for (int i = 1; i <=30; i++) {
                week = week + " " +i;

                if (i % 7 == 0) {
                    System.out.println( week);
                    week = " ";
                }
            }
        }






}
}



