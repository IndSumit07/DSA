package Striever_A2Z_Sheet.Graphs;

import java.sql.Array;
import java.util.ArrayList;

public class Representation_In_Java {
    public static void main(String[] args) {

        /* Method 1 -> Adjacency Matrix */
        int n = 3, m=3;
        int adj[][] = new int[n+1][m+1];

        //edge 1---2
        adj[1][2]=1;
        adj[2][1]=1;

        //edge 2---3
        adj[2][3]=1;
        adj[3][2]=1;

        //edge 1---3
        adj[1][3]=1;
        adj[3][1]=1;

        /* Method 2 -> ArrayList */
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0; i<=n; i++){
            list.add(new ArrayList<Integer>());
        }

        //edge 1---2
        list.get(1).add(2);
        list.get(2).add(2);

        //edge 2---3
        list.get(2).add(3);
        list.get(3).add(2);

        //edge 1---3
        list.get(1).add(3);
        list.get(3).add(1);


        // if there is given weighted graph so inplace of 1 in matrix we will store the weight of edges
        // And in ArrayList we will store in pairs (node, weight)

    }
}
