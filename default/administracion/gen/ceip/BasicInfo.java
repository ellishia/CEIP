package ceip;

import ceip.basicinfo.Address;
import ceip.students.Index;
import java.util.ArrayList;
import org.monet.bpi.FieldDate;
import org.monet.bpi.FieldMultiple;
import org.monet.bpi.FieldNode;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Link;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class BasicInfo extends NodeFormImpl {
  public Index getIndex() {
    return (ceip.students.Index)this.getIndexEntry("ceip.Students.Index");
  }
  
  public FieldText getNameField() {
    return ((org.monet.bpi.FieldText)this.getField("BasicInfo", "Name"));
  }
  
  public String getName() {
    return ((org.monet.bpi.FieldText)this.getField("BasicInfo", "Name")).get();
  }
  
  public void setName(final String value) {
    this.getNameField().set(value);
  }
  
  public FieldText getSurnameField() {
    return ((org.monet.bpi.FieldText)this.getField("BasicInfo", "Surname"));
  }
  
  public String getSurname() {
    return ((org.monet.bpi.FieldText)this.getField("BasicInfo", "Surname")).get();
  }
  
  public void setSurname(final String value) {
    this.getSurnameField().set(value);
  }
  
  public FieldSelect getLevelField() {
    return ((org.monet.bpi.FieldSelect)this.getField("BasicInfo", "Level"));
  }
  
  public Term getLevel() {
    return ((org.monet.bpi.FieldSelect)this.getField("BasicInfo", "Level")).get();
  }
  
  public void setLevel(final Term value) {
    this.getLevelField().set(value);
  }
  
  public FieldText getCialField() {
    return ((org.monet.bpi.FieldText)this.getField("BasicInfo", "Cial"));
  }
  
  public String getCial() {
    return ((org.monet.bpi.FieldText)this.getField("BasicInfo", "Cial")).get();
  }
  
  public void setCial(final String value) {
    this.getCialField().set(value);
  }
  
  public FieldDate getDate_of_BirthField() {
    return ((org.monet.bpi.FieldDate)this.getField("BasicInfo", "Date_of_Birth"));
  }
  
  public Date getDate_of_Birth() {
    return ((org.monet.bpi.FieldDate)this.getField("BasicInfo", "Date_of_Birth")).get();
  }
  
  public void setDate_of_Birth(final Date value) {
    this.getDate_of_BirthField().set(value);
  }
  
  public Address getAddressField() {
    return ((ceip.basicinfo.Address)this.getField("BasicInfo", "Address"));
  }
  
  public FieldMultiple<FieldNode,Link> getBoletinField() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldNode, org.monet.bpi.types.Link>)this.getField("BasicInfo", "Boletin"));
  }
  
  public ArrayList<Link> getBoletin() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldNode, org.monet.bpi.types.Link>)this.getField("BasicInfo", "Boletin")).getAll();
  }
  
  public ArrayList<Term> getBoletinAsTerm() {
    return ((org.monet.bpi.FieldMultiple<org.monet.bpi.FieldNode, org.monet.bpi.types.Link>)this.getField("BasicInfo", "Boletin")).getAllAsTerm();
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static BasicInfo createNew(final Node parent) {
    return (ceip.BasicInfo)org.monet.bpi.NodeService.create(ceip.BasicInfo.class, parent);
  }
}
