package Code;

public class PDFFactory extends DocumentFactory {
    public Document createDocument(){
        return new PDFDocument();
    }
}
