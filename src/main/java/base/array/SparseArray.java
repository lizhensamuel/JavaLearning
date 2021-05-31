package   base.array;

/*
稀疏数组
 */
public class SparseArray {
    public static void main(String[] args) {
        int[][] array = new int[11][11];
        array[0][0] = 2;
        array[1][1] = 3;
        array[2][2] = 3;
        array[3][3] = 3;

        System.out.println("输出原始数组：");
        print2Array(array);

        System.out.println("将原始数组转换为稀疏数组后：");
        print2Array(toSparseArray(array));

        System.out.println("将稀疏数组转换为普通数组后：");
        print2Array(toArray(toSparseArray(array)));


    }

    public static void print2Array(int[][] array) {
        for (int[] arr : array) {
            for (int i : arr) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] toSparseArray(int[][] arrry) {
        /*计算数组中有效值的个数*/
        int sum = 0;
        for (int i = 0; i < arrry.length; i++) {
            for (int j = 0; j < arrry[i].length; j++) {
                if (arrry[i][j] != 0) {
                    sum++;
                }
            }
        }

        /*创建稀疏数组*/
        int[][] sparseArray = new int[sum+1][3];

        //稀疏数组表头行记录原始数组的行列数和有效值数
        sparseArray[0][0] = arrry.length;
        sparseArray[0][1] = arrry[0].length;
        sparseArray[0][2] = sum;

        //将原始数组中有效值存入稀疏数组中
        int count=0;
        for (int i = 0; i < arrry.length; i++) {
            for (int j = 0; j < arrry[i].length; j++) {
                if(arrry[i][j]!=0){
                    count++;
                    sparseArray[count][0]=i;
                    sparseArray[count][1]=j;
                    sparseArray[count][2]=arrry[i][j];
                }
            }

        }
        return sparseArray;
    }

    public static int[][] toArray(int[][] sparseArray){
        int[][] array=new int[sparseArray[0][0]][sparseArray[0][1]];

        for (int i = 1; i < sparseArray.length; i++) {
            for (int j = 0; j < sparseArray[i].length; j++) {
                array[sparseArray[i][0]][sparseArray[i][1]]=sparseArray[i][2];
            }
        }

        return array;
    }

}
