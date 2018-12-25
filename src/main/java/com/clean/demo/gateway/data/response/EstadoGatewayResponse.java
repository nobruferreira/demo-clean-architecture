package com.clean.demo.gateway.data.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class EstadoGatewayResponse {
	private Integer id;
	private String nome;
	private String sigla;
}
