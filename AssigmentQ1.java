//create a class to create methods and Constructor;

class StoreInteger{
int firstNumber ;
int secondNumber;

//create a Constructor of paramites;
StoreInteger(int firstNumber , int secondNumber){

    this.firstNumber=firstNumber;
    this.secondNumber=secondNumber;
}
//sum fuction or mathod
void SumNumber(){

    int sum = firstNumber + secondNumber;
    System.out.println("The sum is :" + sum);
}
//Different fuction or mathod
void DifferentNumber(){

    int diff = firstNumber - secondNumber;
    System.out.println("The Different of number is :" + diff);
}
//Product fuction or mathod
void ProductNumber(){

    int Product = firstNumber * secondNumber;
    System.out.println("The Product of number is :" + Product);
}
//Average fuction or mathod
void AverageNumber(){

    double aver = (double) firstNumber/secondNumber * 100;
    System.out.println("The Average of number is :" + aver);
}
//Distance fuction or mathod
void DistanceNumbers(){

    int distan = Math.abs( firstNumber - secondNumber);
    System.out.println("The Distance of number is :" + distan);

}
//MaximumNumber fuction or mathod
void MaximumNumber(){

    int max = Math.max(secondNumber, firstNumber);
    System.out.println("The Maximum number is :" + max);
}

}

public class AssigmentQ1 {
    
    public static void main(String[]arge){
    //Given number Testing
        int num1 = 43;
        int num2=8;
        //Make object
        StoreInteger obj = new StoreInteger(num1,num2);
 // Perform calculations and print results
        obj.SumNumber();
        obj.DifferentNumber();
        obj.ProductNumber();
        obj.AverageNumber();
        obj.DistanceNumbers();
        obj.MaximumNumber();

    }
}
