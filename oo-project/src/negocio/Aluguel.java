package negocio;

import java.util.Date;

public class Aluguel {
    private Hospedagem hospedagem;
    private Usuario usuario;
    private float valorPago;
    private Date checkIn;
    private Date checkOut;
    private boolean cancelado = false;

    public Aluguel(Hospedagem imovel, Usuario cliente, Date dtInicial, Date dtFinal, float precoTotal) {
        usuario = cliente;
        hospedagem = imovel;
        checkIn = dtInicial;
        checkOut = dtFinal;
        valorPago = precoTotal;
    }

    public Hospedagem getHospedagem() {
        return this.hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public float getValorPago() {
        return this.valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public Date getCheckIn() {
        return this.checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return this.checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public boolean isCancelado() {
        return this.cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

}
