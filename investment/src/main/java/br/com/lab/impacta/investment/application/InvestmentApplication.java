package br.com.lab.impacta.investment.application;

import br.com.lab.impacta.investment.application.dto.request.InvestmentRequest;
import br.com.lab.impacta.investment.application.dto.response.InvestmentResponse;

public interface InvestmentApplication {
    InvestmentResponse invest(Long accountId, InvestmentRequest investmentRequest);
}
