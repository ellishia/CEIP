package serv.shared.clasification;

import org.monet.metamodel.ThesaurusDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ThesaurusDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "ma6pz1a";
    this._name = "serv.shared.Clasification";
    this._isAbstract = null;this._label = "Clasification";
    this._ontology = "86de6aa9-679f-4b69-9969-f42b31f66391";
    org.monet.metamodel.ThesaurusDefinition.TermsProperty termsProperty2 = new org.monet.metamodel.ThesaurusDefinition.TermsProperty();
    org.monet.metamodel.TermProperty termProperty2 = new org.monet.metamodel.TermProperty();
    termProperty2.setLabel("Huelga");
    termProperty2.setKey("001");
    termsProperty2.addTermProperty(termProperty2);
    org.monet.metamodel.TermProperty termProperty5 = new org.monet.metamodel.TermProperty();
    termProperty5.setLabel("Temporal");
    termProperty5.setKey("002");
    termsProperty2.addTermProperty(termProperty5);
    org.monet.metamodel.TermProperty termProperty8 = new org.monet.metamodel.TermProperty();
    termProperty8.setLabel("Servicio no proporcionado");
    termProperty8.setKey("003");
    termsProperty2.addTermProperty(termProperty8);
    org.monet.metamodel.TermProperty termProperty11 = new org.monet.metamodel.TermProperty();
    termProperty11.setLabel("Modificación de Parada");
    termProperty11.setKey("004");
    termsProperty2.addTermProperty(termProperty11);
    org.monet.metamodel.TermProperty termProperty14 = new org.monet.metamodel.TermProperty();
    termProperty14.setLabel("Horario Incumplido");
    termProperty14.setKey("005");
    termsProperty2.addTermProperty(termProperty14);
    org.monet.metamodel.TermProperty termProperty17 = new org.monet.metamodel.TermProperty();
    termProperty17.setLabel("Vehículo no autorizado");
    termProperty17.setKey("006");
    termsProperty2.addTermProperty(termProperty17);
    org.monet.metamodel.TermProperty termProperty20 = new org.monet.metamodel.TermProperty();
    termProperty20.setLabel("Máximo de alumnos/as superado");
    termProperty20.setKey("007");
    termsProperty2.addTermProperty(termProperty20);
    org.monet.metamodel.TermProperty termProperty23 = new org.monet.metamodel.TermProperty();
    termProperty23.setLabel("Auxiliar no asignado");
    termProperty23.setKey("008");
    termsProperty2.addTermProperty(termProperty23);
    org.monet.metamodel.TermProperty termProperty26 = new org.monet.metamodel.TermProperty();
    termProperty26.setLabel("Fuciones de Auxiliar insatisfechas");
    termProperty26.setKey("009");
    termsProperty2.addTermProperty(termProperty26);
    this.setTerms(termsProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.shared.clasification.$Definition$.class,"serv.shared.Clasification",null);
  }
  }
  
  public static String static_getName() {
    return "Clasification";
  }
  
  public String getClientBehaviour() {
    return "var ma6pz1a = new Object();ma6pz1a.refresh = function (node) {if (!node.isEditable()) return;};ma6pz1a.onChangeField = function (node, field) {};";
  }
}
