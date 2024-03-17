/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joaohenriquerevisao;

/**
 *
 * @author João Henrique
 */
public class Internacao {
    
    private int id_internacao;
    private double valorDia;
    private int qtdDias;
    private Paciente paciente;
    private Medico medicoR;
    private Enfermeiro enfermeiroR;
    private static int conta_internacao;
    
    public Internacao(double valorDia, int qtdDias, Enfermeiro enfermeiroR, Medico medicoR, Paciente paciente){
        
        
        this.id_internacao = ++conta_internacao;
        this.paciente = paciente;
        this.medicoR = medicoR;
        this.enfermeiroR = enfermeiroR;
        this.valorDia = valorDia;
        this.qtdDias = qtdDias;
        paciente.adicionarInternacao(this);
        
    }
    
    public double calcularValorTotal() {
        return valorDia * qtdDias;
    }
    
    @Override
    public String toString() {
        return "Internacao ID#" + id_internacao + "\n" +
               "Paciente: " + paciente.getNome() + "\n" +
               "Medico responsavel: " + medicoR.getNome() + "\n" +
               "Enfermeiro responsavel: " + enfermeiroR.getNome() + "\n" +
               "Motivo: " + paciente.getMotivo_int()+ "\n" +
               "Valor por dia: " + valorDia + "\n" +
               "Quantidade de dias: " + qtdDias + "\n" +
               "Valor total: " + calcularValorTotal();
        
    }

    public int getId_internacao() {
        return id_internacao;
    }

    public void setId_internacao(int id_internacao) {
        this.id_internacao = id_internacao;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedicoR() {
        return medicoR;
    }

    public void setMedicoR(Medico medicoR) {
        this.medicoR = medicoR;
    }

    public Enfermeiro getEnfermeiroR() {
        return enfermeiroR;
    }

    public void setEnfermeiroR(Enfermeiro enfermeiroR) {
        this.enfermeiroR = enfermeiroR;
    }

    public static int getConta_internacao() {
        return conta_internacao;
    }

    public static void setConta_internacao(int conta_internacao) {
        Internacao.conta_internacao = conta_internacao;
    }
    
    
    
    
    
    
    
    
    
    
}
