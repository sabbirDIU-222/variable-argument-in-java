
package online_shop;

class Test
{
    // for adding two number's we use two perameter in add method
    
    void add(int num,int num1)
    {
        int result = num + num1;
        System.out.println(result);
    }
    void add(int num,int num1,int num2)
    {
        int result = num + num1+num2;
        System.out.println(result);
    }
    
    
    // var args 
    
    void add(int... num)
    {
        int sum = 0;
        
        for(int x : num)
        {
            sum = sum+x;
            
        }
        System.out.println(sum);
    }

    
}








public class VarArags {
    
    public static void main(String[] args) {
        
        // we creeate an object of Test class so that we can ascces add method
        
        Test obj = new Test();
        obj.add(10, 20);
        obj.add(10, 20,30);
        // so in case we don't know how many data we use to pass as an argument 
        // so we need an alternating way 
        // ************* //
        
        // that called variable argument or varargs method
        
        obj.add(10,20,30,30,40,50,60,20,10,100);
        obj.add(10,20,30,30,40,50,60,20,10,100,400);
        
        
    }
    
}
