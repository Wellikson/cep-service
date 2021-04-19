/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wellikson.cepservice;

import com.wellikson.model.Endereco;

/**
 *
 * @author wellikson
 */
public interface CepService {
    Endereco buscaEndereco(String cep);   
}
