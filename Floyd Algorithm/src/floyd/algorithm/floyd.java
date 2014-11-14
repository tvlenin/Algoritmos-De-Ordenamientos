package floyd.algorithm;

// Arup Guha
// 6/25/02
// Floyd Warshall's algorithm: an example of dynamic programming.

import java.util.*;

public class floyd {
    
    public static int[][] shortestpath(int[][] adj, int[][] path) {
        int n = adj.length;
        int[][] ans = new int[n][n];
        // Implement algorithm on a copy matrix so that the adjacency isn't
        // destroyed.
        copy(ans, adj);
        
//        for (int i=0; i<3;i++) {
//            for (int j=0; j<3;j++)
//                    System.out.print(ans[i][j]+" ");
//            System.out.println();
//        }
        // Compute successively better paths through vertex k.
        for (int k=0; k<n;k++) {// Do so between each possible pair of points.
            for (int i=0; i<n; i++) {
                for (int j=0; j<n;j++) {
                    if (ans[i][k]+ans[k][j] < ans[i][j]) {
                        ans[i][j] = ans[i][k]+ans[k][j];
                        path[i][j] = path[k][j];
                    }
                }
            }
        }// Return the shortest path matrix.
        System.out.println();
        for (int i=0; i<3;i++) {
            for (int j=0; j<3;j++)
                    System.out.print(path[i][j]+" ");
            System.out.println();
        }
        System.out.println();
        
        return ans;
    }

    // Copies the contents of array b into array a. Assumes that both a and
    // b are 2D arrays of identical dimensions.
    public static void copy(int[][] a, int[][] b) {
        for (int i=0;i<a.length;i++)
            for (int j=0;j<a[0].length;j++)
                a[i][j] = b[i][j];
    }
// Returns the smaller of a and b.
    public static int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }
    
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

    
        // Tests out algorithm with graph shown in class.
        int[][] matrizAdyacencia = new int[3][3];
        matrizAdyacencia[0][0] = 0; 
        matrizAdyacencia[0][1] = 10000; 
        matrizAdyacencia[0][2] = 40; 
     //   matrizAdyacencia[0][3] = 10000; 
      //  matrizAdyacencia[0][4] = -4;
        matrizAdyacencia[1][0] = 10000; 
        matrizAdyacencia[1][1] = 0; 
        matrizAdyacencia[1][2] = 8; 
      //  matrizAdyacencia[1][3] = 1;
     //   matrizAdyacencia[1][4]=7;
        matrizAdyacencia[2][0] = 15; 
        matrizAdyacencia[2][1] = 5; 
        matrizAdyacencia[2][2] = 0; 
       // matrizAdyacencia[2][3] = 10000; 
      //  matrizAdyacencia[2][4] = 10000;
//        matrizAdyacencia[3][0] = 2; 
   //     matrizAdyacencia[3][1] = 10000; 
   //     matrizAdyacencia[3][2] = -5; 
     //   matrizAdyacencia[3][3] = 0; 
     //   matrizAdyacencia[3][4] = 10000;
     //   matrizAdyacencia[4][0] = 10000; 
   //     matrizAdyacencia[4][1] = 10000; 
   //     matrizAdyacencia[4][2] = 10000; 
     //   matrizAdyacencia[4][3] = 6;
     //   matrizAdyacencia[4][4] =0;
        
        int[][] shortpath;
        int[][] path = new int[3][3];
        // Initialize with the previous vertex for each edge. -1 indicates
        // no such vertex.
        for (int i=0; i<3; i++)
            for (int j=0; j<3;  j++)
                if (matrizAdyacencia[i][j] == 10000)
                    path[i][j] = -1;
                else
                    path[i][j] = i;
        // This means that we don't have to go anywhere to go from i to i.
        for (int i=0; i<3; i++)
            path[i][i] = i;
//      for (int i=0; i<3;i++) {
//            for (int j=0; j<3;j++)
//                    System.out.print([i][j]+" ");
//            System.out.println();
//        }  
        shortpath = shortestpath(matrizAdyacencia, path);
        
        // Prints out shortest distances.
//        for (int i=0; i<3;i++) {
//            for (int j=0; j<3;j++)
//                    System.out.print(path[i][j]+" ");
//            System.out.println();
//        }
  //      System.out.println("aaaaaaaa");
//        for (int i=0; i<3;i++) {
//            for (int j=0; j<3;j++)
//                    System.out.print(path[i][j]+" ");
//            System.out.println();
//        }
        
        System.out.println("From where to where do you want to find the shortest path?(0 to 4)");
        int start = stdin.nextInt();
        int end = stdin.nextInt();

        // The path will always end at end.
        String myPath = end + "";
    
         // Loop through each previous vertex until you get back to start.
        
        while (path[start][end] != start) {
            myPath = path[start][end] + " -> " + myPath;
            end = path[start][end];
        }
        
        // Just add start to our string and print.
        myPath = start + " -> " + myPath;
        System.out.println("Here's the path "+myPath);
    }

}