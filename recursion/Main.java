package recursion;

public class Main {
    public static void main(String[] args) {
        //write function that prints
        number(1);
    }
    static void number(int n){
        if(n>5) return;//base conditon 
        System.out.println(n);
        number(n+1);//recursive call
    }
}

//how function calls work in language
//very very important 
//while the function is not finished executing it iwl remain in stack
//that is when a function is present in a stack its call is currently going on i hasnt been finished yet

//when a function executing it is removed from the stack and the flow of program is restored to where that function was called 

//recursion means a function that calls

//base condition in recursion is condition where our recursion will stop making new calls
// if you are calling a function again and again, you can treat it as a separate call in the stack
//no base condtion -function call will keep happening stack will get filled again and again and every call aquires a newspace in the stack this leads to exceeding in the memeory of computer leeding to error of STACKOVERFLOWERROR

//why recursion??
// helps us in solving bigger complex problems in a simple way 
//you can convert recursion solutions into iteration and vice versa
//space complexity: O(n) or is not constant because of recursive calls 

//VISUALIZING RECURSION
//recursive tree

