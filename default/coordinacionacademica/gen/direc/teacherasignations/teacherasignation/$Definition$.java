package direc.teacherasignations.teacherasignation;

import direc.teacherasignations.teacherasignation.FromProperty;
import direc.teacherasignations.teacherasignation.TeacherProperty;
import direc.teacherasignations.teacherasignation.ToProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "m8jehqa";
    this._name = "direc.TeacherAsignations.TeacherAsignation";
    this._isAbstract = null;this._label = "Asignación Horaria";
    this.addDateFieldProperty(From);
    this.addDateFieldProperty(To);
    this.addLinkFieldProperty(Teacher);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty4 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty4.setIndex(new org.monet.metamodel.internal.Ref("direc.TeacherAsignations.Indice"));
    this.getMappingList().add(mappingProperty4);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty6 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty6.setLabel("Ficha");
    formViewProperty6.setCode("mc24t5q");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("From","direc.TeacherAsignations.TeacherAsignation","direc.TeacherAsignations.TeacherAsignation.From"));
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("To","direc.TeacherAsignations.TeacherAsignation","direc.TeacherAsignations.TeacherAsignation.To"));
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("Teacher","direc.TeacherAsignations.TeacherAsignation","direc.TeacherAsignations.TeacherAsignation.Teacher"));
    formViewProperty6.setShow(showProperty7);
    this.addView(formViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.teacherasignations.teacherasignation.$Definition$.class,"direc.TeacherAsignations.TeacherAsignation",null);
  }
  }
  
  public static String static_getName() {
    return "TeacherAsignation";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.teacherasignations.TeacherAsignation.class;
  }
  
  public String getClientBehaviour() {
    return "var m8jehqa = new Object();m8jehqa.refresh = function (node) {if (!node.isEditable()) return;};m8jehqa.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -189709366:
    return direc.teacherasignations.teacherasignation.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final FromProperty From = new direc.teacherasignations.teacherasignation.FromProperty();
  
  private final ToProperty To = new direc.teacherasignations.teacherasignation.ToProperty();
  
  private final TeacherProperty Teacher = new direc.teacherasignations.teacherasignation.TeacherProperty();
}
