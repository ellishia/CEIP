package direc.intanceejemplar;

import direc.intanceejemplar.ejemplaresseccion.LibroProperty;
import direc.intanceejemplar.ejemplaresseccion.NumberProperty;
import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;

@SuppressWarnings("all")
public class EjemplaresSeccionProperty extends SectionFieldProperty implements HasBehaviour {
  public EjemplaresSeccionProperty() {
    super();this._code = "madx8gg";
    this._name = "EjemplaresSeccion";
    this._label = "Ejemplares a Añadir";
    this.setIsMultiple(true);
    this.addLinkFieldProperty(Libro);
    this.addNumberFieldProperty(Number);
    
  }
  
  public Class<?> getBehaviourClass() {
    return direc.intanceejemplar.EjemplaresSeccion.class;
  }
  
  public static String static_getName() {
    return "EjemplaresSeccion";
  }
  
  private final LibroProperty Libro = new direc.intanceejemplar.ejemplaresseccion.LibroProperty();
  
  private final NumberProperty Number = new direc.intanceejemplar.ejemplaresseccion.NumberProperty();
}
