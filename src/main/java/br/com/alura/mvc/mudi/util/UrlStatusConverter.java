package br.com.alura.mvc.mudi.util;

import br.com.alura.mvc.mudi.model.OrderStatus;

public class UrlStatusConverter {

    public static OrderStatus toEnum(String status) {
        if (status.equals("aprovado")) {
            return OrderStatus.ACCEPTED;
        }

        if (status.equals("aguardando")) {
            return OrderStatus.AWAITING;
        }

        if (status.equals("entregue")) {
            return OrderStatus.DELIVERED;
        }

        throw new IllegalArgumentException(String.format("O status '%s' informado não é válido", status));
    }
}
