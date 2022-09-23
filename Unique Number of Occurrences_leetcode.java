class Solution {
    public boolean uniqueOccurrences(int[] a) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(mp.containsKey(a[i])){
                mp.put(a[i],mp.get(a[i])+1);
            }
            else{
                mp.put(a[i],1);
            }
        }
        int count=mp.size();
        int[] c=new int[count];
        int i=0;
        for(int value: mp.values()){
            c[i++]=value;
        }
        Arrays.sort(c);
        for(i=0;i<c.length-1;i++){
            if(c[i]==c[i+1]){
                return (false);
            }
        }
        return (true);
    }
}
