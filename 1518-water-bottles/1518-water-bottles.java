class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink = numBottles;
        int toExchange = 0;
        int remaining = numBottles;
        while(remaining>=numExchange){
            toExchange = remaining / numExchange;
            drink += toExchange;

            remaining = (remaining % numExchange) + toExchange;
        }
        return drink;
    }
}