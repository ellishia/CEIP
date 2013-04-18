package ceip.studentsdoc;

import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasSchema;

@SuppressWarnings("all")
public class $Definition$ extends ceip.academicrecords.$Definition$ implements HasBehaviour, HasClientBehaviour, HasSchema, HasMappings {
  public $Definition$() {
    super();this._code = "msnjbva";
    this._name = "ceip.StudentsDoc";
    this._parent = "ceip.AcademicRecords";
    this._isAbstract = null;this._label = "Listado de Alumnos";
    this._template = ceip.Resources.Template.StudentList;
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.studentsdoc.$Definition$.class,"ceip.StudentsDoc","ceip.AcademicRecords");
  }
  }
  
  public static String static_getName() {
    return "StudentsDoc";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.StudentsDoc.class;
  }
  
  public String getClientBehaviour() {
    return "var msnjbva = new Object();msnjbva.refresh = function (node) {if (!node.isEditable()) return;};msnjbva.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSchemaClass() {
    return ceip.studentsdoc.Schema.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
}
