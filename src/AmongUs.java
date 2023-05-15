import Menu.GestionMenu;
import Menu.MenuTarefas;
import Menu.MenuXogadores;
import Scanner.ScannerSingleton;


public class AmongUs {
    ScannerSingleton sc = new ScannerSingleton();
    GestionMenu gm = new GestionMenu();
    MenuTarefas mt = new MenuTarefas();
    MenuXogadores mx = new MenuXogadores();

    public static void main(String[] args) throws Exception {
        ScannerSingleton sc = new ScannerSingleton();
        GestionMenu gm = new GestionMenu();
        MenuTarefas mt = new MenuTarefas();
        MenuXogadores mx = new MenuXogadores();
        //Enseñar menu
        gm.crearMenu();
        gm.mostrarMenu();
        System.out.println("--------------------");
        System.out.println("Introduce una opción:");
        int opcion = sc.getScanner().nextInt();
    }
}
 