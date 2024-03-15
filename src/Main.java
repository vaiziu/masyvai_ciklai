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


//   2a
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
        plant[8] = "egle";
        plant[9] = "azuolas";

        for (int i = 0; i < plant.length ; i++) {
            System.out.println(plant[i]);
        }








    }
}



