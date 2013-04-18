package direc.intanceejemplar;

import direc.intanceejemplar.ejemplares.LibroProperty;
import direc.intanceejemplar.ejemplares.NumberProperty;
import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;

@SuppressWarnings("all")
public class EjemplaresProperty extends SectionFieldProperty implements HasBehaviour {
  public EjemplaresProperty() {
    super();this._code = "madx8gg";
    this._name = "Ejemplares";
    this._label = "Ejemplares a Añadir";
    this.setIsMultiple(true);
    this.addLinkFieldProperty(Libro);
    this.addNumberFieldProperty(Number);
    
  }
  
  public Class<?> getBehaviourClass() {
    return direc.intanceejemplar.Ejemplares.class;
  }
  
  public static String static_getName() {
    return "Ejemplares";
  }
  
  private final LibroProperty Libro = new direc.intanceejemplar.ejemplares.LibroProperty();
  
  private final NumberProperty Number = new direc.intanceejemplar.ejemplares.NumberProperty();
}
