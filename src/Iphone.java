public final class Iphone implements AparelhoEletronico {

    @Override
    public void tocarMusica() {
        System.out.println("tocar musica");
    }

    @Override
    public void Navegar() {
        System.out.println("rodar o Safari");
    }

    @Override
    public void tocarVideo() {
        System.out.println("tocar video");
    }

    @Override
    public void ligar() {
        System.out.println("iniciar o OS");
    }
}
