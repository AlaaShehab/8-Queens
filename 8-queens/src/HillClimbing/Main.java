package HillClimbing;

public class Main {
    public static void main (String[] args) {
        boolean[][] i = {{false,true,false,false,false,false,false,false}
                    ,{false,true,false,false,false,false,false,false}
                    ,{false,false,false,true,false,false,false,false}
                    ,{false,false,false,true,false,true,false,false}
                    ,{false,false,false,false,false,false,false,false}
                    ,{false,true,false,false,false,true,false,false}
                    ,{false,false,false,false,false,false,false,false}
                    ,{false,false,false,false,false,false,false,true}};
        HillClimbingAlgorithm hillClimbingAlgorithm = new HillClimbingAlgorithm(i);
        hillClimbingAlgorithm.run();
    }
}
