package pluralsight;

class Subscribe{
    public static void main(String[] args) {
        System.out.println("Subscribe Now!");

        //variables
    int myVar; //int is 32bit
    myVar= 50;
    System.out.println(myVar);
    
     //primitive data types
    long milesToUranus = 556876970897569L; // long is 64bit. You have to include L at the end.
    System.out.println(milesToUranus);
    
    float metresToToilet = 45.67f; //float 32 bit include f at the end
        System.out.println(metresToToilet);
   
    double milessToToilet = 0.423535235623d ; //double is 64 bit include d at the end
        System.out.println(milessToToilet);

    char regularT ='T'; //char stores a single unicode character..use single quote
        System.out.println(regularT);

    boolean iLoveJava = true; // bool stores true/false values
    System.out.println(iLoveJava);

//Arithmetic operators
/*
++ increment by 1
-- decrement by 1

prefix applies operation before returning value
postfix  applies operation after returning value

compound assignment
apply right side value to the left
store result in variable to the left.

precedence  :posfix(x++,x--)> prefix (++x,--x)> multiplicative(* /%) > additive (+-)
 
*/


    }
}