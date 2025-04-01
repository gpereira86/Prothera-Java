package prothera.system;

/**
 * 3 - Crie as classes Pessoa e Documento:
 *
 * <p>A classe `Document` representa um documento com um tipo, número e descrição.
 * Ela permite o armazenamento e manipulação das informações relacionadas a um documento.</p>
 *
 * <p>A classe fornece métodos para acessar e modificar os atributos de um documento e também
 * para obter uma representação em string do documento.</p>
 *
 * @author Glauco Pereira
 */
public class Document {

    /** O tipo do documento (ex: CPF, RG, etc.). */
    private String documentType;

    /** O número do documento. */
    private String documentNumber;

    /** A descrição do documento. */
    private String documentDescription;

    /**
     * Constrói um novo documento com os dados fornecidos.
     *
     * @param documentType O tipo do documento.
     * @param documentNumber O número do documento.
     * @param documentDescription A descrição do documento.
     */
    public Document(String documentType, String documentNumber, String documentDescription) {
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.documentDescription = documentDescription;
    }

    /**
     * Obtém o tipo do documento.
     *
     * @return O tipo do documento.
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Obtém o número do documento.
     *
     * @return O número do documento.
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Obtém a descrição do documento.
     *
     * @return A descrição do documento.
     */
    public String getDocumentDescription() {
        return documentDescription;
    }

    /**
     * Define o tipo do documento.
     *
     * @param documentType O novo tipo do documento.
     */
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * Define o número do documento.
     *
     * @param documentNumber O novo número do documento.
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /**
     * Define a descrição do documento.
     *
     * @param documentDescription A nova descrição do documento.
     */
    public void setDocumentDescription(String documentDescription) {
        this.documentDescription = documentDescription;
    }

    /**
     * Retorna uma representação em string do documento, contendo seu tipo, número e descrição.
     *
     * @return Uma string representando o documento.
     */
    @Override
    public String toString() {
        return documentType + " - " + documentNumber + " - " + documentDescription;
    }
}
