package direc.evaluationdoc;

import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasSchema;

@SuppressWarnings("all")
public class $Definition$ extends direc.documentocentro.$Definition$ implements HasBehaviour, HasClientBehaviour, HasSchema, HasMappings {
  public $Definition$() {
    super();this._code = "m0s_5jq";
    this._name = "direc.EvaluationDoc";
    this._parent = "direc.DocumentoCentro";
    this._isAbstract = null;this._label = "Sesión de Evaluación";
    this._template = direc.Resources.Template.SesionEvaluacion;
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.evaluationdoc.$Definition$.class,"direc.EvaluationDoc","direc.DocumentoCentro");
  }
  }
  
  public static String static_getName() {
    return "EvaluationDoc";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.EvaluationDoc.class;
  }
  
  public String getClientBehaviour() {
    return "var m0s_5jq = new Object();m0s_5jq.refresh = function (node) {if (!node.isEditable()) return;};m0s_5jq.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSchemaClass() {
    return direc.evaluationdoc.Schema.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
}
