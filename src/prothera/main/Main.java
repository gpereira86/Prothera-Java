package prothera.main;

import prothera.system.Person;
import prothera.system.Document;
import prothera.system.Functions;
import java.util.ArrayList;
import java.util.List;

/**
 * A classe `Main` instancia os objetos do tipo `Person` e `Document`, e chama funções
 * para listar e processar informações sobre as pessoas e seus documentos.
 *
 * <p>Chama as funções da classe Functions.</p>
 *
 * @author Glauco Pereira
 */
public class Main {

    /**
     * O método principal do programa que instancia os objetos `Person` e `Document`,
     * adiciona documentos a cada pessoa e chama funções da classe `Functions` para exibir
     * diversas listagens e pesquisas.
     *
     * @param args Parâmetros de linha de comando (não utilizados).
     */
    public static void main(String[] args) {

        String separator = "========================================";

        // 3.1 - Instancie a planilha em objetos Java:
        List<Person> people = new ArrayList<>();

        Person luiz = new Person(1, "Luiz Roberto", 33);
        luiz.addDocument(new Document("CNH", "74591035698445", "Carteira de Motorista"));
        luiz.addDocument(new Document("RG", "5200789", "Carteira de Identidade"));
        luiz.addDocument(new Document("CTPS", "4567898", "Carteira de Trabalho"));
        people.add(luiz);

        Person raimundo = new Person(2, "Raimundo Soares", 51);
        raimundo.addDocument(new Document("CNH", "45963548565769", "Carteira de Motorista"));
        raimundo.addDocument(new Document("RG", "5200785", "Carteira de Identidade"));
        raimundo.addDocument(new Document("CTPS", "7891237", "Carteira de Trabalho"));
        people.add(raimundo);

        Person ana = new Person(3, "Ana Tavares", 24);
        ana.addDocument(new Document("CNH", "65236525662159", "Carteira de Motorista"));
        ana.addDocument(new Document("CPF", "41254125147", "Cadastro de Person Física"));
        people.add(ana);

        Person janete = new Person(4, "Janete Niehues", 28);
        janete.addDocument(new Document("CPF", "65236525662", "Cadastro de Person Física"));
        janete.addDocument(new Document("RG", "3300785", "Carteira de Identidade"));
        janete.addDocument(new Document("SUS", "784512", "Sistema Único de Saúde"));
        people.add(janete);

        Person paulo = new Person(5, "Paulo da Rosa", 74);
        paulo.addDocument(new Document("RG", "5200785", "Carteira de Identidade"));
        paulo.addDocument(new Document("CPF", "456215812541", "Cadastro de Person Física"));
        people.add(paulo);

        Person wesley = new Person(6, "Wesley Soares", 60);
        wesley.addDocument(new Document("CNH", "91035698445963", "Carteira de Motorista"));
        wesley.addDocument(new Document("RG", "7415595", "Carteira de Identidade"));
        wesley.addDocument(new Document("CPF", "45618452136", "Cadastro de Person Física"));
        wesley.addDocument(new Document("SUS", "2200789", ""));
        people.add(wesley);

        Person tamires = new Person(7, "Tamires Souza", 12);
        tamires.addDocument(new Document("RG", "7852123", "Carteira de Identidade"));
        people.add(tamires);

//        3.2 - Crie um algoritmo para listar:
//        -> Apenas chamadas, as funções estão em system/Functions

        System.out.println(separator);

//        👉 Pessoa com ID = 2:
        Functions.searchPersonByID(people, 2);
        System.out.println(separator);

//        👉 Listagem de pessoas em ordem crescente de idade:
        Functions.listPeopleSortingAge(people);
        System.out.println(separator);

//        👉 Pessoas com idade superior a 50 anos:
        Functions.AgeOverFifty(people);
        System.out.println(separator);

//        👉 Pessoas que não possuem CPF:
        Functions.withoutCpf(people);
        System.out.println(separator);

//        👉 Listagem de tipos de documentos:
        Functions.documentTypes(people);
        System.out.println(separator);

    }

}