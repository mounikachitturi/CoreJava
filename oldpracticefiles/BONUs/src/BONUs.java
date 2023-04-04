public class BONUs {
    public static void main(String[] args)
    {
        boolean Gameover=true;
        int score=800;
        int levelcompleted=5;
        int bonus=100;
        int finalscore=score+(levelcompleted*bonus);
        System.out.println("your final score was" + finalscore);
        boolean newgameover=true;
        int newscore=10000;
        int newlevelcomple=8;
        int newbonus=200;
        if (newgameover)
        {
            int finalScore=newscore+(newlevelcomple*newbonus);
            System.out.println("your finalScore was " + finalScore);
        }
    }
}
