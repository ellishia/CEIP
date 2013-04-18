package doc.absences.absence;

import doc.absences.absence.AreasProperty;
import doc.absences.absence.DateProperty;
import doc.absences.absence.HourProperty;
import doc.absences.absence.JustificanteProperty;
import doc.absences.absence.StudentProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mdlztvq";
    this._name = "doc.Absences.Absence";
    this._isAbstract = null;this._label = "Ausencia";
    this.addDateFieldProperty(Date);
    this.addTextFieldProperty(Hour);
    this.addSelectFieldProperty(Areas);
    this.addLinkFieldProperty(Student);
    this.addFileFieldProperty(Justificante);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty6 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty6.setIndex(new org.monet.metamodel.internal.Ref("doc.Absences.Indice"));
    this.getMappingList().add(mappingProperty6);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty8 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty8.setLabel("Ausencia");
    formViewProperty8.setCode("asfda");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty9 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Date","doc.Absences.Absence","doc.Absences.Absence.Date"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Hour","doc.Absences.Absence","doc.Absences.Absence.Hour"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Areas","doc.Absences.Absence","doc.Absences.Absence.Areas"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Student","doc.Absences.Absence","doc.Absences.Absence.Student"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Justificante","doc.Absences.Absence","doc.Absences.Absence.Justificante"));
    formViewProperty8.setShow(showProperty9);
    this.addView(formViewProperty8);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.absences.absence.$Definition$.class,"doc.Absences.Absence",null);
  }
  }
  
  public static String static_getName() {
    return "Absence";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.absences.Absence.class;
  }
  
  public String getClientBehaviour() {
    return "var mdlztvq = new Object();mdlztvq.refresh = function (node) {if (!node.isEditable()) return;};mdlztvq.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case 1446300975:
    return doc.absences.absence.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final DateProperty Date = new doc.absences.absence.DateProperty();
  
  private final HourProperty Hour = new doc.absences.absence.HourProperty();
  
  private final AreasProperty Areas = new doc.absences.absence.AreasProperty();
  
  private final StudentProperty Student = new doc.absences.absence.StudentProperty();
  
  private final JustificanteProperty Justificante = new doc.absences.absence.JustificanteProperty();
}
