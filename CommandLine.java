public class CommandLine{
    public static void main(String [] args){
        for (int i=0; i < args.length; i++){
            String fs = String.format("args[%d]: %s\n", i, args[i]);
            System.out.println(fs);
        }
    }
}
