//class sample
class sample{
    int x;
    sample(){
        //calling paramerarised constructoe using this keyword
        this(55);
        //calling access function using this keyword
        this.access();
    }
    //this constructor assigns value of z to x
    sample(int z){
        this.x = z;
    }
    //access function is used to display the value of x
    void access(){
        System.out.println("x = "+ x);
    }
}
//main class
public class this_operator {
    public static void main(String args[]){
        //creating a object s of class sample
        //sample s = new sample();
    }
    
}