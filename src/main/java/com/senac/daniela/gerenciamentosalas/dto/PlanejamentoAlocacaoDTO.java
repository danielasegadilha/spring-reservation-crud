package com.senac.daniela.gerenciamentosalas.dto;

import com.senac.daniela.gerenciamentosalas.entities.Ambiente;
import com.senac.daniela.gerenciamentosalas.entities.Reserva;
import com.senac.daniela.gerenciamentosalas.entities.Usuario;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class PlanejamentoAlocacaoDTO {

    private LocalDate data;

    private java.sql.Time horaInicio;

    private java.sql.Time horaFim;

    private String observacao;

    private int status;

    private int ambienteId;

    private int usuarioId;

    private int reservaId;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public java.sql.Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(java.sql.Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public java.sql.Time getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(java.sql.Time horaFim) {
        this.horaFim = horaFim;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAmbienteId() {
        return ambienteId;
    }

    public void setAmbienteId(int ambienteId) {
        this.ambienteId = ambienteId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getReservaId() {
        return reservaId;
    }

    public void setReservaId(int reservaId) {
        this.reservaId = reservaId;
    }
}
