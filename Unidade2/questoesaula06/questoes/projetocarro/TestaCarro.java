
import java.time.LocalDate;

import endereco.CEP;
import endereco.Endereco;
import endereco.Estado;

public class TestaCarro {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Jordão Torres");
        Marca marca = new Marca();

        Endereco endereco = new Endereco(
            "Padre francisco de sales gurjão", 
            "Frutilandia", 
            "Assú", 
            27, 
            new CEP(59650, 000), 
            Estado.RN
        );

        Dono dono = new Dono("Jordao Torres da Silva", endereco);

        LocalDate localDate = LocalDate.now();

        marca.setAnoLancamento(localDate);
        marca.setCodigoIdentificador(5836);
        marca.setNome("Ferrari");
        marca.setNrDeModelos(18);

        carro.setMarca(marca);
        carro.setAno(localDate);
        carro.setCambio(Cambio.AUTOMATICO);
        carro.setCor("amarelo");
        carro.setModelo("Esportivo");
        carro.setNumChassi("CBQ999");
        carro.setNumeroPortas(2);
        carro.setQuantidadeMarchas(10);
        carro.setTetoSolar(false);
        carro.setVelocidadeAtual(0);
        carro.setVelocidadeMaxima(490);
        carro.setVolumeTanque(150);

        dono.getCarros().add(carro);

        System.out.println(dono);
        for(Carro c: dono.getCarros()){
            System.out.println(carro);
        }
    }
}