import com.zipcodewilmington.scientificcalculator.Console;

public class Operations {
}

//add method
public Double sum(input1){
    Double sumValue = Console.getDoubleInput("Enter the value you want to sum.");

    return input1+sumValue;
}

//Subtraction
public Double subtract(input1){
    Double subtractValue = Console.getDoubleInput("Enter the value you want to subtract.");

    return input1-subtractValue;

}

//Multiplication
public Double multiply(input1){
    Double multiplyValue = Console.getDoubleInput("Enter the value you want to multiply.");

    return input1*multiplyValue;

}

//Division
public Double divide(input1){
    Double divideValue = Console.getDoubleInput("Enter the value you want to divide.");

    return input1/divideValue;

}