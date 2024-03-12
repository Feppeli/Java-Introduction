public class Loops {

    public static void main(String[] args){
        //Loops


        //Metodo for
        int idade = 18;
        int count = 0;

        for(var i = 0; i < idade; i++){
            count = count +1;
            System.out.println("Menor de idade:" + count);
        }

        // metodo while
        int i = 0;
        while(i < idade){
            i++;
            System.out.println(i);
        }
    }
}
