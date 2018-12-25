package com.clean.demo.gateway;

import java.util.List;

import com.clean.demo.gateway.data.response.EstadoGatewayResponse;

public interface EstadoGateway {
	List<EstadoGatewayResponse> findAll();
}
