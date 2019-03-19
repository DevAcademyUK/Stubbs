package threeLittleDucks;

import java.util.Scanner;

public class Ducks {
    public static void main(String[] args) {
        Ducks swimming = new Ducks();
        swimming.swim();

    }

    private void swim() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many ducks can you see?");
        int ducks = myScanner.nextInt();
        String word = "little duck";

        for (int i = ducks; i > 0; i--) {

            if (i == 1) {
                word = "little duck";
        System.out.println(i + " " + "went swimming one day, over the hills and far away. Mother Ducks said 'Quack Quack Quack Quack!");
        System.out.println("and all her" + ducks + "little ducks came back!");
        } else {
        int newNum = i = 1;
        System.out.println(i + " " + word + "went swimming over the hill and far away.Mother duck said 'Quack Quack Quack Quack'");
        System.out.println("and only" + newNum + "little ducks came back!");

        }

        }
        }
        }
