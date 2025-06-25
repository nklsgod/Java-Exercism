public class Lasagna {
    public int expectedMinutesInOven(){
        final int cookingTime = 40;
        return cookingTime;
    };
    public int remainingMinutesInOven(int minutesInOven){
        return expectedMinutesInOven() - minutesInOven;
    };
    public int preparationTimeInMinutes(int numberOfLayers){
        final int timeForOneLayer = 2;
        return numberOfLayers * timeForOneLayer;
    };
    public int totalTimeInMinutes(int numbersOfLayers,int minutesInOven){
        return preparationTimeInMinutes(numbersOfLayers) + minutesInOven;
    };
}
