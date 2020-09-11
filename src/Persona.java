public class Persona {
    protected String nombre;
    protected String ocupacion;
    protected int edad;

    public Persona(String work, String name, int age) {
        this.ocupacion = work;
        this.nombre = name;
        this.edad = age;
    }
    public void comer() {
        System.out.println("Ñom Ñom comida casera");
    }

    public void hacerCuarentena(){
        System.out.println("Cuarentena, lol");
    }
    public void dormir() {
        System.out.println("ZzzZzZzZ");
    }

    public String hacerLoSuyo() {
        return "";
    }
}
