package entidades;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Articulo")
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "denominacion")
    private String denominacion;

    @Column(name = "precio")
    private int precio;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "articulo_categoria",
    joinColumns = @JoinColumn(name = "articulo_id"),
    inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    private final List<Categoria> categorias = new ArrayList<Categoria>();

    @OneToMany(mappedBy = "articulo")
    @Builder.Default
    private List<DetalleFactura> detalle = new ArrayList<DetalleFactura>();
}
