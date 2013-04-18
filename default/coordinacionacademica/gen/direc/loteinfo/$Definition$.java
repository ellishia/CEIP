package direc.loteinfo;

import direc.loteinfo.AcademicYearProperty;
import direc.loteinfo.IdentifierProperty;
import direc.loteinfo.LevelProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "moozz0g";
    this._name = "direc.LoteInfo";
    this._isAbstract = null;this._label = "LoteInfo";
    this.setIsComponent(true);
    this.addSerialFieldProperty(Identifier);
    this.addSelectFieldProperty(AcademicYear);
    this.addSelectFieldProperty(Level);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty5 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty5.setLabel("Ficha");
    formViewProperty5.setCode("mwzxzuw");
    formViewProperty5.setName("Vista");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty6.getField().add(new org.monet.metamodel.internal.Ref("Identifier","direc.LoteInfo","direc.LoteInfo.Identifier"));
    showProperty6.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","direc.LoteInfo","direc.LoteInfo.AcademicYear"));
    showProperty6.getField().add(new org.monet.metamodel.internal.Ref("Level","direc.LoteInfo","direc.LoteInfo.Level"));
    formViewProperty5.setShow(showProperty6);
    this.addView(formViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.loteinfo.$Definition$.class,"direc.LoteInfo",null);
  }
  }
  
  public static String static_getName() {
    return "LoteInfo";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.LoteInfo.class;
  }
  
  public String getClientBehaviour() {
    return "var moozz0g = new Object();moozz0g.refresh = function (node) {if (!node.isEditable()) return;};moozz0g.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final IdentifierProperty Identifier = new direc.loteinfo.IdentifierProperty();
  
  private final AcademicYearProperty AcademicYear = new direc.loteinfo.AcademicYearProperty();
  
  private final LevelProperty Level = new direc.loteinfo.LevelProperty();
}
