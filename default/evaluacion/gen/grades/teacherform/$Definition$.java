package grades.teacherform;

import grades.teacherform.SubjectProperty;
import grades.teacherform.TeacherNameProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "m_6cfaa";
    this._name = "grades.TeacherForm";
    this._isAbstract = null;this._label = "Docente";
    this.setIsComponent(true);
    this.addSelectFieldProperty(TeacherName);
    this.addSelectFieldProperty(Subject);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty4 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty4.setLabel("Ficha");
    formViewProperty4.setCode("fad");
    formViewProperty4.setName("Ficha");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty5.getField().add(new org.monet.metamodel.internal.Ref("TeacherName","grades.TeacherForm","grades.TeacherForm.TeacherName"));
    showProperty5.getField().add(new org.monet.metamodel.internal.Ref("Subject","grades.TeacherForm","grades.TeacherForm.Subject"));
    formViewProperty4.setShow(showProperty5);
    this.addView(formViewProperty4);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.teacherform.$Definition$.class,"grades.TeacherForm",null);
  }
  }
  
  public static String static_getName() {
    return "TeacherForm";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.TeacherForm.class;
  }
  
  public String getClientBehaviour() {
    return "var m_6cfaa = new Object();m_6cfaa.refresh = function (node) {if (!node.isEditable()) return;};m_6cfaa.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final TeacherNameProperty TeacherName = new grades.teacherform.TeacherNameProperty();
  
  private final SubjectProperty Subject = new grades.teacherform.SubjectProperty();
}
