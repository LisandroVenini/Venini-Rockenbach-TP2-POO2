/*Escenario 2: Método obsoleto con sugerencia de uso alternativo
Descripción: Tienes un método que ha quedado obsoleto, y quieres documentarlo para que no sea utilizado, sugiriendo un nuevo método.*/

import modelos.Obsoleto;
public class App {
    public static void main(String[] args) throws Exception {
            
                Obsoleto miObjeto = new Obsoleto();
                
                // Llamada al método obsoleto (se mostrará una advertencia)
                miObjeto.viejoMetodo();
                
                // Llamada al método nuevo (el recomendado)
                miObjeto.nuevoMetodo();
    }     
}
