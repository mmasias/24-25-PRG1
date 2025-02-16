 class JuegoBatalla {
    
    // Clase base Personaje
abstract class Personaje {
    protected String nombre;
    protected int puntosVida;
    protected int ataque;
    protected int defensa;

    // Constructor
    public Personaje(String nombre, int puntosVida, int ataque, int defensa) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    // Método abstracto para atacar
    public abstract void atacar(Personaje oponente);

    // Método para recibir daño
    public void recibirDanio(int danio) {
        int danioRecibido = danio - defensa;
        if (danioRecibido > 0) {
            puntosVida -= danioRecibido;
        } else {
            danioRecibido = 0; // Daño mínimo es 0
        }
        System.out.println(nombre + " recibe " + danioRecibido + " puntos de daño. Vida restante: " + puntosVida);
    }

    // Método para verificar si el personaje sigue vivo
    public boolean estaVivo() {
        return puntosVida > 0;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Heroina que extiende de Personaje
class Heroina extends Personaje {

    // Constructor específico para Heroina
    public Heroina(String nombre, int puntosVida, int ataque, int defensa) {
        super(nombre, puntosVida, ataque, defensa);
    }

    // Implementación del ataque
    @Override
    public void atacar(Personaje oponente) {
        System.out.println(nombre + " ataca a " + oponente.getNombre());
        oponente.recibirDanio(ataque);
    }
}

// Clase Vampiresa que extiende de Personaje
class Vampiresa extends Personaje {

    // Constructor específico para Vampiresa
    public Vampiresa(String nombre, int puntosVida, int ataque, int defensa) {
        super(nombre, puntosVida, ataque, defensa);
    }

    // Implementación del ataque
    @Override
    public void atacar(Personaje oponente) {
        System.out.println(nombre + " muerde a " + oponente.getNombre());
        oponente.recibirDanio(ataque);

        // La vampiresa recupera algo de vida por cada ataque
        int vidaRecuperada = 10; // Vida que recupera al atacar
        puntosVida += vidaRecuperada;
        System.out.println(nombre + " recupera " + vidaRecuperada + " puntos de vida. Vida actual: " + puntosVida);
    }
}

// Clase Batalla para iniciar la pelea
public class Batalla {
    public static void main(String[] args) {
        // Crear personajes
        Heroina heroina = new Heroina("Guerrera Valiente", 100, 25, 10);
        Vampiresa vampiresa = new Vampiresa("Vampiresa Oscura", 80, 20, 5);

        // Iniciar batalla
        System.out.println("¡Comienza la batalla entre " + heroina.getNombre() + " y " + vampiresa.getNombre() + "!\n");

        while (heroina.estaVivo() && vampiresa.estaVivo()) {
            // Turno de la heroína
            heroina.atacar(vampiresa);
            if (!vampiresa.estaVivo()) {
                System.out.println(vampiresa.getNombre() + " ha sido derrotada.");
                break;
            }

            // Turno de la vampiresa
            vampiresa.atacar(heroina);
            if (!heroina.estaVivo()) {
                System.out.println(heroina.getNombre() + " ha sido derrotada.");
                break;
            }
        }

        System.out.println("\n¡La batalla ha terminado!");
    }
}
}

