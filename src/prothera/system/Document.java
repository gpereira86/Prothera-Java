package prothera.system;

public class Document {
    private String documentType;
    private String documentNumber;
    private String documentDescription;

    public Document(String documentType, String documentNumber, String documentDescription) {
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.documentDescription = documentDescription;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getDocumentDescription() {
        return documentDescription;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setDocumentDescription(String documentDescription) {
        this.documentDescription = documentDescription;
    }

    @Override
    public String toString() {
        return documentType + " - " + documentNumber + "-" + documentDescription;
    }
}
