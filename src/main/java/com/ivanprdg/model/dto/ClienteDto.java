package com.ivanprdg.model.dto;
import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ClienteDto implements Serializable {

    private Integer id_cliente;
    private String nombre;
    private String apellido;
    private String correo;
    private Date fecha_registro;

}
