public class Carro extends Veiculo{
    private String placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String getModelo() {
        return "M4 ";
    }

    @Override
    public void setAno(int ano) {
        super.setAno(ano);    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);    }

    
}
