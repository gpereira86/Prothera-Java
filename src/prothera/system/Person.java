package prothera.system;

import java.util.ArrayList;
import java.util.List;

/**
 * 3 - Crie as classes Pessoa e Documento:
 *
 * <p>A classe `Person` representa uma pessoa com atributos como ID, nome, idade e documentos.
 * Ela permite o armazenamento e manipulação dos documentos associados a uma pessoa.</p>
 *
 * <p>Além disso, a classe oferece métodos para acessar e modificar as propriedades da pessoa,
 * bem como para verificar a existência de documentos de tipos específicos.</p>
 *
 * @author Glauco Pereira
 */
public class Person {

    /** O ID da pessoa. */
    private int id;

    /** O nome da pessoa. */
    private String name;

    /** A idade da pessoa. */
    private int age;

    /** A lista de documentos associados à pessoa. */
    private List<Document> documents;

    /**
     * Constrói uma nova pessoa com os dados fornecidos.
     *
     * @param id O ID da pessoa.
     * @param name O nome da pessoa.
     * @param age A idade da pessoa.
     */
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.documents = new ArrayList<>();
    }

    /**
     * Obtém o ID da pessoa.
     *
     * @return O ID da pessoa.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtém o nome da pessoa.
     *
     * @return O nome da pessoa.
     */
    public String getName() {
        return name;
    }

    /**
     * Obtém a idade da pessoa.
     *
     * @return A idade da pessoa.
     */
    public int getAge() {
        return age;
    }

    /**
     * Obtém a lista de documentos da pessoa.
     *
     * @return A lista de documentos.
     */
    public List<Document> getDocuments() {
        return documents;
    }

    /**
     * Adiciona um documento à lista de documentos da pessoa.
     *
     * @param document O documento a ser adicionado.
     */
    public void addDocument(Document document) {
        documents.add(document);
    }

    /**
     * Verifica se a pessoa possui um documento de um tipo específico.
     *
     * @param tipo O tipo de documento a ser verificado.
     * @return `true` se a pessoa tiver o documento desse tipo, `false` caso contrário.
     */
    public boolean hasDocumentType(String tipo) {
        for (Document doc : documents) {
            if (doc.getDocumentType().equals(tipo)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Define o ID da pessoa.
     *
     * @param id O novo ID da pessoa.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Define a idade da pessoa.
     *
     * @param age A nova idade da pessoa.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Define o nome da pessoa.
     *
     * @param name O novo nome da pessoa.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retorna uma representação em string da pessoa, com seu ID, nome, idade e a quantidade de documentos.
     *
     * @return Uma string representando a pessoa.
     */
    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + name + " | Idade: " + age + " | Documentos: " + documents.size();
    }
}
