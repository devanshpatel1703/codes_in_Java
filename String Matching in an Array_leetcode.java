class Solution {
    public List<String> stringMatching(String[] w) {
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<w.length;i++){
            for(int j=0;j<w.length;j++){
                if(i==j){
                    continue;
                }
                if(w[i].indexOf(w[j])!=-1){
                    list.add(w[j]);
                }
            }
        }
        ArrayList<String> newList = new ArrayList<String>();
        for (String element : list){
            if (!newList.contains(element)){
                newList.add(element);
            }
        }
        return (newList);
    }
}
