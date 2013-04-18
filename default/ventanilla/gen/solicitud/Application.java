package solicitud;

import org.monet.bpi.ClientService;
import org.monet.bpi.MonetLink;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeContainerImpl;
import org.monet.bpi.types.Date;
import org.monet.metamodel.NodeDefinitionBase.RuleViewProperty.AddFlagEnumeration;
import solicitud.ApplicationInfo;
import solicitud.MedicalIssues;
import solicitud.RegistrationPeriod;
import solicitud.Relatives;
import solicitud.procesos.PublicarPlaza;

@SuppressWarnings("all")
public class Application extends NodeContainerImpl {
  public ApplicationInfo getApplicationInfo() {
    return (solicitud.ApplicationInfo)this.getChildNode("solicitud.ApplicationInfo");
  }
  
  public MedicalIssues getMedicalIssues() {
    return (solicitud.MedicalIssues)this.getChildNode("solicitud.MedicalIssues");
  }
  
  public Relatives getRelatives() {
    return (solicitud.Relatives)this.getChildNode("solicitud.Relatives");
  }
  
  public void onFormalizar() {
    PublicarPlaza preinscripcion = PublicarPlaza.createNew();
    Application contenedor = this;
    preinscripcion.setTarget(((Application) contenedor));
    preinscripcion.save();
    preinscripcion.resume();
    String _id = preinscripcion.getId();
    MonetLink _forTask = MonetLink.forTask(_id);
    ClientService.redirectUserTo(_forTask);
  }
  
  protected boolean whenMg6acbg() {
    boolean _xblockexpression = false;
    {
      Application application = ((Application) this);
      ApplicationInfo _applicationInfo = application.getApplicationInfo();
      boolean _matriculable = _applicationInfo.getMatriculable();
      boolean _booleanValue = Boolean.valueOf(_matriculable).booleanValue();
      boolean _not = (!_booleanValue);
      _xblockexpression = (_not);
    }
    return _xblockexpression;
  }
  
  protected void ruleMg6acbg() {
    if(whenMg6acbg()) {
      this.setFlag("mg6acbg", AddFlagEnumeration.HIDDEN);
    }
  }
  
  protected boolean whenMypr_bq() {
    boolean _xblockexpression = false;
    {
      Date _date = new Date();
      Date fecha = _date;
      RegistrationPeriod periodo = RegistrationPeriod.getInstance();
      Application application = ((Application) this);
      ApplicationInfo _applicationInfo = application.getApplicationInfo();
      boolean _matriculable = _applicationInfo.getMatriculable();
      boolean _booleanValue = Boolean.valueOf(_matriculable).booleanValue();
      boolean _not = (!_booleanValue);
      _xblockexpression = (_not);
    }
    return _xblockexpression;
  }
  
  protected void ruleMypr_bq() {
    if(whenMypr_bq()) {
      this.setFlag("mypr_bq", org.monet.metamodel.NodeDefinitionBase.RuleOperationProperty.AddFlagEnumeration.HIDDEN);
    }
  }
  
  public void evaluateRules() {
    ruleMg6acbg();
    ruleMypr_bq();
    
  }
  
  public void executeCommand(final String operation) {
    if(operation.equals("Formalizar")) {
    	this.onFormalizar();
    }super.executeCommand(operation);
  }
  
  public static Application createNew(final Node parent) {
    return (solicitud.Application)org.monet.bpi.NodeService.create(solicitud.Application.class, parent);
  }
}
