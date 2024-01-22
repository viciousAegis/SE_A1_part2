// class Support {
//     -documents: List<Document>

//     +getAllDocuments(): List<Document>
//     +getDocumentByTopic(String topic): Document
//     +getDocumentById(int id): Document

//     -addDocument(): Boolean
//     -updateDocument(Document document): Boolean
//     -deleteDocument(Document document): Boolean
// }
import java.util.List;
import java.util.ArrayList;

public class Support {
    private List<Document> documents; // list of documents

    // constructor
    public Support() {
        this.documents = new ArrayList<Document>();
    }

    // methods
    public List<Document> getAllDocuments() {
        return this.documents;
    }

    public Document getDocumentByTopic(String topic) {
        // get document by topic
        return new Document();
    }

    public Document getDocumentById(int id) {
        // get document by id
        return new Document();
    }

    private Boolean addDocument() {
        // add document
        return true;
    }

    private Boolean updateDocument(Document document) {
        // update document
        return true;
    }

    private Boolean deleteDocument(Document document) {
        // delete document
        return true;
    }
    
}
