package ArrayList;
//Two friends, A and B, are playing the game of matchsticks.
// In this game, a group of N matchsticks is placed on the table.
// The players can pick any number of matchsticks from 1 to 4 (both inclusive) during their chance.
// The player who takes the last match stick wins the game.
// If A starts first, how many matchsticks should he pick on his 1st turn such that he is guaranteed
// to win the game or determine if it's impossible for him to win. Return -1 if it's impossible for A
// to win the game, else return the number of matchsticks should he pick on his 1st turn such that
// he is guaranteed to win.
// (Note : Consider both A and B play the game optimally.)

//Input: N = 48
//Output: 3
//Explanation:
//Player A is guaranteed a win if he picks 3 matchsticks first.

//Input: N = 15
//Output: -1
//Explanation:
//Player A is guaranteed a loss no matter how many matches he picks at first.
public class MatchStickGame {
    public static int matchStick(int n)
    {                       //time complexity : O(1)
        if (n%5==0)
        {
            return -1;
        }
        else
        {
            return (n%5);
        }
    }

    public static void main(String[] args) {
        int n = 6;
        int ans = matchStick(n);
        System.out.println(ans);   //ans = 1
    }
}
