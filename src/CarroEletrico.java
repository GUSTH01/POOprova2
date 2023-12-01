public class CarroEletrico extends Carro implements Recarregavel{

    private String autonomiaBateria;
    public CarroEletrico(String ano, String modelo, String cor, String autonomiaBateria) {
        super(ano, modelo, cor);
        this.autonomiaBateria = autonomiaBateria;

    }

    public String getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(String autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public String toString() {
        String carroE = super.toString();
        return carroE + '\n' +
                "CarroEletrico{" +
                "autonomiaBateria='" + autonomiaBateria + '\'' +
                '}';
    }

    @Override
    public String recarregarBateria() {
        return "Recarregar bateria !";
    }



}
