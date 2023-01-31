package JavaAssignment4.Generic;

import java.util.ArrayList;
public class TesterGeneric {
    public static void main(String[] args) {
    	//Integer
    	ArrayList<Integer> in=new ArrayList<Integer>();
        in.add(10);
        in.add(20);
        in.add(30);
        in.add(40);
        in.add(50);
        Generic<Integer> intArr=new Generic<Integer>(in);
        System.out.println("INTEGER ARRAY CONTENT:");
        intArr.display();
        
        //Float
        ArrayList<Float> fl=new ArrayList<Float>();
        fl.add(10f);
        fl.add(20f);
        fl.add(30f);
        fl.add(40f);
        fl.add(50f);
        Generic<Float> floatArr=new Generic<Float>(fl);
        System.out.println("FLOAT ARRAY CONTENT:");
        floatArr.display();
        
        //String
        ArrayList<String> st=new ArrayList<String>();
        st.add("Sunny");
        st.add("Sinha");
        st.add("Is");
        st.add("From");
        st.add("Darjeeling");
        Generic<String> stringArr=new Generic<String>(st);
        System.out.println("STRING ARRAY CONTENT:");
        stringArr.display();
        
        //Double       
        ArrayList<Double> dou=new ArrayList<Double>();
        dou.add(10d);
        dou.add(20d);
        dou.add(30d);
        dou.add(40d);
        dou.add(50d);
        Generic<Double> doubleArr=new Generic<Double>(dou);
        System.out.println("DOUBLE ARRAY CONTENT:");
        doubleArr.display();
          
    }
    
}

/*
EXPECTED INPUT/OUTPUT
INTEGER ARRAY CONTENT:
10 20 30 40 50 


FLOAT ARRAY CONTENT:
10.0 20.0 30.0 40.0 50.0 


STRING ARRAY CONTENT:
Sunny Sinha Is From Darjeeling 


DOUBLE ARRAY CONTENT:
10.0 20.0 30.0 40.0 50.0 
 

*/
