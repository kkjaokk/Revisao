/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joaohenriquerevisao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Henrique
 */
public class Paciente extends Pessoa{
    
    private String motivo_int;
    private List<Internacao> internacoes;

    public List<Internacao> getInternacoes() {
        return internacoes;
    }

    public void setInternacoes(List<Internacao> internacoes) {
        this.internacoes = internacoes;
    }
    
    
    
    public Paciente(String nome, String motivo_int) {
        
        super(nome);
        this.motivo_int = motivo_int;
        this.internacoes = new ArrayList<>();
    }
    
    public void adicionarInternacao(Internacao internacao) {
        internacoes.add(internacao);
    }
    
    public double calcularValorTotalInternacoes() {
        double total = 0;
        for (Internacao internacao : internacoes) {
            total += internacao.calcularValorTotal();
        }
        return total;
    }

    public String getMotivo_int() {
        return motivo_int;
    }

    public void setMotivo_int(String motivo_int) {
        this.motivo_int = motivo_int;
    }
    
    
    
}
