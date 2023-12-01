import java.util.Objects;

public class Carro implements Recarregavel{
    private String ano;

    private  String modelo;
    private String cor;

    public Carro(String ano,String modelo, String cor){
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "ano='" + ano + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }


    @Override
    public String recarregarBateria() {
        return "O carro não recarrega !";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(ano, carro.ano) && Objects.equals(modelo, carro.modelo) && Objects.equals(cor, carro.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ano, modelo, cor);
    }
}
