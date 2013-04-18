package doc.alumnado.student;

import doc.alumnado.student.BirthDateProperty;
import doc.alumnado.student.CialProperty;
import doc.alumnado.student.DataProperty;
import doc.alumnado.student.NameProperty;
import doc.alumnado.student.SurnameProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasProperties;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasProperties, HasMappings {
  public $Definition$() {
    super();this._code = "mm2f2hg";
    this._name = "doc.Alumnado.Student";
    this._isAbstract = null;this._label = "Alumno/a";
    this.addTextFieldProperty(Name);
    this.addTextFieldProperty(Surname);
    this.addTextFieldProperty(Cial);
    this.addDateFieldProperty(BirthDate);
    this.addTextFieldProperty(Data);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty6 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty6.setIndex(new org.monet.metamodel.internal.Ref("doc.Alumnado.Indice"));
    this.getMappingList().add(mappingProperty6);
    org.monet.metamodel.FormDefinition.PropertiesProperty propertiesProperty8 = new org.monet.metamodel.FormDefinition.PropertiesProperty();
    this.setProperties(propertiesProperty8);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty10 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty10.setLabel("Ficha");
    formViewProperty10.setCode("fas");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty11 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Name","doc.Alumnado.Student","doc.Alumnado.Student.Name"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Surname","doc.Alumnado.Student","doc.Alumnado.Student.Surname"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Cial","doc.Alumnado.Student","doc.Alumnado.Student.Cial"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("BirthDate","doc.Alumnado.Student","doc.Alumnado.Student.BirthDate"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Data","doc.Alumnado.Student","doc.Alumnado.Student.Data"));
    formViewProperty10.setShow(showProperty11);
    this.addView(formViewProperty10);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.alumnado.student.$Definition$.class,"doc.Alumnado.Student",null);
  }
  }
  
  public static String static_getName() {
    return "Student";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.alumnado.Student.class;
  }
  
  public String getClientBehaviour() {
    return "var mm2f2hg = new Object();mm2f2hg.refresh = function (node) {if (!node.isEditable()) return;};mm2f2hg.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getPropertiesClass() {
    return doc.alumnado.student.$Properties$.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case 2065139823:
    return doc.alumnado.student.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final NameProperty Name = new doc.alumnado.student.NameProperty();
  
  private final SurnameProperty Surname = new doc.alumnado.student.SurnameProperty();
  
  private final CialProperty Cial = new doc.alumnado.student.CialProperty();
  
  private final BirthDateProperty BirthDate = new doc.alumnado.student.BirthDateProperty();
  
  private final DataProperty Data = new doc.alumnado.student.DataProperty();
}
