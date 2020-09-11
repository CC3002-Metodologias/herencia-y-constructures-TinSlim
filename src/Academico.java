public class Academico extends Persona{
    private final String paper;

    public Academico(String work, String name, int age, String paper) {
        super(work,name,age);
        this.paper = paper;
    }


    @Override
    public void dormir() {
        System.out.println("ZzZzZzZ"); // 7 Zs
    }

    public void publicarPaper(){
        System.out.println("Publicando: ");
        System.out.println(this.paper);
    }

    @Override
    public String hacerLoSuyo() {
        System.out.println("Aprendiendo Zoom");
        return "Zoom";
    }
}
