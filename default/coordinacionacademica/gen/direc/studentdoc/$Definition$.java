package direc.studentdoc;

import org.monet.metamodel.DocumentDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasSchema;

@SuppressWarnings("all")
public class $Definition$ extends DocumentDefinition implements HasBehaviour, HasClientBehaviour, HasSchema, HasMappings {
  public $Definition$() {
    super();this._code = "m5jbdcg";
    this._name = "direc.StudentDoc";
    this._isAbstract = null;this._label = "Listado de Alumnos";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.studentdoc.$Definition$.class,"direc.StudentDoc",null);
  }
  }
  
  public static String static_getName() {
    return "StudentDoc";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.StudentDoc.class;
  }
  
  public String getClientBehaviour() {
    return "var m5jbdcg = new Object();m5jbdcg.refresh = function (node) {if (!node.isEditable()) return;};m5jbdcg.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSchemaClass() {
    return direc.studentdoc.Schema.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
}
