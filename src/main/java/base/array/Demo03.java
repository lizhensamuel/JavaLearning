package   base.array;
/*
多维数组：本质就是数组中嵌套数组
 */
public class Demo03 {
    public static void main(String[] args) {
        int[][] twodArray = new int[][]{
                {1,1,1},
                {2,2,2},
                {3,3,3}
        };
        int[][][] threedArray = new int[][][]{
                {{1,1,1},{2,2,2},{3,3,3}},
                {{4,4,4},{5,5,5},{6,6,6}},
                {{7,7,7},{8,8,8},{9,9,9}}
        };

        //遍历二维数组
        System.out.println("遍历二维数组");
        for (int i = 0; i < twodArray.length; i++) {
            for (int j = 0; j < twodArray[i].length; j++) {
                System.out.print(" "+twodArray[i][j]);
                if((j+1)%3==0){
                    System.out.println();
                }
            }
        }

        //遍历三维数组
        System.out.println("遍历三维数组");
        for (int i = 0; i < threedArray.length; i++) {
            for (int j = 0; j < threedArray[i].length; j++) {
                for (int k = 0; k < threedArray[i][j].length; k++) {
                    System.out.print(" "+threedArray[i][j][k]);
                    if((k+1)%3==0){
                        System.out.print(",");
                    }
                }
            }
            System.out.println();
        }


    }
}
