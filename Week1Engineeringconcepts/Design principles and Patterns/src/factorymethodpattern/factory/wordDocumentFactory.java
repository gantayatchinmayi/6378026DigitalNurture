package factory;

import documents.Document;
import documents.worddocument;

public class wordDocumentFactory extends Documentfactory {
    @Override
    public Document createDocument() {
        return new worddocument();
    }
}
