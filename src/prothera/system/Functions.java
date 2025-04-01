package prothera.system;

import java.util.*;

/**
 * A classe `Functions` contém métodos que realizam várias operações sobre uma lista de pessoas.
 * As operações incluem:
 * -> Busca por ID = searchPersonByID
 * -> Listagem de pessoas ordenando por idade = listPeopleSortingAge
 * -> Listagem de pessoas com mais de 50 anos = AgeOverFifty
 * -> Listagem de pessoas sem CPF cadastrado = withoutCpf
 * -> Listagem dos tipos de documentos no cadastro no momento da consulta = documentTypes
 *
 * @author Glauco Pereira
 */
public class Functions {

    /** Separador utilizado nas impressões no console. */
    static String separator = "----------------------------------------";

    /**
     * 👉 Pessoa com ID = 2:
     * Busca uma pessoa pelo ID e exibe seus dados juntamente com seus documentos.
     *
     * @param people A lista de pessoas a ser pesquisada.
     * @param id O ID da pessoa a ser buscada.
     */
    public static void searchPersonByID(List<Person> people, int id) {
        System.out.println("PESSOA COM ID = " + id + ":");
        System.out.println(separator);
        for (Person person : people) {
            if (person.getId() == id) {
                System.out.println(person + "\n  Documentos:");
                for (Document doc : person.getDocuments()) {
                    System.out.println("    " +doc.getDocumentType() + " - " + doc.getDocumentNumber());
                }
            }
        }
        System.out.println();
    }

    /**
     * 👉 Listagem de pessoas em ordem crescente de idade:
     * Lista as pessoas em ordem crescente de idade e exibe seus documentos.
     *
     * @param people A lista de pessoas a ser ordenada e exibida.
     */
    public static void listPeopleSortingAge(List<Person> people) {
        System.out.println("PESSOAS EM ORDEM CRESCENTE DE IDADE:");
        System.out.println(separator);
        people.sort(Comparator.comparingInt(Person::getAge));
        for (Person person : people) {
            System.out.println(person + "\n  Documentos:");
            for (Document doc : person.getDocuments()) {
                System.out.println("    " +doc.getDocumentType() + " - " + doc.getDocumentNumber());
            }
            System.out.println();
        }
    }

    /**
     * 👉 Pessoas com idade superior a 50 anos:
     * Exibe as pessoas com idade superior a 50 anos e seus documentos.
     *
     * @param people A lista de pessoas a ser verificada.
     */
    public static void AgeOverFifty(List<Person> people) {
        System.out.println("PESSOAS COM IDADE SUPERIOR A 50 ANOS:");
        System.out.println(separator);
        for (Person person : people) {
            if (person.getAge() > 50) {
                System.out.println(person + "\n  Documentos:");
                for (Document doc : person.getDocuments()) {
                    System.out.println("    " +doc.getDocumentType() + " - " + doc.getDocumentNumber());
                }
                System.out.println();
            }
        }
    }

    /**
     * 👉 Pessoas que não possuem CPF:
     * Exibe as pessoas que não possuem o documento do tipo CPF e seus documentos.
     *
     * @param people A lista de pessoas a ser verificada.
     */
    public static void withoutCpf(List<Person> people) {
        System.out.println("PESSOAS QUE NÃO POSSUEM CPF:");
        System.out.println(separator);
        for (Person person : people) {
            if (!person.hasDocumentType("CPF")) {
                System.out.println(person + "\n  Documentos:");
                for (Document doc : person.getDocuments()) {
                    System.out.println("    " +doc.getDocumentType() + " - " + doc.getDocumentNumber());
                }
                System.out.println();
            }
        }
    }

    /**
     * 👉 Listagem de tipos de documentos:
     * Exibe os tipos de documentos registrados no sistema e suas descrições e
     * caso não exista uma descrição para o item, exibirá "Sem descrição".
     *
     * @param people A lista de pessoas a ser analisada para extrair os tipos de documentos.
     */
    public static void documentTypes(List<Person> people) {
        System.out.println("TIPOS DE DOCUMENTOS:");
        System.out.println(separator);

        Map<String, String> typesDocuments = new HashMap<>();

        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            List<Document> docs = person.getDocuments();
            for (int j = 0; j < docs.size(); j++) {
                Document doc = docs.get(j);
                String tipo = doc.getDocumentType();
                String descricao = doc.getDocumentDescription();

                if (!typesDocuments.containsKey(tipo)) {
                    if (descricao != null) {
                        typesDocuments.put(tipo, descricao);
                    } else {
                        typesDocuments.put(tipo, "Sem descrição");
                    }
                } else if (typesDocuments.get(tipo).equals("Sem descrição") && descricao != null) {
                    typesDocuments.put(tipo, descricao);
                }
            }
        }

        for (String key : typesDocuments.keySet()) {
            System.out.println(key + " - " + typesDocuments.get(key));
        }
        System.out.println();
    }
}
