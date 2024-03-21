package teoria.lambda.interfasfuncional;

public class Main{
    public static void main(String[] args) {
         HolaMundo holaMundo = new HolaMundo() {
            @Override
            public void HolaMundo() {
                System.out.println("Hola mundo");
            }
        };
        //una vez que has "rellenado el método de la clase
        //ya tienes un objeto con el que llamarlo
        holaMundo.HolaMundo();

    }

}
