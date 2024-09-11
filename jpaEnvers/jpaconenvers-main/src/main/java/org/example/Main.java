package org.example;
import org.example.entidades.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-unit");

        EntityManager em = emf.createEntityManager();
        System.out.println("en marcha Alberto");

        try {
            em.getTransaction().begin();

            /*Factura factura1 = Factura.builder()
                    .numero(12)
                    .fecha("04/09/2024")
                    .total(1240)
                    .build();
            Domicilio domicilio1 = Domicilio.builder()
                    .nombreCalle("Calle Ejemplo")
                    .numero(123)
                    .build();

            Cliente cliente1 = Cliente.builder().apellido("lopez").dni(45137591).nombre("facundo").domicilio(domicilio1).build();

            factura1.setCliente(cliente1);

            Categoria perecederos = Categoria.builder().denominacion("Perecederos").build();
            Categoria lacteos = Categoria.builder().denominacion("Lacteos").build();
            Categoria limpieza = Categoria.builder().denominacion("Limpieza").build();

            Articulo art1 = Articulo.builder().cantidad(200).denominacion("Yogur Frutilla").precio(20).build();
            Articulo art2 = Articulo.builder().cantidad(100).denominacion("Arroz").precio(30).build();
            Articulo art3 = Articulo.builder().cantidad(120).denominacion("Cif").precio(40).build();

            art1.getCategorias().add(lacteos);
            art2.getCategorias().add(perecederos);
            art3.getCategorias().add(limpieza);
            perecederos.getArticulos().add(art2);
            lacteos.getArticulos().add(art1);
            limpieza.getArticulos().add(art3);

            DetalleFactura det1 = DetalleFactura.builder().articulo(art1).cantidad(20).subtotal(400).build();

            art1.getDetalle().add(det1);
            factura1.getDetalles().add(det1);*/

            Factura factura1 = em.find(Factura.class, 1L);
            //factura1.setNumero(85);//

            em.remove(factura1);
            em.flush();
            em.getTransaction().commit();
        }catch (Exception e){

            em.getTransaction().rollback();
            System.out.println(e.getMessage());
            System.out.println("No se pudo grabar la clase Persona");}

        // Cerrar el EntityManager y el EntityManagerFactory
      em.close();
        emf.close();
    }
}
