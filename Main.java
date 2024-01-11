/* Online Java Compiler and Editor */
public class Main {

    public static void main(String []args) {
        System.out.println("Hello, World!");
        String input = "Java Objects";
        String output="";
        
        String words[]=input.split(" ");
        for(int i=0;i<words.length;i++)
        {
          
           String str= words[i];
          
           
            for(int j=str.length()-1;j>=0;j--){
                
              output+= str.charAt(j);  
            }
            output+=" ";
           
        }
      System.out.println("output::"+output);
    }
}