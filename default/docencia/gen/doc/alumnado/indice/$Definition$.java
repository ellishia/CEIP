package doc.alumnado.indice;

import doc.alumnado.indice.BirthDateProperty;
import doc.alumnado.indice.CialProperty;
import doc.alumnado.indice.NameProperty;
import doc.alumnado.indice.SurnameProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "im1knjrg";
    this._name = "doc.Alumnado.Indice";
    this._isAbstract = null;this._label = "Alumnado";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Name);
    referenceProperty1.addAttributeProperty(Surname);
    referenceProperty1.addAttributeProperty(Cial);
    referenceProperty1.addAttributeProperty(BirthDate);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty6.setCode("i");
    indexViewProperty6.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Name","doc.Alumnado.Indice","doc.Alumnado.Indice.Name"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Surname","doc.Alumnado.Indice","doc.Alumnado.Indice.Surname"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Cial","doc.Alumnado.Indice","doc.Alumnado.Indice.Cial"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("BirthDate","doc.Alumnado.Indice","doc.Alumnado.Indice.BirthDate"));
    indexViewProperty6.setShow(showProperty6);
    this.addView(indexViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.alumnado.indice.$Definition$.class,"doc.Alumnado.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.alumnado.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var im1knjrg = new Object();im1knjrg.refresh = function (node) {if (!node.isEditable()) return;};im1knjrg.onChangeField = function (node, field) {};";
  }
  
  private final NameProperty Name = new doc.alumnado.indice.NameProperty();
  
  private final SurnameProperty Surname = new doc.alumnado.indice.SurnameProperty();
  
  private final CialProperty Cial = new doc.alumnado.indice.CialProperty();
  
  private final BirthDateProperty BirthDate = new doc.alumnado.indice.BirthDateProperty();
}
