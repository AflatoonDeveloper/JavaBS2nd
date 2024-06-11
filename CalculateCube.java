public class CalculateCube {
//make Function or method to give limit and output is cube;
    void DisplayCubeValue(int limit){
        for(int i=1; i<=limit;i++){
            int cube = CubeCalculate(i);

            System.out.println("the value of cube " + i + " time is : " + cube);
        }
    }
//Make method to calculate cube of number;
    int CubeCalculate(int num){

         int total = num * num * num;
         return total;
    }
    public static void main(String [] arge)
    {
     //give limit 
        int limit = 4;
//Make Object 
        CalculateCube objCube = new CalculateCube();
        //assigne object function
        objCube.DisplayCubeValue(limit);


    }
}
