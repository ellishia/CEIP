package direc.lotes;

import direc.lotes.Index;
import java.util.ArrayList;
import org.monet.bpi.FieldLink;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldSerial;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class Lote extends NodeFormImpl {
  public Index getIndex() {
    return (direc.lotes.Index)this.getIndexEntry("direc.Lotes.Index");
  }
  
  public FieldSerial getIdentifierField() {
    return ((org.monet.bpi.FieldSerial)this.getField("Lote", "Identifier"));
  }
  
  public String getIdentifier() {
    return ((org.monet.bpi.FieldSerial)this.getField("Lote", "Identifier")).get();
  }
  
  public void setIdentifier(final String value) {
    this.getIdentifierField().set(value);
  }
  
  public FieldSelect getAcademicYearField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Lote", "AcademicYear"));
  }
  
  public Term getAcademicYear() {
    return ((org.monet.bpi.FieldSelect)this.getField("Lote", "AcademicYear")).get();
  }
  
  public void setAcademicYear(final Term value) {
    this.getAcademicYearField().set(value);
  }
  
  public FieldSelect getLevelField() {
    return ((org.monet.bpi.FieldSelect)this.getField("Lote", "Level"));
  }
  
  public Term getLevel() {
    return ((org.monet.bpi.FieldSelect)this.getField("Lote", "Level")).get();
  }
  
  public void setLevel(final Term value) {
    this.getLevelField().set(value);
  }
  
  public FieldMultiple<FieldLink,Link> getBooksField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("Lote", "Books"));
  }
  
  public ArrayList<Link> getBooks() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("Lote", "Books")).getAll();
  }
  
  public ArrayList<Term> getBooksAsTerm() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldLink, org.monet.bpi.types.Link>)this.getField("Lote", "Books")).getAllAsTerm();
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static Lote createNew(final Node parent) {
    return (direc.lotes.Lote)org.monet.bpi.NodeService.create(direc.lotes.Lote.class, parent);
  }
}
