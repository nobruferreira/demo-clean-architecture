package com.clean.demo.usecase.data;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EstadoDTO {
	private Integer id;
	private String nome;
	private String sigla;
}
