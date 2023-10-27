package com.example.demo.dto;

public class ClientDTO {

    private Integer id_client;


    public ClientDTO(Integer id_client) {
        super();
        this.id_client = id_client;
    }

    public Integer getId_client() {
        return id_client;
    }

    public void setId_client(Integer id_client) {
        this.id_client = id_client;
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "idClient=" + id_client +
                '}';
    }
}
