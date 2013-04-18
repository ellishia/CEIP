package solicitud;

import org.monet.bpi.ClientService;
import org.monet.bpi.Expression;
import org.monet.bpi.MonetLink;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;
import org.monet.bpi.types.Date;
import org.monet.bpi.types.Link;
import org.monet.metamodel.NodeDefinitionBase.RuleOperationProperty.AddFlagEnumeration;
import solicitud.Application;
import solicitud.RegistrationPeriod;
import solicitud.applications.Indice;

@SuppressWarnings("all")
public class Applications extends NodeCollectionImpl {
  public static Applications getInstance() {
    return (solicitud.Applications)org.monet.bpi.NodeService.locate("solicitud.Applications");
  }
  
  public Iterable<Indice> getAll() {
    return (Iterable<solicitud.applications.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<solicitud.applications.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<solicitud.applications.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<solicitud.applications.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (solicitud.applications.Indice)genericGetFirst(where);
  }
  
  public void onAnadirSolicitud() {
    Application application = Application.createNew(this);
    Link _link = application.toLink();
    String _id = _link.getId();
    MonetLink _forNode = MonetLink.forNode(_id);
    ClientService.redirectUserTo(_forNode);
  }
  
  protected boolean whenMsl_2ia() {
    boolean _xblockexpression = false;
    {
      Date _date = new Date();
      Date fecha = _date;
      RegistrationPeriod periodo = RegistrationPeriod.getInstance();
      Date _initialDate = periodo.getInitialDate();
      Date _finalDate = periodo.getFinalDate();
      boolean _isInInterval = fecha.isInInterval(_initialDate, _finalDate);
      boolean _not = (!_isInInterval);
      _xblockexpression = (_not);
    }
    return _xblockexpression;
  }
  
  protected void ruleMsl_2ia() {
    if(whenMsl_2ia()) {
      this.setFlag("msl_2ia", AddFlagEnumeration.HIDDEN);
    }
  }
  
  public void evaluateRules() {
    ruleMsl_2ia();
    
  }
  
  public void executeCommand(final String operation) {
    if(operation.equals("AnadirSolicitud")) {
    	this.onAnadirSolicitud();
    }super.executeCommand(operation);
  }
}
