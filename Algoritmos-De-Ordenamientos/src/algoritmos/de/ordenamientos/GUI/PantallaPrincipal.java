package algoritmos.de.ordenamientos.GUI;
import static algoritmos.de.ordenamientos.InsertionSort.InsertionArray;
import static algoritmos.de.ordenamientos.InsertionSort.insertion;
import algoritmos.de.ordenamientos.SelectionSort;
import static algoritmos.de.ordenamientos.SelectionSort.SelectionArray;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
/**
 *
 * @author tvlenin
 */
public class PantallaPrincipal extends JFrame implements Constantes, ActionListener{
    //-- IMPORTAMOS LIBRERIAS QUE UTILIZAREMOS
    JPanel panel =  new JPanel(); 
    
    private JCheckBox checkQuick;
    private JCheckBox checkInsert;
    private JCheckBox checkSelectio;
    private JCheckBox checkMerge;
    private JCheckBox checkRadix;
    private JCheckBox checkBubble;
    private JLabel lblOrdena;
    private JLabel lblTamanoMuestras;
    private JLabel lblCantidadRepeticiones;
    private ButtonGroup grupoTipo;
    private JRadioButton rbString;
    private JRadioButton rbInt;
    private JTextField txtTam;
    private JTextField txtRep;
    private JButton btnAceptar;
    int  arreglo[] = {5, 8, 9, 6, 5, 4, 3, 45, 845, 425, 21, 65, 48, 79, 85, 75, 25, 36, 20, 78, 15, 21, 65, 45, 542, 548, 21};
    Integer  arreglo2[] = {5, 8, 9, 6, 5, 4, 3, 45, 845, 425, 21, 65, 48, 79, 85, 75, 25, 36, 20, 78, 15, 21, 65, 45, 542, 548, 21};

    
    


public PantallaPrincipal(){
    
    super(TITULO_PRINCIPAL);
    this.setSize(600,400);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.panel.setBackground(Color.lightGray);
    this.panel.setLayout(null);
    add(panel);
    // Se instancian los componentes de la ventana
    this.checkQuick = new JCheckBox(QUICK_SORT_NAME);
    this.checkInsert = new JCheckBox(INSERT_SORT_NAME);
    this.checkSelectio = new JCheckBox(SELECTION_SORT_NAME);
    this.checkMerge = new JCheckBox(MERGE_SORT_NAME);
    this.checkRadix = new JCheckBox(RADIX_SORT_NAME);
    this.checkBubble = new JCheckBox(BUBBLE_SORT_NAME);
    //Labels
    this.lblOrdena = new JLabel(LABEL_SELECCION);
    this.lblTamanoMuestras = new JLabel (LABEL_TAM_MUESTRAS);
    this.lblCantidadRepeticiones = new JLabel (LABEL_CANT_REPETICIONES);
    //Grupo
    this.grupoTipo = new ButtonGroup();
    //RadioButton
    this.rbString = new JRadioButton(RADIO_STRING, false);
    this.rbInt = new JRadioButton(RADIO_INT, true);
    //txt
    this.txtRep = new JTextField();
    this.txtTam = new JTextField();
    //Boton
    this.btnAceptar = new JButton(BUTTON_ACEPTAR);
    
    
    // Se agrega el color de fondo de los componentes
    this.checkQuick.setBackground(Color.lightGray);
    this.checkInsert.setBackground(Color.lightGray);
    this.checkSelectio.setBackground(Color.lightGray);
    this.checkMerge.setBackground(Color.lightGray);
    this.checkRadix.setBackground(Color.lightGray);
    this.checkBubble.setBackground(Color.lightGray);
    //labels
    this.lblOrdena.setBackground(Color.lightGray);
    this.lblCantidadRepeticiones.setBackground(Color.lightGray);
    this.lblTamanoMuestras.setBackground(Color.lightGray);
    //RadiOButton
    this.rbInt.setBackground(Color.lightGray);
    this.rbString.setBackground(Color.lightGray);
    
    
    
    
    // Se agregan los componentes al panel
    this.panel.add(checkQuick);
    this.panel.add(checkInsert);
    this.panel.add(checkSelectio);
    this.panel.add(checkMerge);
    this.panel.add(checkRadix);
    this.panel.add(checkBubble);
    //labels
    this.panel.add(lblOrdena);
    this.panel.add(lblTamanoMuestras);
    this.panel.add(lblCantidadRepeticiones);
    //radioButton
    this.panel.add(rbString);
    this.panel.add(rbInt);
    //txt
    this.panel.add(txtTam);
    this.panel.add(txtRep);
    //Boton
    this.panel.add(btnAceptar);
    
    // posicion de los componentes 
    this.checkQuick.setBounds(20, 80, 150, 20);
    this.checkInsert.setBounds(20, 120, 150, 20);
    this.checkSelectio.setBounds(20, 160, 150, 20);
    this.checkMerge.setBounds(20, 200, 150, 20);
    this.checkRadix.setBounds(20, 240, 150, 20);
    this.checkBubble.setBounds(20, 280, 150, 20);
    //labels
    this.lblOrdena.setBounds(20,40,260,30);
    this.lblTamanoMuestras.setBounds(300,40,300,20);
    this.lblCantidadRepeticiones.setBounds(300,160,300,20);
    //grupo
    this.grupoTipo.add(rbInt);
    this.grupoTipo.add(rbString);
    //RadiioButton
    this.rbInt.setBounds(340, 120, 50, 20);
    this.rbString.setBounds(440, 120, 80, 20);
    //txt
    this.txtTam.setBounds(320,80,200,20);
    this.txtRep.setBounds(320,200,200,20);
    //Boton
    this.btnAceptar.setBounds(470,320,100,30);
    
    
    // Agregar el action listener
    btnAceptar.addActionListener(this);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar){
           //insertion(arreglo);
           InsertionArray(arreglo2);
        }
    }
 


}
    

