/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wellikson.cepservice;

import javax.enterprise.context.Dependent;

@Dependent
public class WidenetCepService extends AbstractCepService {

    public WidenetCepService() {
        super("https://apps.widenet.com.br/busca-cep/api/");
    }

    @Override
    protected String buildPath(String cod) {
         return String.format("/cep/%s.json",cod);
    }
    
}
