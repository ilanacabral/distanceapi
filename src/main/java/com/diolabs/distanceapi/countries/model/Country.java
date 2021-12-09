package com.diolabs.distanceapi.countries.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Country")
@Table(name = "pais")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Country {

  @Id
  private Long id;
  
  @Column(name = "nome")
  private String name;

  @Column(name = "nome_pt")
  private String portugueseName;

  @Column(name = "sigla")
  private String code;

  private Integer bacen;
}
