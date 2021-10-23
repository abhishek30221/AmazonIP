class Tree
{
    public static class Pair
    {
        Node n;
        int vlevel;
        Pair(Node node,int v)
        {
            n = node;
            vlevel = v;
        }
    }
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null)
            return ans;
        
        Queue<Pair> q = new LinkedList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        q.add(new Pair(root,0));
        
        while(q.size() > 0)
        {
            int size = q.size();
            while(size-- > 0)
            {
                Pair rem = q.remove();
                hm.put(rem.vlevel,rem.n.data);
                if(rem.n.left != null)
                {
                    q.add(new Pair(rem.n.left, rem.vlevel - 1));
                }
                if(rem.n.right != null)
                {
                    q.add(new Pair(rem.n.right, rem.vlevel + 1));
                }
            }
        }
        int minim = Integer.MAX_VALUE;
        int maxim = Integer.MIN_VALUE;
        for(int elem : hm.keySet())
        {
            minim = Math.min(minim,elem);
            maxim = Math.max(maxim,elem);
        }
        for(int i = minim; i <= maxim; i++)
        {
            ans.add(hm.get(i));
        }
        return ans;
    }
}