import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {



        Compression compression = new StringCompressor(); // Zmienna YourCompressionClass to nazwa twojej klasy implementującej Compression

        // Przesyłamy przykładowy tekst do kompresji
        String[] strings = { "Jaskraworóżowe! xd  Mickiewicz. Adam; Bliźniak, Gigachad\" przez; Szef, siedem( bliźniak. kadzili. do, azbest) Adam, Ilugodzinnym) MIESZAŁ, trzy. azbest! a( Gigachad) xd  pałaszujące\" AMBICJA! xd, kadzili  azbEst  Efekciarstwie( pałaszujące) efekciarstwie, MIESZAŁ( Mickiewicz. Ilugodzinnym; Sus( ilugodzinnym) Domek\n dzban) Szef\" Bliźniak( przez. MIESZAŁ\n dzban\" i\n Śpiulkolot! Gigachad\" Robił) Essa, Ilugodzinnym! SUS, xd  xd; edukującą; Efekciarstwie: SUS, do) xd, efekciarstwie! edukującą) Domek! Szef\n azbest: sztos  Essa, efekciarstwie; z, ChińskieBajki  xd) efekciarstwie( a; Mickiewicz\" xD\" dX. Szef; xd  xd, dX\n XD: Bliźniak\n SUS) ilugodzinnym; edukującą; kadzili\" Śpiulkolot. Adam; Pacyfistycznymi: azbest     \" osiem\" dwa! pacyfistycznymi) w! AMBICJA) pałaszujące! betoniarka( pałaszujące. Gigachad( siedem\" trzy( w\n sztos  trzy; xd. \n",
                "Ala i.","Domek Woda i i i i i i i i i i i i i i i i i o o o o o o o o o o o o o o o .","Domek Woda i i i i i i i i i i i i i i i i i i i i i i i i i i i i  Woda Domek i i i i i i o o o o o o o o o o o o o o o o o o o o o o o o o .", "Alternatywki mieszają beton w betoniarce kotem Ali!!! Ala nie wiedziała, że Alternatywki będą używać kota w betoniarce, myślała, że to ma być piaskarka.", "  du du du du du du siupp siupp motocykl motocykl dupadup"};

        String[] test_2_grzanie = {"Aktor! Interpretować! Książkowiec. Pyszny) HP) Wielkopolskie) Swift, sideeye) deified) Prednizolon. nieodwracalnościowe",
                "Muzyk! Długotrwaćleczyć; Tablicaogniskowa Wspaniały. Samsung. Łódzkie, Lua) fr( racecar, Prednizolon: antystanowiskowy",
                "Florysta! Jeść; Pralkaautom! Nowy) Amazon! Opolskie, Swift( essa: Malayalam Ibuprofen: superinteligentności",
                "Drukarz) Interpretować. Zeszyt. Chłodny( Nike! Śląskie( Haskell cringe; Malayalam Hydrokortyzon. elektrokardiogramowy",
                "Muzyk( Zainteresować( Klimatyzator! Zaskakujący) Dell( Pomorskie Perl! sideeye; poop, Hydrokortyzon. antystanowiskowy",
                "Muzyk! Spać, Zeszyt, Mądry, Pepsi. Dolnośląskie Ruby) delulu kok Aspiryna, superinteligentności",
                "Radca: Interpretować! Dom! Czerwony. Apple) Lubuskie Haskell: essa) poop( Prednizolon! przeciwzapalnościowy",
                "Policjant Iść: Dom Wysoki. Panasonic Lubelskie; Kotlin: git( kajak( Simwastatyna. nieodwracalnościowe",
                "Drukarz! Zainteresować: Kubek) Słodki) Amazon) Opolskie( Perl: drillowiec. poop! Warfaryna) antystanowiskowy",
                "Florysta; Przygotowywać: Klimatyzator: Ciepły! Samsung! Świętokrzyskie( SQL, delulu Anna, Fluoksetyna nieprzewidywalny",
                "Florysta: Iść Mikroskop. Wysoki, Panasonic; Podkarpackie( Lua: OL! repaper( Ibuprofen: bezinteresowności",
                "Lekarz( Interpretować( Tablicaogniskowa! Chłodny. Microsoft Łódzkie: Kotlin) bruh! radar, Enalapryl. hipopotomonstroseskwipedaliofobia",
                "Tłumacz( Fotografić: Pralkaautom, Szybki, Apple( Mazowieckie. PHP, fr. civic, Simwastatyna, superinteligentności",
                "Tłumacz) Fotografić( Lodówka: Duży) Sony, Wielkopolskie. Scala! git noon Prednizolon( antystanowiskowy",
                "Psycholog! Zainteresować) Pralkaautom) Ciepły: Google) Podkarpackie( Lua) fr) Anna, Tamsulozyna) antystanowiskowy",
                "Mechanik; Sprzątać( Kubek: Czerwony, Dell. Świętokrzyskie JavaScript) git) radar( Furosemid; nieodwracalnościowe",
                "Inżynier Grać) Ty Nowy. Toyota; Mazowieckie: Visual Basic( delulu: tenet, Loratadyna; elektrokardiogramowy",
                "Muzyk; Pisać( Zeszyt) Duży, Lego! Świętokrzyskie. Swift: git: racecar: Hydrokortyzon) elektrokardiogramowy",
                "Stolarz) Iść; Tablicaogniskowa. Zajęty; Google! Śląskie: Visual Basic( cringe( wow! Loratadyna) hipopotomonstroseskwipedaliofobia",
                "Mechanik, Eksperymentowanie: Mikroskop, Mały! Dell, Pomorskie) Ruby drillowiec: kajak: Aspiryna( superinteligentności",
                "Radca; Pisać; Fotografaparat! Zdecydowany Dell Opolskie! Visual Basic( sideeye wow: Enalapryl; nieprzewidywalności",
                "Programista( Eksplorować( Dom) Zdecydowany: Panasonic; Mazowieckie! Kotlin) OL; rotator Simwastatyna. nieprzewidywalności",
                "Grafik, Iść) Kubek; Słodki. Dell, Lubelskie) Ruby) mrozić! racecar. Hydrokortyzon: niestrukturalizowany",
                "Artysta Spać, Lodówka; Pyszny! Samsung( Podlaskie! Haskell cringe, civic. Hydrokortyzon: nieodwracalnościowe",
                "Piekarz( Słuchać! Dom Czerwony! Adidas( Lubelskie; Visual Basic. drillowiec: refer Fluoksetyna, przeciwzapalnościowy",
                "Notariusz) Czytać, Mikroskop; Zimny. HP) Pomorskie; Rust, rel! refer Atorwastatyna niestrukturalizowany",
                "Psycholog! Zastanawiać Drukarkakomputer) Ciepły; HP. Lubelskie) Go) cringe racecar Paracetamol hipopotomonstroseskwipedaliofobia",
                "Notariusz! Sprzątać( Ty( Zaskakujący. Volkswagen) Lubuskie( JavaScript, imo! rotator; Aspiryna; elektrokardiogramowy",
                "Sędzia Projektować. Ty, Wspaniały, Adidas; Pomorskie Rust: rel( madam, Diazepam) hipopotomonstroseskwipedaliofobia",
                "Florysta! Eksperymentowanie! Kubek( Zaskakujący; Panasonic( Świętokrzyskie, Haskell: bruh) peep: Atorwastatyna. nieprzewidywalności",
                "\"otariusz, Kubek Dolnośląskie\n" +
                        "Kucharz Ibuprofen, Iść Kwiat\n" +
                        "Ty. niestrukturalizowany\n" +
                        "Czerwony\n" +
                        "Szybki\n" +
                        "Nike, Apple. Kucharz\n" +
                        "PHP, kok\n" +
                        "nieprzewidywalności. Iść, git. OL Aspiryna\n" +
                        "Ty Dolnośląskie bambik. Ruby\n" +
                        "OL, Dolnośląskie. Stół\n" +
                        "Ty Go. bambik, radar. Ibuprofen. Lubelskie\n" +
                        "OL. Notariusz bezinteresowności, Jeść kok\n" +
                        "hipopotomonstroseskwipedaliofobia. Ruby hipopotomonstroseskwipedaliofobia\n" +
                        "Aktor. Swift. Notariusz\n" +
                        "nieprzewidywalności. Kubek BM, kok OL\n" +
                        "Paracetamol. Iść Dolnośląskie. Wysoki\n" +
                        "Iść, Duży Lubuskie, Dom. Mały\n" +
                        "Stół\n" +
                        "Duży. Ibuprofen, Spać\n" +
                        "Duży, Spać. Kwiat, radar. Jeść, Swift. PHP. Kwiat. Aktor. Ruby\n" +
                        "Ibuprofen, Dell Iść, Metformina elektrokardiogramowy, level level\n" +
                        "git, HP, Paracetamol. JavaScript git niestrukturalizowany, delulu\n" +
                        "Duży Anna, Spać\n" +
                        "bezinteresowności Grać\n" +
                        "bambik, Mały. Kubek\n" +
                        "delulu, Łódzkie\n" +
                        "Nike\n" +
                        "Łódzkie, Pisać Ruby. Wysoki, Iść\n" +
                        "Swift Łódzkie, kok. Aspiryna, JavaScript, radar, Notariusz bezinteresowności. niestrukturalizowany PHP Czerwony Aktor OL, essa\n" +
                        "Ruby\n" +
                        "Grać, Iść, essa Ibuprofen Lubelskie. Iść. Ty\n" +
                        "kajak Dom. Dom. Aspiryna, Ruby. Czerwony\n" +
                        "delulu Dell Ibuprofen JavaScript bambik. Amoksycylina\n" +
                        "Kwiat. Paracetamol\n" +
                        "Aspiryna\n" +
                        "level\n" +
                        "Lubuskie, Aktor Swift. Go\n" +
                        "Aktor Dom, Jeść. essa. BM\n" +
                        "Amoksycylina. Kwiat\n" +
                        "delulu\n" +
                        "OL\n" +
                        "Łódzkie, niestrukturalizowany, JavaScript\n" +
                        "kajak Czerwony Spać\n" +
                        "essa\n" +
                        "Florysta, bambik\n" +
                        "niestrukturalizowany\n" +
                        "Ibuprofen, OL. level\n" +
                        "Iść kok\n" +
                        "HP\n" +
                        "kajak\n" +
                        "Apple Ibuprofen, nieprzewidywalności Iść\n" +
                        "hipopotomonstroseskwipedaliofobia. Mały Wysoki. Paracetamol\n" +
                        "JavaScript, Amoksycylina Spać, essa, Jeść\n" +
                        "Grafik, essa, Kwiat nieprzewidywalności. Dell\n" +
                        "Ty\n" +
                        "Jeść, hipopotomonstroseskwipedaliofobia, Dolnośląskie\n" +
                        "Mały\n" +
                        "Mały Dolnośląskie, Pisać. Paracetamol Amoksycylina, delulu. "
        };




        String[] test_3_grzanie = {"", ".,:;\"!() .,:;\"!() .,:;\"!() .,:;\"!() .,:;\"!() .,:;\"!()", "              ", " . . "};

        String[] test_4_grzanie = {"Krowa w kosmosie - Krowa o imieniu Klara postanowiła odwiedzić Księżyc. Zbudowała rakietę z papieru toaletowego, ale po drodze spotkała galaretowatą meduzę, która chciała ją zabrać na imprezę do Jowisza. Klara odmówiła, bo nie lubiła meduz.\",\"\",\"Zupa z książek - Pewnego dnia stół w kuchni zaczął płakać, bo był zmęczony byciem tylko stołem. Zdecydował, że jego marzeniem jest zostać zupą. Zatem z książek, w których nikt już nie chciał czytać, zrobił wywar, który stał się najdziwniejszą zupą świata.\",\"\",\"Zegar, który mówił - Zegar na ścianie zaczynał mówić, a jego ulubionym tematem były włoskie makarony. Każdego dnia opowiadał, jak różne gatunki spaghetti mają swoje unikalne osobowości.\",\"\",\"Wiewiórka na wakacjach - Wiewiórka o imieniu Marika postanowiła wybrać się na wakacje na Antarktydę. Tam zaprzyjaźniła się z pingwinem, który codziennie uczył ją tańczyć flamenco.\",\"\",\"Krokodyl w dżungli biurowej - Krokodyl, który pracował w korporacji, postanowił wystartować w konkursie na najlepszego pracownika miesiąca. Jego pomysły były dziwne, ale każdy w firmie go uwielbiał.\",\"\",\"Magiczne skarpetki - Skarpetki, które były w stanie zmieniać kolory w zależności od nastroju osoby, która je nosiła. Czasami jednak zmieniały kolor na różowy, co powodowało, że właściciel czuł się jak jednorożec.\",\"\",\"Balon z wodą - Balon, który marzył o tym, by stać się oceanem. Zamiast latać, spędzał dni na rozmyślaniu o tym, jak to jest być dużą kałużą. Niestety, nigdy nie udało mu się spełnić marzenia.\",\"\",\"Dinozaur, który jeździł na deskorolce - Jeden z ostatnich dinozaurów, który zamiast zginąć w wyniku uderzenia meteorytu, postanowił nauczyć się jeździć na deskorolce i stał się pierwszym prehistorycznym sportowcem.\",\"\",\"Złodziej kapci - Pewien mężczyzna miał obsesję na punkcie kradzieży kapci. Zbierał je po całym mieście, aż w końcu stworzył z nich wielką tapicerkę na kanapę, która była tak wygodna, że nigdy już z niej nie wychodził.\",\"\",\"Drzewo, które pisało listy - Drzewo w parku zaczęło pisać listy do innych drzew. Każdego dnia zostawiało je na ławce, ale nikt nigdy ich nie czytał, bo każdy uważał, że drzewa nie mogą pisać.\",\"\",\"Koala, który nie umiał spać - Koala, który spędzał noce, oglądając seriale zamiast spać na drzewie. Każdy próbował mu pomóc, ale koala twierdził, że najlepsze rzeczy dzieją się po zmroku.\",\"\",\"Czajnik, który rysował portrety - Czajnik, który zamiast parzyć herbatę, rysował portrety osób w filiżankach. Był uznawany za artystę, ale nikt nie wiedział, jak poradzić sobie z parującymi obrazami.\",\"\",\"Tęczowy pingwin - Pingwin, który był wyjątkowy, bo zamiast czarno-białego futra miał tęczowe. Marzył o tym, by być superbohaterem, ale jego jedyną supermocą była umiejętność robienia balonów z gumy.\",\"\",\"Banan, który śpiewał - Banan, który zamiast zgnieść się w plecaku, postanowił zaśpiewać hit lat 80. Kiedy skończył, jego skórka zaczęła tańczyć, a cała kuchnia zamieniła się w scenę muzyczną.\",\"\",\"Zamek z kart - Zamek zbudowany z kart do gry, który pewnego dnia zaczął się samowolnie przeprowadzać do innych miast, zmieniając każdą lokalizację na nową, bez ostrzeżenia.\",\"\",\"Królestwo ślimaków - Królestwo, gdzie wszystkie ślimaki były książkami. Każdy mieszkaniec musiał przeczytać innego ślimaka, by zdobyć mądrość na następny dzień.\",\"\",\"Lampa, która marzyła o byciu słońcem - Lampa nocna miała obsesję na punkcie bycia słońcem. Każdej nocy próbowała świecić jaśniej, ale nigdy nie udało jej się rozjaśnić pokoju na tyle, by zamienić noc w dzień.\",\"\",\"Kura, która myślała, że jest pingwinem - Kura, która zdecydowała się mieszkać na biegunie północnym, wierzyła, że jej krótkie nogi to idealny sposób na pływanie w zimnej wodzie.\",\"\",\"Łódka na górze - Mała łódka, która postanowiła wspiąć się na górę. Po drodze spotkała inne pojazdy, które jej mówiły, że to nie jest możliwe, ale ona nie słuchała i dalej próbowała.\",\"\",\"Kaktus, który tańczył - Kaktus, który, kiedy nikogo nie było w pobliżu, zaczynał tańczyć. Nikt nigdy nie widział jego ruchów, ale zawsze pozostawiał po sobie ślady tańca w piasku."};

        String[] test_5_grzanie = {"git nieprzewidywalności hipopotomonstroseskwipedaliofobia essa Grafik niestrukturalizowany bambik nieprzewidywalności nieprzewidywalności git hipopotomonstroseskwipedaliofobia LOL bambik Kucharz LOL nieprzewidywalności bezinteresowności git Kucharz git elektrokardiogramowy Florysta essa bambik hipopotomonstroseskwipedaliofobia LOL delulu Kucharz Notariusz nieprzewidywalności niestrukturalizowany Kucharz bezinteresowności niestrukturalizowany bambik Notariusz nieprzewidywalności nieprzewidywalności elektrokardiogramowy bezinteresowności"
                ,"bambik elektrokardiogramowy Aktor nieprzewidywalności nieprzewidywalności hipopotomonstroseskwipedaliofobia elektrokardiogramowy elektrokardiogramowy elektrokardiogramowy nieprzewidywalności Kucharz Grafik bezinteresowności Aktor git bezinteresowności Grafik LOL hipopotomonstroseskwipedaliofobia bezinteresowności git Aktor hipopotomonstroseskwipedaliofobia Aktor Notariusz niestrukturalizowany Kucharz bezinteresowności Kucharz Notariusz Aktor LOL bambik bezinteresowności bambik Aktor bezinteresowności Grafik hipopotomonstroseskwipedaliofobia delulu"
                ,"hipopotomonstroseskwipedaliofobia delulu Aktor Notariusz LOL nieprzewidywalności git elektrokardiogramowy elektrokardiogramowy bambik bambik essa bezinteresowności niestrukturalizowany niestrukturalizowany elektrokardiogramowy Florysta git Kucharz Kucharz bambik elektrokardiogramowy Notariusz bezinteresowności Aktor delulu Grafik essa bambik Florysta bambik niestrukturalizowany delulu Notariusz essa Notariusz elektrokardiogramowy LOL niestrukturalizowany Kucharz"
                ,"essa nieprzewidywalności delulu Florysta bambik Notariusz bambik bambik bambik LOL git LOL Aktor Aktor bambik LOL elektrokardiogramowy git nieprzewidywalności Grafik git essa git LOL Florysta LOL niestrukturalizowany elektrokardiogramowy delulu Florysta LOL bambik nieprzewidywalności hipopotomonstroseskwipedaliofobia Kucharz Aktor Notariusz LOL bezinteresowności Grafik"
                ,"bambik delulu Notariusz bezinteresowności elektrokardiogramowy Kucharz bambik delulu bezinteresowności delulu Aktor essa niestrukturalizowany Notariusz nieprzewidywalności Aktor niestrukturalizowany Aktor Florysta bezinteresowności Aktor LOL Grafik delulu LOL Aktor elektrokardiogramowy bambik hipopotomonstroseskwipedaliofobia Aktor niestrukturalizowany bambik niestrukturalizowany delulu essa essa git elektrokardiogramowy Aktor Aktor"
                ,"Florysta bezinteresowności git Aktor git bambik LOL Florysta bezinteresowności LOL bezinteresowności essa Kucharz Notariusz bambik Florysta essa hipopotomonstroseskwipedaliofobia Aktor Kucharz delulu nieprzewidywalności LOL bezinteresowności Kucharz nieprzewidywalności Florysta bezinteresowności git Aktor Florysta Aktor Florysta git bezinteresowności git Notariusz bambik niestrukturalizowany git"
                ,"essa Grafik elektrokardiogramowy bambik Florysta hipopotomonstroseskwipedaliofobia Kucharz hipopotomonstroseskwipedaliofobia Florysta elektrokardiogramowy Kucharz Kucharz Aktor Notariusz hipopotomonstroseskwipedaliofobia elektrokardiogramowy LOL Florysta Kucharz Grafik Kucharz Kucharz niestrukturalizowany essa bezinteresowności delulu LOL git bezinteresowności Grafik hipopotomonstroseskwipedaliofobia nieprzewidywalności Kucharz LOL essa essa LOL bambik essa LOL"
                ,"hipopotomonstroseskwipedaliofobia delulu nieprzewidywalności bambik essa nieprzewidywalności nieprzewidywalności Notariusz bezinteresowności essa Florysta hipopotomonstroseskwipedaliofobia bambik niestrukturalizowany essa essa bezinteresowności nieprzewidywalności elektrokardiogramowy niestrukturalizowany Florysta LOL Kucharz essa Aktor bambik Kucharz Grafik Notariusz bambik elektrokardiogramowy nieprzewidywalności bezinteresowności git Kucharz nieprzewidywalności Aktor Grafik git essa"
                ,"delulu git essa LOL nieprzewidywalności delulu Notariusz LOL Kucharz niestrukturalizowany hipopotomonstroseskwipedaliofobia Grafik Kucharz delulu delulu git bezinteresowności niestrukturalizowany git elektrokardiogramowy Notariusz essa niestrukturalizowany git bezinteresowności bezinteresowności delulu Grafik nieprzewidywalności nieprzewidywalności Kucharz essa bambik Aktor Notariusz Aktor LOL git nieprzewidywalności Notariusz"
                ,"Grafik Florysta nieprzewidywalności essa delulu Kucharz LOL hipopotomonstroseskwipedaliofobia git delulu elektrokardiogramowy bambik bambik essa Florysta hipopotomonstroseskwipedaliofobia Notariusz Kucharz essa LOL Grafik Kucharz LOL Aktor elektrokardiogramowy git bezinteresowności Kucharz Grafik LOL hipopotomonstroseskwipedaliofobia hipopotomonstroseskwipedaliofobia elektrokardiogramowy Florysta essa nieprzewidywalności essa nieprzewidywalności Florysta bezinteresowności"
                ,"hipopotomonstroseskwipedaliofobia elektrokardiogramowy essa niestrukturalizowany LOL Florysta git niestrukturalizowany Kucharz git essa essa Notariusz nieprzewidywalności git niestrukturalizowany delulu delulu LOL Aktor Notariusz bezinteresowności bambik niestrukturalizowany bezinteresowności elektrokardiogramowy delulu Notariusz bambik Kucharz elektrokardiogramowy niestrukturalizowany LOL elektrokardiogramowy Florysta bambik elektrokardiogramowy bambik nieprzewidywalności Notariusz"
                ,"Florysta hipopotomonstroseskwipedaliofobia hipopotomonstroseskwipedaliofobia Notariusz bezinteresowności git delulu Grafik LOL nieprzewidywalności niestrukturalizowany git LOL bezinteresowności hipopotomonstroseskwipedaliofobia delulu bambik delulu essa Notariusz Aktor bezinteresowności delulu Grafik bambik Grafik niestrukturalizowany hipopotomonstroseskwipedaliofobia git bambik bezinteresowności niestrukturalizowany bambik bezinteresowności Aktor Kucharz Kucharz LOL Aktor Florysta"
                ,"git LOL niestrukturalizowany essa bambik niestrukturalizowany niestrukturalizowany Notariusz elektrokardiogramowy elektrokardiogramowy niestrukturalizowany hipopotomonstroseskwipedaliofobia Aktor Notariusz essa LOL Florysta LOL LOL niestrukturalizowany Grafik niestrukturalizowany hipopotomonstroseskwipedaliofobia git essa Aktor LOL Aktor nieprzewidywalności hipopotomonstroseskwipedaliofobia delulu niestrukturalizowany LOL Notariusz elektrokardiogramowy Grafik delulu Grafik Notariusz Florysta"
                ,"LOL Aktor hipopotomonstroseskwipedaliofobia Florysta essa Kucharz elektrokardiogramowy Florysta nieprzewidywalności Aktor niestrukturalizowany hipopotomonstroseskwipedaliofobia bezinteresowności Aktor bambik nieprzewidywalności LOL Grafik delulu elektrokardiogramowy essa elektrokardiogramowy Florysta LOL niestrukturalizowany git Notariusz bezinteresowności niestrukturalizowany elektrokardiogramowy elektrokardiogramowy Kucharz hipopotomonstroseskwipedaliofobia LOL Kucharz hipopotomonstroseskwipedaliofobia bezinteresowności Notariusz hipopotomonstroseskwipedaliofobia LOL"
                ,"Grafik niestrukturalizowany git Notariusz Notariusz hipopotomonstroseskwipedaliofobia bezinteresowności bambik Grafik Grafik hipopotomonstroseskwipedaliofobia Kucharz LOL hipopotomonstroseskwipedaliofobia Florysta essa bambik elektrokardiogramowy Florysta Florysta Kucharz elektrokardiogramowy Kucharz Grafik Kucharz delulu essa hipopotomonstroseskwipedaliofobia Grafik Kucharz LOL Kucharz LOL delulu hipopotomonstroseskwipedaliofobia bambik delulu Notariusz nieprzewidywalności bambik"
                ,"nieprzewidywalności Florysta git git Notariusz niestrukturalizowany bezinteresowności Kucharz Grafik elektrokardiogramowy Kucharz Kucharz delulu bambik Aktor niestrukturalizowany LOL git niestrukturalizowany LOL bezinteresowności Grafik nieprzewidywalności niestrukturalizowany Aktor Notariusz Florysta niestrukturalizowany elektrokardiogramowy Notariusz nieprzewidywalności Aktor elektrokardiogramowy bambik Florysta bambik Notariusz elektrokardiogramowy LOL nieprzewidywalności"
                ,"Kucharz nieprzewidywalności essa git delulu niestrukturalizowany nieprzewidywalności Notariusz Grafik bambik git Notariusz niestrukturalizowany bambik Kucharz LOL delulu essa Kucharz bezinteresowności Notariusz Grafik Grafik bambik bambik Grafik nieprzewidywalności Kucharz LOL git essa Florysta bambik essa bambik LOL LOL delulu git LOL"
                ,"bezinteresowności Grafik niestrukturalizowany essa bambik LOL Notariusz LOL LOL Grafik niestrukturalizowany git Kucharz elektrokardiogramowy Florysta LOL git Notariusz nieprzewidywalności delulu Aktor Florysta essa Notariusz essa git niestrukturalizowany nieprzewidywalności nieprzewidywalności Florysta git elektrokardiogramowy Grafik nieprzewidywalności bezinteresowności niestrukturalizowany elektrokardiogramowy elektrokardiogramowy Grafik Aktor"
                ,"bezinteresowności git nieprzewidywalności Notariusz hipopotomonstroseskwipedaliofobia nieprzewidywalności niestrukturalizowany git bezinteresowności delulu nieprzewidywalności essa Kucharz hipopotomonstroseskwipedaliofobia Florysta Aktor git Aktor delulu niestrukturalizowany delulu LOL Florysta Aktor git bezinteresowności bezinteresowności Kucharz delulu Notariusz niestrukturalizowany Grafik Aktor Aktor nieprzewidywalności bambik essa delulu Florysta nieprzewidywalności"
                ,"git bezinteresowności Florysta Notariusz bezinteresowności Florysta Kucharz Kucharz delulu niestrukturalizowany LOL elektrokardiogramowy essa LOL nieprzewidywalności bezinteresowności Aktor elektrokardiogramowy Notariusz LOL niestrukturalizowany delulu bezinteresowności nieprzewidywalności LOL git essa nieprzewidywalności Notariusz essa LOL Aktor nieprzewidywalności elektrokardiogramowy Kucharz niestrukturalizowany git bambik bezinteresowności bezinteresowności"
                ,"Florysta bambik bambik Florysta hipopotomonstroseskwipedaliofobia delulu LOL bambik Florysta git Grafik bambik nieprzewidywalności Notariusz Kucharz niestrukturalizowany Aktor Aktor Aktor essa niestrukturalizowany hipopotomonstroseskwipedaliofobia git delulu LOL bezinteresowności Notariusz essa Kucharz git nieprzewidywalności hipopotomonstroseskwipedaliofobia hipopotomonstroseskwipedaliofobia delulu hipopotomonstroseskwipedaliofobia hipopotomonstroseskwipedaliofobia niestrukturalizowany bezinteresowności bambik bambik"
                ,"essa git bezinteresowności Grafik Kucharz Florysta elektrokardiogramowy elektrokardiogramowy Aktor Notariusz LOL Notariusz nieprzewidywalności delulu essa bambik Florysta Florysta git essa niestrukturalizowany niestrukturalizowany Kucharz Aktor bezinteresowności Kucharz bambik Kucharz Notariusz bezinteresowności git hipopotomonstroseskwipedaliofobia delulu delulu Grafik git delulu git Grafik elektrokardiogramowy"
                ,"bambik bezinteresowności niestrukturalizowany delulu hipopotomonstroseskwipedaliofobia niestrukturalizowany bezinteresowności hipopotomonstroseskwipedaliofobia bambik Aktor Grafik Notariusz Notariusz delulu essa bambik bambik elektrokardiogramowy LOL Kucharz Aktor delulu delulu git git bambik Grafik nieprzewidywalności hipopotomonstroseskwipedaliofobia essa niestrukturalizowany bambik Florysta nieprzewidywalności elektrokardiogramowy nieprzewidywalności bambik bambik nieprzewidywalności Notariusz"
                ,"elektrokardiogramowy Florysta LOL bambik essa Notariusz nieprzewidywalności git Aktor niestrukturalizowany Notariusz LOL bezinteresowności Grafik Kucharz Kucharz niestrukturalizowany Kucharz Grafik bambik Aktor niestrukturalizowany nieprzewidywalności Kucharz bambik niestrukturalizowany Grafik Notariusz Notariusz Florysta LOL bambik bezinteresowności Kucharz nieprzewidywalności Florysta Grafik elektrokardiogramowy niestrukturalizowany bambik"
                ,"essa delulu hipopotomonstroseskwipedaliofobia nieprzewidywalności bambik delulu Grafik Florysta niestrukturalizowany Grafik Aktor bezinteresowności elektrokardiogramowy Grafik Florysta hipopotomonstroseskwipedaliofobia elektrokardiogramowy hipopotomonstroseskwipedaliofobia nieprzewidywalności bambik Florysta git Notariusz bezinteresowności Notariusz git LOL bezinteresowności Kucharz Kucharz essa Aktor git Kucharz delulu Florysta Aktor delulu bezinteresowności Notariusz"
                ,"bambik Grafik elektrokardiogramowy hipopotomonstroseskwipedaliofobia essa git Grafik elektrokardiogramowy elektrokardiogramowy Florysta Grafik bambik niestrukturalizowany bezinteresowności Kucharz Kucharz Aktor Notariusz Florysta elektrokardiogramowy Grafik essa hipopotomonstroseskwipedaliofobia niestrukturalizowany Kucharz delulu bambik elektrokardiogramowy elektrokardiogramowy essa bambik hipopotomonstroseskwipedaliofobia essa Florysta Grafik Aktor niestrukturalizowany essa hipopotomonstroseskwipedaliofobia Florysta"
                ,"Grafik Florysta bambik niestrukturalizowany bezinteresowności LOL LOL Grafik git LOL bezinteresowności niestrukturalizowany Notariusz bezinteresowności Florysta Grafik Grafik Aktor LOL elektrokardiogramowy bambik hipopotomonstroseskwipedaliofobia elektrokardiogramowy git Florysta elektrokardiogramowy Florysta niestrukturalizowany bezinteresowności Notariusz bambik bezinteresowności bezinteresowności nieprzewidywalności delulu git bambik hipopotomonstroseskwipedaliofobia elektrokardiogramowy Florysta"
                ,"LOL bambik niestrukturalizowany git essa bambik niestrukturalizowany delulu LOL Kucharz nieprzewidywalności Grafik Kucharz bambik LOL essa hipopotomonstroseskwipedaliofobia LOL niestrukturalizowany Notariusz niestrukturalizowany Florysta git delulu LOL nieprzewidywalności Notariusz essa nieprzewidywalności niestrukturalizowany essa git nieprzewidywalności niestrukturalizowany hipopotomonstroseskwipedaliofobia hipopotomonstroseskwipedaliofobia Florysta niestrukturalizowany Kucharz elektrokardiogramowy"
                ,"LOL Grafik bezinteresowności Notariusz niestrukturalizowany niestrukturalizowany Florysta niestrukturalizowany hipopotomonstroseskwipedaliofobia niestrukturalizowany essa niestrukturalizowany Aktor bezinteresowności LOL Grafik niestrukturalizowany niestrukturalizowany Kucharz Aktor Notariusz bambik Notariusz bezinteresowności Florysta nieprzewidywalności LOL bezinteresowności Aktor nieprzewidywalności bambik Grafik Florysta hipopotomonstroseskwipedaliofobia nieprzewidywalności delulu niestrukturalizowany bezinteresowności Notariusz git"
                ,"delulu Florysta nieprzewidywalności elektrokardiogramowy elektrokardiogramowy git LOL Grafik Grafik Florysta niestrukturalizowany Florysta Kucharz Aktor git Kucharz Kucharz Kucharz Florysta elektrokardiogramowy Grafik delulu elektrokardiogramowy hipopotomonstroseskwipedaliofobia delulu niestrukturalizowany Aktor Notariusz delulu hipopotomonstroseskwipedaliofobia Kucharz niestrukturalizowany hipopotomonstroseskwipedaliofobia essa Grafik LOL bezinteresowności LOL bezinteresowności Notariusz"
        };

        String[] GIGAG_RZANIE_PROCEOSRA = {"LOL! Notariusz:   LOL; hipopotomonstroseskwipedaliofobia, Grafik)  elektrokardiogramowy;  bambik)   bezinteresowności( bezinteresowności:   Grafik; bambik:  LOL:  niestrukturalizowany:   Grafik; git. bambik!   Florysta)  git.   bambik;   hipopotomonstroseskwipedaliofobia,   elektrokardiogramowy:  Aktor,  nieprzewidywalności( bambik!   elektrokardiogramowy:  LOL,   Florysta( delulu:  Kucharz! Aktor.   Aktor: Notariusz(  bambik,  hipopotomonstroseskwipedaliofobia.  niestrukturalizowany! Florysta! essa,  Kucharz,  Grafik)   git: ",
                "Aktor( essa)   niestrukturalizowany. Notariusz;  Florysta. elektrokardiogramowy.  Grafik.   Aktor(  hipopotomonstroseskwipedaliofobia.  Aktor: git(   Kucharz. bezinteresowności( Florysta;  delulu;   Kucharz:  git(   Florysta;   Grafik!  Notariusz:   nieprzewidywalności, delulu(  Grafik, bezinteresowności, nieprzewidywalności: niestrukturalizowany!   Grafik. hipopotomonstroseskwipedaliofobia) git( elektrokardiogramowy;   Notariusz:   niestrukturalizowany!   bezinteresowności.   Kucharz:   niestrukturalizowany,   bezinteresowności;  niestrukturalizowany!  bezinteresowności! Notariusz,  nieprzewidywalności!",
                "Grafik)   nieprzewidywalności!  LOL) hipopotomonstroseskwipedaliofobia!   hipopotomonstroseskwipedaliofobia,   elektrokardiogramowy( Aktor,  niestrukturalizowany! Florysta; Grafik)   bambik,  Florysta)  hipopotomonstroseskwipedaliofobia)   LOL,  elektrokardiogramowy.  bezinteresowności;  niestrukturalizowany. Florysta(  Kucharz:   git)  LOL;  bambik)  Grafik!  Aktor, bambik:   Florysta!   bambik!   niestrukturalizowany.   elektrokardiogramowy.   Florysta(  delulu:   elektrokardiogramowy. LOL(   delulu.   niestrukturalizowany,  Kucharz; Kucharz( Notariusz.  Kucharz)   Notariusz;  ",
                "delulu(  Grafik; delulu;  Notariusz.   bambik, Aktor! elektrokardiogramowy! elektrokardiogramowy!  Aktor(   nieprzewidywalności,  nieprzewidywalności)  hipopotomonstroseskwipedaliofobia,  LOL, nieprzewidywalności;  hipopotomonstroseskwipedaliofobia;  LOL!  bambik)   Notariusz!  Aktor.  niestrukturalizowany.  bambik! delulu. bezinteresowności:   delulu!  bambik(   Aktor(   LOL)   Aktor!  delulu, bezinteresowności(  delulu.  delulu( nieprzewidywalności;  delulu)  Kucharz!  Aktor, Notariusz(   Aktor:   niestrukturalizowany,  git: ",
                "delulu, bezinteresowności!   Notariusz:  essa,   LOL,  bambik)   nieprzewidywalności: LOL) elektrokardiogramowy;  Florysta) essa:   bezinteresowności,  Grafik:   elektrokardiogramowy.  hipopotomonstroseskwipedaliofobia.   delulu, Florysta, bezinteresowności;  Notariusz:  bezinteresowności.  Florysta:  Notariusz(   bezinteresowności;   niestrukturalizowany;   Aktor!   git:  Aktor!   elektrokardiogramowy) git)  nieprzewidywalności(  bezinteresowności: git;  essa: essa)   LOL; Aktor, LOL)   delulu:  essa(  elektrokardiogramowy) ",
                "bezinteresowności!  git:   nieprzewidywalności;   elektrokardiogramowy) git) git.  Florysta)   git; Grafik;   bambik(   essa)   bambik)   nieprzewidywalności;   bambik,   Aktor,  essa,   delulu)   hipopotomonstroseskwipedaliofobia, LOL) delulu; Kucharz;   bambik(   bambik;  Kucharz;   essa)  elektrokardiogramowy( Grafik;  Kucharz,   essa:   essa(   bezinteresowności,   LOL! Aktor:   elektrokardiogramowy)   Kucharz;   niestrukturalizowany!  hipopotomonstroseskwipedaliofobia:  Florysta;   niestrukturalizowany,   nieprzewidywalności,",
                "delulu! hipopotomonstroseskwipedaliofobia:  bambik, bambik.   Aktor)  niestrukturalizowany(  hipopotomonstroseskwipedaliofobia! Aktor( Aktor;  bezinteresowności: bezinteresowności( niestrukturalizowany) Aktor;   Notariusz)   Florysta; hipopotomonstroseskwipedaliofobia! bambik:  niestrukturalizowany(  Grafik) niestrukturalizowany;   nieprzewidywalności:  essa:  elektrokardiogramowy)  Florysta: git.  Notariusz. Grafik.   bambik(   LOL! essa:   Florysta:   Kucharz!   nieprzewidywalności, niestrukturalizowany: niestrukturalizowany( essa.   hipopotomonstroseskwipedaliofobia(  Florysta:  bambik.   nieprzewidywalności)  ",
                "hipopotomonstroseskwipedaliofobia! niestrukturalizowany(   Notariusz;   delulu;  Florysta:  bambik)  hipopotomonstroseskwipedaliofobia.  Grafik:   Notariusz,  elektrokardiogramowy!   Notariusz)   Kucharz: hipopotomonstroseskwipedaliofobia) bezinteresowności:  delulu)  bambik) nieprzewidywalności!   Notariusz)   bambik(   LOL) git:  Grafik!  delulu( essa(  Grafik: git;  Notariusz! elektrokardiogramowy; Kucharz)  elektrokardiogramowy,   Grafik)  Aktor,  Florysta(   Notariusz(   Florysta!  elektrokardiogramowy. Grafik(   delulu;  delulu!  hipopotomonstroseskwipedaliofobia, ",
                "Florysta(   Florysta; Kucharz; elektrokardiogramowy. bezinteresowności(  Grafik, Florysta(  essa:  elektrokardiogramowy)   git:  nieprzewidywalności:   hipopotomonstroseskwipedaliofobia( nieprzewidywalności! Florysta)  essa,   LOL(   bezinteresowności(  bambik!   Aktor;   Aktor:   niestrukturalizowany:  niestrukturalizowany,  LOL) essa(   niestrukturalizowany)  Notariusz; Notariusz;  essa(  Aktor(   git) bezinteresowności)   LOL! elektrokardiogramowy.   bambik,  Notariusz,   bambik.   bambik!   git! nieprzewidywalności!  delulu;",
                "hipopotomonstroseskwipedaliofobia) Kucharz!  LOL:  delulu;  Kucharz!  elektrokardiogramowy) nieprzewidywalności;  hipopotomonstroseskwipedaliofobia!   Aktor.   Kucharz!   Grafik! essa.  hipopotomonstroseskwipedaliofobia. Aktor;  Kucharz( Grafik(   Notariusz(  Aktor!  git. essa!  Aktor.   essa,  delulu;   Florysta, nieprzewidywalności;  LOL,   Notariusz(   bezinteresowności!   bezinteresowności, Florysta) niestrukturalizowany) Aktor,   Notariusz)   Aktor!  delulu!  hipopotomonstroseskwipedaliofobia) hipopotomonstroseskwipedaliofobia: essa.   git)  bambik,  ",
                "nieprzewidywalności; Aktor!  elektrokardiogramowy,  Florysta;  niestrukturalizowany:   elektrokardiogramowy( Kucharz) delulu,   hipopotomonstroseskwipedaliofobia.   nieprzewidywalności.  Grafik,  nieprzewidywalności! elektrokardiogramowy( Aktor)  delulu:  Kucharz)  nieprzewidywalności:  Florysta: git. Florysta) niestrukturalizowany:   Aktor:  hipopotomonstroseskwipedaliofobia!  delulu!   delulu, git) Florysta!  elektrokardiogramowy;  git! bambik;   niestrukturalizowany.  LOL)  Aktor;   hipopotomonstroseskwipedaliofobia:  elektrokardiogramowy:  LOL.   LOL;   hipopotomonstroseskwipedaliofobia(  Florysta;  delulu)",
                "Grafik(  essa(  niestrukturalizowany:   niestrukturalizowany,   Notariusz( LOL.  essa(   Grafik.  elektrokardiogramowy,  hipopotomonstroseskwipedaliofobia, bambik, Kucharz!   nieprzewidywalności;  delulu;  nieprzewidywalności) nieprzewidywalności.  LOL;  bambik;   niestrukturalizowany! niestrukturalizowany!   Florysta!  Aktor!  Aktor. Kucharz)  Florysta, bambik; nieprzewidywalności; essa.   Kucharz!   Grafik;   bezinteresowności:  bambik! essa;   Aktor;  niestrukturalizowany, Aktor) Notariusz(  bezinteresowności) niestrukturalizowany:  niestrukturalizowany(",
                "bezinteresowności:  Notariusz( bezinteresowności)  niestrukturalizowany, Aktor) essa) Notariusz.  Florysta; Notariusz) essa!   hipopotomonstroseskwipedaliofobia.  bezinteresowności(   bambik.  Aktor!  LOL(  niestrukturalizowany;   essa;  bambik: Aktor(  Aktor,  delulu. nieprzewidywalności; LOL( Notariusz!   Aktor, Grafik;  Kucharz( bambik(  elektrokardiogramowy!  essa)  niestrukturalizowany:  delulu,  bambik: elektrokardiogramowy!   Aktor;  nieprzewidywalności( Aktor; git,   niestrukturalizowany;  bezinteresowności,",
                "elektrokardiogramowy:  essa;  Florysta,   git,  Grafik( Kucharz, LOL,  git;   hipopotomonstroseskwipedaliofobia)   LOL;  LOL;   bambik)   bezinteresowności,   Aktor: nieprzewidywalności)  Florysta! elektrokardiogramowy,   bezinteresowności! essa: Grafik;  Notariusz; elektrokardiogramowy:   Florysta; hipopotomonstroseskwipedaliofobia;  elektrokardiogramowy! Florysta:  Notariusz.   Notariusz(  bambik. Florysta;  Kucharz:  nieprzewidywalności(   hipopotomonstroseskwipedaliofobia; bambik:   bezinteresowności(   Notariusz(   Grafik; Kucharz.  elektrokardiogramowy)  bambik, ",
                "Grafik, bambik,  elektrokardiogramowy, LOL. elektrokardiogramowy)   bambik( Kucharz)   niestrukturalizowany,  Florysta) nieprzewidywalności; Grafik( git( nieprzewidywalności, bezinteresowności:  elektrokardiogramowy,   bezinteresowności, Kucharz( bezinteresowności!  Kucharz(  Florysta: hipopotomonstroseskwipedaliofobia.  LOL( LOL;   Grafik:   Kucharz!  hipopotomonstroseskwipedaliofobia(  nieprzewidywalności;  delulu)   Kucharz;  essa(   Notariusz.  nieprzewidywalności. nieprzewidywalności: niestrukturalizowany)  Grafik:  elektrokardiogramowy( essa( Kucharz.   Grafik)  Florysta( ",
                "git. nieprzewidywalności;  bezinteresowności)   Notariusz!  nieprzewidywalności. elektrokardiogramowy! niestrukturalizowany; nieprzewidywalności.  bambik(   Aktor:  niestrukturalizowany,  bezinteresowności!   Grafik) Notariusz)   Grafik! essa.  Notariusz(   Kucharz,   git.  nieprzewidywalności:   bambik; Florysta:   essa:  essa; essa:  Kucharz;   essa)   Notariusz; git, niestrukturalizowany(   Aktor! Notariusz!   bezinteresowności:   nieprzewidywalności,  Florysta!  hipopotomonstroseskwipedaliofobia,   git,  Grafik)  git. bambik(  ",
                "Florysta:   niestrukturalizowany!  hipopotomonstroseskwipedaliofobia, bambik!   niestrukturalizowany) delulu( Grafik(   bambik!   nieprzewidywalności,   bezinteresowności.  essa. delulu! essa.   bezinteresowności( delulu)   Notariusz. elektrokardiogramowy,   bezinteresowności!   essa!  Aktor! Notariusz!   nieprzewidywalności) Kucharz)  bezinteresowności\"essa! Aktor; elektrokardiogramowy(   bambik.   bezinteresowności!   delulu)  git( delulu;   Grafik.  hipopotomonstroseskwipedaliofobia)  Grafik)   Grafik.  Aktor\"git(  git, Florysta\"",
                "niestrukturalizowany, niestrukturalizowany.  Kucharz; elektrokardiogramowy\" niestrukturalizowany\"Grafik\" essa!   bambik(  niestrukturalizowany! bezinteresowności;  bambik;  niestrukturalizowany\"niestrukturalizowany)  nieprzewidywalności\"Kucharz;   elektrokardiogramowy:   git, niestrukturalizowany:  nieprzewidywalności,   niestrukturalizowany( niestrukturalizowany,   git( nieprzewidywalności. bezinteresowności(   Florysta( elektrokardiogramowy,   Florysta,   Kucharz; nieprzewidywalności:   LOL:   essa\" Grafik.  bezinteresowności( elektrokardiogramowy;  essa; Notariusz:   LOL(   hipopotomonstroseskwipedaliofobia\"  delulu:   Notariusz\"  ",
                "bambik; LOL,  Florysta,  Notariusz, Grafik.   Notariusz, bezinteresowności\"   delulu) hipopotomonstroseskwipedaliofobia,   elektrokardiogramowy\"   git)   bambik:   elektrokardiogramowy: essa:   git\"  Florysta,  Notariusz;   Grafik\" Grafik. Notariusz;  LOL;  Grafik,  Notariusz) LOL)   niestrukturalizowany.  Kucharz;   LOL; niestrukturalizowany: git. bambik:  niestrukturalizowany;   Kucharz;   git) Aktor\"   Aktor(  elektrokardiogramowy, hipopotomonstroseskwipedaliofobia, Kucharz;  LOL)   essa: ",
                "bambik. Notariusz:   Notariusz,   hipopotomonstroseskwipedaliofobia; git; hipopotomonstroseskwipedaliofobia\"   Aktor)  Aktor; Florysta\" git;   elektrokardiogramowy)   Florysta;   LOL) niestrukturalizowany( hipopotomonstroseskwipedaliofobia)   Notariusz;   Kucharz) elektrokardiogramowy: elektrokardiogramowy) nieprzewidywalności( niestrukturalizowany;   Grafik, nieprzewidywalności\" Aktor: bezinteresowności! Aktor:  Florysta) Kucharz(  bambik:   Grafik!   git.  Grafik!  git!   bambik(  nieprzewidywalności) Aktor. nieprzewidywalności. LOL)   Kucharz(  Aktor)",
                "elektrokardiogramowy)  bezinteresowności) delulu(  delulu.  Florysta.  Aktor:   bambik.   delulu.   niestrukturalizowany.  LOL;   nieprzewidywalności,   bambik:  LOL) essa;  delulu:  LOL( Notariusz,  git(  essa)   bezinteresowności!   LOL.   delulu) Florysta, Florysta(  bezinteresowności:  delulu)  nieprzewidywalności;   delulu; Kucharz(  bezinteresowności:   Aktor! niestrukturalizowany(   nieprzewidywalności!   Florysta) Notariusz! git( niestrukturalizowany:  hipopotomonstroseskwipedaliofobia! Aktor. hipopotomonstroseskwipedaliofobia; ",
                "niestrukturalizowany,  bezinteresowności.   delulu(  niestrukturalizowany: bezinteresowności!  essa,  bambik. Aktor. git:  essa)  nieprzewidywalności!   bambik;   Florysta:  niestrukturalizowany, essa!   delulu, git)   elektrokardiogramowy!  LOL!  Kucharz;   nieprzewidywalności: Florysta,  nieprzewidywalności( elektrokardiogramowy:  hipopotomonstroseskwipedaliofobia!  LOL, Aktor(   delulu!  elektrokardiogramowy;  niestrukturalizowany)  Grafik,   LOL,   Kucharz(   LOL)   bezinteresowności)  Kucharz.   Grafik, bezinteresowności.   elektrokardiogramowy.   delulu:  ",
                "LOL. Notariusz:   hipopotomonstroseskwipedaliofobia)  essa.   bezinteresowności)   nieprzewidywalności,  nieprzewidywalności!   essa,   niestrukturalizowany!   Aktor;   essa)   git:   git(  Kucharz!   Kucharz(  delulu)  Aktor!   elektrokardiogramowy)  git:  niestrukturalizowany;   Grafik!  Grafik.   niestrukturalizowany!   essa! Notariusz.  Aktor(  nieprzewidywalności.   niestrukturalizowany)  bezinteresowności( Aktor;   LOL!   delulu) Kucharz! delulu)  bezinteresowności( delulu! bezinteresowności(   Notariusz; nieprzewidywalności( delulu:  ",
                "Aktor: Aktor.   elektrokardiogramowy;  LOL( Florysta. elektrokardiogramowy( Notariusz, hipopotomonstroseskwipedaliofobia;   elektrokardiogramowy!  Kucharz!   Kucharz. Notariusz:   nieprzewidywalności:   hipopotomonstroseskwipedaliofobia(  delulu)   git!  essa)  hipopotomonstroseskwipedaliofobia;   git(  Aktor(   Florysta;  Notariusz.   Kucharz) elektrokardiogramowy!   Florysta(   Aktor;  bezinteresowności,   hipopotomonstroseskwipedaliofobia; hipopotomonstroseskwipedaliofobia(   Aktor(   niestrukturalizowany; Notariusz) bambik!  Grafik; niestrukturalizowany,   bambik(   elektrokardiogramowy) hipopotomonstroseskwipedaliofobia:   bambik(  elektrokardiogramowy!",
                "bambik;  bambik: delulu,   Notariusz: Kucharz:   Notariusz)   Florysta(  nieprzewidywalności,  elektrokardiogramowy;  bezinteresowności;   git) hipopotomonstroseskwipedaliofobia)  LOL(   Grafik,  git!   Florysta:  Florysta)  Florysta)  Kucharz(   niestrukturalizowany!  essa(   Notariusz) Grafik,   bambik(  Florysta. essa.  Grafik.   bezinteresowności) nieprzewidywalności) delulu. essa!  hipopotomonstroseskwipedaliofobia!   bambik)  bambik( Notariusz;  hipopotomonstroseskwipedaliofobia)   LOL(   nieprzewidywalności( delulu:   elektrokardiogramowy,  ",
                "elektrokardiogramowy(  Florysta!  Aktor)  nieprzewidywalności;   delulu:   Kucharz,   git!  Kucharz,   delulu, Notariusz:   bambik;  Grafik,   LOL; bambik,  bezinteresowności.  git( Florysta)  hipopotomonstroseskwipedaliofobia,   niestrukturalizowany(  delulu!   elektrokardiogramowy.   bezinteresowności!   niestrukturalizowany,  delulu( niestrukturalizowany) Florysta. bezinteresowności.  niestrukturalizowany:   Grafik;   LOL(   hipopotomonstroseskwipedaliofobia) bezinteresowności!  git, Grafik. nieprzewidywalności( Aktor: niestrukturalizowany.  hipopotomonstroseskwipedaliofobia(   nieprzewidywalności:   elektrokardiogramowy.  ",
                "Notariusz:  Grafik:   Aktor: Aktor;  elektrokardiogramowy)   Notariusz. delulu;   essa,   Aktor,   delulu. delulu:   Florysta,   essa! hipopotomonstroseskwipedaliofobia(   Grafik)   Notariusz. Grafik:  LOL;   nieprzewidywalności)   Grafik( git.  bezinteresowności! Grafik)   Kucharz.  Aktor( essa( Florysta(   delulu! nieprzewidywalności,   nieprzewidywalności:  LOL.   Kucharz!   niestrukturalizowany;   nieprzewidywalności, bezinteresowności, Notariusz:   Notariusz(   hipopotomonstroseskwipedaliofobia,  git,   nieprzewidywalności:  ",
                "bambik:   essa:  essa( bezinteresowności;   elektrokardiogramowy) Kucharz! essa; git,   Florysta) delulu;   LOL;  elektrokardiogramowy,   nieprzewidywalności! Aktor,  git!  git;   elektrokardiogramowy.   niestrukturalizowany;   LOL(   bezinteresowności) Florysta.   LOL.   niestrukturalizowany,  git; hipopotomonstroseskwipedaliofobia;   bambik)   Notariusz:  Notariusz:   bambik:   essa,  hipopotomonstroseskwipedaliofobia)  Kucharz:   Kucharz!   bezinteresowności, bezinteresowności:  nieprzewidywalności)  essa: Notariusz; Aktor!   LOL!",
                "Kucharz,  niestrukturalizowany)  delulu)  niestrukturalizowany;   Aktor; bambik;  Kucharz,  bambik(  delulu!   elektrokardiogramowy(   Kucharz:   Notariusz.  delulu;  Florysta, bambik.   Notariusz,  Aktor!   Grafik)  git,   delulu, essa, delulu( Florysta;  essa;  Notariusz!   bambik; essa;  essa! Grafik)  Aktor.  bezinteresowności) elektrokardiogramowy. Kucharz)  hipopotomonstroseskwipedaliofobia, niestrukturalizowany(   Notariusz:   niestrukturalizowany:   elektrokardiogramowy; niestrukturalizowany,   git)",
                "niestrukturalizowany!  Kucharz; Notariusz: Aktor;   bezinteresowności!   git. Aktor) bezinteresowności:  Notariusz) Florysta(   elektrokardiogramowy) nieprzewidywalności) essa(  Kucharz;   bambik,  Aktor) git: Kucharz.  niestrukturalizowany)  Kucharz( hipopotomonstroseskwipedaliofobia,  Aktor! Florysta)  Grafik:  elektrokardiogramowy(   essa! Kucharz. niestrukturalizowany( Aktor. bambik! delulu)  Aktor.   Notariusz( niestrukturalizowany! LOL;  Kucharz:  niestrukturalizowany;  bezinteresowności;   hipopotomonstroseskwipedaliofobia:   Notariusz)",
        };

        String[] APP2ke= {"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin purus neque, aliquam ac sapien in, congue finibus risus. In consequat vel sapien id pellentesque. Cras venenatis quam auctor risus pulvinar, a bibendum eros rutrum. Sed neque purus, efficitur a felis vitae, porta maximus dui. Quisque leo mi, volutpat at sapien vitae, pretium dapibus ante. Duis sodales rhoncus dui sit amet tincidunt. Pellentesque volutpat fermentum justo, eu semper orci efficitur ut. Fusce iaculis vestibulum orci, vitae porttitor ipsum pulvinar quis. Fusce lobortis ac ipsum et faucibus. Aenean et ipsum arcu. Vivamus a sodales libero. Aenean quis tincidunt lacus. Nam arcu elit, ultricies ac suscipit vel, iaculis sit amet magna. Nulla at condimentum ex. Vivamus a fringilla nunc, sed fringilla libero. In quis neque sed massa tristique cursus.\n" +
                "\n" +
                "Duis gravida nulla mi, ac interdum velit tincidunt in. Cras id odio justo. Suspendisse pellentesque risus at nisl finibus interdum. Mauris sollicitudin metus ut augue gravida, eget finibus ex suscipit. Suspendisse semper tincidunt cursus. Donec dapibus mollis urna, ut dapibus tortor euismod id. Sed leo ante, convallis sit amet vestibulum ac, commodo ac ipsum. Fusce non commodo libero. Cras placerat malesuada nibh, vel lacinia nibh venenatis hendrerit. Ut volutpat orci vel est iaculis malesuada. Phasellus vulputate risus sed auctor aliquam. Phasellus diam massa, sodales pharetra venenatis eu, laoreet eget erat. Mauris sed ligula efficitur tortor blandit fringilla eu vitae nibh. Vestibulum pharetra sodales maximus. Duis iaculis justo vitae suscipit pellentesque.\n" +
                "\n" +
                "Curabitur auctor consequat(((())))) est, ...:;\"pulvinar gravida,,,,\"\"\" mi hendrerit in. Proin eget mauris efficitur, pretium mi in, tincidunt nisl. Duis porttitor a orci eu vestibulum. Nam efficitur urna quis mauris varius malesuada. Integer id laoreet nulla. Etiam tincidunt, lorem consequat varius ornare, odio ex dictum neque, ut feugiat ipsum ipsum id nunc. Sed eu ullamcorper erat, ac dignissim sapien. Morbi fringilla dignissim nulla ac gravida. Donec consequat eu lorem feugiat varius. Cras faucibus neque justo, in porttitor dui faucibus id. Sed ac nisi sagittis, maximus massa et, tempor nibh. Praesent in facilisis massa, non fermentum sapien. Sed sodales ante quam.\n" +
                "\n" +
                "Aliquam sed\"metus convallis ex vestibulum luctus. Proin nisl enim, interdum sit amet porta vel, sollicitudin sit amet augue. Nulla fermentum vel ligula sit amet vehicula. Nam malesuada feugiat ipsum eget condimentum. Suspendisse venenatis bibendum felis, et vulputate erat venenatis quis. Vestibulum commodo metus et dolor sollicitudin, et sollicitudin ante tincidunt. Proin interdum ultrices ipsum, in pretium mi egestas non. Quisque scelerisque eu dui non pellentesque. Etiam sagittis ante congue hendrerit accumsan. Mauris scelerisque convallis iaculis. Quisque nec scelerisque tellus. Nullam sed diam consequat risus varius tempor ut id metus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Aenean bibendum ex mi, eu rhoncus odio laoreet eu. Morbi mattis dui vitae malesuada cursus.\n" +
                "\n" +
                "In sollicitudin id neque ac auctor. Interdum et malesuada fames ac ante ipsum primis in faucibus. Vestibulum commodo a dui eu faucibus. Donec pharetra risus non velit auctor convallis. Integer est nisl, feugiat tincidunt lectus ut, accumsan vestibulum metus. Donec id interdum purus. Sed sit amet quam et nulla gravida viverra quis et ligula. Aenean sem enim, interdum vitae iaculis id, porta ac lorem. Suspendisse porttitor justo mauris, in sagittis mi luctus sed.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "aaaabbbcc","aabb! ..,","","A","Ab","AbAb","AbAa Ab(Aa", ",,,...;;;!!!", "hello!!!... world!!!...", "aaaaa bbbb ccccc dddddd eeeee ffffff", "aaaaa bbbb ccccc dddddd eeeee ffffff ffffff","a a b b c c a a",".","Dok","Aminini","aaa AAA aaaAAA", "... ...", "!!! !!!", ",,,, ,,,,", ";;; ;;;", "))) )))", "((( (((", "\"\"\" \"\"\"","Ala ma kota i psa. Bardzo lubi kota i psa. Karmi kota i psa. Czesze psa i kota. Drapie psa i kota.", "Ala i e. Ala. e e i i",  "Encyklopedia Encyklopedia Encyklopedia Encyklopedia Encyklopedia", "kwiat, rzeka, drzwi, miasto, książka, las, krzesło, sen, muzyka, światło, zegar, deszcz, słońce, kompas, okno, podróż, dom, pomysł, chmura, radość, woda, wiatr, piosenka, wino, kawa, list, film, wieczór, spacer, lód, plaża, jezioro, las, dźwięk, śmiech, obraz, czas, gwiazda, pióro, serce, przyjaciel, podróż, energia, miłość, historia, obrazek, cisza, zamek, wzgórze, jabłko, cisza, cień, pokój, rzeka, most, okręt, góra, kamień, plaża, brzeg, miłość, poezja, czajnik, list, dzień, fala, kwiat, dom, wzór, nuta, herbata, list, planeta, smak, książka, głos, nuta, płomień, dym, pamięć, wspomnienie, las, podróż, sztuka, cień, puchar, ścieżka, mgła, pokój, kubek, dźwięk, wspomnienie, kamień, wschód, zachód, deszcz, płomień, gwiazda, radość, cień, most, zapach, noc, liść, ptak, kwiat, rzeka, drzwi, miasto, książka, las, krzesło, sen, muzyka, światło, zegar, deszcz, słońce, kompas, okno, podróż, dom, pomysł, chmura, radość, woda, wiatr, piosenka, wino, kawa, list, film, wieczór, spacer, lód, plaża, jezioro, las, dźwięk, śmiech, obraz, czas, gwiazda, pióro, serce, przyjaciel, podróż, energia, miłość, historia, obrazek, cisza, zamek, wzgórze, jabłko, cisza, cień, pokój, rzeka, most, okręt, góra, kamień, plaża, brzeg, miłość, poezja, czajnik, list, dzień, fala, kwiat, dom, wzór, nuta, herbata, list, planeta, smak, książka, głos, nuta, płomień, dym, pamięć, wspomnienie, las, podróż, sztuka, cień, puchar, ścieżka, mgła, pokój, kubek, dźwięk, wspomnienie, kamień, wschód, zachód, deszcz, płomień, gwiazda, radość, cień, most, zapach, noc, liść, ptak, kwiat, rzeka, drzwi, miasto, książka, las, krzesło, sen, muzyka, światło, zegar, deszcz, słońce, kompas, okno, podróż, dom, pomysł, chmura, radość, woda, wiatr, piosenka, wino, kawa, list, film, wieczór, spacer, lód, plaża, jezioro, las, dźwięk, śmiech, obraz, czas, gwiazda, pióro, serce, przyjaciel, podróż, energia, miłość, historia, obrazek, cisza, zamek, wzgórze, jabłko, cisza, cień, pokój, rzeka, most, okręt, góra, kamień, plaża, brzeg, miłość, poezja, czajnik, list, dzień, fala, kwiat, dom, wzór, nuta, herbata, list, planeta, smak, książka, głos, nuta, płomień, dym, pamięć, wspomnienie, las, podróż, sztuka, cień, puchar, ścieżka, mgła, pokój, kubek, dźwięk, wspomnienie, kamień, wschód, zachód, deszcz, płomień, gwiazda, radość, cień, most, zapach, noc, liść, ptak, kwiat, rzeka, drzwi, miasto, książka, las, krzesło, sen, muzyka, światło, zegar, deszcz, słońce, kompas, okno, podróż, dom, pomysł, chmura, radość, woda, wiatr, piosenka, wino, kawa, list, film, wieczór, spacer, lód, plaża, jezioro, las, dźwięk, śmiech, obraz, czas, gwiazda, pióro, serce, przyjaciel, podróż, energia, miłość, historia, obrazek, cisza, zamek, wzgórze, jabłko, cisza, cień, pokój, rzeka, most, okręt, góra, kamień, plaża, brzeg, miłość, poezja, czajnik, list, dzień, fala, kwiat, dom, wzór, nuta, herbata, list, planeta, smak, książka, głos, nuta, płomień, dym, pamięć, wspomnienie, las, podróż, sztuka, cień, puchar, ścieżka, mgła, pokój, kubek, dźwięk, wspomnienie, kamień, wschód, zachód, deszcz, płomień, gwiazda, radość, cień, most, zapach, noc, liść, ptak, kwiat, rzeka, drzwi, miasto, książka, las, krzesło, sen, muzyka, światło, zegar, deszcz, słońce, kompas, okno, podróż, dom, pomysł, chmura, radość, woda, wiatr, piosenka, wino, kawa, list, film, wieczór, spacer, lód, plaża, jezioro, las, dźwięk, śmiech, obraz, czas, gwiazda, pióro, serce, przyjaciel, podróż, energia, miłość, historia, obrazek, cisza, zamek, wzgórze, jabłko, cisza, cień, pokój, rzeka, most, okręt, góra, kamień, plaża, brzeg, miłość, poezja, czajnik, list, dzień, fala, kwiat, dom, wzór, nuta, herbata, list, planeta, smak, książka, głos, nuta, płomień, dym, pamięć, wspomnienie, las, podróż, sztuka, cień, puchar, ścieżka, mgła, pokój, kubek, dźwięk, wspomnienie, kamień, wschód, zachód, deszcz, płomień, gwiazda, radość, cień, most, zapach, noc, liść, ptak",
                "niezastąpiony, rzeczywistość, przyjaźń, odpowiedzialność, niezależność, uprzywilejowany, nieporozumienie, rozczarowanie, poszanowanie, wrażliwość, przyjemność, doskonałość, współpraca, rzeczywistość, zainteresowanie, wyobraźnia, odpowiedzialność, kompromisowość, nieprzewidywalność, zadowolenie, niezastąpiony, prawdopodobieństwo, przyjaźń, uśmiechnięty, satysfakcjonujący, przywiązanie, niepodległość, wytłumaczenie, nierozłączność, zagadkowość, niepowtarzalność, tolerancyjność, odzwierciedlenie, wielokrotność, systematyczność, wszechstronność, porozumienie, niewyczerpalność, przyjemności, odpowiedzialny, rozwiązanie, długowieczność, nieodwracalność, codzienność, rzeczywistość, zainteresowanie, rozważność, odpowiedzialność, emocjonalność, wszechstronny, satysfakcja, przemijalność, odzwierciedlenie, nadzwyczajność, nieoczekiwany, bezstronność, zrozumienie, niepewność, inspiracja, wyobrażenie, zrównoważenie, zadowolenie, rzeczywistość, niepodległość, wytrwałość, stabilność, poważanie, nierozłączność, współpraca, znajomość, zagadkowość, niezależność, wykształcenie, niestrudzony, bezkompromisowość, wynalazczość, samodzielność, wszechmocność, rozmyślanie, wyobraźnia, sprawiedliwość, przeżycie, nieskończoność, przeszłość, emocjonalność, współzależność, tolerancyjność, przewidywalność, przyzwoitość, umiejętność, znajomość, wyrozumiałość, nieprzemijalność, przeznaczenie, wytrwałość, wieloznaczność, współpraca, nieomylność, zapomnienie, przewidywalność, niezastąpiony, rzeczywistość, przyjaźń, odpowiedzialność, niezależność, uprzywilejowany, nieporozumienie, rozczarowanie, poszanowanie, wrażliwość, przyjemność, doskonałość, współpraca, rzeczywistość, zainteresowanie, wyobraźnia, odpowiedzialność, kompromisowość, nieprzewidywalność, zadowolenie, niezastąpiony, prawdopodobieństwo, przyjaźń, uśmiechnięty, satysfakcjonujący, przywiązanie, niepodległość, wytłumaczenie, nierozłączność, zagadkowość, niepowtarzalność, tolerancyjność, odzwierciedlenie, wielokrotność, systematyczność, wszechstronność, porozumienie, niewyczerpalność, przyjemności, odpowiedzialny, rozwiązanie, długowieczność, nieodwracalność, codzienność, rzeczywistość, zainteresowanie, rozważność, odpowiedzialność, emocjonalność, wszechstronny, satysfakcja, przemijalność, odzwierciedlenie, nadzwyczajność, nieoczekiwany, bezstronność, zrozumienie, niepewność, inspiracja, wyobrażenie, zrównoważenie, zadowolenie, rzeczywistość, niepodległość, wytrwałość, stabilność, poważanie, nierozłączność, współpraca, znajomość, zagadkowość, niezależność, wykształcenie, niestrudzony, bezkompromisowość, wynalazczość, samodzielność, wszechmocność, rozmyślanie, wyobraźnia, sprawiedliwość, przeżycie, nieskończoność, przeszłość, emocjonalność, współzależność, tolerancyjność, przewidywalność, przyzwoitość, umiejętność, znajomość, wyrozumiałość, nieprzemijalność, przeznaczenie, wytrwałość, wieloznaczność, współpraca, nieomylność, zapomnienie, przewidywalność, niezastąpiony, rzeczywistość, przyjaźń, odpowiedzialność, niezależność, uprzywilejowany, nieporozumienie, rozczarowanie, poszanowanie, wrażliwość, przyjemność, doskonałość, współpraca, rzeczywistość, zainteresowanie, wyobraźnia, odpowiedzialność, kompromisowość, nieprzewidywalność, zadowolenie, niezastąpiony, prawdopodobieństwo, przyjaźń, uśmiechnięty, satysfakcjonujący, przywiązanie, niepodległość, wytłumaczenie, nierozłączność, zagadkowość, niepowtarzalność, tolerancyjność, odzwierciedlenie, wielokrotność, systematyczność, wszechstronność, porozumienie, niewyczerpalność, przyjemności, odpowiedzialny, rozwiązanie, długowieczność, nieodwracalność, codzienność, rzeczywistość, zainteresowanie, rozważność, odpowiedzialność, emocjonalność, wszechstronny, satysfakcja, przemijalność, odzwierciedlenie, nadzwyczajność, nieoczekiwany, bezstronność, zrozumienie, niepewność, inspiracja, wyobrażenie, zrównoważenie, zadowolenie, rzeczywistość, niepodległość, wytrwałość, stabilność, poważanie, nierozłączność, współpraca, znajomość, zagadkowość, niezależność, wykształcenie, niestrudzony, bezkompromisowość, wynalazczość, samodzielność, wszechmocność, rozmyślanie, wyobraźnia, sprawiedliwość, przeżycie, nieskończoność, przeszłość, emocjonalność, współzależność, tolerancyjność, przewidywalność, przyzwoitość, umiejętność, znajomość, wyrozumiałość, nieprzemijalność, przeznaczenie, wytrwałość, wieloznaczność, współpraca, nieomylność, zapomnienie, przewidywalność, niezastąpiony, rzeczywistość, przyjaźń, odpowiedzialność, niezależność, uprzywilejowany, nieporozumienie, rozczarowanie, poszanowanie, wrażliwość, przyjemność, doskonałość, współpraca, rzeczywistość, zainteresowanie, wyobraźnia, odpowiedzialność, kompromisowość, nieprzewidywalność, zadowolenie, niezastąpiony, prawdopodobieństwo, przyjaźń, uśmiechnięty, satysfakcjonujący, przywiązanie, niepodległość, wytłumaczenie, nierozłączność, zagadkowość, niepowtarzalność, tolerancyjność, odzwierciedlenie, wielokrotność, systematyczność, wszechstronność, porozumienie, niewyczerpalność, przyjemności, odpowiedzialny, rozwiązanie, długowieczność, nieodwracalność, codzienność, rzeczywistość, zainteresowanie, rozważność, odpowiedzialność, emocjonalność, wszechstronny, satysfakcja, przemijalność, odzwierciedlenie, nadzwyczajność, nieoczekiwany, bezstronność, zrozumienie, niepewność, inspiracja, wyobrażenie, zrównoważenie, zadowolenie, rzeczywistość, niepodległość, wytrwałość, stabilność, poważanie, nierozłączność, współpraca, znajomość, zagadkowość, niezależność, wykształcenie, niestrudzony, bezkompromisowość, wynalazczość, samodzielność, wszechmocność, rozmyślanie, wyobraźnia, sprawiedliwość, przeżycie, nieskończoność, przeszłość, emocjonalność, współzależność, tolerancyjność, przewidywalność, przyzwoitość, umiejętność, znajomość, wyrozumiałość, nieprzemijalność, przeznaczenie, wytrwałość, wieloznaczność, współpraca, nieomylność, zapomnienie, przewidywalność"};

        System.out.println("GRZEJEMY 1");
        for (String str : strings) {
            System.out.println("--");
            compression.input(str);
            System.out.println("Histogram rozmiar: "+ compression.histogram().size()); //dlugosc  histogramu
            System.out.println("Input Length: "+str.length()); //dlugosc znaku wejsciowego
            int dlugosc = compression.output().length();
            for (String slowo : compression.code()) dlugosc += slowo.length();
            System.out.println(compression.histogram());
            System.out.println(compression.code());
            System.out.println("Zakodowany: "+dlugosc);

            if (compression.code().size()==0 || compression.code().size()==2 ||compression.code().size()==4 || compression.code().size()==8 || compression.code().size()==16 || compression.code().size()==32 || compression.code().size()==64 )
            {
                System.out.println("Size code:"+compression.code().size());
            }
            else
            {
                System.out.println("Size code: FALSE "+compression.code().size());
            }

            System.out.println("Kodowanie dlugosci:"+ (dlugosc<=str.length()?"True":"False"));
            if (compression.decode(compression.output(),compression.code()).length()==str.length())
            {
                System.out.println("Dlugosc: True");
            }
            else
            {
                System.out.println("Dlugosc: False");
                System.out.println("Input: "+str);
                System.out.println("Output: "+compression.decode(compression.output(),compression.code()));
            }


        }


        System.out.println("GRZEJEMY 2");
        for (String str : test_2_grzanie) {
            System.out.println("--");
            compression.input(str);
            System.out.println("Histogram rozmiar: "+ compression.histogram().size()); //dlugosc  histogramu
            System.out.println("Input Length: "+str.length()); //dlugosc znaku wejsciowego
            int dlugosc = compression.output().length();
            for (String slowo : compression.code()) dlugosc += slowo.length();
            System.out.println(compression.histogram());
            System.out.println(compression.code());
            System.out.println("Zakodowany: "+dlugosc);
            if (compression.code().size()==0 || compression.code().size()==2 ||compression.code().size()==4 || compression.code().size()==8 || compression.code().size()==16 || compression.code().size()==32 || compression.code().size()==64 )
            {
                System.out.println("Size code:"+compression.code().size());
            }
            else
            {
                System.out.println("Size code: FALSE "+compression.code().size());
            }
            System.out.println("Kodowanie dlugosci:"+ (dlugosc<=str.length()?"True":"False"));
            if (compression.decode(compression.output(),compression.code()).length()==str.length())
            {
                System.out.println("Dlugosc: True");
            }
            else
            {
                System.out.println("Dlugosc: False");
                System.out.println("Input: "+str);
                System.out.println("Output: "+compression.decode(compression.output(),compression.code()));
            }
        }


        System.out.println("GRZEJEMY 3");
        for (String str : test_3_grzanie) {
            System.out.println("--");
            compression.input(str);
            System.out.println("Histogram rozmiar: "+ compression.histogram().size()); //dlugosc  histogramu
            System.out.println("Input Length: "+str.length()); //dlugosc znaku wejsciowego
            int dlugosc = compression.output().length();
            for (String slowo : compression.code()) dlugosc += slowo.length();
            System.out.println(compression.histogram());
            System.out.println(compression.code());
            System.out.println("Zakodowany: "+dlugosc);
            if (compression.code().size()==0 || compression.code().size()==2 ||compression.code().size()==4 || compression.code().size()==8 || compression.code().size()==16 || compression.code().size()==32 || compression.code().size()==64 )
            {
                System.out.println("Size code:"+compression.code().size());
            }
            else
            {
                System.out.println("Size code: FALSE "+compression.code().size());
            }
            System.out.println("Kodowanie dlugosci:"+ (dlugosc<=str.length()?"True":"False"));
            if (compression.decode(compression.output(),compression.code()).length()==str.length())
            {
                System.out.println("Dlugosc: True");
            }
            else
            {
                System.out.println("Dlugosc: False");
                System.out.println("Input: "+str);
                System.out.println("Output: "+compression.decode(compression.output(),compression.code()));
            }
        }

        System.out.println("GRZEJEMY 4");
        for (String str : test_4_grzanie) {
            System.out.println("--");
            compression.input(str);
            System.out.println("Histogram rozmiar: "+ compression.histogram().size()); //dlugosc  histogramu
            System.out.println("Input Length: "+str.length()); //dlugosc znaku wejsciowego
            int dlugosc = compression.output().length();
            for (String slowo : compression.code()) dlugosc += slowo.length();
            System.out.println(compression.histogram());
            System.out.println(compression.code());
            System.out.println("Zakodowany: "+dlugosc);
            if (compression.code().size()==0 || compression.code().size()==2 ||compression.code().size()==4 || compression.code().size()==8 || compression.code().size()==16 || compression.code().size()==32 || compression.code().size()==64 )
            {
                System.out.println("Size code:"+compression.code().size());
            }
            else
            {
                System.out.println("Size code: FALSE "+compression.code().size());
            }
            System.out.println("Kodowanie dlugosci:"+ (dlugosc<=str.length()?"True":"False"));
            if (compression.decode(compression.output(),compression.code()).length()==str.length())
            {
                System.out.println("Dlugosc: True");
            }
            else
            {
                System.out.println("Dlugosc: False");
                System.out.println("Input: "+str);
                System.out.println("Output: "+compression.decode(compression.output(),compression.code()));
            }
        }




        System.out.println("GRZEJEMY 5");
        for (String str : test_5_grzanie) {
            System.out.println("--");
            compression.input(str);
            System.out.println("Histogram rozmiar: "+ compression.histogram().size()); //dlugosc  histogramu
            System.out.println("Input Length: "+str.length()); //dlugosc znaku wejsciowego
            int dlugosc = compression.output().length();
            for (String slowo : compression.code()) dlugosc += slowo.length();
            System.out.println(compression.histogram());
            System.out.println(compression.code());
            System.out.println("Zakodowany: "+dlugosc);
            if (compression.code().size()==0 || compression.code().size()==2 ||compression.code().size()==4 || compression.code().size()==8 || compression.code().size()==16 || compression.code().size()==32 || compression.code().size()==64 )
            {
                System.out.println("Size code:"+compression.code().size());
            }
            else
            {
                System.out.println("Size code: FALSE "+compression.code().size());
            }
            System.out.println("Kodowanie dlugosci:"+ (dlugosc<=str.length()?"True":"False"));
            if (compression.decode(compression.output(),compression.code()).length()==str.length())
            {
                System.out.println("Dlugosc: True");
            }
            else
            {
                System.out.println("Dlugosc: False");
                System.out.println("Input: "+str);
                System.out.println("Output: "+compression.decode(compression.output(),compression.code()));
            }
        }

        System.out.println("Gigagrznaie");
        for (String str : GIGAG_RZANIE_PROCEOSRA) {
            System.out.println("--");
            compression.input(str);
            System.out.println("Histogram rozmiar: "+ compression.histogram().size()); //dlugosc  histogramu
            System.out.println("Input Length: "+str.length()); //dlugosc znaku wejsciowego
            int dlugosc = compression.output().length();
            for (String slowo : compression.code()) dlugosc += slowo.length();
            System.out.println(compression.histogram());
            System.out.println(compression.code());
            System.out.println("Zakodowany: "+dlugosc);
            if (compression.code().size()==0 || compression.code().size()==2 ||compression.code().size()==4 || compression.code().size()==8 || compression.code().size()==16 || compression.code().size()==32 || compression.code().size()==64 )
            {
                System.out.println("Size code:"+compression.code().size());
            }
            else
            {
                System.out.println("Size code: FALSE "+compression.code().size());
            }
            System.out.println("Kodowanie dlugosci:"+ (dlugosc<=str.length()?"True":"False"));
            if (compression.decode(compression.output(),compression.code()).length()==str.length())
            {
                System.out.println("Dlugosc: True");
            }
            else
            {
                System.out.println("Dlugosc: False");
                System.out.println("Input: "+str);
                System.out.println("Output: "+compression.decode(compression.output(),compression.code()));

            }
        }



        System.out.println("APP2ke");
        for (String str : APP2ke) {
            System.out.println("--");
            compression.input(str);
            System.out.println("Histogram rozmiar: "+ compression.histogram().size()); //dlugosc  histogramu
            System.out.println("Input Length: "+str.length()); //dlugosc znaku wejsciowego
            int dlugosc = compression.output().length();
            for (String slowo : compression.code()) dlugosc += slowo.length();
            System.out.println(compression.histogram());
            System.out.println(compression.code());
            System.out.println("Zakodowany: "+dlugosc);
            if (compression.code().size()==0 || compression.code().size()==2 ||compression.code().size()==4 || compression.code().size()==8 || compression.code().size()==16 || compression.code().size()==32 || compression.code().size()==64 )
            {
                System.out.println("Size code:"+compression.code().size());
            }
            else
            {
                System.out.println("Size code: FALSE "+compression.code().size());
            }
            System.out.println("Kodowanie dlugosci:"+ (dlugosc<=str.length()?"True":"False"));
            if (compression.decode(compression.output(),compression.code()).length()==str.length())
            {
                System.out.println("Dlugosc: True");
            }
            else
            {
                System.out.println("Dlugosc: False");
                System.out.println("Input: "+str);
                System.out.println("Output: "+compression.decode(compression.output(),compression.code()));

            }
        }



    }
};