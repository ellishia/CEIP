package direc;

import direc.centerbooks.Indice;
import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldSerial;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class CenterBook extends NodeFormImpl {
  public FieldText getTitleField() {
    return ((org.monet.bpi.FieldText)this.getField("CenterBook", "Title"));
  }
  
  public String getTitle() {
    return ((org.monet.bpi.FieldText)this.getField("CenterBook", "Title")).get();
  }
  
  public void setTitle(final String value) {
    this.getTitleField().set(value);
  }
  
  public FieldSerial getIdentifierField() {
    return ((org.monet.bpi.FieldSerial)this.getField("CenterBook", "Identifier"));
  }
  
  public String getIdentifier() {
    return ((org.monet.bpi.FieldSerial)this.getField("CenterBook", "Identifier")).get();
  }
  
  public void setIdentifier(final String value) {
    this.getIdentifierField().set(value);
  }
  
  public FieldText getEditorialField() {
    return ((org.monet.bpi.FieldText)this.getField("CenterBook", "Editorial"));
  }
  
  public String getEditorial() {
    return ((org.monet.bpi.FieldText)this.getField("CenterBook", "Editorial")).get();
  }
  
  public void setEditorial(final String value) {
    this.getEditorialField().set(value);
  }
  
  public FieldText getAuthorField() {
    return ((org.monet.bpi.FieldText)this.getField("CenterBook", "Author"));
  }
  
  public String getAuthor() {
    return ((org.monet.bpi.FieldText)this.getField("CenterBook", "Author")).get();
  }
  
  public void setAuthor(final String value) {
    this.getAuthorField().set(value);
  }
  
  public FieldDate getPublicationYearField() {
    return ((org.monet.bpi.FieldDate)this.getField("CenterBook", "PublicationYear"));
  }
  
  public Date getPublicationYear() {
    return ((org.monet.bpi.FieldDate)this.getField("CenterBook", "PublicationYear")).get();
  }
  
  public void setPublicationYear(final Date value) {
    this.getPublicationYearField().set(value);
  }
  
  public FieldSelect getLevelField() {
    return ((org.monet.bpi.FieldSelect)this.getField("CenterBook", "Level"));
  }
  
  public Term getLevel() {
    return ((org.monet.bpi.FieldSelect)this.getField("CenterBook", "Level")).get();
  }
  
  public void setLevel(final Term value) {
    this.getLevelField().set(value);
  }
  
  public FieldSelect getInUseSinceField() {
    return ((org.monet.bpi.FieldSelect)this.getField("CenterBook", "InUseSince"));
  }
  
  public Term getInUseSince() {
    return ((org.monet.bpi.FieldSelect)this.getField("CenterBook", "InUseSince")).get();
  }
  
  public void setInUseSince(final Term value) {
    this.getInUseSinceField().set(value);
  }
  
  public Indice getIndice() {
    return (direc.centerbooks.Indice)this.getIndexEntry("direc.CenterBooks.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static CenterBook createNew(final Node parent) {
    return (direc.CenterBook)org.monet.bpi.NodeService.create(direc.CenterBook.class, parent);
  }
}
