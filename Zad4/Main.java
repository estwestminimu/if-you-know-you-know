import java.util.ArrayList;
import java.util.List;



public class Main {

    public class GeneratedMethods3 {
        public static void RobiSieCieploWPokoju_1() {
            System.out.println("Robi się ciepło w pokoju 1");
            int rows=13;
            int cols=14;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {106, 165, 32, 59, 207, 233, 125, 95, 224, 170, 195, 0, 135, 186},
                    {27, 122, 63, 24, 209, 80, 105, 226, 70, 25, 219, 129, 145, 117},
                    {182, 177, 3, 9, 255, 99, 42, 140, 88, 233, 144, 115, 226, 145},
                    {49, 135, 148, 186, 123, 72, 133, 233, 176, 80, 69, 85, 156, 219},
                    {84, 59, 5, 171, 15, 203, 151, 102, 20, 1, 119, 34, 175, 133},
                    {239, 244, 172, 188, 246, 117, 92, 133, 160, 60, 129, 8, 13, 101},
                    {11, 108, 54, 76, 149, 96, 230, 255, 20, 177, 139, 213, 223, 233},
                    {128, 226, 32, 135, 176, 184, 209, 240, 38, 167, 25, 56, 222, 129},
                    {169, 244, 56, 141, 92, 237, 180, 224, 32, 182, 125, 243, 235, 215},
                    {136, 162, 237, 151, 212, 218, 111, 146, 251, 14, 132, 119, 114, 238},
                    {187, 100, 87, 87, 55, 140, 6, 7, 250, 221, 32, 231, 33, 28},
                    {204, 228, 0, 118, 119, 145, 154, 70, 37, 240, 197, 138, 79, 224},
                    {223, 24, 148, 252, 175, 49, 240, 204, 215, 179, 88, 113, 37, 98}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(0, 1));
            neighbours.add(new Position2D(1, 1));
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(0, 1));

            Position2D start = new Position2D(4, 9);
            int fillBrightness = 247;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_2() {
            System.out.println("Robi się ciepło w pokoju 2");
            int rows=6;
            int cols=13;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {205, 36, 229, 92, 208, 161, 181, 86, 143, 50, 142, 38, 225},
                    {166, 38, 202, 27, 250, 202, 103, 126, 75, 250, 231, 251, 58},
                    {33, 75, 47, 0, 111, 8, 221, 4, 221, 114, 231, 229, 120},
                    {141, 221, 105, 199, 252, 231, 229, 34, 109, 85, 4, 70, 115},
                    {68, 87, 156, 58, 6, 34, 146, 41, 4, 253, 23, 9, 190},
                    {250, 156, 233, 126, 132, 158, 37, 157, 24, 229, 132, 116, 134}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(-1, -1));

