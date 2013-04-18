package direc.asignations.asignationdefault;

import direc.asignations.asignationdefault.AcademicYearProperty;
import direc.asignations.asignationdefault.StudentProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mqj2d_g";
    this._name = "direc.Asignations.AsignationDefault";
    this._isAbstract = new IsAbstract();this._label = "Asignación";
    this.addSelectFieldProperty(AcademicYear);
    this.addLinkFieldProperty(Student);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty3 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty3.setIndex(new org.monet.metamodel.internal.Ref("direc.Asignations.Indice"));
    this.getMappingList().add(mappingProperty3);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty5 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty5.setLabel("Asignacion");
    formViewProperty5.setCode("asfa");
    formViewProperty5.setName("AsignView");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty6.getField().add(new org.monet.metamodel.internal.Ref("Student","direc.Asignations.AsignationDefault","direc.Asignations.AsignationDefault.Student"));
    showProperty6.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","direc.Asignations.AsignationDefault","direc.Asignations.AsignationDefault.AcademicYear"));
    formViewProperty5.setShow(showProperty6);
    this.addView(formViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.asignations.asignationdefault.$Definition$.class,"direc.Asignations.AsignationDefault",null);
  }
  }
  
  public static String static_getName() {
    return "AsignationDefault";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.asignations.AsignationDefault.class;
  }
  
  public String getClientBehaviour() {
    return "var mqj2d_g = new Object();mqj2d_g.refresh = function (node) {if (!node.isEditable()) return;};mqj2d_g.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case 1229217390:
    return direc.asignations.asignationdefault.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final AcademicYearProperty AcademicYear = new direc.asignations.asignationdefault.AcademicYearProperty();
  
  private final StudentProperty Student = new direc.asignations.asignationdefault.StudentProperty();
}
