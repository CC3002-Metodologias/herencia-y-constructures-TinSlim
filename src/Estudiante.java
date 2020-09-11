public class Estudiante extends Persona {
    public Estudiante(String work, String name, int age) {
        super(work,name,age);

    }

    @Override
    public void dormir() {
        System.out.println("ZzZzZz"); // 6 Zs
    }

    @Override
    public void comer() {
        System.out.println("Completo Lol");
    }

    @Override
    public String hacerLoSuyo() {
        System.out.println("Viendo Netflix");
        return "Netflix xd";
    }
}
