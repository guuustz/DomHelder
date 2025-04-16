public class carros {
    String nome;
    String marca;
    int ano;
    int veld;

    void acelerar(int acelerar){
        veld+=acelerar;
    }

    void freiar(int reduzir){
        veld-=reduzir;
    }

    void buzinar(){
        System.out.println("bibi");
    }

    public static void main(String[] args) {
        carros Ferrari = new carros();

        Ferrari.nome = "Ferrari";
        Ferrari.ano = 2001;
        Ferrari.veld = 120;

        Ferrari.acelerar(120);
        System.out.println("Velocidade atual: "+Ferrari.veld);
        Ferrari.freiar(220);
        System.out.println("Velocidade atual: "+Ferrari.veld);

        Ferrari.buzinar();

        Ferrari.acelerar(60);
        System.out.println("Velocidade atual: "+Ferrari.veld);
        Ferrari.freiar(10);
        System.out.println("Velocidade atual: "+Ferrari.veld);
        Ferrari.acelerar(90);
        System.out.println("Velocidade atual: "+Ferrari.veld);

    }
}
