package com.clean.demo.gateway.impl;

import java.util.List;

import com.clean.demo.gateway.EstadoBaseGateway;
import com.clean.demo.gateway.EstadoGateway;
import com.clean.demo.gateway.data.response.EstadoGatewayResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;

import org.springframework.web.client.RestTemplate;

@Component
public class EstadoGatewayImpl extends EstadoBaseGateway implements EstadoGateway {

	public EstadoGatewayImpl(HttpHeaders httpHeaders, RestTemplate restTemplate) {
		super(httpHeaders, restTemplate);
	}

	@Override
	public List<EstadoGatewayResponse> findAll() {
	    ResponseEntity<List<EstadoGatewayResponse>> response =
	    		this.restTemplate.exchange("http://localhost:8081/estados",
	    				              HttpMethod.GET,
	    				              new HttpEntity<>(this.httpHeaders),
	    				              new ParameterizedTypeReference<List<EstadoGatewayResponse>>(){});
	    return response.getBody();
	}
}
