public class TypecastingOperator {
    public static void main(String[] args){
        double d=9.67;
        
        int num = (int)d;
        System.out.println("double value before conversion: "+d);
        System.out.println("After Explicit type conversion: "+num);
        //implicit type conversion
        int x=90;
        double value=x;
        System.out.println("Implicit type conversion: "+value);
        
    }
    
}
