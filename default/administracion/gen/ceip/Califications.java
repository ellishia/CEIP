package ceip;

import ceip.BasicInfo;
import ceip.Boletin;
import ceip.Student;
import ceip.Students;
import ceip.boletin.Exportador;
import ceip.boletin.exportador.ExporterScope;
import ceip.califications.Indice;
import ceip.students.Index;
import java.util.ArrayList;
import org.monet.bpi.Expression;
import org.monet.bpi.Node;
import org.monet.bpi.OrderExpression;
import org.monet.bpi.java.NodeCollectionImpl;
import org.monet.bpi.types.Link;

@SuppressWarnings("all")
public class Califications extends NodeCollectionImpl {
  public static Califications getInstance() {
    return (ceip.Califications)org.monet.bpi.NodeService.locate("ceip.Califications");
  }
  
  public Iterable<Indice> getAll() {
    return (Iterable<ceip.califications.Indice>)genericGetAll();
  }
  
  public Iterable<Indice> getAll(final OrderExpression orderBy) {
    return (Iterable<ceip.califications.Indice>)genericGetAll(orderBy);
  }
  
  public Iterable<Indice> get(final Expression where) {
    return (Iterable<ceip.califications.Indice>)genericGet(where);
  }
  
  public Iterable<Indice> get(final Expression where, final OrderExpression orderBy) {
    return (Iterable<ceip.califications.Indice>)genericGet(where, orderBy);
  }
  
  public Indice getFirst(final Expression where) {
    return (ceip.califications.Indice)genericGetFirst(where);
  }
  
  public void onBoletines() {
    Students _instance = Students.getInstance();
    Iterable<Index> _all = _instance.getAll();
    for (final Index student : _all) {
      {
        Node _indexedNode = student.getIndexedNode();
        Student studentcontainer = ((Student) _indexedNode);
        BasicInfo _basicInfo = studentcontainer.getBasicInfo();
        BasicInfo basicInfo = ((BasicInfo) _basicInfo);
        ExporterScope _doExportOf = Exportador.doExportOf(basicInfo);
        Boletin boletin = _doExportOf.toNewDocument();
        boletin.consolidate();
        ArrayList<Link> _boletin = basicInfo.getBoletin();
        Link _link = boletin.toLink();
        _boletin.add(_link);
        basicInfo.save();
      }
    }
  }
  
  public void executeCommand(final String operation) {
    if(operation.equals("Boletines")) {
    	this.onBoletines();
    }super.executeCommand(operation);
  }
}
