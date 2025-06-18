import documents.Document;
import factory.Documentfactory;
import factory.excelDocumentFactory;
import factory.pdfDocumentFactory;
import factory.wordDocumentFactory;

public class Main {
    public static void main(String[] args) {

        Documentfactory wordFactory = new wordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.save();
        wordDoc.close();

        Documentfactory pdfFactory = new pdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        pdfDoc.save();
        pdfDoc.close();

        Documentfactory excelFactory = new excelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
        excelDoc.save();
        excelDoc.close();

        System.out.println("\nUsing processDocument method:");
        wordFactory.processDocument();
        pdfFactory.processDocument();
        excelFactory.processDocument();
    }
}
/*
 * output :
 * Opening Word document
 * Saving Word document
 * Closing Word document
 * Opening PDF document
 * Saving PDF document
 * Closing PDF document
 * Opening Excel document
 * Saving Excel document
 * Closing Excel document
 * 
 * Using processDocument method:
 * Opening Word document
 * Saving Word document
 * Closing Word document
 * Opening PDF document
 * Saving PDF document
 * Closing PDF document
 * Opening Excel document
 * Saving Excel document
 * Closing Excel document
 * PS
 * C:\Users\USER\OneDrive\Desktop\chinmayee\week1\FactoryMethodPatternExample\
 * src>
 */