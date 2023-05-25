package com.soulcode.vendas.controllers;

import com.soulcode.vendas.models.dtos.VendaDTO;
import com.soulcode.vendas.services.VendaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping(value = "/vendas")
    public VendaDTO save(@RequestBody @Valid VendaDTO dto){
        return this.vendaService.save(dto);
    }

    @GetMapping(value = "/vendas")
    public List<VendaDTO> findAll(){
        return this.vendaService.findAll();
    }

    @GetMapping(value = "/vendas/{id}")
    public VendaDTO findById(@PathVariable Long id){
        return this.vendaService.findById(id);
    }

    @GetMapping(value = "/vendas/cliente/{idCliente}")
    public List<VendaDTO> findByIdCliente(@PathVariable Long idCliente){
        return this.vendaService.findByIdCliente(idCliente);
    }

}
