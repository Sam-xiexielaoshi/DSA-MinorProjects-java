package arrays;

public class array {
    static class Student {
        int rollNo;
        String name;
        int marks;
    }

    public static void main(String args[]) {
        int[] nums = new int[4];
        for (int i = 0; i < nums.length; i++) {
        nums[i] = i + 1;
        System.out.println("Element at index " + i + ": " + nums[i]);
        }
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = (int) (Math.random() * 10);
        System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
        }

        for (int[] rows : matrix) {
        for (int row : rows) {
        System.out.println(row + " ");
        }
        System.out.println();
        }

        int[][] jaggedArray = new int[3][];

        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[3];
        jaggedArray[2] = new int[4];

        for(int i=0 ;i<jaggedArray.length;i++){
        for(int j=0;j<jaggedArray[i].length;j++){
        jaggedArray[i][j] = (int)(Math.random()*10);
        }
        }
        for(int n[]:jaggedArray){
        for(int m:n){
        System.out.print(m+" ");
        }
        System.out.println();
        }

        int[][][] threeDJaggedArray = new int[3][][];
        threeDJaggedArray[0] = new int [3][];
        threeDJaggedArray[1] = new int[1][];
        threeDJaggedArray[2] = new int[5][];
        threeDJaggedArray[0][0] = new int[2];
        threeDJaggedArray[0][1] = new int[3];
        threeDJaggedArray[0][2] = new int[4];

        threeDJaggedArray[1][0] = new int[2];

        threeDJaggedArray[2][0] = new int[1];
        threeDJaggedArray[2][1] = new int[2];
        threeDJaggedArray[2][2] = new int[3];
        threeDJaggedArray[2][3] = new int[2];
        threeDJaggedArray[2][4] = new int[1];

        for(int i=0;i<threeDJaggedArray.length;i++){
        for(int j =0 ;j<threeDJaggedArray[i].length;j++){
        for(int k=0;k<threeDJaggedArray[i][j].length;k++){
        threeDJaggedArray[i][j][k] = (int)(Math.random()*10);
        }
        }
        }
        for(int one: threeDJaggedArray[0][0]){
        for(int two: threeDJaggedArray[0][1]){
        for(int three: threeDJaggedArray[0][2]){
        System.out.print(one + " " + two + " " + three + " ");
        }
        }System.out.println();
        }System.out.println();

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "John Doe";
        s1.marks = 45;
        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "John snow";
        s2.marks = 55;
        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "John grove";
        s3.marks = 65;
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for (int i = 0; i < students.length; i++) {
            System.out.println("Roll No: " + students[i].rollNo);
            System.out.println("Name: " + students[i].name);
            System.out.println("Marks: " + students[i].marks);
            System.out.println("---------------------");

        }
    }
}
