package br.com.alura.mvc.mudi.form;

import br.com.alura.mvc.mudi.model.Order;

import javax.validation.constraints.NotBlank;

public class CreateOrderForm {
    @NotBlank
    private String productName;

    @NotBlank
    private String productLink;

    @NotBlank
    private String productImageUrl;
    private String description;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductLink() {
        return productLink;
    }

    public void setProductLink(String productLink) {
        this.productLink = productLink;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Order toOrder() {
        Order order = new Order();
        order.setProductImageUrl(this.productImageUrl);
        order.setProductLink(this.productLink);
        order.setDescription(this.description);
        order.setProductName(this.productName);
        return order;
    }
}
