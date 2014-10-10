
package algoritmos.de.ordenamientos;
import algoritmos.de.ordenamientos.SelectionSort;
import algoritmos.de.ordenamientos.GUI.PantallaPrincipal;
import static algoritmos.de.ordenamientos.InsertionSort.InsertionArray;
import algoritmos.de.ordenamientos.Lista.Lista;



public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PantallaPrincipal pantalla = new PantallaPrincipal();
       
       pantalla.setVisible(true);
       // LeerTexto leer = new LeerTexto();
        //Lista Num = leer.leer("PRUEBA.TXT");
        String []arreglo = {"5", "8", "9", "6", "5", "4", "3", "45", "845", "425", "21", "65", "48", "79", "85", "75", "25", "36", "20", "78", "15", "21", "65", "45", "542", "548", "21"};
        InsertionArray(arreglo);
        
    }
    
}
