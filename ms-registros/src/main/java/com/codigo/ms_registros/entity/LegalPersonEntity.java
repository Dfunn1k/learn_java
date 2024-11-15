package com.codigo.ms_registros.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "legal_person")
@Getter
@Setter
public class LegalPersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean state;
    private String razonSocial;
    private String tipoDocumento;
    private String numeroDocumento;
    private String estado;
    private String condicion;
    private String direccion;
    private String ubigeo;
    private String viaTipo;
    private String viaNombre;
    private String zonaCodigo;
    private String zonaTipo;
    private String numero;
    private String interior;
    private String lote;
    private String dpto;
    private String manzana;
    private String kilometro;
    private String distrito;
    private String provincia;
    private String departamento;
    private Boolean esAgenteRetencion;
    private String tipo;
    private String actividadEconomica;
    private String numeroTrabajadores;
    private String tipoFacturacion;
    private String tipoContabilidad;
    private String comercioExterior;
    private String createdBy;
    private Timestamp createdAt;
}
