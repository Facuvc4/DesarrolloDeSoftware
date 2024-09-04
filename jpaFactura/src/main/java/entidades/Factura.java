package entidades;


import javax.persistence.*;

@Entity
@Table(name = "Factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "numero")
    private int numero;

    @Column(name = "total")
    private int total;

    @Column(name = "fecha")
    private String fecha;
}
