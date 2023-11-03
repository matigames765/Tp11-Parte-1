import java.util.ArrayList;
public class Factura {
    /*
    3.	Crear una clase llamada Factura que represente una factura comercial. La clase
    debe tener los siguientes atributos:

•	Número de factura: Un número único para identificar la factura.
•	Fecha de emisión: La fecha en la que se emitió la factura.
•	Cliente: El cliente al que se le emite la factura.
•	Artículos: Una lista de artículos vendidos en la factura.
•	Precio unitario: El precio unitario de cada artículo.
•	Cantidad: La cantidad de cada artículo vendido.
•	Subtotal: El subtotal de la factura sin impuestos.
•	IVA: El impuesto sobre el valor añadido (IVA) de la factura.
•	Total: El total de la factura, incluyendo el IVA.
•
La clase debe tener los siguientes métodos:

•	Constructor: Un constructor que inicializa los atributos de la factura.
•	Agregar artículo: Un método que agrega un artículo a la factura.
•	Calcular subtotal: Un método que calcula el subtotal de la factura.
•	Calcular IVA: Un método que calcula el IVA de la factura.
•	Calcular total: Un método que calcula el total de la factura

     */
    int numero_factura;
    String fecha_emision;
    String cliente;
    ArrayList<String> articulos;
    ArrayList<Double> precio_unitario;
    ArrayList<Integer> cantidad;
    double subtotal;
    double iva;
    double total;

    public Factura(int numero_factura, String fecha_emision, String cliente, double subtotal, double iva, double total) {
        this.numero_factura = numero_factura;
        this.fecha_emision = fecha_emision;
        this.cliente = cliente;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        articulos = new ArrayList<>();
        precio_unitario = new ArrayList<>();
        cantidad = new ArrayList<>();
    }

    public void AgregarArticulo(String articulo){
        articulos.add(articulo);
    }

    public double CalcularSubtotal(){
        subtotal = 0.0;
        for (int i = 0; i < articulos.size(); i++){
            subtotal +=  precio_unitario.get(i) * cantidad.get(i);
        }
        return subtotal;
    }

    public double CalcularIva(){
        return subtotal * iva;
    }

    public double CalcularTotal(){
        subtotal = CalcularSubtotal();
        return subtotal + subtotal * iva;
    }
}