            Position2D start = new Position2D(11, 4);
            int fillBrightness = 148;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_3() {
            System.out.println("Robi się ciepło w pokoju 3");
            int rows=11;
            int cols=14;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {21, 222, 53, 19, 138, 254, 178, 221, 162, 62, 48, 4, 131, 205},
                    {81, 123, 176, 34, 176, 235, 145, 53, 130, 231, 90, 183, 77, 118},
                    {41, 125, 218, 53, 67, 234, 70, 178, 251, 253, 14, 181, 145, 103},
                    {65, 193, 83, 64, 205, 180, 229, 73, 75, 40, 183, 57, 13, 33},
                    {140, 8, 59, 5, 145, 200, 56, 117, 79, 124, 63, 201, 201, 164},
                    {0, 95, 134, 51, 165, 247, 52, 138, 250, 8, 174, 142, 217, 18},
                    {177, 106, 207, 37, 174, 89, 244, 96, 233, 8, 90, 78, 122, 127},
                    {219, 221, 79, 197, 90, 159, 203, 182, 222, 124, 18, 208, 105, 176},
                    {217, 186, 96, 36, 243, 30, 115, 94, 10, 194, 36, 24, 104, 101},
                    {62, 85, 18, 178, 184, 69, 87, 124, 40, 195, 116, 156, 179, 225},
                    {40, 152, 115, 212, 137, 164, 16, 90, 160, 248, 135, 165, 181, 72}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(-1, 1));
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(-1, 0));

            Position2D start = new Position2D(2, 9);
            int fillBrightness = 119;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_4() {
            System.out.println("Robi się ciepło w pokoju 4");
            int rows=7;
            int cols=9;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {132, 56, 178, 236, 195, 209, 40, 171, 92},
                    {106, 162, 54, 10, 222, 212, 64, 1, 71},
                    {151, 80, 138, 77, 160, 227, 110, 143, 107},
                    {90, 223, 211, 139, 169, 95, 144, 81, 70},
                    {202, 145, 204, 158, 83, 7, 80, 80, 167},
                    {98, 71, 44, 17, 8, 96, 79, 234, 119},
                    {226, 62, 126, 215, 181, 33, 237, 182, 49}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(0, 1));
            neighbours.add(new Position2D(-1, 1));
            neighbours.add(new Position2D(1, 1));

            Position2D start = new Position2D(8, 5);
            int fillBrightness = 89;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_5() {
            System.out.println("Robi się ciepło w pokoju 5");
            int rows=8;
            int cols=8;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {6, 13, 60, 123, 36, 209, 19, 95},
                    {142, 222, 233, 85, 25, 26, 74, 13},
                    {112, 8, 133, 81, 162, 50, 141, 151},
                    {217, 180, 48, 229, 108, 247, 138, 3},
                    {137, 14, 239, 235, 212, 167, 249, 26},
                    {226, 80, 199, 220, 48, 242, 85, 148},
                    {154, 171, 240, 255, 56, 109, 124, 127},
                    {195, 123, 126, 168, 102, 156, 138, 19}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(-1, 0));

            Position2D start = new Position2D(2, 4);
            int fillBrightness = 6;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_6() {
            System.out.println("Robi się ciepło w pokoju 6");
            int rows=5;
            int cols=9;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {195, 253, 242, 185, 191, 2, 189, 49, 161},
                    {8, 248, 211, 24, 237, 125, 152, 4, 188},
                    {36, 126, 131, 159, 29, 129, 134, 248, 253},
                    {26, 166, 242, 224, 13, 44, 201, 84, 138},
                    {67, 141, 92, 65, 201, 133, 146, 255, 30}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(1, 1));
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(-1, -1));

            Position2D start = new Position2D(1, 0);
            int fillBrightness = 154;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_7() {
            System.out.println("Robi się ciepło w pokoju 7");
            int rows=7;
            int cols=12;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {125, 199, 23, 149, 179, 188, 148, 231, 175, 17, 119, 42},
                    {25, 142, 254, 40, 80, 2, 163, 79, 99, 233, 190, 50},
                    {10, 228, 81, 202, 232, 168, 190, 86, 239, 160, 87, 161},
                    {2, 113, 7, 14, 100, 83, 92, 18, 137, 148, 201, 59},
                    {48, 240, 167, 20, 129, 160, 172, 250, 117, 74, 200, 31},
                    {221, 0, 218, 201, 175, 172, 173, 131, 156, 215, 167, 17},
                    {218, 157, 186, 220, 10, 80, 91, 100, 173, 50, 179, 87}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(-1, 1));
            neighbours.add(new Position2D(-1, -1));
            neighbours.add(new Position2D(-1, 0));

            Position2D start = new Position2D(11, 0);
            int fillBrightness = 88;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_8() {
            System.out.println("Robi się ciepło w pokoju 8");
            int rows=9;
            int cols=9;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {46, 228, 60, 216, 45, 183, 227, 51, 173},
                    {115, 123, 20, 158, 41, 239, 115, 63, 102},
                    {126, 62, 42, 33, 63, 220, 220, 253, 254},
                    {18, 213, 196, 28, 226, 24, 17, 201, 33},
                    {118, 0, 118, 28, 222, 245, 25, 145, 67},
                    {105, 223, 3, 82, 189, 235, 98, 77, 240},
                    {186, 22, 96, 51, 141, 222, 239, 175, 74},
                    {29, 144, 87, 70, 106, 124, 188, 69, 123},
                    {5, 23, 106, 72, 130, 18, 228, 168, 25}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(-1, 1));
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(-1, -1));
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(1, 1));
            neighbours.add(new Position2D(1, -1));

            Position2D start = new Position2D(5, 2);
            int fillBrightness = 30;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_9() {
            System.out.println("Robi się ciepło w pokoju 9");
            int rows=14;
            int cols=8;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {44, 163, 70, 51, 90, 251, 154, 89},
                    {210, 91, 209, 45, 168, 65, 91, 113},
                    {131, 99, 37, 83, 175, 179, 52, 73},
                    {101, 162, 71, 94, 36, 146, 75, 127},
                    {197, 244, 218, 135, 148, 17, 178, 77},
                    {183, 31, 77, 224, 16, 125, 77, 56},
                    {72, 26, 155, 101, 162, 27, 169, 110},
                    {127, 96, 56, 48, 128, 69, 20, 96},
                    {6, 100, 37, 48, 123, 19, 204, 207},
                    {85, 170, 176, 61, 48, 154, 36, 27},
                    {239, 32, 201, 176, 190, 246, 129, 85},
                    {49, 245, 193, 226, 203, 83, 49, 223},
                    {156, 209, 235, 197, 206, 233, 111, 253},
                    {106, 81, 27, 145, 107, 215, 44, 142}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(1, 1));
            neighbours.add(new Position2D(-1, -1));
            neighbours.add(new Position2D(-1, 1));
            neighbours.add(new Position2D(1, 1));

            Position2D start = new Position2D(2, 1);
            int fillBrightness = 190;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_10() {
            System.out.println("Robi się ciepło w pokoju 10");
            int rows=12;
            int cols=6;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {195, 203, 63, 137, 31, 231},
                    {62, 189, 66, 139, 143, 98},
                    {213, 69, 89, 134, 187, 158},
                    {133, 181, 189, 155, 99, 105},
                    {81, 52, 33, 139, 244, 70},
                    {39, 17, 103, 81, 159, 128},
                    {107, 229, 30, 6, 218, 90},
                    {251, 223, 245, 91, 214, 109},
                    {248, 71, 74, 171, 153, 12},
                    {136, 202, 239, 93, 11, 143},
                    {209, 83, 54, 203, 155, 53},
                    {226, 72, 106, 0, 116, 26}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(0, 1));
            neighbours.add(new Position2D(0, 1));
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(0, 0));

            Position2D start = new Position2D(0, 1);
            int fillBrightness = 194;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_11() {
            System.out.println("Robi się ciepło w pokoju 11");
            int rows=13;
            int cols=10;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {85, 66, 34, 118, 203, 247, 51, 13, 26, 58},
                    {161, 40, 5, 126, 224, 57, 250, 10, 175, 131},
                    {22, 248, 139, 162, 75, 252, 137, 20, 115, 60},
                    {125, 16, 26, 155, 33, 190, 59, 134, 47, 216},
                    {156, 56, 128, 97, 0, 52, 181, 58, 86, 64},
                    {142, 165, 133, 150, 166, 225, 213, 220, 81, 24},
                    {120, 233, 72, 44, 67, 120, 109, 76, 216, 249},
                    {146, 14, 111, 110, 195, 190, 125, 23, 116, 4},
                    {76, 87, 232, 42, 75, 146, 1, 141, 62, 42},
                    {215, 80, 25, 83, 233, 175, 55, 64, 57, 206},
                    {171, 30, 126, 174, 189, 251, 174, 174, 157, 86},
                    {144, 151, 20, 91, 141, 199, 132, 178, 8, 129},
                    {64, 157, 55, 64, 66, 74, 72, 167, 214, 72}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(-1, 1));
            neighbours.add(new Position2D(-1, 1));
            neighbours.add(new Position2D(0, 0));

            Position2D start = new Position2D(3, 2);
            int fillBrightness = 92;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_12() {
            System.out.println("Robi się ciepło w pokoju 12");
            int rows=9;
            int cols=12;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {108, 39, 60, 147, 249, 24, 233, 106, 61, 184, 69, 236},
                    {29, 101, 8, 137, 23, 211, 227, 167, 6, 34, 121, 253},
                    {144, 220, 219, 211, 200, 73, 252, 0, 82, 90, 115, 237},
                    {243, 133, 143, 162, 204, 78, 254, 130, 58, 246, 171, 23},
                    {119, 92, 176, 38, 118, 224, 228, 248, 53, 237, 202, 11},
                    {4, 66, 245, 32, 207, 66, 174, 7, 168, 131, 52, 55},
                    {218, 19, 103, 197, 37, 84, 177, 132, 48, 89, 131, 225},
                    {162, 177, 190, 32, 163, 7, 163, 38, 96, 241, 221, 174},
                    {139, 205, 0, 124, 90, 198, 235, 172, 89, 97, 200, 79}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(0, 1));
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(0, 1));
            neighbours.add(new Position2D(-1, -1));
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(0, 0));

            Position2D start = new Position2D(11, 6);
            int fillBrightness = 18;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_13() {
            System.out.println("Robi się ciepło w pokoju 13");
            int rows=6;
            int cols=14;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {131, 101, 210, 24, 123, 170, 231, 28, 99, 11, 253, 146, 84, 236},
                    {206, 84, 180, 121, 109, 165, 43, 3, 206, 12, 81, 66, 83, 244},
                    {61, 146, 172, 190, 203, 176, 65, 192, 135, 176, 201, 24, 24, 61},
                    {170, 47, 125, 232, 60, 173, 188, 76, 188, 239, 251, 213, 234, 183},
                    {128, 28, 82, 229, 92, 61, 67, 160, 206, 224, 146, 8, 187, 177},
                    {159, 153, 250, 217, 13, 171, 55, 210, 142, 163, 176, 214, 133, 102}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(-1, 1));
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(1, 0));

            Position2D start = new Position2D(8, 5);
            int fillBrightness = 185;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_14() {
            System.out.println("Robi się ciepło w pokoju 14");
            int rows=12;
            int cols=14;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {39, 11, 152, 189, 138, 12, 122, 174, 251, 210, 99, 25, 162, 175},
                    {203, 37, 204, 121, 179, 68, 125, 16, 162, 199, 134, 144, 177, 216},
                    {4, 245, 142, 2, 130, 79, 170, 4, 11, 190, 45, 52, 11, 200},
                    {120, 192, 198, 97, 195, 0, 16, 135, 119, 71, 141, 144, 247, 86},
                    {64, 20, 24, 202, 165, 68, 125, 81, 44, 85, 62, 201, 99, 214},
                    {63, 17, 126, 128, 16, 39, 103, 111, 78, 138, 122, 110, 57, 1},
                    {68, 106, 171, 153, 66, 53, 204, 164, 124, 191, 249, 242, 27, 54},
                    {142, 199, 115, 217, 186, 40, 78, 120, 242, 172, 93, 85, 84, 201},
                    {134, 29, 173, 150, 247, 212, 56, 40, 234, 10, 87, 27, 74, 110},
                    {180, 194, 160, 96, 7, 184, 46, 115, 245, 174, 222, 117, 138, 232},
                    {29, 73, 96, 130, 178, 49, 187, 135, 61, 193, 134, 133, 248, 158},
                    {139, 68, 88, 89, 39, 252, 44, 16, 73, 72, 230, 72, 54, 60}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(-1, -1));
            neighbours.add(new Position2D(0, -1));

            Position2D start = new Position2D(4, 8);
            int fillBrightness = 117;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_15() {
            System.out.println("Robi się ciepło w pokoju 15");
            int rows=9;
            int cols=8;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {229, 49, 230, 114, 174, 85, 109, 61},
                    {119, 47, 201, 83, 190, 71, 160, 226},
                    {144, 199, 144, 40, 136, 2, 254, 127},
                    {52, 93, 97, 87, 109, 180, 76, 236},
                    {106, 191, 161, 21, 208, 71, 199, 87},
                    {197, 118, 174, 174, 218, 16, 95, 160},
                    {22, 70, 16, 98, 203, 101, 39, 184},
                    {242, 126, 71, 15, 233, 17, 111, 43},
                    {182, 69, 185, 157, 240, 59, 70, 195}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(-1, 1));
            neighbours.add(new Position2D(0, 1));
            neighbours.add(new Position2D(-1, 1));
            neighbours.add(new Position2D(1, 1));

            Position2D start = new Position2D(5, 2);
            int fillBrightness = 15;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_16() {
            System.out.println("Robi się ciepło w pokoju 16");
            int rows=11;
            int cols=5;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {215, 156, 126, 57, 196},
                    {80, 30, 120, 237, 42},
                    {20, 168, 86, 109, 203},
                    {151, 176, 174, 86, 197},
                    {127, 9, 1, 71, 165},
                    {115, 69, 36, 151, 187},
                    {82, 135, 115, 51, 197},
                    {80, 255, 67, 239, 17},
                    {240, 209, 158, 42, 48},
                    {80, 195, 51, 7, 139},
                    {113, 132, 85, 112, 75}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(0, -1));

            Position2D start = new Position2D(3, 5);
            int fillBrightness = 196;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_17() {
            System.out.println("Robi się ciepło w pokoju 17");
            int rows=6;
            int cols=13;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {181, 98, 109, 219, 160, 136, 92, 245, 175, 183, 68, 71, 169},
                    {35, 164, 103, 28, 45, 180, 148, 136, 120, 104, 20, 155, 12},
                    {141, 25, 156, 205, 145, 97, 240, 17, 50, 100, 190, 142, 135},
                    {187, 27, 194, 49, 13, 173, 87, 9, 201, 132, 160, 165, 129},
                    {14, 215, 170, 138, 144, 210, 60, 246, 210, 84, 93, 195, 224},
                    {20, 222, 66, 45, 248, 244, 175, 147, 66, 71, 178, 61, 166}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(1, 0));

            Position2D start = new Position2D(6, 0);
            int fillBrightness = 64;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_18() {
            System.out.println("Robi się ciepło w pokoju 18");
            int rows=11;
            int cols=8;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {99, 211, 97, 57, 131, 208, 145, 1},
                    {240, 144, 87, 70, 196, 209, 195, 209},
                    {148, 247, 86, 92, 17, 113, 123, 82},
                    {239, 161, 252, 131, 113, 240, 216, 185},
                    {179, 9, 190, 215, 121, 39, 160, 210},
                    {186, 23, 21, 27, 191, 196, 29, 46},
                    {96, 215, 178, 161, 101, 106, 80, 68},
                    {222, 135, 136, 214, 218, 216, 120, 228},
                    {113, 70, 115, 213, 71, 214, 161, 36},
                    {161, 233, 60, 223, 166, 175, 117, 21},
                    {61, 133, 80, 77, 53, 120, 248, 165}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(1, 0));

            Position2D start = new Position2D(2, 7);
            int fillBrightness = 18;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_19() {
            System.out.println("Robi się ciepło w pokoju 19");
            int rows=12;
            int cols=8;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {70, 193, 231, 254, 134, 213, 89, 97},
                    {173, 237, 164, 226, 183, 56, 208, 222},
                    {154, 137, 40, 106, 19, 254, 24, 54},
                    {191, 133, 85, 215, 219, 58, 109, 246},
                    {13, 157, 164, 57, 183, 122, 195, 176},
                    {219, 244, 51, 32, 111, 143, 227, 245},
                    {168, 93, 4, 183, 151, 126, 243, 8},
                    {147, 177, 241, 128, 125, 243, 250, 240},
                    {29, 215, 212, 99, 161, 178, 115, 229},
                    {238, 157, 165, 140, 182, 134, 183, 99},
                    {217, 45, 152, 75, 211, 83, 100, 194},
                    {1, 45, 26, 100, 107, 230, 240, 246}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(-1, 1));
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(1, 1));
            neighbours.add(new Position2D(1, 0));

            Position2D start = new Position2D(5, 7);
            int fillBrightness = 125;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void RobiSieCieploWPokoju_20() {
            System.out.println("Robi się ciepło w pokoju 20");
            int rows=11;
            int cols=5;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {126, 236, 207, 123, 147},
                    {86, 74, 27, 243, 222},
                    {59, 142, 115, 195, 131},
                    {28, 167, 134, 155, 170},
                    {59, 120, 238, 112, 171},
                    {225, 197, 151, 95, 69},
                    {131, 131, 178, 222, 172},
                    {62, 58, 172, 132, 19},
                    {102, 96, 142, 3, 105},
                    {44, 145, 216, 141, 85},
                    {126, 163, 155, 108, 104}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(0, 1));
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(1, 1));
            neighbours.add(new Position2D(-1, 1));

            Position2D start = new Position2D(4, 9);
            int fillBrightness = 239;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    //System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

    }



    public class GeneratedMethods2 {
        public static void SuperMegaGrzanie_1() {
            System.out.println("Super Mega Grzanie 1");
            int rows=8;
            int cols=8;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {103, 203, 211, 52, 217, 182, 240, 105},
                    {193, 246, 247, 32, 61, 150, 58, 68},
                    {231, 34, 100, 234, 38, 127, 245, 255},
                    {128, 130, 148, 32, 160, 57, 119, 177},
                    {203, 23, 163, 58, 31, 121, 235, 33},
                    {208, 109, 82, 210, 192, 86, 181, 230},
                    {154, 118, 173, 80, 53, 72, 58, 49},
                    {7, 78, 49, 105, 49, 90, 164, 112}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(-1, 1));
            neighbours.add(new Position2D(0, 1));
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(1, 0));

            Position2D start = new Position2D(4, 5);
            int fillBrightness = 215;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_2() {
            System.out.println("Super Mega Grzanie 2");
            int rows=5;
            int cols=5;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {73, 64, 246, 177, 195},
                    {157, 55, 68, 28, 108},
                    {34, 179, 192, 93, 133},
                    {55, 168, 169, 26, 39},
                    {218, 107, 230, 40, 102}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(1, 1));
            neighbours.add(new Position2D(0, 1));
            neighbours.add(new Position2D(1, 1));
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(-1, 1));

            Position2D start = new Position2D(3, 0);
            int fillBrightness = 193;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_3() {
            System.out.println("Super Mega Grzanie 3");
            int rows=7;
            int cols=8;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {83, 145, 72, 142, 122, 85, 39, 115},
                    {73, 58, 224, 162, 102, 249, 14, 85},
                    {14, 125, 170, 97, 12, 209, 201, 209},
                    {236, 19, 234, 250, 155, 206, 198, 202},
                    {67, 228, 107, 123, 137, 29, 131, 116},
                    {50, 119, 240, 4, 75, 249, 187, 222},
                    {243, 244, 31, 95, 215, 137, 119, 132}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(1, 1));

            Position2D start = new Position2D(0, 5);
            int fillBrightness = 214;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_4() {
            System.out.println("Super Mega Grzanie 4");
            int rows=13;
            int cols=13;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {204, 60, 19, 43, 177, 247, 28, 151, 249, 95, 179, 187, 148},
                    {50, 205, 12, 84, 20, 94, 96, 253, 60, 4, 183, 201, 174},
                    {67, 188, 99, 216, 61, 27, 231, 21, 69, 251, 5, 131, 53},
                    {39, 246, 15, 8, 135, 164, 125, 228, 220, 218, 135, 13, 159},
                    {15, 169, 14, 225, 11, 96, 198, 210, 125, 217, 164, 97, 35},
                    {82, 104, 168, 221, 33, 246, 199, 107, 82, 96, 116, 161, 228},
                    {180, 135, 118, 239, 243, 198, 225, 17, 61, 17, 75, 247, 201},
                    {185, 135, 244, 244, 211, 145, 17, 35, 253, 41, 254, 81, 102},
                    {189, 21, 64, 61, 243, 100, 28, 35, 74, 91, 228, 148, 204},
                    {100, 241, 59, 103, 210, 110, 168, 137, 199, 27, 207, 110, 197},
                    {206, 92, 68, 67, 64, 82, 171, 78, 169, 37, 68, 135, 248},
                    {11, 10, 58, 124, 213, 125, 230, 45, 168, 56, 87, 12, 245},
                    {134, 214, 192, 231, 158, 246, 208, 94, 119, 193, 170, 209, 165}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(-1, -1));

            Position2D start = new Position2D(5, 12);
            int fillBrightness = 39;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_5() {
            System.out.println("Super Mega Grzanie 5");
            int rows=9;
            int cols=7;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {232, 114, 172, 87, 54, 102, 40},
                    {106, 1, 139, 146, 219, 115, 54},
                    {78, 67, 251, 197, 202, 68, 78},
                    {202, 37, 179, 254, 95, 154, 217},
                    {221, 167, 253, 77, 217, 194, 27},
                    {50, 252, 84, 29, 109, 161, 3},
                    {253, 42, 171, 186, 180, 203, 6},
                    {180, 91, 54, 235, 191, 61, 69},
                    {58, 201, 139, 231, 202, 33, 65}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(-1, -1));
            neighbours.add(new Position2D(-1, -1));
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(1, 1));

            Position2D start = new Position2D(2, 0);
            int fillBrightness = 21;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_6() {
            System.out.println("Super Mega Grzanie 6");
            int rows=5;
            int cols=11;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {79, 238, 6, 2, 43, 131, 103, 240, 224, 24, 214},
                    {177, 247, 94, 86, 243, 4, 66, 214, 220, 186, 255},
                    {12, 203, 216, 122, 180, 89, 32, 154, 95, 39, 30},
                    {255, 133, 167, 37, 200, 245, 250, 9, 155, 97, 203},
                    {59, 181, 29, 107, 196, 125, 37, 41, 201, 132, 203}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(-1, 1));
            neighbours.add(new Position2D(0, 0));

            Position2D start = new Position2D(6, 1);
            int fillBrightness = 4;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_7() {
            System.out.println("Super Mega Grzanie 7");
            int rows=9;
            int cols=7;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {166, 51, 77, 82, 116, 23, 251},
                    {197, 54, 45, 60, 242, 113, 21},
                    {60, 11, 109, 119, 58, 53, 98},
                    {240, 98, 69, 212, 145, 116, 27},
                    {134, 240, 124, 97, 129, 100, 8},
                    {62, 74, 80, 251, 189, 216, 249},
                    {71, 83, 252, 142, 10, 163, 236},
                    {72, 18, 149, 126, 243, 77, 35},
                    {185, 223, 228, 215, 84, 2, 88}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(1, 1));
            neighbours.add(new Position2D(1, 1));
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(0, 1));

            Position2D start = new Position2D(1, 6);
            int fillBrightness = 44;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_8() {
            System.out.println("Super Mega Grzanie 8");
            int rows=6;
            int cols=7;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {130, 57, 201, 191, 45, 164, 248},
                    {182, 106, 26, 217, 189, 149, 209},
                    {124, 190, 102, 90, 151, 229, 166},
                    {62, 32, 78, 156, 16, 11, 230},
                    {197, 62, 121, 18, 190, 171, 224},
                    {26, 122, 245, 56, 25, 213, 22}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(1, 1));
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(1, 0));

            Position2D start = new Position2D(0, 2);
            int fillBrightness = 16;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_9() {
            System.out.println("Super Mega Grzanie 9");
            int rows=10;
            int cols=10;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {188, 183, 217, 170, 46, 76, 46, 182, 236, 244},
                    {200, 195, 139, 70, 85, 237, 223, 74, 64, 213},
                    {139, 66, 168, 239, 158, 245, 140, 218, 7, 94},
                    {178, 55, 254, 156, 67, 90, 224, 228, 190, 230},
                    {76, 89, 113, 157, 76, 101, 59, 221, 0, 221},
                    {45, 219, 223, 164, 196, 112, 160, 144, 204, 253},
                    {148, 156, 60, 96, 194, 142, 29, 130, 17, 114},
                    {2, 246, 77, 7, 253, 32, 211, 205, 37, 74},
                    {5, 123, 115, 122, 167, 127, 12, 175, 21, 198},
                    {236, 56, 60, 68, 120, 168, 104, 215, 12, 169}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(1, 1));
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(0, 1));

            Position2D start = new Position2D(2, 3);
            int fillBrightness = 89;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_10() {
            System.out.println("Super Mega Grzanie 10");
            int rows=11;
            int cols=6;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {110, 167, 40, 198, 57, 179},
                    {16, 107, 111, 6, 139, 228},
                    {155, 163, 68, 122, 83, 242},
                    {77, 146, 159, 150, 64, 6},
                    {181, 176, 73, 150, 94, 103},
                    {244, 75, 235, 201, 45, 73},
                    {235, 104, 129, 160, 205, 35},
                    {76, 165, 133, 73, 122, 209},
                    {90, 198, 211, 90, 43, 207},
                    {169, 158, 103, 121, 53, 147},
                    {10, 110, 254, 9, 190, 240}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(-1, -1));
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(-1, 1));

            Position2D start = new Position2D(4, 3);
            int fillBrightness = 13;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_11() {
            System.out.println("Super Mega Grzanie 11");
            int rows=12;
            int cols=12;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {97, 255, 246, 136, 220, 98, 35, 23, 4, 96, 204, 92},
                    {67, 103, 56, 105, 133, 122, 73, 80, 128, 88, 250, 156},
                    {2, 23, 51, 176, 103, 213, 48, 242, 225, 216, 58, 224},
                    {41, 29, 37, 195, 128, 118, 230, 29, 101, 250, 233, 142},
                    {38, 97, 190, 60, 213, 136, 59, 216, 129, 128, 176, 152},
                    {85, 19, 74, 171, 106, 114, 235, 50, 239, 11, 155, 14},
                    {197, 16, 203, 116, 184, 34, 142, 72, 38, 98, 17, 233},
                    {92, 55, 235, 5, 224, 231, 98, 31, 203, 175, 155, 213},
                    {174, 161, 24, 93, 11, 222, 69, 208, 1, 37, 28, 112},
                    {251, 200, 77, 44, 219, 72, 2, 221, 99, 45, 137, 0},
                    {225, 149, 164, 169, 234, 90, 100, 228, 239, 190, 67, 64},
                    {172, 105, 25, 95, 0, 253, 51, 117, 216, 84, 246, 135}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(1, 1));
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(0, -1));

            Position2D start = new Position2D(7, 6);
            int fillBrightness = 110;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_12() {
            System.out.println("Super Mega Grzanie 12");
            int rows=13;
            int cols=11;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {119, 244, 125, 97, 172, 180, 244, 165, 16, 18, 119},
                    {38, 114, 221, 222, 66, 50, 242, 41, 154, 46, 183},
                    {114, 28, 22, 174, 151, 212, 141, 99, 204, 204, 73},
                    {100, 6, 241, 145, 147, 83, 105, 72, 21, 232, 184},
                    {21, 198, 133, 169, 198, 147, 146, 108, 241, 131, 68},
                    {96, 98, 56, 228, 95, 154, 186, 76, 30, 163, 6},
                    {9, 134, 100, 205, 216, 15, 220, 132, 84, 38, 214},
                    {62, 221, 87, 150, 0, 141, 126, 198, 87, 21, 187},
                    {170, 2, 251, 101, 100, 240, 173, 68, 226, 129, 43},
                    {89, 34, 31, 13, 250, 140, 237, 219, 5, 71, 47},
                    {165, 248, 216, 165, 100, 15, 67, 134, 136, 180, 31},
                    {209, 152, 14, 58, 161, 11, 45, 12, 138, 33, 199},
                    {125, 102, 123, 177, 30, 130, 231, 84, 147, 46, 224}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(0, 1));
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(0, 1));
            neighbours.add(new Position2D(-1, -1));

            Position2D start = new Position2D(9, 3);
            int fillBrightness = 11;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_13() {
            System.out.println("Super Mega Grzanie 13");
            int rows=9;
            int cols=10;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {49, 172, 191, 159, 7, 219, 159, 167, 187, 233},
                    {243, 193, 91, 213, 117, 248, 249, 68, 68, 151},
                    {39, 240, 125, 224, 247, 28, 231, 225, 196, 70},
                    {169, 90, 174, 208, 36, 70, 222, 2, 24, 150},
                    {44, 208, 254, 208, 219, 29, 76, 77, 152, 16},
                    {154, 132, 215, 38, 237, 159, 214, 206, 146, 47},
                    {62, 10, 8, 212, 172, 216, 191, 104, 5, 48},
                    {165, 99, 122, 208, 230, 73, 58, 151, 127, 166},
                    {97, 222, 165, 86, 176, 82, 90, 45, 134, 184}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(0, 1));

            Position2D start = new Position2D(8, 3);
            int fillBrightness = 28;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_14() {
            System.out.println("Super Mega Grzanie 14");
            int rows=10;
            int cols=14;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {152, 70, 230, 100, 247, 7, 85, 2, 147, 149, 136, 73, 54, 193},
                    {228, 11, 97, 109, 228, 112, 212, 125, 209, 99, 159, 81, 121, 200},
                    {252, 116, 40, 126, 141, 98, 14, 232, 163, 89, 215, 95, 16, 135},
                    {133, 55, 59, 113, 73, 32, 44, 120, 0, 96, 196, 237, 254, 198},
                    {84, 163, 88, 248, 87, 54, 220, 17, 20, 76, 156, 79, 146, 111},
                    {252, 25, 22, 98, 240, 152, 16, 138, 170, 141, 100, 108, 100, 74},
                    {64, 42, 220, 198, 177, 141, 88, 219, 153, 128, 20, 5, 96, 17},
                    {72, 26, 63, 201, 246, 135, 64, 173, 61, 165, 207, 191, 98, 7},
                    {17, 198, 79, 136, 142, 247, 60, 131, 107, 145, 101, 226, 74, 92},
                    {188, 97, 147, 216, 153, 186, 62, 186, 72, 98, 174, 58, 218, 175}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(0, -1));

            Position2D start = new Position2D(11, 6);
            int fillBrightness = 165;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_15() {
            System.out.println("Super Mega Grzanie 15");
            int rows=14;
            int cols=9;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {50, 50, 117, 181, 44, 32, 83, 181, 72},
                    {96, 41, 39, 32, 193, 104, 184, 255, 133},
                    {110, 213, 5, 192, 168, 178, 147, 36, 79},
                    {91, 149, 90, 40, 54, 158, 113, 128, 254},
                    {75, 148, 94, 2, 7, 193, 210, 81, 204},
                    {227, 162, 139, 77, 235, 22, 94, 241, 99},
                    {112, 132, 96, 99, 195, 165, 115, 174, 17},
                    {76, 170, 73, 55, 27, 81, 95, 13, 214},
                    {114, 68, 80, 150, 58, 24, 108, 18, 58},
                    {78, 236, 85, 29, 4, 174, 223, 130, 35},
                    {68, 197, 19, 157, 73, 116, 206, 4, 115},
                    {166, 210, 9, 237, 207, 100, 171, 98, 80},
                    {218, 129, 16, 50, 48, 239, 174, 239, 230},
                    {30, 174, 212, 250, 64, 219, 116, 59, 35}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(-1, 1));
            neighbours.add(new Position2D(-1, -1));

            Position2D start = new Position2D(0, 6);
            int fillBrightness = 130;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_16() {
            System.out.println("Super Mega Grzanie 16");
            int rows=6;
            int cols=10;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {185, 126, 9, 222, 192, 97, 142, 41, 18, 233},
                    {72, 132, 252, 239, 85, 169, 68, 238, 169, 97},
                    {148, 148, 16, 37, 56, 225, 31, 229, 199, 56},
                    {136, 16, 252, 44, 247, 53, 189, 44, 7, 94},
                    {70, 53, 192, 115, 11, 120, 79, 177, 121, 188},
                    {49, 138, 226, 34, 164, 11, 198, 191, 103, 91}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(-1, 1));
            neighbours.add(new Position2D(1, 1));
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(-1, -1));
            neighbours.add(new Position2D(1, 0));

            Position2D start = new Position2D(0, 4);
            int fillBrightness = 226;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_17() {
            System.out.println("Super Mega Grzanie 17");
            int rows=12;
            int cols=7;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {162, 244, 198, 241, 20, 122, 11},
                    {252, 201, 208, 32, 36, 41, 231},
                    {32, 96, 176, 162, 103, 56, 131},
                    {57, 238, 205, 8, 151, 35, 190},
                    {57, 225, 27, 255, 119, 82, 194},
                    {214, 182, 75, 200, 244, 143, 157},
                    {112, 141, 116, 186, 90, 85, 198},
                    {127, 255, 188, 255, 159, 171, 122},
                    {21, 111, 71, 79, 142, 215, 242},
                    {92, 218, 193, 69, 32, 152, 9},
                    {213, 66, 137, 240, 97, 39, 179},
                    {22, 224, 24, 74, 235, 9, 27}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(1, 1));

            Position2D start = new Position2D(2, 5);
            int fillBrightness = 181;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_18() {
            System.out.println("Super Mega Grzanie 18");
            int rows=8;
            int cols=8;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {130, 187, 211, 191, 155, 31, 141, 251},
                    {169, 130, 1, 139, 191, 50, 0, 86},
                    {2, 233, 152, 66, 2, 164, 164, 38},
                    {230, 13, 171, 36, 113, 7, 161, 37},
                    {186, 38, 200, 152, 175, 92, 68, 172},
                    {255, 221, 227, 232, 85, 215, 243, 143},
                    {166, 233, 38, 155, 170, 230, 224, 118},
                    {197, 197, 123, 163, 106, 87, 211, 127}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(0, -1));

            Position2D start = new Position2D(6, 0);
            int fillBrightness = 119;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_19() {
            System.out.println("Super Mega Grzanie 19");
            int rows=9;
            int cols=14;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {8, 130, 0, 142, 254, 249, 53, 184, 19, 105, 141, 97, 238, 131},
                    {124, 97, 43, 91, 149, 92, 114, 195, 120, 252, 130, 196, 108, 26},
                    {43, 219, 141, 127, 96, 219, 209, 214, 229, 2, 68, 142, 143, 108},
                    {43, 252, 146, 94, 194, 122, 86, 176, 63, 111, 14, 7, 130, 215},
                    {50, 120, 95, 68, 229, 60, 14, 27, 190, 120, 61, 155, 247, 199},
                    {117, 214, 166, 218, 247, 86, 127, 54, 45, 97, 164, 130, 167, 215},
                    {199, 237, 6, 233, 110, 6, 218, 204, 16, 49, 82, 75, 102, 205},
                    {4, 207, 127, 41, 56, 237, 178, 69, 217, 187, 11, 153, 153, 46},
                    {52, 174, 183, 61, 43, 87, 193, 34, 144, 65, 137, 196, 243, 90}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(0, 0));

            Position2D start = new Position2D(8, 7);
            int fillBrightness = 112;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void SuperMegaGrzanie_20() {
            System.out.println("Super Mega Grzanie 20");
            int rows=7;
            int cols=7;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {172, 252, 106, 4, 144, 156, 170},
                    {36, 5, 64, 6, 130, 177, 191},
                    {234, 251, 205, 23, 93, 77, 47},
                    {21, 12, 163, 227, 236, 188, 149},
                    {203, 205, 105, 64, 45, 187, 206},
                    {158, 90, 123, 231, 68, 161, 170},
                    {115, 68, 38, 131, 48, 211, 122}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(0, -1));
            neighbours.add(new Position2D(1, 1));
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(0, 0));

            Position2D start = new Position2D(3, 6);
            int fillBrightness = 11;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

    }


    public class GeneratedMethods {
        public static void Glowa_w_betoniarce_1() {
            System.out.println("Głowa w betoniarce 1");
            int rows=7;
            int cols=6;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {17, 39, 156, 39, 112, 142},
                    {124, 45, 166, 216, 115, 31},
                    {224, 250, 219, 107, 27, 100},
                    {216, 6, 14, 74, 93, 28},
                    {117, 59, 211, 132, 106, 1},
                    {225, 53, 153, 186, 252, 229},
                    {226, 143, 87, 200, 127, 61}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(0, 1));
            neighbours.add(new Position2D(0, -2));
            neighbours.add(new Position2D(-1, 1));
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(0, 0));

            Position2D start = new Position2D(1, 1);
            int fillBrightness = 133;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void Glowa_w_betoniarce_2() {
            System.out.println("Głowa w betoniarce 2");
            int rows=5;
            int cols=14;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {186, 13, 137, 149, 37, 139, 104, 108, 164, 242, 137, 63, 145, 76},
                    {19, 161, 137, 89, 198, 103, 23, 65, 25, 100, 198, 129, 27, 246},
                    {224, 55, 242, 54, 137, 168, 225, 76, 69, 143, 160, 71, 145, 64},
                    {78, 81, 185, 185, 42, 7, 10, 173, 194, 27, 120, 188, 143, 190},
                    {245, 217, 143, 11, 83, 213, 249, 171, 106, 55, 216, 49, 175, 53}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(0, 1));
            neighbours.add(new Position2D(1, 1));
            neighbours.add(new Position2D(-1, -1));
            neighbours.add(new Position2D(1, 3));

            Position2D start = new Position2D(7, 2);
            int fillBrightness = 189;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void Glowa_w_betoniarce_3() {
            System.out.println("Głowa w betoniarce 3");
            int rows=14;
            int cols=6;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {127, 151, 101, 12, 132, 237},
                    {91, 89, 157, 216, 111, 100},
                    {174, 98, 211, 249, 149, 140},
                    {149, 120, 220, 108, 80, 22},
                    {100, 201, 205, 111, 192, 50},
                    {116, 246, 92, 54, 145, 127},
                    {4, 167, 144, 145, 14, 52},
                    {166, 70, 184, 64, 122, 230},
                    {51, 12, 216, 25, 148, 28},
                    {197, 187, 171, 135, 92, 225},
                    {117, 152, 7, 191, 43, 50},
                    {136, 31, 190, 9, 216, 166},
                    {202, 149, 60, 177, 136, 236},
                    {13, 224, 177, 82, 231, 173}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(-1, 1));
            neighbours.add(new Position2D(1, -3));

            Position2D start = new Position2D(2, 5);
            int fillBrightness = 27;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void Glowa_w_betoniarce_4() {
            System.out.println("Głowa w betoniarce 4");
            int rows=12;
            int cols=6;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {253, 41, 103, 165, 245, 27},
                    {147, 96, 67, 16, 93, 222},
                    {167, 99, 119, 168, 207, 30},
                    {56, 154, 248, 50, 234, 118},
                    {122, 67, 18, 173, 241, 167},
                    {215, 246, 223, 108, 140, 70},
                    {32, 120, 158, 78, 244, 121},
                    {251, 115, 168, 225, 144, 24},
                    {156, 5, 40, 36, 9, 108},
                    {153, 72, 218, 56, 98, 22},
                    {180, 206, 4, 200, 177, 239},
                    {146, 162, 27, 238, 220, 121}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(0, 3));
            neighbours.add(new Position2D(-1, 0));
            neighbours.add(new Position2D(2, -2));
            neighbours.add(new Position2D(3, 0));

            Position2D start = new Position2D(4, 5);
            int fillBrightness = 59;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void Glowa_w_betoniarce_5() {
            System.out.println("Głowa w betoniarce 5");
            int rows=6;
            int cols=12;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {34, 195, 127, 247, 48, 20, 116, 195, 239, 21, 71, 107},
                    {214, 206, 240, 43, 137, 228, 100, 88, 129, 113, 57, 128},
                    {28, 157, 3, 17, 243, 220, 14, 48, 175, 81, 174, 42},
                    {122, 128, 147, 9, 180, 43, 210, 104, 42, 195, 3, 190},
                    {185, 221, 54, 24, 16, 14, 92, 155, 43, 175, 183, 95},
                    {37, 14, 119, 86, 147, 166, 182, 4, 90, 48, 233, 26}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(-2, 2));
            neighbours.add(new Position2D(1, -1));
            neighbours.add(new Position2D(0, 0));
            neighbours.add(new Position2D(-1, -2));
            neighbours.add(new Position2D(-1, -1));

            Position2D start = new Position2D(5, 3);
            int fillBrightness = 230;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void Glowa_w_betoniarce_6() {
            System.out.println("Głowa w betoniarce 6");
            int rows=11;
            int cols=8;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {117, 235, 230, 201, 52, 160, 62, 192},
                    {176, 124, 208, 183, 130, 120, 118, 240},
                    {42, 198, 1, 114, 208, 42, 39, 51},
                    {62, 19, 136, 83, 178, 74, 159, 9},
                    {134, 68, 38, 200, 246, 71, 204, 180},
                    {21, 208, 13, 196, 135, 230, 112, 27},
                    {79, 231, 238, 46, 0, 42, 60, 74},
                    {177, 113, 194, 237, 210, 239, 118, 203},
                    {149, 105, 28, 39, 7, 137, 82, 117},
                    {139, 57, 143, 82, 222, 104, 190, 6},
                    {9, 230, 137, 152, 57, 145, 105, 202}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(-1, 1));
            neighbours.add(new Position2D(1, 0));
            neighbours.add(new Position2D(1, -2));
            neighbours.add(new Position2D(0, 1));
            neighbours.add(new Position2D(-1, 2));
            neighbours.add(new Position2D(-1, 3));
            neighbours.add(new Position2D(-1, -16));

            Position2D start = new Position2D(4, 8);
            int fillBrightness = 227;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

        public static void Glowa_w_betoniarce_7() {
            System.out.println("Głowa w betoniarce 7");
            int rows=11;
            int cols=12;
            SimpleCanvas canvas = new SimpleCanvas(rows, cols);

            int[][] brightnessValues = {
                    {210, 76, 65, 178, 39, 78, 120, 41, 44, 31, 7, 156},
                    {145, 88, 64, 17, 252, 129, 51, 104, 185, 212, 13, 38},
                    {184, 237, 82, 235, 139, 74, 75, 109, 24, 222, 104, 190},
                    {197, 65, 91, 188, 238, 151, 168, 238, 104, 142, 75, 12},
                    {142, 199, 147, 252, 192, 182, 111, 253, 84, 14, 192, 189},
                    {91, 243, 207, 134, 8, 140, 103, 4, 137, 43, 182, 227},
                    {4, 186, 185, 24, 210, 151, 103, 210, 129, 180, 251, 104},
                    {100, 114, 151, 181, 239, 82, 146, 114, 120, 59, 206, 236},
                    {190, 136, 73, 10, 135, 181, 163, 170, 14, 206, 190, 81},
                    {242, 244, 44, 144, 189, 30, 246, 128, 139, 246, 24, 180},
                    {1, 228, 10, 228, 26, 187, 39, 236, 235, 90, 218, 3}
            };

            List<Position2D> neighbours = new ArrayList<>();
            neighbours.add(new Position2D(-1, -11));
            neighbours.add(new Position2D(-1, 4));
            neighbours.add(new Position2D(1, 3));

            Position2D start = new Position2D(10, 5);
            int fillBrightness = 236;

            System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
            for (int i = 0; i < brightnessValues.length; i++) {
                for (int j = 0; j < brightnessValues[i].length; j++) {
                    canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                    ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
                }
            }
            System.out.println("Canvas before fill:");
            canvas.printCanvas();

            CanvasFill filler = new CanvasFill();
            filler.fill(canvas, neighbours, start, fillBrightness);

            System.out.println("Canvas after fill:");
            canvas.printCanvas();
        }

    }


    public static void main(String[] args) {



        Glowa_w_betoniarce_1();
        grzeje_Jak_w_Stegnie();
        Grzeje_Grzeje_PROCESOR();
        Glowa_w_betoniarce();
        EEEEE_iiii_aaaaa_ee();

        GeneratedMethods2.SuperMegaGrzanie_1();
        GeneratedMethods2.SuperMegaGrzanie_2();
        GeneratedMethods2.SuperMegaGrzanie_3();
        GeneratedMethods2.SuperMegaGrzanie_4();
        GeneratedMethods2.SuperMegaGrzanie_5();
        GeneratedMethods2.SuperMegaGrzanie_6();
        GeneratedMethods2.SuperMegaGrzanie_7();
        GeneratedMethods2.SuperMegaGrzanie_8();
        GeneratedMethods2.SuperMegaGrzanie_9();
        GeneratedMethods2.SuperMegaGrzanie_10();
        GeneratedMethods2.SuperMegaGrzanie_11();
        GeneratedMethods2.SuperMegaGrzanie_12();
        GeneratedMethods2.SuperMegaGrzanie_13();
        GeneratedMethods2.SuperMegaGrzanie_15();
        GeneratedMethods2.SuperMegaGrzanie_16();
        GeneratedMethods2.SuperMegaGrzanie_17();
        GeneratedMethods2.SuperMegaGrzanie_18();
        GeneratedMethods2.SuperMegaGrzanie_19();
        GeneratedMethods2.SuperMegaGrzanie_20();




        GeneratedMethods3.RobiSieCieploWPokoju_1();
        GeneratedMethods3.RobiSieCieploWPokoju_2();
        GeneratedMethods3.RobiSieCieploWPokoju_3();
        GeneratedMethods3.RobiSieCieploWPokoju_4();
        GeneratedMethods3.RobiSieCieploWPokoju_5();
        GeneratedMethods3.RobiSieCieploWPokoju_6();
        GeneratedMethods3.RobiSieCieploWPokoju_7();
        GeneratedMethods3.RobiSieCieploWPokoju_8();
        GeneratedMethods3.RobiSieCieploWPokoju_9();
        GeneratedMethods3.RobiSieCieploWPokoju_10();
        GeneratedMethods3.RobiSieCieploWPokoju_11();
        GeneratedMethods3.RobiSieCieploWPokoju_12();
        GeneratedMethods3.RobiSieCieploWPokoju_13();
        GeneratedMethods3.RobiSieCieploWPokoju_15();
        GeneratedMethods3.RobiSieCieploWPokoju_16();
        GeneratedMethods3.RobiSieCieploWPokoju_17();
        GeneratedMethods3.RobiSieCieploWPokoju_18();
        GeneratedMethods3.RobiSieCieploWPokoju_19();
        GeneratedMethods3.RobiSieCieploWPokoju_20();





        GeneratedMethods.Glowa_w_betoniarce_1();
        GeneratedMethods.Glowa_w_betoniarce_2();
        GeneratedMethods.Glowa_w_betoniarce_3();
        GeneratedMethods.Glowa_w_betoniarce_4();
        GeneratedMethods.Glowa_w_betoniarce_5();
        GeneratedMethods.Glowa_w_betoniarce_6();
        GeneratedMethods.Glowa_w_betoniarce_7();





    }
    public static void Glowa_w_betoniarce_1() {
        System.out.println("Głowa w betoniarce 1");
        int rows=4;
        int cols=3;
        SimpleCanvas canvas = new SimpleCanvas(rows, cols);

        int[][] brightnessValues = {
                {70, 105, 127},
                {129, 66, 232},
                {206, 175, 150},
                {243, 232, 69}
        };

        System.out.println(brightnessValues.length + " " + brightnessValues[0].length);
        for (int i = 0; i < brightnessValues.length; i++) {
            for (int j = 0; j < brightnessValues[i].length; j++) {
                canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
                ////System.out.print(i + " " + j + " " + brightnessValues[i][j] + ",");
            }
        }
        System.out.println("Canvas before fill:");
        canvas.printCanvas();

        List<Position2D> neighbours = new ArrayList<>();
        neighbours.add(new Position2D(1, -1));
        neighbours.add(new Position2D(0, 0));
        neighbours.add(new Position2D(2, 1));

        Position2D start = new Position2D(0, 4);
        int fillBrightness = 90;

        CanvasFill filler = new CanvasFill();
        filler.fill(canvas, neighbours, start, fillBrightness);

        System.out.println("Canvas after fill:");
        canvas.printCanvas();
    }

    public static void  Glowa_w_betoniarce()
    {
        System.out.println("Głowa w betoniarce");
        int rows=6;
        int cols=8;
        SimpleCanvas canvas = new SimpleCanvas(rows, cols);


        int[][] brightnessValues = {
                {1, 2, 3, 255, 255, 6,7,8},
                {1, 2, 3, 4, 255, 6,7,8},
                {1, 2, 3, 4, 255, 6,7,8},
                {1, 2, 3, 4, 255, 6,7,8},
                {1, 2, 3, 4, 255, 255,7,8},
                {1, 2, 3, 4, 5, 255,255,8},

        };


        System.out.println(brightnessValues.length+" "+  brightnessValues[1].length);
        for (int i = 0; i < brightnessValues.length; i++) {
            for (int j = 0; j < brightnessValues[i].length; j++) {
                canvas.setBrightness(new Position2D(j, i), brightnessValues[i][j]);
               //System.out.print(i+" "+j+" "+brightnessValues[i][j]+",");
            }
        }
        System.out.println("Canvas before fill:");
        canvas.printCanvas();

        List<Position2D> neighbours = new ArrayList<>();
        neighbours.add(new Position2D(1, -1));
        neighbours.add(new Position2D(2, 0));
        neighbours.add(new Position2D(2, 1));


        Position2D start = new Position2D(0, 4);
        int fillBrightness = 90;

        CanvasFill filler = new CanvasFill();
        filler.fill(canvas, neighbours, start, fillBrightness);

        System.out.println("Canvas after fill:");
        canvas.printCanvas();
    };


    public static void  EEEEE_iiii_aaaaa_ee()
    {
        System.out.println("EEEEE iiii aaaaa ee");
        int rows=6;
        int cols=8;
        SimpleCanvas canvas = new SimpleCanvas(3, 2);



        int[][] brightnessValues = {
                {1, 1}, //kolumna
                {1, 1},
                {230, 230},

        };


        for (int i = 0; i < brightnessValues.length; i++) {
            for (int j = 0; j < brightnessValues[i].length; j++) {
                canvas.setBrightness(new Position2D(j,i), brightnessValues[i][j]);
            }
        }
        System.out.println("Canvas before fill:");
        canvas.printCanvas();

        List<Position2D> neighbours = new ArrayList<>();
        neighbours.add(new Position2D(2, 1));


        Position2D start = new Position2D(0, 0);
        int fillBrightness = 255;

        CanvasFill filler = new CanvasFill();
        filler.fill(canvas, neighbours, start, fillBrightness);

        System.out.println("Canvas after fill:");
        canvas.printCanvas();



         neighbours = new ArrayList<>();
        neighbours.add(new Position2D(0, -1));
        neighbours.add(new Position2D(-1, 0));


         start = new Position2D(1, 1);
         fillBrightness = 180;
        filler.fill(canvas, neighbours, start, fillBrightness);

        System.out.println("Canvas after fill:");
        canvas.printCanvas();
    };

    public static void grzeje_Jak_w_Stegnie()
    {
        System.out.println("Grzeje jak w Stegnie");
        SimpleCanvas canvas = new SimpleCanvas(4, 4);

        int[][] brightnessValues = {
                {108, 138, 136, 18},
                {243, 227, 100, 149},
                {254, 146, 139, 240},
                {241, 97,  200, 111}
        };


        for (int i = 0; i < brightnessValues.length; i++) {
            for (int j = 0; j < brightnessValues[i].length; j++) {
                canvas.setBrightness(new Position2D(j,i), brightnessValues[i][j]);
            }
        }
        System.out.println("Canvas before fill:");
        canvas.printCanvas();

        List<Position2D> neighbours = new ArrayList<>();
        neighbours.add(new Position2D(0, 1));
        neighbours.add(new Position2D(1, 0));
        neighbours.add(new Position2D(0, -1));
        neighbours.add(new Position2D(-1, 0));


        Position2D start = new Position2D(0, 0);
        int fillBrightness = 148;

        CanvasFill filler = new CanvasFill();
        filler.fill(canvas, neighbours, start, fillBrightness);

        System.out.println("Canvas after fill:");
        canvas.printCanvas();
        start = new Position2D(2, 2);
        fillBrightness = 238;
        filler.fill(canvas, neighbours, start, fillBrightness);
        System.out.println("Canvas after fill:");
        canvas.printCanvas();
        System.out.println("W indeksach tablicowych"+canvas.getMaxPosition());
    }


    public static void Grzeje_Grzeje_PROCESOR()
    {
        System.out.println("GRZJE GRZEJE PROCESOR");

        SimpleCanvas canvas = new SimpleCanvas(11, 4);

        int[][] brightnessValues = {
                {213, 75, 145, 196},
                {140, 12, 231, 28},
                {192, 143, 144, 185},
                {38, 158, 41, 155},
                {4, 232, 197, 144},
                {86, 108, 254, 211},
                {124, 56, 82, 200},
                {251, 179, 3, 25},
                {60, 211, 32, 183},
                {145, 40, 209, 48},
                {198, 244, 1, 146}
        };


        for (int i = 0; i < brightnessValues.length; i++) {
            for (int j = 0; j < brightnessValues[i].length; j++) {
                canvas.setBrightness(new Position2D(j,i), brightnessValues[i][j]);
            }
        }
        System.out.println("Canvas before fill:");
        canvas.printCanvas();

        List<Position2D> neighbours = new ArrayList<>();
        neighbours.add(new Position2D(0, 1));
        neighbours.add(new Position2D(2, 2));
        neighbours.add(new Position2D(0, -1));
        neighbours.add(new Position2D(-2, 0));
        neighbours.add(new Position2D(1, 0));


        Position2D start = new Position2D(0, 10);
        int fillBrightness = 118;

        CanvasFill filler = new CanvasFill();
        filler.fill(canvas, neighbours, start, fillBrightness);
        System.out.println("Canvas after fill:");
        canvas.printCanvas();

        Position2D start2 = new Position2D(1, 2);
        fillBrightness = 198;
        filler.fill(canvas, neighbours, start2, fillBrightness);
        System.out.println("Canvas after fill:");
        canvas.printCanvas();
        System.out.println("W indeksach tablicowych"+canvas.getMaxPosition());
    }


}