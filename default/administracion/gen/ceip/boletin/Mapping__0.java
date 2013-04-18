package ceip.boletin;

import ceip.Boletin;
import ceip.boletin.Schema;
import ceip.boletines.Index;
import com.google.common.base.Objects;
import org.monet.bpi.java.MappingImpl;

@SuppressWarnings("all")
public class Mapping__0 extends MappingImpl {
  public void calculateMapping() {
    super.calculateMapping();
    ceip.Boletin node = (ceip.Boletin) this.genericGetNode();
    ceip.boletines.Index reference = (ceip.boletines.Index) this.genericGetReference();
    this.calculate();
  }
  
  public Index getReference() {
    return (ceip.boletines.Index) this.genericGetReference();
  }
  
  public Boletin getNode() {
    return (ceip.Boletin) this.genericGetNode();
  }
  
  private void calculate() {
    Index referencia = this.getReference();
    Boletin _node = this.getNode();
    Schema esq = _node.getSchema();
    boolean _notEquals = (!Objects.equal(esq, null));
    if (_notEquals) {
      String _studentName = esq.getStudentName();
      String _plus = (_studentName + " ");
      String _studentSurname = esq.getStudentSurname();
      String _plus_1 = (_plus + _studentSurname);
      String _anyoAcademico = esq.getAnyoAcademico();
      String _plus_2 = (_plus_1 + _anyoAcademico);
      referencia.setName(_plus_2);
      String _anyoAcademico_1 = esq.getAnyoAcademico();
      referencia.setAcademicYear(_anyoAcademico_1);
      String _studentName_1 = esq.getStudentName();
      String _plus_3 = (_studentName_1 + " ");
      String _studentSurname_1 = esq.getStudentSurname();
      String _plus_4 = (_plus_3 + _studentSurname_1);
      referencia.setStudentName(_plus_4);
    }
  }
}
