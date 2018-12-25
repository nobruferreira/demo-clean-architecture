package com.clean.demo.usecase.impl.converter;

import java.util.List;

import com.clean.demo.usecase.data.EstadoDTO;
import com.clean.demo.gateway.data.response.EstadoGatewayResponse;

public interface EstadoDTOConverter {
	List<EstadoDTO> toListDTO(List<EstadoGatewayResponse> estadoGatewayResponse);
}
