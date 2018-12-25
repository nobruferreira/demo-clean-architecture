package com.clean.demo.http.converter.estado;

import java.util.List;

import com.clean.demo.http.data.response.EstadoResponse;
import com.clean.demo.usecase.data.EstadoDTO;

public interface EstadoResponseConverter {
	List<EstadoResponse> toListResponse(List<EstadoDTO> estados);
}
