package direc.activityteachers;

import direc.activityteachers.TeachersProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mmrp2rg";
    this._name = "direc.ActivityTeachers";
    this._isAbstract = null;this._label = "Docentes que realizan la actividad";
    this.addLinkFieldProperty(Teachers);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty2 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty2.setLabel("Docente");
    formViewProperty2.setCode("mkeacmg");
    formViewProperty2.setName("View");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty3 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty3.getField().add(new org.monet.metamodel.internal.Ref("Teachers","direc.ActivityTeachers","direc.ActivityTeachers.Teachers"));
    formViewProperty2.setShow(showProperty3);
    this.addView(formViewProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.activityteachers.$Definition$.class,"direc.ActivityTeachers",null);
  }
  }
  
  public static String static_getName() {
    return "ActivityTeachers";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.ActivityTeachers.class;
  }
  
  public String getClientBehaviour() {
    return "var mmrp2rg = new Object();mmrp2rg.refresh = function (node) {if (!node.isEditable()) return;};mmrp2rg.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final TeachersProperty Teachers = new direc.activityteachers.TeachersProperty();
}
