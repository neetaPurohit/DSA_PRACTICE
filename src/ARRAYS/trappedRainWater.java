package ARRAYS;

public class trappedRainWater {
public static int findTrappedWater(int[] height){
//    calculate left max boundary - array
    int leftMax[] = new int[height.length];
    leftMax[0] = height[0];
//    for calculate other left max bars
    for (int i=1; i<height.length; i++){
        leftMax[i] = Math.max(height[i],leftMax[i -1]);
    }
//    calculate right max boundary - array
     int rightMax[] = new int[height.length];
    rightMax[height.length-1] = height[height.length-1];
//    for calculate other right max bars
    for (int i=height.length-2; i>=0; i--){
        rightMax[i] = Math.max(height[i], rightMax[i+1]);
    }
//    loop
    int trappedWater = 0;
    for (int i=0; i<height.length-1; i++){
        //    find water level = min(leftMax Boundary, rightMax Boundary)
      int waterLevel = Math.min(leftMax[i],rightMax[i]);
        //    trapped water = water level - height[i]
      trappedWater += waterLevel - height[i];
    }
    return trappedWater;



}
    static void main(String[] args) {
    int[] height = {4,2,0,6,3,2,5};
    int result = findTrappedWater(height);
    System.out.println(result);
    }
}
