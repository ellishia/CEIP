package ceip.filerecord;

import org.monet.metamodel.DocumentDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasSchema;

@SuppressWarnings("all")
public class $Definition$ extends DocumentDefinition implements HasBehaviour, HasClientBehaviour, HasSchema, HasMappings {
  public $Definition$() {
    super();this._code = "mxpuvda";
    this._name = "ceip.FileRecord";
    this._isAbstract = null;this._label = "FileRecord";
    this._template = nopackage.Resources.Template.FileRecord;
    this.setIsReadonly(true);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.filerecord.$Definition$.class,"ceip.FileRecord",null);
  }
  }
  
  public static String static_getName() {
    return "FileRecord";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.FileRecord.class;
  }
  
  public String getClientBehaviour() {
    return "var mxpuvda = new Object();mxpuvda.refresh = function (node) {if (!node.isEditable()) return;};mxpuvda.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSchemaClass() {
    return ceip.filerecord.Schema.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
}
