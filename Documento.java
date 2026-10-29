public class Documento implements intefaceGerenciarEntrega {
    private String titulo;
    private String autor;
    
    public Documento(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    @Override
    public void entrega() {
        System.out.println("O documento '" + titulo + "' do autor " 
        + autor + " foi enviado para o endereço do cliente.");
    }
}
