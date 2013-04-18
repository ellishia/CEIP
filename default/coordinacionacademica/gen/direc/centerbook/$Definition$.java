package direc.centerbook;

import direc.centerbook.AuthorProperty;
import direc.centerbook.EditorialProperty;
import direc.centerbook.IdentifierProperty;
import direc.centerbook.InUseSinceProperty;
import direc.centerbook.LevelProperty;
import direc.centerbook.PublicationYearProperty;
import direc.centerbook.TitleProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasProperties;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasProperties, HasMappings {
  public $Definition$() {
    super();this._code = "muke6tq";
    this._name = "direc.CenterBook";
    this._isAbstract = null;this._label = "Referencia Bibliográfica";
    this.addTextFieldProperty(Title);
    this.addSerialFieldProperty(Identifier);
    this.addTextFieldProperty(Editorial);
    this.addTextFieldProperty(Author);
    this.addDateFieldProperty(PublicationYear);
    this.addSelectFieldProperty(Level);
    this.addSelectFieldProperty(InUseSince);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty8 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty8.setIndex(new org.monet.metamodel.internal.Ref("direc.CenterBooks.Indice"));
    this.getMappingList().add(mappingProperty8);
    org.monet.metamodel.FormDefinition.PropertiesProperty propertiesProperty10 = new org.monet.metamodel.FormDefinition.PropertiesProperty();
    this.setProperties(propertiesProperty10);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty12 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty12.setLabel("Ficha de Libro");
    formViewProperty12.setCode("asfas");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty13 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty13.getField().add(new org.monet.metamodel.internal.Ref("Title","direc.CenterBook","direc.CenterBook.Title"));
    showProperty13.getField().add(new org.monet.metamodel.internal.Ref("Editorial","direc.CenterBook","direc.CenterBook.Editorial"));
    showProperty13.getField().add(new org.monet.metamodel.internal.Ref("Author","direc.CenterBook","direc.CenterBook.Author"));
    showProperty13.getField().add(new org.monet.metamodel.internal.Ref("PublicationYear","direc.CenterBook","direc.CenterBook.PublicationYear"));
    showProperty13.getField().add(new org.monet.metamodel.internal.Ref("Level","direc.CenterBook","direc.CenterBook.Level"));
    showProperty13.getField().add(new org.monet.metamodel.internal.Ref("InUseSince","direc.CenterBook","direc.CenterBook.InUseSince"));
    formViewProperty12.setShow(showProperty13);
    this.addView(formViewProperty12);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.centerbook.$Definition$.class,"direc.CenterBook",null);
  }
  }
  
  public static String static_getName() {
    return "CenterBook";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.CenterBook.class;
  }
  
  public String getClientBehaviour() {
    return "var muke6tq = new Object();muke6tq.refresh = function (node) {if (!node.isEditable()) return;};muke6tq.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getPropertiesClass() {
    return direc.centerbook.$Properties$.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -2134398080:
    return direc.centerbook.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final TitleProperty Title = new direc.centerbook.TitleProperty();
  
  private final IdentifierProperty Identifier = new direc.centerbook.IdentifierProperty();
  
  private final EditorialProperty Editorial = new direc.centerbook.EditorialProperty();
  
  private final AuthorProperty Author = new direc.centerbook.AuthorProperty();
  
  private final PublicationYearProperty PublicationYear = new direc.centerbook.PublicationYearProperty();
  
  private final LevelProperty Level = new direc.centerbook.LevelProperty();
  
  private final InUseSinceProperty InUseSince = new direc.centerbook.InUseSinceProperty();
}
