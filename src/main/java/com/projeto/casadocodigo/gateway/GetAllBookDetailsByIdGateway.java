package com.projeto.casadocodigo.gateway;

import com.projeto.casadocodigo.api.response.book.GetAllBooksDetailResponse;
import com.projeto.casadocodigo.gateway.exception.BookNotFoundGatewayException;

public interface GetAllBookDetailsByIdGateway {
    public GetAllBooksDetailResponse execute(final Long id) throws BookNotFoundGatewayException;
}
