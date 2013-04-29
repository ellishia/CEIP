package direc.intanceejemplar;

import direc.intanceejemplar.EjemplaresSeccionProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mdmc_4w";
    this._name = "direc.IntanceEjemplar";
    this._isAbstract = null;this._label = "IntanceEjemplar";
    this.addSectionFieldProperty(EjemplaresSeccion);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty2 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty2.setLabel("IntanceEjemplar");
    formViewProperty2.setCode("mcdsria");
    formViewProperty2.setName("View");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty3 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty3.getField().add(new org.monet.metamodel.internal.Ref("EjemplaresSeccion","direc.IntanceEjemplar","direc.IntanceEjemplar.EjemplaresSeccion"));
    formViewProperty2.setShow(showProperty3);
    this.addView(formViewProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.intanceejemplar.$Definition$.class,"direc.IntanceEjemplar",null);
  }
  }
  
  public static String static_getName() {
    return "IntanceEjemplar";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.IntanceEjemplar.class;
  }
  
  public String getClientBehaviour() {
    return "var mdmc_4w = new Object();mdmc_4w.refresh = function (node) {if (!node.isEditable()) return;};mdmc_4w.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final EjemplaresSeccionProperty EjemplaresSeccion = new direc.intanceejemplar.EjemplaresSeccionProperty();
}
