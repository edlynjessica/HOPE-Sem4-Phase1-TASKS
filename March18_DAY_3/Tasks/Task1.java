// TASK 1 - SUBWAY SURFERS IMPLEMENTATION

import java.util.*;

public class Task1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int lane=2; // 1 = Left, 2 = Middle, 3 = Right
        int score=0;
        boolean gameOver=false;
        System.out.println("🚆 SUBWAY SURFERS GAME!!!");
        System.out.println("Controls:");
        System.out.println("1 - Left | 2 - Right | 3 - Jump | 4 - Slide");
        while(!gameOver){
            int obstacleLane=rand.nextInt(3)+1; // random lane
            int obstacleType=rand.nextInt(2); // 0 = barrier, 1 = hurdle
            System.out.println("\nObstacle in lane: " + obstacleLane);
            System.out.println("Type: " + (obstacleType == 0 ? "Barrier (Jump)" : "Hurdle (Slide)"));
            System.out.print("Enter move: ");
            int move=sc.nextInt();
            switch(move){
                case 1: // Left
                    if(lane>1) lane--;
                    break;
                case 2: // Right
                    if(lane<3) lane++;
                    break;
                case 3: // Jump
                    if(lane==obstacleLane && obstacleType==0){
                        System.out.println("✅ Jumped successfully!");
                    }else if(lane == obstacleLane){
                        gameOver=true;
                    }
                    break;
                case 4: // Slide
                    if(lane==obstacleLane && obstacleType==1){
                        System.out.println("✅ Slid successfully!");
                    }else if(lane==obstacleLane){
                        gameOver=true;
                    }
                    break;
                default:
                    System.out.println("Invalid move!");
            }
            if(lane==obstacleLane && move!= 3 && move!= 4){
                gameOver=true;
            }
            if (!gameOver) {
                score++;
                System.out.println("Current Lane: " + lane);
                System.out.println("Score: " + score);
            }
        }
        System.out.println("\n💥 Game Over!");
        System.out.println("Final Score: " + score);
    }
}
