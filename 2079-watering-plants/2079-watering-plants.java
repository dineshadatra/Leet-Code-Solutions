class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int c = 0;
        int cap = capacity;
        for(int i = 0;i<plants.length;i++){
            if(plants[i]<=cap){
                c++;
                cap-=plants[i];
            }
            else{
                cap = capacity;
                c += i+i+1;
                cap -= plants[i];
            }
        }
        return c;
    }
}