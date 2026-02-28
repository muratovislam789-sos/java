public class car {
    String brand;
    int fuel;
    
    void drive(int km){
        if (km <= 0){
            return;
        }
        int need = km / 10;

        if(need == 0) need = 1;

        if(fuel < need){
            System.out.println("Not enough fuel!" +"Need " + need + ", have "+ fuel);
            return;
        }
        fuel -= need;
        System.out.println("Drove " + km + " km fuel left: " + fuel);
    }
}