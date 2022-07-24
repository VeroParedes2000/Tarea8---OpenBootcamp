public class App {
    public static void main(String[] args) throws Exception {


        Persona persona = new Persona ();
        persona.setNombre("Veronica");
        System.out.println("Mi nombre es: " + persona.getNombre());
        persona.setEdad (22);
        System.out.println("Tengo " + persona.getEdad() + "años" );
        persona.setTeléfono(021220152);
        System.out.println("Mi Teléfono es " + persona.getTeléfono());
    }
}
        class Persona {
            private String Nombre;
            private int Edad;
            private int Teléfono;


        public void setNombre  (String Nombre) {
            this.Nombre = Nombre;
        }

        public String getNombre(){
            return Nombre;
        }

        public void setEdad (int Edad) {
            this.Edad = Edad;
        }

        public int  getEdad (){
            return Edad;
        }

        public void setTeléfono (int Teléfono) {
            this.Teléfono = Teléfono;
        }

        public int getTeléfono () {
            return Teléfono;
        }
    }
