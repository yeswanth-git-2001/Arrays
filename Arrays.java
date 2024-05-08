import java.util.Scanner;

public class Arrays {
    // The most convinient way to store the data is variables
    // If the data is huge like data of hundred students, it was not the best way to
    // store the data in variables, then there come the topic called arrays.
    // Array is an index based dataStructure which can deal with the large data with
    // single variable name
    // Arrays can only store the homogenous data
    // In java arrays are objects, which means the storage will be on heap area
    // [int[] arr = new int[10]] => A space will be created in heap to store ten
    // integer values
    // arr : reference variable[stack area within the method] A sapce for ten
    // integers to store : heap area

    // int[] ar = new int[5]; 1D regular array => initialization = ar[0] = 1 and so
    // on
    // int[][] ar = new int[3][5]; 2D regular array => initialization = ar[0][0] = 1
    // and so on
    // int[][][] ar = new int[3][4][5]; 3D regular array => initialization =
    // ar[0][0][0] = 1 and so on

    // 2D jagged arrays
    // int[][] ar = new int[3][];
    // ar[0] = new int[5];
    // ar[1] = new int[3];
    // ar[2] = new int[4];

    // 3D jagged arrays
    // int[][][] ar = new int[3][][];
    // ar[0] = new int[2][];
    // ar[1] = new int[2][];
    // ar[2] = new int[1][];

    // ar[0][1] = new int[4];
    // ar[0][2] = new int[5];

    // ar[1][0] = new int[4];
    // ar[1][1] = new int[5];

    // ar[2][0] = new int[10];

    // ====================================================================//

    // 1D array
    public int[] ar = new int[5];

    public void oneDimenArray() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Enter the student marks : " + i);
            ar[i] = scan.nextInt();
        }
    }

    public void showOneDimenArray() {
        System.out.print("The details of the student : ");
        for (int j = 0; j < ar.length; j++) {
            System.out.print(ar[j] + " ");
        }
    }

    // 2D regular array
    public int[][] arr = new int[3][4];

    public void twoDimenRegularArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the student details for class : " + i);
            for (int j = 0; j < arr[i].length; j++) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter the student marks : " + j);
                arr[i][j] = scan.nextInt();
            }
        }
    }

    public void displayTwoDimenRegularArray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("The class : " + i + " Student : " + j + " = ");
                System.out.println(arr[i][j]);
            }
        }
    }

    // 2D jagged array
    public int[][] arr_ir = new int[3][];

    public void twoDimenIregularArray() {
        arr_ir[0] = new int[6];
        arr_ir[1] = new int[2];
        arr_ir[2] = new int[4];

        for (int i = 0; i < arr_ir.length; i++) {
            System.out.println("Enter the student details for class : " + i);
            for (int j = 0; j < arr_ir[i].length; j++) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter the student marks : " + j);
                arr_ir[i][j] = scan.nextInt();
            }
        }
    }

    public void displayTwoDimenIregularArray() {
        for (int i = 0; i < arr_ir.length; i++) {
            for (int j = 0; j < arr_ir[i].length; j++) {
                System.out.print("The class : " + i + " Student : " + j + " = ");
                System.out.println(arr_ir[i][j]);
            }
        }
    }

    //3D regular array
    int[][][] arr_3 = new int[2][3][3];

    void threeDimenRegularArrya(){
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<arr_3.length; i++){

            for(int j=0; j<arr_3[i].length; j++){

                for(int k=0; k<arr_3[i][j].length; k++){
                    System.out.println("School : " + i + " Class : " + j + " Student " + k);
                    arr_3[i][j][k] = scan.nextInt();
                }
            }
        }
    }

    public void displayThreeDimenRegukarArray(){
        for(int i=0; i<arr_3.length; i++){

            for(int j=0; j<arr_3[i].length; j++){

                for(int k=0; k<arr_3[i][j].length; k++){
                    System.out.print(arr_3[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }

    //3D jagged array
    int[][][] arr_4 = new int[2][][];

    void threeDimenIregularArrya(){

        arr_4[0] = new int[2][];
        arr_4[1] = new int[4][];

        arr_4[0][0] = new int[4];
        arr_4[0][1] = new int[3];

        arr_4[1][0] = new int[2];
        arr_4[1][1] = new int[5];
        arr_4[1][2] = new int[3];
        arr_4[1][3] = new int[7];

        Scanner scan = new Scanner(System.in);
        for(int i=0; i<arr_4.length; i++){
            for(int j=0; j<arr_4[i].length; j++){
                for(int k=0; k<arr_4[i][j].length; k++){
                    System.out.println("School : " + i + " Class : " + j + " Student " + k);
                    arr_4[i][j][k] = scan.nextInt();
                }
            }
        }
    }

    public void displayThreeDimenIregukarArray(){
        for(int i=0; i<arr_4.length; i++){
            for(int j=0; j<arr_4[i].length; j++){
                for(int k=0; k<arr_4[i][j].length; k++){
                    System.out.print(arr_4[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }

    //Array of Objects
    public class StudentDetails{
        int id;
        char className;
        String name;
    }

    StudentDetails[] stu = new StudentDetails[3];

    void arrayOfObjects(){
        stu[0] = new StudentDetails();
        stu[1] = new StudentDetails();
        stu[2] = new StudentDetails();

        stu[0].id = 10;
        stu[0].className = 'A';
        stu[0].name = "Yeswanth chowdary";

        stu[1].id = 20;
        stu[1].className = 'A';
        stu[1].name = "Gowthami chowdary";

        stu[2].id = 20;
        stu[2].className = 'A';
        stu[2].name = "Bhanu chowdary";

        for(int i=0; i<stu.length; i++){
            System.out.println(stu[i].id);
            System.out.println(stu[i].className);
            System.out.println(stu[i].name);
        }
    }

    //Disadvantages of the array
    //  Stores only homogenous data
    //  Size of array size is fixed, it cannot grow and shrink
    //  It demands the contiguous memory locations

    //Advanced for-loop, for-each loops or enhanced for-loop => all refers to same
    int[] arrr = new int[10];

    public void enhancedForLoop(){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arrr.length; i++){
            System.out.println("Enter : " + i + " element");
            arrr[i] = sc.nextInt();
        }

        for(int el : arrr){
            System.out.println("The element is : " + el);
        }
    }
}