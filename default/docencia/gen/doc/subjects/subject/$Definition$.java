package doc.subjects.subject;

import doc.subjects.subject.AreaProperty;
import doc.subjects.subject.IdentifierProperty;
import doc.subjects.subject.NameProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasProperties;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasProperties, HasMappings {
  public $Definition$() {
    super();this._code = "mqk5h_g";
    this._name = "doc.Subjects.Subject";
    this._isAbstract = null;this._label = "Asignatura";
    this.addTextFieldProperty(Name);
    this.addTextFieldProperty(Area);
    this.addSerialFieldProperty(Identifier);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty4 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty4.setIndex(new org.monet.metamodel.internal.Ref("doc.Subjects.Indice"));
    this.getMappingList().add(mappingProperty4);
    org.monet.metamodel.FormDefinition.PropertiesProperty propertiesProperty6 = new org.monet.metamodel.FormDefinition.PropertiesProperty();
    this.setProperties(propertiesProperty6);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty8 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty8.setLabel("Especificación de Asignatura");
    formViewProperty8.setCode("mnl1skw");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty9 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Name","doc.Subjects.Subject","doc.Subjects.Subject.Name"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Area","doc.Subjects.Subject","doc.Subjects.Subject.Area"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Identifier","doc.Subjects.Subject","doc.Subjects.Subject.Identifier"));
    formViewProperty8.setShow(showProperty9);
    this.addView(formViewProperty8);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.subjects.subject.$Definition$.class,"doc.Subjects.Subject",null);
  }
  }
  
  public static String static_getName() {
    return "Subject";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.subjects.Subject.class;
  }
  
  public String getClientBehaviour() {
    return "var mqk5h_g = new Object();mqk5h_g.refresh = function (node) {if (!node.isEditable()) return;};mqk5h_g.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getPropertiesClass() {
    return doc.subjects.subject.$Properties$.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case 1297648867:
    return doc.subjects.subject.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final NameProperty Name = new doc.subjects.subject.NameProperty();
  
  private final AreaProperty Area = new doc.subjects.subject.AreaProperty();
  
  private final IdentifierProperty Identifier = new doc.subjects.subject.IdentifierProperty();
}
