public class ABSFonction {

    public static void main(String[] args) {
        int value = doSomething(4);
        System.out.println(value);
    }

    public static int doSomething(int i){
        if(i < 0){
            return -i;
        }
        return i;
    }
}
