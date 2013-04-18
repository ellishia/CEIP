package direc.minutedoc;

import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasSchema;

@SuppressWarnings("all")
public class $Definition$ extends direc.documentocentro.$Definition$ implements HasBehaviour, HasClientBehaviour, HasSchema, HasMappings {
  public $Definition$() {
    super();this._code = "mi_mhdg";
    this._name = "direc.MinuteDoc";
    this._parent = "direc.DocumentoCentro";
    this._isAbstract = null;this._label = "Documento de Acta";
    this._template = direc.Resources.Template.MinuteDoc;
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.minutedoc.$Definition$.class,"direc.MinuteDoc","direc.DocumentoCentro");
  }
  }
  
  public static String static_getName() {
    return "MinuteDoc";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.MinuteDoc.class;
  }
  
  public String getClientBehaviour() {
    return "var mi_mhdg = new Object();mi_mhdg.refresh = function (node) {if (!node.isEditable()) return;};mi_mhdg.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSchemaClass() {
    return direc.minutedoc.Schema.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
}
