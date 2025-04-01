package prothera.system;

import java.util.*;

public class Functions {

    static String separator = "----------------------------------------";

//    👉 Pessoa com ID = 2.
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
