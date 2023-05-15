package Menu;

import java.util.ArrayList;
import java.util.List;

public class GestionMenu {
    List<ParteAbstracta> partes = new ArrayList<>();

    abstract class ParteAbstracta {
        protected String nombre;

        protected ParteAbstracta(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
    }

    public class ParteCompuesta extends ParteAbstracta {
        private List<ParteAbstracta> partes = new ArrayList<>();

        public ParteCompuesta(String nombre) {
            super(nombre);
        }

        public void addParte(ParteAbstracta parte) {
            partes.add(parte);
        }

        public List<ParteAbstracta> getPartes() {
            return partes;
        }

    }

    public class ParteSimple extends ParteAbstracta {
        public ParteSimple(String nombre) {
            super(nombre);
        }
    }

    public void crearMenu() {
        List<ParteAbstracta> partes = new ArrayList<>();
        ParteCompuesta configuracion = new ParteCompuesta("0. Configuracion");

        ParteCompuesta tareas = new ParteCompuesta("0. Tareas");
        tareas.addParte(new ParteSimple("0. Engadir tarefa"));
        tareas.addParte(new ParteSimple("1. Borrar tarefa"));
        tareas.addParte(new ParteSimple("2. Ver tarefas"));
        tareas.addParte(new ParteSimple("3. Salir"));

        ParteCompuesta jugadores = new ParteCompuesta("1. Xogadores");
        jugadores.addParte(new ParteSimple("0. Engadir xogador"));
        jugadores.addParte(new ParteSimple("1. Borrar xogador"));
        jugadores.addParte(new ParteSimple("2. Ver xogadores"));
        jugadores.addParte(new ParteSimple("3. Salir"));

        configuracion.addParte(tareas);
        configuracion.addParte(jugadores);
        configuracion.addParte(new ParteSimple("2. Configurar tempo máximo de resposta"));
        configuracion.addParte(new ParteSimple("3. Salir"));

        partes.add(configuracion);
        partes.add()

    }

    public void mostrarMenu() {
        for (ParteAbstracta parte : partes) {
            //getNombre
            System.out.println(parte.getNombre());            
        }
    }
}
