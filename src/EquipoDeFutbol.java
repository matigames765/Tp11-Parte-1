import java.util.ArrayList;
public class EquipoDeFutbol {
    /*
    2.	Define una clase EquipoDeFútbol que utiliza un ArrayList para mantener una lista de
    jugadores. La clase debe permitir agregar nuevos jugadores, eliminar jugadores y listar
    la plantilla.
     */
    ArrayList<String> plantilla;

    public EquipoDeFutbol() {
        plantilla = new ArrayList<>();
    }

    public void AgreggarJugadores(String jugador){
        plantilla.add(jugador);
    }

    public void EliminarJugadores(String jugador){
        plantilla.remove(jugador);
    }

    public void ListarPlantilla(){
        for (String jugador : plantilla){
            System.out.print(jugador + " ");
        }
    }

    public static void main(String[] args) {
        EquipoDeFutbol equipo = new EquipoDeFutbol();

        equipo.AgreggarJugadores("jugador 1");
        equipo.AgreggarJugadores("jugador 2");
        equipo.AgreggarJugadores("jugador 3");
        equipo.AgreggarJugadores("jugador 4");

        equipo.EliminarJugadores("jugador 2");

        equipo.ListarPlantilla();
    }
}

