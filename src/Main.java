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

        String[] plants = new String[10];
        plants[0] = "Berzas";
        plants[1] = "gele";
        plants[2] = "krumas";
        plants[3] = "samana";
        plants[4] = "kerpe";
        plants[5] = "grybas";
        plants[6] = "uosis";
        plants[7] = "pusis";
        plants[8] = "kenis";
        plants[9] = "egle";


//        System.out.println("-----3------");
//
//        String[] plants = new String[12];
//        plants[0] = "Berzas";
//        plants[1] = "gele";
//        plants[2] = "krumas";
//        plants[3] = "samana";
//        plants[4] = "kerpe";
//        plants[5] = "grybas";
//        plants[6] = "uosis";
//        plants[7] = "pusis";
//        plants[8] = "kenis";
//        plants[9] = "egle";
//        plants[10] = "azuolas";
//        plants[11] = "liepa";

//        for (int i =plants.length-1; i >=0; i--) {
//            System.out.println(plants[i]);
//        }

//4.
        System.out.println("-----4------");

        for (int i = 0; i < plants.length; i++) {
            System.out.println(plants[i]);
        }


//            5.Atspausdinkite 3čio uždavinio kiekvieną augalą pradedant nuo paskutinio,
//            ir baigiant pirmuoju. (atvirkščias ciklas)

        System.out.println("-----5------");
        for (int i = 9; i >= 0; i--) {
            System.out.println(plants[i]);
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
//  7,Atspausdinkite kas antrą skaičių nuo 10 iki 50. (porinius)
//   Jei skaičius dalinasi iš 10 be liekanos jo nespausdinkite. ( naudokite continue.)
//   (atspausdinti visus porinus skaičius, išskyrus tuos kurie dalinasi iš 10 be liekanos)

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


//      8.  Sukurkite ciklą kuris suktųsi nuo 0 iki 20.
//        Suskaičiuokite, kiek kartų kintamasis i turėjo porinę reikšmę

        System.out.println("-----8------");
        int a = 0;

        for (int i = 0; i <= 20; i++) {

            if (i % 2 == 0) {
                a++;
            }

        }
        System.out.println("poriniu skaiciu reiksme kartais yra " + a);


        System.out.println("-----savarankiskai--");

        String week = "";
        for (int month = 1; month <= 12; month++) {
            System.out.println("menuo" + month);
            for (int i = 1; i <= 30; i++) {
                week = week + " " + i;

                if (i % 7 == 0) {
                    System.out.println(week);
                    week = " ";
                }
            }
        }

        System.out.println("--------------------");
//9. Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių trumpesnių nei 5 simboliai,
// ir kiek ilgesnių nei 7 simboliai. (du skaičiavimai)


        System.out.println("-----9------");
        // System.out.println(plants[i]);
        // System.out.println(plants[i].length());

        int count7 =0;
        int count5 = 0;
        System.out.println(plants[0].length());

        for (int i = 0; i < plants.length; i++) {
        }

        for (int i = 0; i < plants.length; i++) {
            if (plants[i].length() < 5 ) {
                count5++;
            }
            if (plants[i].length() > 7 ) {
                count7++;
            }
        }




        System.out.println("zodziu su maziau nei 5 simboliais yra  " + count5);
        System.out.println("zodziu su daugiau  nei 7 simboliais yra  " + count7);



        System.out.println("--------------");

//Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių ilgesnių nei 5 simboliai bet trumpesnių
// nei 10 simboliai.
// (tarp 5 ir 10 simbolių ilgio)

        System.out.println("--------10---------");

        int countnew = 0;

        System.out.println(plants[0].length());

        for (int i = 0; i < plants.length; i++) {
            if (plants[i].length() > 5 && plants[i].length() < 10) {
                countnew++;
            }
        }

        System.out.println("zodziai reziuose yra " + countnew);

//        Sugeneruokite 300 atsitiktinių skaičių nuo 0 iki 300,
//            atspausdinkite juos atskirtus tarpais ir suskaičiuokite kiek tarp jų yra
//        didesnių už 150.
//        Skaičiai didesni nei 275 turi būti atspausdinti skliausteliuose” [ ] “

        System.out.println("--------sunkesni-1---------");

        int count = 0;
        for (int i = 0; i < 300; i++) {
            int randomNum =(int) (Math. random() * 300  );

            if(randomNum > 150) {
                count++;
            }
            if (randomNum > 275) {
                System.out.print("[" + randomNum + "] ");
            }else {
                System.out.print(randomNum + " ");
            }
        }

        System.out.println();
        System.out.println(count);


        System.out.println("--------sunkesni-2---------");

//       sunkesni 2.
//       Vienoje eilutėje atspausdinkite visus skaičius nuo 1 iki 3000,
//        kurie dalijasi iš 77 be liekanos.
//        Skaičius atskirkite kableliais.
//        Po paskutinio skaičiaus kablelio neturi būti.

String result = "";

        for (int i = 1; i <= 3000; i++) {
            if (i % 77 == 0) {
//                System.out.print (i + ",");
               result += i + ",";
            }

        }
        System.out.println(result.length()-1);
        System.out.println( result.substring(0,result.length()-1) );


//        String comma = "";
//
//        for (int i = 77; i < 3000; i+=77) {
//            System.out.print(comma + i);
//            comma = ",";
//        }
        // 77,154,231,308



        System.out.println("--------sunkesni-3---------");

        //        Nupieškite kvadratą iš “*”, kurio kraštines sudaro 25“*”

            for (int y = 1; y < 25; y++) {
                for (int x = 1; x < 25; x++) {
                    System.out.print( " * ");
                }
                System.out.println();
            }

        System.out.println("--------sunkesni-4---------");
//        Prieš tai nupieštam kvadratui nupieškite istrižaines zaigzdutę pakeisdami kitu simboliu.

        for (int y = 1; y < 25; y++) {
            for (int x = 1; x < 25; x++) {
                if (x == y) {
                    System.out.print(" Y ");
                } else if ((x+y) == 25) {

                    System.out.print(" Y ");

                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }


        System.out.println("--------sunkesni-5---------");
//Metam monetą. Monetos kritimo rezultatą imituojam Math.random() funkcija,
// kur 0 yra herbas, o 1 - skaičius.
// Monetos metimo rezultatus išvedame į ekraną atskiroje eilutėje:
// “S” jeigu iškrito skaičius ir “H” jeigu herbas.
// Suprogramuokite tris skirtingus scenarijus kai monetos metimą stabdome:
//Iškritus herbui;
//Tris kartus iškritus herbui;
//Tris kartus iš eilės iškritus herbui;





        System.out.println("-------------------------------------");
        System.out.println("--------sunkesni-8---------");
//        Sumodeliuokite vinies kalimą.
//        Įkalimo gylį sumodeliuokite pasinaudodami Math.random() funkcija.
//        Vinies ilgis 8.5cm (pilnai sulenda į lentą).
//  “Įkalkite” 5 vinis mažais smūgiais. Vienas smūgis vinį įkala 5-20 mm.
//   Suskaičiuokite kiek reikia smūgių.
//  “Įkalkite” 5 vinis dideliais smūgiais.
//  Vienas smūgis vinį įkala 20-30 mm, bet yra 50% tikimybė (pasinaudokite Math.random()

        int minVin=5;
        int maxVIN =20;
        int longvin = 85;
        int smugis = (int) (minVin + Math.random()*(maxVIN-minVin));
        System.out.println(smugis);






    }
}



