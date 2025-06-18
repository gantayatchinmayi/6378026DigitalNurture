package factory;

import documents.Document;
import documents.pdfdocument;

public class pdfDocumentFactory extends Documentfactory {
    @Override
    public Document createDocument() {
        return new pdfdocument();
    }
}