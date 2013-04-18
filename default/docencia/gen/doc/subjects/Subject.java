package doc.subjects;

import doc.subjects.Indice;
import org.monet.bpi.FieldSerial;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;

@SuppressWarnings("all")
public class Subject extends NodeFormImpl {
  public FieldText getNameField() {
    return ((org.monet.bpi.FieldText)this.getField("Subject", "Name"));
  }
  
  public String getName() {
    return ((org.monet.bpi.FieldText)this.getField("Subject", "Name")).get();
  }
  
  public void setName(final String value) {
    this.getNameField().set(value);
  }
  
  public FieldText getAreaField() {
    return ((org.monet.bpi.FieldText)this.getField("Subject", "Area"));
  }
  
  public String getArea() {
    return ((org.monet.bpi.FieldText)this.getField("Subject", "Area")).get();
  }
  
  public void setArea(final String value) {
    this.getAreaField().set(value);
  }
  
  public FieldSerial getIdentifierField() {
    return ((org.monet.bpi.FieldSerial)this.getField("Subject", "Identifier"));
  }
  
  public String getIdentifier() {
    return ((org.monet.bpi.FieldSerial)this.getField("Subject", "Identifier")).get();
  }
  
  public void setIdentifier(final String value) {
    this.getIdentifierField().set(value);
  }
  
  public Indice getIndice() {
    return (doc.subjects.Indice)this.getIndexEntry("doc.Subjects.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Subject createNew(final Node parent) {
    return (doc.subjects.Subject)org.monet.bpi.NodeService.create(doc.subjects.Subject.class, parent);
  }
}
