package com.example.cursomc.services;

import com.example.cursomc.domain.PagamentoComBoleto;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.Calendar;

@Service
public class BoletoService {

    public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(instanteDoPedido);
        cal.add(Calendar.DAY_OF_MONTH, 7);
        pagto.setDataVencimento(cal.getTime());
    }
}

