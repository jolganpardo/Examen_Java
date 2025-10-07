package model.repository.ItemFacturaDAO;

import model.entities.Items_Factura.Factura;
import java.util.List;

public interface IFacturaDAO {
    Factura insertar(Factura factura);
    Factura obtenerPorId(Integer id);
    List<Factura> obtenerTodas();
    List<Factura> obtenerFacturasPorCliente(String documento);
    void actualizar(Factura factura);
    void eliminar(Integer id);
}
