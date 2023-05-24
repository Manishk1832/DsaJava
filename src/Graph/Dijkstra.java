//package Graph;
//
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Dijkstra {
//    public static void main(String[] args) {
//
//    }
//    class dijpair{
//        public dijpair(int i ,int j, String str){
//            v = i;
//            cost = j;
//            path = str;
//        }
//        int v ;
//        int cost;
//        String path;
//    }
//    public void Dijkstra (int src){
//        Queue<dijpair> Q = new LinkedList<>();
//        Q.add(new dijpair (src,0," "+src));
//        HashSet<Integer> Visted = new HashSet<>();
//        while (!Q.isEmpty()){
//            dijpair curr = Q.poll();
//            for (int nbr :HM.get(v).keyset()){
//                int E = getEdge(v,nbr);
//                Q.add(new dijpair(nbr,curr.cost+E, curr.path)+" "+nbr));
//            }
//
//        }
//    }
//}
