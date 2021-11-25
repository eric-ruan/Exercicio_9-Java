public class TestaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setMarca("BMW");
        carro.setAno(2022);
        carro.setPlaca("ERI28C05");

        System.out.println("Cliente: Éric Ruan");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Placa: " + carro.getPlaca());
    }
}
