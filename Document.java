// class Document {
//     -documentId: int
//     -documentTopic: String
//     -documentUrl: String
//     -documentInformation: String

//     +getDocumentId(): int
//     +getDocumentTopic(): String
//     +getDocumentUrl(): String
//     +getDocumentInformation(): String
// }

public class Document {
    private int documentId; // document ID
    private String documentTopic; // document topic
    private String documentUrl; // document URL
    private String documentInformation; // document information

    public Document() {
        this.documentId = 0;
        this.documentTopic = "";
        this.documentUrl = "";
        this.documentInformation = "";
    }

    // constructor
    public Document(int documentId, String documentTopic, String documentUrl, String documentInformation) {
        this.documentId = documentId;
        this.documentTopic = documentTopic;
        this.documentUrl = documentUrl;
        this.documentInformation = documentInformation;
    }

    // methods
    public int getDocumentId() {
        return this.documentId;
    }

    public String getDocumentTopic() {
        return this.documentTopic;
    }

    public String getDocumentUrl() {
        return this.documentUrl;
    }

    public String getDocumentInformation() {
        return this.documentInformation;
    }
    
}
