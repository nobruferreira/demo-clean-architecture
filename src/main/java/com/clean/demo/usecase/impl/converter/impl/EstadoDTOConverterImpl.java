package com.clean.demo.usecase.impl.converter.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.clean.demo.usecase.data.EstadoDTO;
import com.clean.demo.usecase.impl.converter.EstadoDTOConverter;
import org.springframework.stereotype.Component;

import com.clean.demo.gateway.data.response.EstadoGatewayResponse;

@Component
public class EstadoDTOConverterImpl implements EstadoDTOConverter {

	@Override
	public List<EstadoDTO> toListDTO(List<EstadoGatewayResponse> estadosGatewayResponse) {

		List<EstadoDTO> estadosDTO = estadosGatewayResponse.stream().map(x -> EstadoDTO.builder()
				.id(x.getId())
				.nome(x.getNome())
				.sigla(x.getSigla())
				.build()).collect(Collectors.toList());

		return estadosDTO;
	}
}
