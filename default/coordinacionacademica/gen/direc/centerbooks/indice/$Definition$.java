package direc.centerbooks.indice;

import direc.centerbooks.indice.EditorialProperty;
import direc.centerbooks.indice.LevelProperty;
import direc.centerbooks.indice.PublicationYearProperty;
import direc.centerbooks.indice.TitleProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "im67xsww";
    this._name = "direc.CenterBooks.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Title);
    referenceProperty1.addAttributeProperty(Level);
    referenceProperty1.addAttributeProperty(Editorial);
    referenceProperty1.addAttributeProperty(PublicationYear);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty6.setCode("mcag7og");
    indexViewProperty6.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty6.setTitle(new org.monet.metamodel.internal.Ref("Title","direc.CenterBooks.Indice","direc.CenterBooks.Indice.Title"));
    indexViewProperty6.setShow(showProperty6);
    this.addView(indexViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.centerbooks.indice.$Definition$.class,"direc.CenterBooks.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.centerbooks.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var im67xsww = new Object();im67xsww.refresh = function (node) {if (!node.isEditable()) return;};im67xsww.onChangeField = function (node, field) {};";
  }
  
  private final TitleProperty Title = new direc.centerbooks.indice.TitleProperty();
  
  private final LevelProperty Level = new direc.centerbooks.indice.LevelProperty();
  
  private final EditorialProperty Editorial = new direc.centerbooks.indice.EditorialProperty();
  
  private final PublicationYearProperty PublicationYear = new direc.centerbooks.indice.PublicationYearProperty();
}
