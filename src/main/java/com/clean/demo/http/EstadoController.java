package com.clean.demo.http;

import java.util.List;

import com.clean.demo.usecase.EstadoUsecase;
import com.clean.demo.usecase.data.EstadoDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clean.demo.http.converter.estado.EstadoResponseConverter;
import com.clean.demo.http.data.response.EstadoResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value="/demo")
public class EstadoController {

	private final EstadoResponseConverter estadoConverter;
	private final EstadoUsecase estadoUsecase;
	
	@GetMapping("/estados")
	public ResponseEntity<List<EstadoResponse>> findEstados() {

		List<EstadoDTO> estadosDTO = estadoUsecase.findAll();
		List<EstadoResponse> estadosResponse = estadoConverter.toListResponse(estadosDTO);
		return new ResponseEntity<List<EstadoResponse>>(estadosResponse, HttpStatus.OK);
	}
}
 
