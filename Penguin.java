public class Penguin extends Animal{
    public Penguin(String myName, int myid){
        super(myName, myid);
    }

    public static void main(String [] args){
        Penguin pn = new Penguin("Penguin", 1);
        pn.eat();
    }
}

