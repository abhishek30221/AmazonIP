import java.io.*;
import java.util.*;

public class Main30
{
   static class Edge
   {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      
      for (int i = 0; i < vtces; i++) 
         graph[i] = new ArrayList<>();
   
      int indegree[] = new int[vtces];
      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2));
         indegree[v2]++; 
      }

       System.out.println(cycle(graph , indegree)); 
   }
   public static boolean cycle(ArrayList<Edge> graph[] , int[] indegree)
   {
   		Queue<Integer> q = new LinkedList<>(); 
   		int count = 0; 
   		for(int i = 0 ; i < indegree.length ; i++)
   			if(indegree[i] == 0)
   			{	q.add(i); count++; }

   		if(q.size()==0)
   			return true; 

   		while(q.size() > 0)
   		{
   			int rem = q.removeFirst(); 
   			for(int nbr : graph[rem])
   			{
   				indegree[nbr]--; 
   				if(indegree[nbr] == 0)
   				{	q.add(nbr); count++; }
   			}
   		}
   		return (count == indegree.length) ? true : false; 
   }

}