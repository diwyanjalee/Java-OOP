public class Arrayiv {
    public static void  main (String args[]){
        int array[] = new int[]{8, 20, 84, 12, 57, 90};
        Arrayiv mi = new Arrayiv();
        mi.getMin(array);

        int max = getMax(array);
        System.out.println("Maximum Value is: "+max);

        //int min = getMin(array);
        System.out.println("Minimum Value is: "+mi);
    }
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
    public  int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
            
        }
        return minValue;
    }
}
