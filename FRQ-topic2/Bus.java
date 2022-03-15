public class Bus {
    private int busStops;
    private int currentBusStop;
    private boolean direction;
    public Bus(int busStops) {
        this.busStops = busStops;
        currentBusStop = 1;
        direction = true;
    }
    public int getCurrentBusStop() {
        return currentBusStop;
    }
    public void move(){
        if(currentBusStop == busStops || currentBusStop == 1){
            direction = !direction;
        }
        if(direction){
            currentBusStop++;
        }else{
            currentBusStop--;
        }
    }
}
