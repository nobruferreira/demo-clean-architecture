package com.clean.demo.usecase;

import java.util.List;

import com.clean.demo.usecase.data.EstadoDTO;

public interface EstadoUsecase {
	List<EstadoDTO> findAll();
}
