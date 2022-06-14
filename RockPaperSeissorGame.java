import java.util.Random;
import java.util.Scanner;

class RPSgame {

    public int Uch;
    public int comCh;
    public int noOfTry = 5;
    Scanner sc = new Scanner(System.in);

    public void description() {
        System.out.println("\n\n*****************HERE'S THE GAME ROCK-PAPER-SEISSOR*****************\n");
        System.out.println("   ||||||First read the description carefully!|||||\n");
        System.out.println("**You have to play 5 round for complete the game**");
        System.out.println(
                "@ If you Want to choose ROCK, PRESS.....0\n@ If you Want to choose PAPER, PRESS......1\n@ If you Want to choose SEISSOR, PRESS......2");
        System.out.println("\n\nSo you read all about): BE SURE READY TO START THE GAME>>>>>>\n\n");
    }

    public int takeUserInput() {
        System.out.print("Let's start go, Enter your choice from this 3 number[0 1 2]>>> ");
        Uch = sc.nextInt();
        System.out.print("\n\nYou choose :  ");
        return Uch;
    }

    public int comGenarateNo() {
        Random rand = new Random();
        comCh = rand.nextInt(3);
        System.out.println("\n\nNow let's see your luck>$$$$");
        System.out.print("\n\nComputer choose :  ");
        return comCh;
    }

    public void Choice(int Ch) {
        if (Ch == 0) {
            System.out.println("ROCK");
        } else if (Ch == 1) {
            System.out.println("PAPER");
        } else if (Ch == 2) {
            System.out.println("SEISSOR");
        }
    }

    public void gameCondition() {
        int i = Uch, j = comCh;
        System.out.println("\n\n");
        if (i == j) {
            System.out.println("Oooppsss Drow the game!!!!");
        } else if (i == 0 && j == 2 || i == 1 && j == 0 || i == 2 && j == 1) {
            System.out.println("Congratulation!!!!!!! You won the game");
        } else {
            System.out.println("Oho Shit , You lost the game");
        }
        noOfTry--;
        if (noOfTry > 0) {
            System.out.println("\nYou Have Another [" + noOfTry + "] more chances\n\n\n");
        } else {
            System.out.println("\nYou have no more chance,The game is over.\n\t\t Byee Byeee.):");
        }
    }

    public boolean repeatGame() {
        System.out.print("\nAre you want to play again, if sure PRESS \'4\' ::$  ");
        int r = sc.nextInt();
        if (r == 4) {
            return true;
        } else {
            return false;
        }
    }
}

public class RockPaperSeissorGame {

    public static void main(String[] args) {

        boolean t;
        int i = 5;
        do {
            RPSgame g = new RPSgame();
            g.description();
            while (i != 0) {
                int uch = g.takeUserInput();
                g.Choice(uch);
                int comCh = g.comGenarateNo();
                g.Choice(comCh);
                g.gameCondition();
                i--;
            }
            t = g.repeatGame();
        } while (t);
    }
}
