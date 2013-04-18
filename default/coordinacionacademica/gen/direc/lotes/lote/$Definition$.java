package direc.lotes.lote;

import direc.lotes.lote.AcademicYearProperty;
import direc.lotes.lote.BooksProperty;
import direc.lotes.lote.IdentifierProperty;
import direc.lotes.lote.LevelProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasProperties;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasProperties, HasMappings {
  public $Definition$() {
    super();this._code = "mrfnkdw";
    this._name = "direc.Lotes.Lote";
    this._isAbstract = null;this._label = "Lote";
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty1 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty1.setIndex(new org.monet.metamodel.internal.Ref("direc.Lotes.Index"));
    this.getMappingList().add(mappingProperty1);
    this.addSerialFieldProperty(Identifier);
    this.addSelectFieldProperty(AcademicYear);
    this.addSelectFieldProperty(Level);
    this.addLinkFieldProperty(Books);
    org.monet.metamodel.FormDefinition.PropertiesProperty propertiesProperty7 = new org.monet.metamodel.FormDefinition.PropertiesProperty();
    this.setProperties(propertiesProperty7);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty9 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty9.setLabel("Ficha");
    formViewProperty9.setCode("mwzxzuw");
    formViewProperty9.setName("Vista");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty10 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("Identifier","direc.Lotes.Lote","direc.Lotes.Lote.Identifier"));
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","direc.Lotes.Lote","direc.Lotes.Lote.AcademicYear"));
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("Level","direc.Lotes.Lote","direc.Lotes.Lote.Level"));
    formViewProperty9.setShow(showProperty10);
    this.addView(formViewProperty9);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty15 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty15.setLabel("Libros del Lote");
    formViewProperty15.setCode("mxbwg7q");
    formViewProperty15.setName("ViewBooks");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty16 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty16.getField().add(new org.monet.metamodel.internal.Ref("Books","direc.Lotes.Lote","direc.Lotes.Lote.Books"));
    formViewProperty15.setShow(showProperty16);
    this.addView(formViewProperty15);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.lotes.lote.$Definition$.class,"direc.Lotes.Lote",null);
  }
  }
  
  public static String static_getName() {
    return "Lote";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.lotes.Lote.class;
  }
  
  public String getClientBehaviour() {
    return "var mrfnkdw = new Object();mrfnkdw.refresh = function (node) {if (!node.isEditable()) return;};mrfnkdw.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getPropertiesClass() {
    return direc.lotes.lote.$Properties$.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case 1219056049:
    return direc.lotes.lote.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final IdentifierProperty Identifier = new direc.lotes.lote.IdentifierProperty();
  
  private final AcademicYearProperty AcademicYear = new direc.lotes.lote.AcademicYearProperty();
  
  private final LevelProperty Level = new direc.lotes.lote.LevelProperty();
  
  private final BooksProperty Books = new direc.lotes.lote.BooksProperty();
}
