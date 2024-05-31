package com.co.conexion.conect.entidades;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BuscarUsuarioEnGit {
    @JsonProperty("total_count")
    private int totalCount;
    @JsonProperty("incomplete_results")
    private boolean incompleteResults;
    @JsonProperty("items")
    private List<Usuarios> items;

    public BuscarUsuarioEnGit(List<Usuarios> usuarios) {
        this.items = usuarios;
    }

    public BuscarUsuarioEnGit() {
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public boolean isIncompleteResults() {
        return incompleteResults;
    }

    public void setIncompleteResults(boolean incompleteResults) {
        this.incompleteResults = incompleteResults;
    }

    public List<Usuarios> getItems() {
        return items;
    }

    public void setItems(List<Usuarios> items) {
        this.items = items;
    }
}