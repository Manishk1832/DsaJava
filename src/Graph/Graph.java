package Graph;

import java.util.HashMap;

public class Graph {
    HashMap<Integer,HashMap<Integer,Integer>>HM;
    public Graph(int Total_Nodes){
        HM = new HashMap<>();
        for (int i = 1; i<+Total_Nodes;i++){
            HM.put(i,new HashMap<>());
        }
    }
}
