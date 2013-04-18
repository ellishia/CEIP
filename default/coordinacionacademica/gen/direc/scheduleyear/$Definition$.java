package direc.scheduleyear;

import direc.scheduleyear.AcademicYearProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mkgjxbw";
    this._name = "direc.ScheduleYear";
    this._isAbstract = null;this._label = "Año Escolar";
    this.setIsComponent(true);
    this.addSelectFieldProperty(AcademicYear);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty3 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty3.setIndex(new org.monet.metamodel.internal.Ref("direc.Schedules.Indice"));
    this.getMappingList().add(mappingProperty3);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty5 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty5.setLabel("Ficha");
    formViewProperty5.setCode("mg4huna");
    formViewProperty5.setName("View");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty6.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","direc.ScheduleYear","direc.ScheduleYear.AcademicYear"));
    formViewProperty5.setShow(showProperty6);
    this.addView(formViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.scheduleyear.$Definition$.class,"direc.ScheduleYear",null);
  }
  }
  
  public static String static_getName() {
    return "ScheduleYear";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.ScheduleYear.class;
  }
  
  public String getClientBehaviour() {
    return "var mkgjxbw = new Object();mkgjxbw.refresh = function (node) {if (!node.isEditable()) return;};mkgjxbw.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -244642513:
    return direc.scheduleyear.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final AcademicYearProperty AcademicYear = new direc.scheduleyear.AcademicYearProperty();
}
