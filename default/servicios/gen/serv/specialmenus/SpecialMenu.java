package serv.specialmenus;

import org.monet.bpi.FieldSerial;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import serv.specialmenus.Indice;

@SuppressWarnings("all")
public class SpecialMenu extends NodeFormImpl {
  public FieldText getFirstCourseField() {
    return ((org.monet.bpi.FieldText)this.getField("SpecialMenu", "FirstCourse"));
  }
  
  public String getFirstCourse() {
    return ((org.monet.bpi.FieldText)this.getField("SpecialMenu", "FirstCourse")).get();
  }
  
  public void setFirstCourse(final String value) {
    this.getFirstCourseField().set(value);
  }
  
  public FieldText getMainCourseField() {
    return ((org.monet.bpi.FieldText)this.getField("SpecialMenu", "MainCourse"));
  }
  
  public String getMainCourse() {
    return ((org.monet.bpi.FieldText)this.getField("SpecialMenu", "MainCourse")).get();
  }
  
  public void setMainCourse(final String value) {
    this.getMainCourseField().set(value);
  }
  
  public FieldText getDessertField() {
    return ((org.monet.bpi.FieldText)this.getField("SpecialMenu", "Dessert"));
  }
  
  public String getDessert() {
    return ((org.monet.bpi.FieldText)this.getField("SpecialMenu", "Dessert")).get();
  }
  
  public void setDessert(final String value) {
    this.getDessertField().set(value);
  }
  
  public FieldText getSuitableField() {
    return ((org.monet.bpi.FieldText)this.getField("SpecialMenu", "Suitable"));
  }
  
  public String getSuitable() {
    return ((org.monet.bpi.FieldText)this.getField("SpecialMenu", "Suitable")).get();
  }
  
  public void setSuitable(final String value) {
    this.getSuitableField().set(value);
  }
  
  public FieldSerial getIdentifierField() {
    return ((org.monet.bpi.FieldSerial)this.getField("SpecialMenu", "Identifier"));
  }
  
  public String getIdentifier() {
    return ((org.monet.bpi.FieldSerial)this.getField("SpecialMenu", "Identifier")).get();
  }
  
  public void setIdentifier(final String value) {
    this.getIdentifierField().set(value);
  }
  
  public Indice getIndice() {
    return (serv.specialmenus.Indice)this.getIndexEntry("serv.SpecialMenus.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static SpecialMenu createNew(final Node parent) {
    return (serv.specialmenus.SpecialMenu)org.monet.bpi.NodeService.create(serv.specialmenus.SpecialMenu.class, parent);
  }
}
