
//      Semana1-Fundamentos/Ejercicio1_Variables
//
//      #### Variables #### 
//
//  Las variables son espacios en la memoria que guarda un valor y tiene un nombre que lo identifica
//  En Java las variables se deben declarar segun su tipo de dato, definiendo asi el tipo de informacion que puede almacenar


public class Ejercicio1_Variables {
    public static void main(String[] args) {

        System.out.println("Tipos de datos - Variables\n");

        //  ### Tipos de datos numericos ###
        //      Los tipos de datos que se presentaran, van destinados al ahorro de memoria y para circuntancias especificas
        //
        //      dato [byte]     - Utilizado cuando se necesita ahorro de memoria, con tan solo 8bits rango (-128 a 127)

        //      dato [short]    - Utilizado para ahorro de memoria pero numeros mas grandes que byte, con 16 bits rango (-32,768 a 32,767)

        //      dato [int]      - Utilizado como el dato mas comun utilizado para contar o hacer operaciones, con 32bits rango (±2,147,483,647)
        //      dato [float]    - Utilizado para calculos o mediciones donde no importa la precision, con 32 bits rango (7 decimales)

        //      dato [long]     - Utilizado para valores muy grandes como dinero en bancos o estrellas, 64bits rango [±9 trillones]
        //      dato [double]   - Utilizado para calculos matematicos, finanzas, fisica etc, se necesita mas precision 64 bits rango (15 decimales)

        byte datoEnteroMuyPequeño = 100;
        short datoEnteroPequeño = 5000;
        int datoEntero = 21;
        float datoDecimal = 3;
        long datosMuyGrandes = 10233942;
        double datosDecimalesGrandes = 3.14159262;

        System.out.println(" ### Tipos de datos numericos ###\n");
        System.out.println("Este es el valor [byte]: " + datoEnteroMuyPequeño);
        System.out.println("Este es el valor [short]:" + datoEnteroPequeño);
        System.out.println("Este es el valor [int]: " + datoEntero);
        System.out.println("Este es el valor [float]: " + datoDecimal);
        System.out.println("Este es el valor [long]: " + datosMuyGrandes);
        System.out.println("Este es el valor [double]: " + datosDecimalesGrandes);

        //  ## Tipos de datos caracteres ##//
        //      Los tipos de datos que se presentan, son destinados a las cadenas de texto
        //
        //      dato [Char]     - Utilizado para trabajar con caracteres individuales no en cadenade completa, 16bits
        //      
        //      tipo de referencia (objetos)    [String]     - Utilizado para las variables que almacenaran Cadena/s de texto
        //      tipo de referentcia (objetos)   [Array]      - Utilizada para las listas de elementos del mismo tipo
        
        System.out.println("");
        
    }
}