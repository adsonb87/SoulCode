package com.soulcode.vendas.controllers;

import com.soulcode.vendas.models.dtos.ClienteDTO;
import com.soulcode.vendas.services.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    //@RequestMapping(value = "/clientes", method = RequestMethod.POST)
    @PostMapping(value = "/clientes")
    public ClienteDTO save(@RequestBody @Valid ClienteDTO dto){
        return this.clienteService.save(dto);
    }

    //@RequestMapping(value = "/clientes", method = RequestMethod.GET)
    @GetMapping(value = "/clientes")
    public List<ClienteDTO> findAll(){
        return this.clienteService.findAll();
    }

    @GetMapping(value = "/clientes/{id}")
    public ClienteDTO findById(@PathVariable Long id){
        return this.clienteService.findById(id);
    }

    @DeleteMapping(value = "/clientes/{id}")
    public ClienteDTO deleteById(@PathVariable Long id){
        return this.clienteService.deleteById(id);
    }

    @PutMapping(value = "/clientes/{id}")
    public ClienteDTO updateById(@PathVariable Long id, @RequestBody @Valid ClienteDTO dto){
        return this.clienteService.updateById(id, dto);
    }
}
