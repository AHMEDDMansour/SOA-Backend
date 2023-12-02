package com.ahmed.sports.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Image {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idImage ;
private String name ;
private String type ;
@Column( name = "IMAGE" , length = 4048576 )
@Lob
private byte[] image;
@OneToOne
private Sport sport;

;
}

