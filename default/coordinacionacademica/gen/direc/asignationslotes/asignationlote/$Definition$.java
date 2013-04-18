package direc.asignationslotes.asignationlote;

import direc.asignationslotes.asignationlote.LoteProperty;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends direc.asignations.asignationdefault.$Definition$ implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mumocda";
    this._name = "direc.AsignationsLotes.AsignationLote";
    this._parent = "direc.Asignations.AsignationDefault";
    this._isAbstract = null;this._label = "Asignación de Lote";
    this.addLinkFieldProperty(Lote);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty2 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty2.setLabel("Lote sin número");
    formViewProperty2.setCode("m41_o5q");
    formViewProperty2.setName("AsignView");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty3 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty3.getField().add(new org.monet.metamodel.internal.Ref("Lote","direc.AsignationsLotes.AsignationLote","direc.AsignationsLotes.AsignationLote.Lote"));
    formViewProperty2.setShow(showProperty3);
    this.addView(formViewProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.asignationslotes.asignationlote.$Definition$.class,"direc.AsignationsLotes.AsignationLote","direc.Asignations.AsignationDefault");
  }
  }
  
  public static String static_getName() {
    return "AsignationLote";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.asignationslotes.AsignationLote.class;
  }
  
  public String getClientBehaviour() {
    return "var mumocda = new Object();mumocda.refresh = function (node) {if (!node.isEditable()) return;};mumocda.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final LoteProperty Lote = new direc.asignationslotes.asignationlote.LoteProperty();
}
