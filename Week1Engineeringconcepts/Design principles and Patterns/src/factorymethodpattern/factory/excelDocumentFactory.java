package factory;

import documents.Document;
import documents.exceldocument;

public class excelDocumentFactory extends Documentfactory {
    @Override
    public Document createDocument() {
        return new exceldocument();
    }
}