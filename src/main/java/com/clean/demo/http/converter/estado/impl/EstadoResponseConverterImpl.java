package com.clean.demo.http.converter.estado.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.clean.demo.http.converter.estado.EstadoResponseConverter;
import com.clean.demo.http.data.response.EstadoResponse;
import com.clean.demo.usecase.data.EstadoDTO;
import org.springframework.stereotype.Component;

@Component
public class EstadoResponseConverterImpl implements EstadoResponseConverter {

	@Override
    public List<EstadoResponse> toListResponse(List<EstadoDTO> estadosDTO) {

        List<EstadoResponse> estadosResponse = estadosDTO.stream().map(x -> EstadoResponse.builder()
                .id(x.getId())
                .nome(x.getNome())
                .sigla(x.getSigla())
                .build()).collect(Collectors.toList());

        return estadosResponse;
	}
}
