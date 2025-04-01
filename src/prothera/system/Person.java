package prothera.system;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private int id;
    private String name;
    private int age;
    private List<Document> documents;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.documents = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void addDocument(Document document) {
        documents.add(document);
    }

    public boolean hasDocumentType(String tipo) {
        for (Document doc : documents) {
            if (doc.getDocumentType().equals(tipo)) {
                return true;
            }
        }
        return false;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + name + " | Idade: " + age + " | Documentos: " + documents.size();
    }
}
