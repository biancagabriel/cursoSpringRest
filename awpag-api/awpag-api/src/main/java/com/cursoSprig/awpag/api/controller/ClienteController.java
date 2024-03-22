package com.cursoSprig.awpag.api.controller;

import com.cursoSprig.awpag.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {
    @GetMapping("/clientes")
        public List<Cliente> listar(){
            var cliente1 = new Cliente();
            cliente1.setId(1L);
            cliente1.setNome("joão souza");
            cliente1.setTelefone("11 99999-9999");
            cliente1.setEmail("joao@blabla.com");

            var cliente2 = new Cliente();
            cliente2.setId(2L);
            cliente2.setNome("maria");
            cliente2.setTelefone("11 99999-9900");
            cliente2.setEmail("maria@blabla.com");

            return Arrays.asList(cliente1,cliente2);
        }
}
