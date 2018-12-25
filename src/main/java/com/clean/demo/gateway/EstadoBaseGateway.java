package com.clean.demo.gateway;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Builder
public class EstadoBaseGateway {

	protected final HttpHeaders httpHeaders;
	protected final RestTemplate restTemplate;
}
