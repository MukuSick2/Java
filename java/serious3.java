// string tokkenizer class is used to break str into tokens //
//delivator that separate tokens //
//default delemeter : white space, new line spaces,tab //

//

// import java.util.StringTokenizer;

// public class serious3 {
//     public static void main(String[] args) {
//         StringTokenizer st = new StringTokenizer("this is java");
//         System.out.println("no. of tokens: "+st.countTokens());
//     }
// }

import java.util.StringTokenizer;

public class serious3 {

        static String str = "title = java : the Complete"+
        "Reference;author = Schildt;Publisher=The Mc Graw Hill;"+
        "Copyright = 2014";
        public static void main(String[] args){
            StringTokenizer st = new StringTokenizer(str,"=;");
            System.out.println(st.countTokens());
            while(st.hasMoreTokens()){
                String key = st.nextToken();
                String value = st.nextToken();
                System.out.println(key+"\t"+value);
            }
            
        }
    }
// if we write true, then only it will include tokens and spaces in output // 