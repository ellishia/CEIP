package direc.ejemplares.ejemplar;

import direc.ejemplares.ejemplar.CodigoProperty;
import direc.ejemplares.ejemplar.EstadoProperty;
import direc.ejemplares.ejemplar.LibroProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasProperties;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasProperties, HasMappings {
  public $Definition$() {
    super();this._code = "mumocda";
    this._name = "direc.Ejemplares.Ejemplar";
    this._isAbstract = null;this._label = "Ejemplar";
    this.addLinkFieldProperty(Libro);
    this.addSerialFieldProperty(Codigo);
    this.addTextFieldProperty(Estado);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty4 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty4.setIndex(new org.monet.metamodel.internal.Ref("direc.Ejemplares.Indice"));
    this.getMappingList().add(mappingProperty4);
    org.monet.metamodel.FormDefinition.PropertiesProperty propertiesProperty6 = new org.monet.metamodel.FormDefinition.PropertiesProperty();
    this.setProperties(propertiesProperty6);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty8 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty8.setLabel("Libro");
    formViewProperty8.setCode("m41_o5q");
    formViewProperty8.setName("AsignView");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty9 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Libro","direc.Ejemplares.Ejemplar","direc.Ejemplares.Ejemplar.Libro"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Estado","direc.Ejemplares.Ejemplar","direc.Ejemplares.Ejemplar.Estado"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Codigo","direc.Ejemplares.Ejemplar","direc.Ejemplares.Ejemplar.Codigo"));
    formViewProperty8.setShow(showProperty9);
    this.addView(formViewProperty8);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty14 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty14.setLabel("Lote al que pertenece");
    formViewProperty14.setCode("m5ywoma");
    formViewProperty14.setName("VistaInversa");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty15 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty.LinksInProperty linksInProperty15 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty.LinksInProperty();
    linksInProperty15.getNode().add(new org.monet.metamodel.internal.Ref("direc.Lotes.Lote"));
    showProperty15.setLinksIn(linksInProperty15);
    formViewProperty14.setShow(showProperty15);
    this.addView(formViewProperty14);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.ejemplares.ejemplar.$Definition$.class,"direc.Ejemplares.Ejemplar",null);
  }
  }
  
  public static String static_getName() {
    return "Ejemplar";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.ejemplares.Ejemplar.class;
  }
  
  public String getClientBehaviour() {
    return "var mumocda = new Object();mumocda.refresh = function (node) {if (!node.isEditable()) return;};mumocda.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getPropertiesClass() {
    return direc.ejemplares.ejemplar.$Properties$.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case 1461496143:
    return direc.ejemplares.ejemplar.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final LibroProperty Libro = new direc.ejemplares.ejemplar.LibroProperty();
  
  private final CodigoProperty Codigo = new direc.ejemplares.ejemplar.CodigoProperty();
  
  private final EstadoProperty Estado = new direc.ejemplares.ejemplar.EstadoProperty();
}
