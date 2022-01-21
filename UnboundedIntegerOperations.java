/*
Maxime Sotsky
COMP 2611
Nov 10 1pm 2020
*/
public class UnboundedIntegerOperations{
    
    private static UnboundedInteger product = new UnboundedInteger();

    public static UnboundedInteger add(UnboundedInteger num1, UnboundedInteger num2)
    {
        product.clear();
        if (greaterValue(num1,num2) == false){
            UnboundedInteger temp = new UnboundedInteger();
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int sign1 = num1.getDataAt(1);
        int sign2 = num2.getDataAt(1);

        if(sign1 == 1 && sign2 == 1){
            add(num1,num2,2);
            product.addFirst(1);
            if(product.getLast() == 0)
                format(product);
            return product;
        }
        else if(sign1 == 1 && sign2 == -1){
            subtract(num1,num2,2);
            product.addFirst(1);
            if(product.getLast() == 0)
                format(product);
            return product;
        }
        else if(sign1 == -1 && sign2 == 1){
            subtract(num1,num2,2);
            product.addFirst(-1);
            if(product.getLast() == 0)
                format(product);
            return product;
        }
        else{
            add(num1,num2,2);
            product.addFirst(-1);
            if(product.getLast() == 0)
                format(product);
            return product;
        }
    }

    private static int data1 = 0;
    private static int data2 = 0;

    private static boolean greaterValue(UnboundedInteger num1, UnboundedInteger num2){
        if (num1.getSize() < num2.getSize())
            return false;
            
        else if (num1.getSize() > num2.getSize())
            return true;
            
        else{
            for(int i = num1.getSize(); i > 1; i--){
                data1 = num1.getDataAt(i);
                data2 = num2.getDataAt(i);
                if(data1 < data2)
                    return false;
                else if(data1 > data2)
                    return true;
            }
        }
        return true;
    }

    private static int carry = 0;

    private static void add(UnboundedInteger num1, UnboundedInteger num2, int index){

        data1 = num1.getDataAt(index);
        data2 = num2.getDataAt(index);
        
        if(index-1 == num1.getSize()){
            if(carry == 1){
                product.addLast(carry);
                carry = 0;
            }
            return;
        }
        if((data1 + data2 + carry) >= 10){
            product.addLast((data1 + data2 + carry) - 10);
            carry = 1;
            add(num1, num2, index+1);
        }
        else{
            product.addLast(data1 + data2 + carry);
            carry = 0;
            add(num1,num2,index+1);
        }
    }

    private static void subtract(UnboundedInteger num1, UnboundedInteger num2, int index){

        data1 = num1.getDataAt(index);
        data2 = num2.getDataAt(index);

        if(index-1 == num1.getSize())
            return;

        if(((data1 - data2) - carry) < 0){
            product.addLast((data1 + 10 -  data2 - carry));
            carry = 1;
            subtract(num1, num2, index+1);
        }
        else{
            product.addLast((data1 -data2) - carry);
            carry = 0;
            subtract(num1,num2,index+1);
        }
    }
    
    private static UnboundedInteger format(UnboundedInteger product){
        for(int i = product.getSize();(i != 1) && (product.getLast() == 0);i--){
            product.deleteLast();
        }
        return product;
    }
}


