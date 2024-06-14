// jo data pass karege uske according type select karega //

// class Gen<T>{
//     T og;
//     Gen(T o){
//         og=o;
//     }
//     T getData(){
//         return og;
//     }
//     void showType(){
//         System.out.println("type of og: "+og.getClass().getName());
//     }
// }


// public class serious8 {
//     public static void main(String[] args) {
//         Gen<Integer> ob;
//         ob = new Gen<Integer>(78);

//         // Gen ob = new Gen(34);
//         ob.showType();
//     }
// }



// class NonGen{
//     Object og;
//     NonGen(Object o){
//         og=o;
//     }
//     Object getData(){
//         return og;
//     }
//     void showType(){
//         System.out.println("type of og: "+og.getClass().getName());
//     }
// }


// public class serious8 {
//     public static void main(String[] args) {
//         NonGen ob;
//         ob = new NonGen(78);
//         int v = (Integer)ob.getData();
//         // Gen ob = new Gen(34);
//         ob.showType();
//         System.out.println("value: "+v);
//     }
// }

// class Gen<T,v>{
//     T og;
//     v og1;
//     Gen(T o,v j){
//         og=o;
//         og1=j;
//     }
//     T getData(){
//         return og;
//     }
//     v gdata(){
//         return og1;
//     }
//     void showType(){
//         System.out.println("type of og: "+og.getClass().getName());
//         System.out.println("type of og1: "+og1.getClass().getName());
//     }
// }


// public class serious8 {
//     public static void main(String[] args) {
//         Gen<Integer,String> ob;
//         ob = new Gen<Integer,String>(78,"hello");

//         // Gen ob = new Gen(34);
//         ob.showType();
//         System.out.println("value: "+(Integer)ob.getData()+" "+(String)ob.gdata());
//     }
// }