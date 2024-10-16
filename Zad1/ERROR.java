//ZMIEŃ NAZWE

public class Main {
    public static void main(String[] args) {
        testDodawanie();
        testDodawanie2();
        testMnozenie();
        testDzielenie();
        testOdejmowanie();
        testZlaDlugoscA();
        testZlaDlugoscB();
        testZaDlugaLiczba();
        testDodawanieMalychLiczb();
        testZaMalaliczbaDanych();
        testMinusFirstByte();
        allon();
        System.out.println("Grzejemy procesor BAZA1");
        gigaBaza1();

        System.out.println("Grzejemy procesor BAZA2");
         gigaUltraBaza2();

        System.out.println("Grzejemy procesor BAZA3");
        SuperDuperUltraBaza3();
    }


    public static void allon() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; //
        for (int bit : input) {
            zadanie.input(bit);
        }
        System.out.println("Test 55 (+, all on): " + zadanie.wynik() + ": expected 0");
    }

    public static void gigaBaza1() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input = { 0,3,1, 0,0,1, 3,3,1, 3,1,3, 3,0,1, 3,3,1, 1,1,3, 1,1,0, 0,1,1,0,1, 0,0,1, 3,3,1, 1,1,3, 1,3,1, 0,0,1, 3,3,1, 3,0,1, 3,1,0, 0,3,1, 0,0,1, 1,3,3, 0,3,1, 1,0,1, 3,0,1, 1,1,3, 0,3,1, 3,0,1, 0,1,1, 1,0,0, 0,3,1, 0,1,3, 3,0,1, 0,0,1, 0,0,1, 3,1,1, 1,0,0, 1,0,1, 1,3,3, 1,3,3, 0,3,1, 0,0,1, 3,1,3, 0,3,1, 3,0,1, 0,0,1, 0,3,1, 3,0,1, 0,1,0, 1,3,3, 1,1,1, 3,1,3, 3,3,1, 1,3,3, 0,0,1, 0,1,0, 1,1,0, 1,1,1, 0,0,1, 3,3,1, 0,0,1, 1,0,1, 1,1,3, 3,3,1, 0,1,0, 1,1,0, 1,0,3, 0,1,3, 3,1,3, 0,0,1, 0,1,1, 3,0,1, 0,3,1, 1,0,0, 0,0,1, 1,3,0, 1,0,3, 3,1,3, 1,0,3, 1,3,1, 0,0,1, 0,0,1, 0,1,0, 3,1,0, 1,1,1, 3,0,1, 1,1,3, 0,0,1, 1,3,3, 3,3,1, 1,1,0, 0,0,1, 1,3,0, 3,3,1, 3,3,1, 0,3,1, 3,0,1, 1,3,0, 1,3,1, 0,3,1, 3,3,1, 3,3,1, 3,3,1, 3,1,1, 1,1,0, 0,1,0, 1,3,0, 1,1,0, 3,0,1, 3,1,0, 1,3,3, 0,1,1, 3,1,1, 3,3,1, 1,0,1, 1,0,1, 3,3,1, 0,1,3, 0,0,1, 0,1,1, 3,3,1, 1,3,3, 1,1,3, 3,3,1, 1,0,0, 0,0,1, 0,0,1, 1,0,0, 0,1,0, 3,0,1, 3,1,1, 1,1,3, 0,0,1, 1,0,1, 1,1,0, 0,3,1, 0,3,1, 1,3,3, 1,3,1, 0,3,1, 3,1,3, 3,3,1, 0,0,1, 0,3,1, 0,1,3, 1,1,1, 0,1,3, 0,3,1, 0,3,1, 3,3,1, 0,1,3, 1,1,0, 0,1,3, 3,1,1, 3,0,1, 0,0,1, 0,3,1, 0,1,0, 3,1,1, 1,3,3, 0,1,1, 1,1,1, 3,3,1, 0,1,1, 0,1,3, 3,3,1, 0,3,1 }
                ;        for (int bit : input) {
            if (bit == 3) {
                System.out.println(zadanie.wynik());
            } else {

                zadanie.input(bit);
            }
        }
    }

    public static void SuperDuperUltraBaza3() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input = { 0,3,1, 3,0,1, 1,0,3, 1,3,3, 1,1,0, 3,3,1, 1,0,3, 0,0,1, 1,0,1, 3,1,0, 3,0,1, 0,3,1, 0,1,1, 3,1,0, 1,3,1, 0,3,1, 3,0,1, 0,1,0, 3,0,1, 3,0,1, 0,1,3, 0,1,0, 0,3,1, 1,1,1, 3,0,1, 0,1,3, 3,0,1, 3,1,3, 1,0,0, 3,0,1, 3,1,0, 3,0,1, 0,1,0, 3,1,0, 3,1,3, 1,3,0, 0,1,1, 3,0,1, 3,1,0, 0,3,1, 3,3,1, 3,0,1, 1,1,0, 0,0,1, 3,1,0, 3,1,1, 1,0,0, 0,1,3, 0,0,1, 3,1,3, 0,1,1, 3,1,0, 3,3,1, 3,3,1, 0,0,1, 1,1,3, 1,0,0, 0,1,0, 0,0,1, 3,1,0, 3,1,0, 1,1,3, 0,3,1, 3,0,1, 1,1,3, 3,3,1, 1,3,3, 3,0,1, 1,0,3, 0,3,1, 0,3,1, 1,3,1, 3,0,1, 3,3,1, 1,3,3, 1,0,1, 0,1,1, 1,3,0, 3,1,1, 0,0,1, 0,1,1, 3,0,1, 0,3,1, 1,1,3, 1,3,3, 3,3,1, 1,0,1, 1,3,3, 0,1,3, 1,1,3, 1,1,0, 0,0,1, 3,3,1, 1,1,0, 3,1,1, 3,0,1, 1,3,1, 0,3,1, 3,1,1, 3,1,1, 1,1,3, 1,3,1, 3,3,1, 0,0,1, 0,3,1, 3,1,0, 1,1,3, 3,1,1, 0,3,1, 0,0,1, 3,0,1, 0,0,1, 0,3,1, 1,0,0, 3,3,1, 1,1,0, 0,0,1, 3,0,1, 1,3,0, 1,3,3, 3,0,1, 0,0,1, 3,0,1, 3,1,3, 1,0,0, 1,3,0, 3,0,1, 1,0,1, 0,3,1, 1,3,3, 3,1,1, 0,3,1, 1,0,1, 1,0,1, 0,1,1, 3,0,1, 3,0,1, 1,0,3, 3,0,1, 0,3,1, 0,3,1, 0,3,1, 3,1,0, 1,0,0, 1,1,3, 1,1,3, 0,3,1, 1,0,3, 0,1,3, 0,0,1, 0,1,3, 0,0,1, 3,3,1, 3,0,1, 3,1,3, 0,1,0, 3,0,1, 3,0,1, 1,1,3, 0,0,1, 0,3,1, 3,0,1, 1,1,3, 0,3,1, 0,1,0, 0,3,1, 1,1,3 }
                ;       for (int bit : input) {
            if (bit == 3) {
                System.out.println(zadanie.wynik());
            } else {

                zadanie.input(bit);
            }
        }

    }




    public static void gigaUltraBaza2() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input= { 3,1,0, 1,1,3, 1,3,3, 0,1,3, 1,3,3, 3,0,1, 0,0,1, 0,3,1, 0,3,1, 3,1,3, 3,3,1, 1,3,1, 3,1,3, 0,3,1, 3,3,1, 3,0,1, 0,0,1, 1,1,3, 0,1,3, 0,0,1, 0,0,1, 3,0,1, 3,0,1, 3,3,1, 1,1,3, 1,3,1, 0,1,3, 0,0,1, 1,1,1, 3,0,1, 1,1,3, 3,3,1, 0,3,1, 0,0,1, 1,1,1, 1,1,1, 3,3,1, 1,0,3, 3,3,1, 0,3,1, 1,0,3, 1,3,3, 0,3,1, 0,1,0, 1,0,1, 3,1,1, 0,3,1, 3,3,1, 0,3,1, 3,1,1, 3,0,1, 1,1,3, 3,0,1, 0,0,1, 1,3,0, 3,3,1, 1,3,1, 3,0,1, 0,3,1, 0,3,1, 1,0,0, 0,0,1, 1,3,1, 0,1,3, 3,3,1, 1,0,3, 3,3,1, 0,1,0, 0,0,1, 3,0,1, 0,1,1, 0,0,1, 3,0,1, 1,3,1, 0,0,1, 3,1,1, 3,3,1, 0,1,1, 1,1,1, 0,1,1, 3,3,1, 1,3,1, 3,1,0, 1,1,0, 3,1,0, 1,3,3, 3,0,1, 0,1,3, 0,3,1, 0,0,1, 1,0,0, 0,0,1, 1,1,0, 3,3,1, 3,3,1, 0,1,1, 3,1,3, 3,3,1, 3,3,1, 3,0,1, 0,3,1, 1,3,1, 1,3,3, 3,0,1, 0,1,0, 3,0,1, 3,3,1, 0,0,1, 3,0,1, 0,3,1, 1,3,0, 1,1,0, 0,0,1, 3,0,1, 1,1,3, 0,3,1, 3,1,3, 0,3,1, 1,1,1, 3,3,1, 3,1,0, 3,3,1, 3,1,1, 3,3,1, 0,3,1, 1,3,1, 1,3,0, 3,0,1, 1,3,0, 3,3,1, 3,1,3, 3,1,3, 1,3,3, 3,1,3, 1,3,3, 0,1,1, 0,3,1, 1,3,3, 0,0,1, 1,3,0, 1,0,1, 0,1,3, 3,0,1, 0,3,1, 3,3,1, 1,3,3, 1,1,1, 1,3,1, 1,3,1, 0,0,1, 1,1,3, 3,0,1, 1,3,1, 3,3,1, 1,3,3, 0,1,3, 0,1,3, 3,0,1, 1,0,1, 1,1,1, 0,1,3, 1,1,1, 1,0,3, 0,0,1, 0,1,3, 1,1,3, 1,1,1, 3,3,1, 3,0,1, 3,1,3, 3,0,1, 0,0,1, 1,3,3, 1,0,1, 0,0,1, 1,1,1, 0,3,1, 0,3,1, 0,1,3, 3,0,1, 1,0,0, 0,3,1, 0,0,1, 1,3,1, 3,0,1, 1,3,1, 1,3,1, 0,1,0, 1,3,1, 3,1,0, 1,3,0, 3,3,1, 3,0,1, 1,3,1, 0,3,1, 3,1,0, 1,0,0, 3,1,0, 3,3,1, 3,0,1, 1,3,0, 3,0,1, 1,1,0, 0,0,1, 0,0,1, 1,3,1, 0,1,0, 1,1,1, 3,1,3, 3,0,1, 3,0,1, 0,0,1, 3,3,1, 3,3,1, 0,1,3, 3,1,0, 1,3,0, 1,3,0, 0,3,1, 1,1,0, 3,1,1, 0,1,3, 1,1,1, 0,0,1, 1,3,1, 3,1,1, 3,3,1, 0,0,1, 0,1,1, 1,0,1, 1,1,1, 1,3,1, 1,3,3, 3,3,1, 0,3,1, 3,0,1, 0,3,1, 0,3,1, 1,1,0, 0,3,1, 3,3,1, 1,1,0, 3,3,1, 3,0,1, 3,3,1, 1,3,1, 0,3,1, 0,3,1, 3,3,1, 3,3,1, 1,3,0, 0,1,3, 3,3,1, 0,3,1, 3,3,1, 3,3,1, 3,0,1, 0,1,3, 0,1,0, 3,1,3, 1,1,1, 0,1,1, 1,3,3, 1,0,1, 1,3,1, 1,1,3, 1,0,3, 3,1,0, 3,1,0, 0,3,1, 0,0,1, 0,3,1, 3,1,1, 0,0,1, 0,1,0, 3,1,0, 0,0,1, 0,1,3, 1,3,0, 1,0,3, 0,3,1, 1,1,1, 0,0,1, 1,1,1, 0,0,1, 1,3,3, 0,0,1, 3,3,1, 3,3,1, 1,1,3, 3,0,1, 0,3,1, 3,3,1, 1,1,0, 1,1,0, 1,0,0, 3,0,1, 1,1,1, 1,1,1, 3,0,1, 1,0,3, 0,0,1, 3,1,1, 3,1,1, 1,0,0, 0,1,1, 3,3,1, 0,3,1, 1,1,0, 1,0,3, 1,3,3, 3,0,1, 0,0,1, 3,0,1, 1,1,1, 0,1,1, 3,1,0, 0,3,1, 1,3,3, 3,1,1, 1,3,3, 3,1,3, 3,3,1, 3,0,1, 1,3,0, 0,1,0, 1,0,1, 3,0,1, 1,0,0, 0,3,1, 3,1,1, 3,0,1, 3,1,3, 1,3,0 };
        for (int bit : input) {
            if (bit == 3) {
                System.out.println(zadanie.wynik());
            } else {

                zadanie.input(bit);
            }
        }

    }







    public static void testDodawanie() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input = {0,0,1,1, 1,1,1, 0,0, 0,1,1};
        for (int bit : input) {
            zadanie.input(bit);
        }
        System.out.println("Test 1 (+, simple addition): " + zadanie.wynik() + ": expected 0");
    }

    public static void testOdejmowanie() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input = {0,0,1,1, 1,1,1, 0,1, 0,1,1};
        for (int bit : input) {
            zadanie.input(bit);
        }
        System.out.println("Test 2 (-, simple subtraction): " + zadanie.wynik() + ": expected -6");
    }


    public static void testMnozenie() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input = {0,0,1,1, 1,1,1, 1,0, 0,1,1};
        for (int bit : input) {
            zadanie.input(bit);
        }
        System.out.println("Test 3 (*, multiplication): " + zadanie.wynik() + ": expected -9");
    }


    public static void testDzielenie() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input = {0,0,1,1, 1,1,1, 1,1, 0,1,1};
        for (int bit : input) {
            zadanie.input(bit);
        }
        System.out.println("Test 4 (/, division): " + zadanie.wynik() + ": expected -1");
    }


    public static void testZlaDlugoscA() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input = {0,0,1};
        for (int bit : input) {
            zadanie.input(bit);
        }
        System.out.println("Test 5 (invalid input length in a): " + zadanie.wynik() + ": expected -2000000000");
    }

    public static void testZlaDlugoscB() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input = {1, 1, 1, 1, 0, 0, 0};
        for (int bit : input) {
            zadanie.input(bit);
        }
        System.out.println("Test 6 (invalid input length in b): " + zadanie.wynik() + ": expected -2000000000");
    }


    public static void testDodawanieMalychLiczb() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input = {0,0,1,0, 0,1, 0,0, 0,1};
        for (int bit : input) {
            zadanie.input(bit);
        }
        System.out.println("Test 7 (+, adding small numbers): " + zadanie.wynik() + ": expected 2");
    }


    public static void testDodawanieDuzychLiczb() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input = {0,0,1,1, 0,1,1, 0,0, 0,1,1};
        for (int bit : input) {
            zadanie.input(bit);
        }
        System.out.println("Test 8 (+, adding large numbers): " + zadanie.wynik() + ": expected 6");
    }

    public static void testZaDlugaLiczba() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input = {0,0,1,1, 1,1,1, 0,0, 1,1,1,   0,0,1,0, 1,0, 0,0 ,1,0};
        for (int bit : input) {
            zadanie.input(bit);
        }
        System.out.println("Test 9 (input sequence too long): " + zadanie.wynik() + ": expected 0");
    }

    public static void testkolejnaTuraSprawdzania() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input = {0,0,1,1, 0,1,1, 0,0, 0,1,1, 0,1};
        for (int bit : input) {
            zadanie.input(bit);
        }
        System.out.println("Test 10 (multiple rounds of input): " + zadanie.wynik() + ": expected 6");
    }

    public static void testkolejnaTuraSprawdzania2() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input = {0,0,1,1, 0,1,1, 1,0, 0,1,1, 0,0,1,1, 1,1,1, 0,0, 1,1,1};
        for (int bit : input) {
            zadanie.input(bit);
        }
        System.out.println("Test 11 (result from two sequences): " + zadanie.wynik() + ": expected -6");
    }

    public static void testZaMalaliczbaDanych() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input = {0,0,1,1, 0,1,1, 1,0, 0,1};
        for (int bit : input) {
            zadanie.input(bit);
        }
        System.out.println("Test 12 (insufficient data bits): " + zadanie.wynik() + ": expected -2000000000");
    }

    public static void testDodawanie2() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input = {0,0,1,0, 0,1, 0,0, 0,1};
        for (int bit : input) {
            zadanie.input(bit);
        }
        System.out.println("Test 13 (+, 2 bytes): " + zadanie.wynik() + ": expected 2");
    }

    public static void testMnozenie2() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input = {0,0,1,0, 0,1, 0,0, 0,1, 0,0,1,1, 0,1,0, 1,0, 0,1,0};
        for (int bit : input) {
            zadanie.input(bit);
        }
        System.out.println("Test 14 (*, 2 bytes): " + zadanie.wynik() + ": expected 4");
    }

    public static void testMinusFirstByte() {
        Zadanie01 zadanie = new Zadanie01();
        int[] input = {1,0,1,0, 0,1, 0,0, 0,1};
        for (int bit : input) {
            zadanie.input(bit);
        }
        System.out.println("Test 15 (*, ujemny pierwszybit): " + zadanie.wynik() + ": expected -2000000000");
    }

}
