package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "localidad")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Localidad extends Base {

    @Column(name = "denominacion")
    private String denominacion;

}
