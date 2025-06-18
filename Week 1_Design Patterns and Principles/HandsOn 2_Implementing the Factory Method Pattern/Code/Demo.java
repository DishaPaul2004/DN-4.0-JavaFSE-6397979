//Product interface
interface WordDocument
{
    public void createWordDocument();
}
interface PdfDocument
{
    public void createPdfDocument();
}
interface ExcelDocument
{
    public void createExcelDocument();
}
//Concrete products
class concreteWord implements WordDocument
{
    public void createWordDocument()
    {
        System.out.println("Word document created");
    }
}
class concretePDF implements PdfDocument
{
    public void createPdfDocument()
    {
        System.out.println("PDF document created");
    }
}
class concreteExcel implements ExcelDocument
{
    public void createExcelDocument()
    {
        System.out.println("Excel document created");
    }
}
//Factory interface
abstract class DocumentFactory
{
    abstract public void createDocument();
}
//Concrete factories
class WordDocumentFactory extends DocumentFactory
{
    public void createDocument()
    {
        concreteWord ob=new concreteWord();
        ob.createWordDocument();
    }
}
class PdfDocumentFactory extends DocumentFactory
{
    public void createDocument()
    {
        concretePDF ob=new concretePDF();
        ob.createPdfDocument();
    }
}
class ExcelDocumentFactory extends DocumentFactory
{
    public void createDocument()
    {
        concreteExcel ob=new concreteExcel();
        ob.createExcelDocument();
    }
}
//test class
class Demo
{
    public static void main(String[] args) {
        System.out.println("Calling createDocument() of the WordDocumentFactory class");
        WordDocumentFactory ob1=new WordDocumentFactory();
        ob1.createDocument();
        System.out.println("Calling createDocument() of the PdfDocumentFactory class");
        PdfDocumentFactory ob2=new PdfDocumentFactory();
        ob2.createDocument();
        System.out.println("Calling createDocument() of the ExcelDocumentFactory class");
        ExcelDocumentFactory ob3=new ExcelDocumentFactory();
        ob3.createDocument();
    }
}
/*
OUTPUT
---------------------------------------------------------
Calling createDocument() of the WordDocumentFactory class
Word document created
Calling createDocument() of the PdfDocumentFactory class
PDF document created
Calling createDocument() of the ExcelDocumentFactory class
Excel document created
 */