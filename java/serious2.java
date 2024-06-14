//         StringBuffer st = new StringBuffer(); // will set capacity of 16-21 //
//         StringBuffer st1 = new StringBuffer(50); // will set capacity of 50 //
//         StringBuffer st2 = new StringBuffer("hello"); // will set capacity of 21 by default , otherwise string length  //



public class serious2{
    public static void main(String[] args) {
        // String str = "hello";
        // str.getChars(0, 4, null, 0);
        // str.substring(0,4);
        
        StringBuffer str = new StringBuffer("hello");
        System.out.println("length: "+str.length());
        System.out.println("capacity: "+str.capacity());
        str.ensureCapacity(90);
        System.out.println("capacity: "+str.capacity());

        // // to get specific chars from a string //
        // char[] charar=new char[2];
        // str.getChars(0, 2, charar, 0); 
        // System.out.println("getChars(): "+new String(charar));
        char[] charar=new char[5];
        str.getChars(0, 5, charar, 0); 
        System.out.println("getChars(): "+new String(charar));

        // to append string with other string //
        str.append(" world");
        System.out.println("after appending: "+ str);

        // to reverse string //
        // System.out.println("reversed: "+str.reverse());

        // to replace a part of string //
        System.out.println("replaced: "+str.replace(6, 11, "mukund")); 
        System.out.println("after deletion: "+ str.delete(6, 12));
    }}
