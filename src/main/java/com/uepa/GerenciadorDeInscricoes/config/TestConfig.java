package com.uepa.GerenciadorDeInscricoes.config;

import com.uepa.GerenciadorDeInscricoes.model.Participante;
import com.uepa.GerenciadorDeInscricoes.repository.ParticipanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test") // certifique-se que o profile está minúsculo se for definido como "test" no application.properties
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ParticipanteRepository repository;

    @Override
    public void run(String... args) {
        Participante p1 = new Participante("João Silva", "12345678901", "joao@email.com", "91999999991", "Alimentos", "João Lanches");
        Participante p2 = new Participante("Maria Souza", "23456789012", "maria@email.com", "91999999992", "Beleza", "Salão da Maria");
        Participante p3 = new Participante("Carlos Lima", "34567890123", "carlos@email.com", "91999999993", "Moda", "Estilo Carlos");
        Participante p4 = new Participante("Ana Beatriz", "45678901234", "ana@email.com", "91999999994", "Educação", "Curso Ana");
        Participante p5 = new Participante("Paulo Cesar", "56789012345", "paulo@email.com", "91999999995", "Construção", "PC Reformas");

        Participante p6 = new Participante("Luciana Alves", "67890123456", "luciana@email.com", "91999999996", "Artesanato", "Arte em Casa");
        Participante p7 = new Participante("Bruno Rocha", "78901234567", "bruno@email.com", "91999999997", "Tecnologia", "Tech Bruno");
        Participante p8 = new Participante("Fernanda Dias", "89012345678", "fernanda@email.com", "91999999998", "Saúde", "FitLife");
        Participante p9 = new Participante("Rafael Torres", "90123456789", "rafael@email.com", "91999999999", "Serviços Gerais", "Rafael Serviços");
        Participante p10 = new Participante("Juliana Pires", "01234567890", "juliana@email.com", "91999999910", "Comércio", "Juliana Store");

        Participante p11 = new Participante("Marcos Vinícius", "11234567891", "marcos@email.com", "91999999911", "Logística", "Entrega Certa");
        Participante p12 = new Participante("Bianca Lima", "12234567892", "bianca@email.com", "91999999912", "Alimentos", "Bolos da Bia");
        Participante p13 = new Participante("Eduardo Gomes", "13234567893", "eduardo@email.com", "91999999913", "Serviços", "Edu Service");
        Participante p14 = new Participante("Carla Oliveira", "14234567894", "carla@email.com", "91999999914", "Moda", "Look da Carla");
        Participante p15 = new Participante("Diego Martins", "15234567895", "diego@email.com", "91999999915", "Tecnologia", "DM Solutions");

        Participante p16 = new Participante("Vanessa Lopes", "16234567896", "vanessa@email.com", "91999999916", "Beleza", "Vanessa Make");
        Participante p17 = new Participante("Gabriel Barbosa", "17234567897", "gabriel@email.com", "91999999917", "Educação", "GB Cursos");
        Participante p18 = new Participante("Renata Cruz", "18234567898", "renata@email.com", "91999999918", "Saúde", "NutriRenata");
        Participante p19 = new Participante("Thiago Freitas", "19234567899", "thiago@email.com", "91999999919", "Serviços Gerais", "TF Manutenções");
        Participante p20 = new Participante("Patrícia Mendes", "20234567890", "patricia@email.com", "91999999920", "Comércio", "Mendes Roupas");

        Participante p21 = new Participante("Lucas Silva", "21234567891", "lucas@email.com", "91999999921", "Artesanato", "Arte Lucas");
        Participante p22 = new Participante("Tatiane Rocha", "22234567892", "tatiane@email.com", "91999999922", "Alimentos", "Doces da Tati");
        Participante p23 = new Participante("André Luiz", "23234567893", "andre@email.com", "91999999923", "Construção", "AL Construções");
        Participante p24 = new Participante("Simone Reis", "24234567894", "simone@email.com", "91999999924", "Beleza", "Simone Beauty");
        Participante p25 = new Participante("Fábio Nunes", "25234567895", "fabio@email.com", "91999999925", "Moda", "Fábio Fashion");

        Participante p26 = new Participante("Aline Santos", "26234567896", "aline@email.com", "91999999926", "Educação", "Inglês da Aline");
        Participante p27 = new Participante("Rodrigo Melo", "27234567897", "rodrigo@email.com", "91999999927", "Serviços Gerais", "RM Serviços");
        Participante p28 = new Participante("Tatiana Costa", "28234567898", "tatiana@email.com", "91999999928", "Comércio", "Loja da Tati");
        Participante p29 = new Participante("Henrique Souza", "29234567899", "henrique@email.com", "91999999929", "Tecnologia", "HS Tech");

        repository.saveAll(Arrays.asList(
                p1, p2, p3, p4, p5, p6, p7, p8, p9, p10,
                p11, p12, p13, p14, p15, p16, p17, p18, p19, p20,
                p21, p22, p23, p24, p25, p26, p27, p28, p29
        ));
    }
}
