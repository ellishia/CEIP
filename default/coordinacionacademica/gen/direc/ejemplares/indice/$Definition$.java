package direc.ejemplares.indice;

import direc.ejemplares.indice.CodigoProperty;
import direc.ejemplares.indice.EstadoProperty;
import direc.ejemplares.indice.LibroProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mwjdfjw";
    this._name = "direc.Ejemplares.Indice";
    this._isAbstract = null;this._label = "Todos los ejemplares";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Libro);
    referenceProperty1.addAttributeProperty(Estado);
    referenceProperty1.addAttributeProperty(Codigo);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty5.setCode("mqgn37q");
    indexViewProperty5.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Libro","direc.Ejemplares.Indice","direc.Ejemplares.Indice.Libro"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Codigo","direc.Ejemplares.Indice","direc.Ejemplares.Indice.Codigo"));
    indexViewProperty5.setShow(showProperty5);
    this.addView(indexViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.ejemplares.indice.$Definition$.class,"direc.Ejemplares.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.ejemplares.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var mwjdfjw = new Object();mwjdfjw.refresh = function (node) {if (!node.isEditable()) return;};mwjdfjw.onChangeField = function (node, field) {};";
  }
  
  private final LibroProperty Libro = new direc.ejemplares.indice.LibroProperty();
  
  private final EstadoProperty Estado = new direc.ejemplares.indice.EstadoProperty();
  
  private final CodigoProperty Codigo = new direc.ejemplares.indice.CodigoProperty();
}
