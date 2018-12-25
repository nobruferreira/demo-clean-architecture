package com.clean.demo.usecase.impl;

import java.util.List;

import com.clean.demo.usecase.EstadoUsecase;
import com.clean.demo.usecase.data.EstadoDTO;
import org.springframework.stereotype.Component;

import com.clean.demo.gateway.EstadoGateway;
import com.clean.demo.gateway.data.response.EstadoGatewayResponse;
import com.clean.demo.usecase.impl.converter.EstadoDTOConverter;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EstadoUsecaseImpl implements EstadoUsecase {

	private final EstadoGateway estadoGateway;
    private final EstadoDTOConverter estadoDTOConverter;
	
	@Override
	public List<EstadoDTO> findAll() {
		 List<EstadoGatewayResponse> estadoGatewayResponse = estadoGateway.findAll();
	     List<EstadoDTO> estadosDTO = estadoDTOConverter.toListDTO(estadoGatewayResponse);
	     return estadosDTO;
	}
}
