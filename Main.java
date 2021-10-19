import java.io.*; 
import java.util.*; 


public class Main
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in); 
      MedianFinder m = new MedianFinder(); 
      int n = 3 , i = 0;  
      int arr[] = {1 , 2 , 3}; 
      while(n-- > 0)
        m.addNum(arr[i++]);
        System.out.println(m.findMedian());
    }
}
 class MedianFinder 
 {
  PriorityQueue<Integer> pqmax; 
  PriorityQueue<Integer> pqmin; 
  
  public MedianFinder() 
  {
      pqmax = new PriorityQueue<>(Collections.reverseOrder()); 
      pqmin = new PriorityQueue<>(); 
  }
  
  public void addNum(int num) 
  {
      
      if(pqmax.size() == pqmin.size())
      {
          pqmin.add(num); 
          pqmax.add(pqmin.peek()); 
          pqmin.remove(pqmin.peek());    
      }
      else
      {
          pqmax.add(num); 
          pqmin.add(pqmax.peek()); 
          pqmax.remove(pqmax.peek()); 
      }
  }
  
  public double findMedian() 
  {
       if(pqmax.size() == pqmin.size())
       {              
        return (pqmax.peek() + pqmin.peek() * 1.0) / 2.0; 
       }  
      return pqmax.peek() * 1.0;
  }
}