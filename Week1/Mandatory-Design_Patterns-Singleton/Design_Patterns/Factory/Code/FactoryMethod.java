package Code;

public class FactoryMethod {
   public static void main(String[] args){
      DocumentFactory obj1 = new PDFFactory();
      Document PDF = obj1.createDocument();
       PDF.open();
       DocumentFactory obj2 = new WordDocumentFactory();
       Document word = obj2.createDocument();
       word.open();
       DocumentFactory obj3 = new ExcelFactory();
       Document excel = obj3.createDocument();
       excel.open();
   }

}
