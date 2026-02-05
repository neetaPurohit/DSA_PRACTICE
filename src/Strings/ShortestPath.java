package Strings;

public class ShortestPath {
    public static float findShortestPath(String str){
        int x =0, y = 0;
        for (int i=0; i<str.length(); i++){
            //stored each character to compare direction
            char dir = str.charAt(i);
//            sout
            if (dir=='S'){
                y--;
            }else if (dir=='N'){  //north
                y++;
            }else if (dir=='W'){//west
                x--;
            }else {//east
                x++;
            }
        }

        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    static void main(String[] args) {
//        String path = "WNEENESENNN";
        String path = "NS";
        System.out.println(findShortestPath(path));
    }
}
