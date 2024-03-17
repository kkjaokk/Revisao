package joaohenriquerevisao;

import java.util.Scanner;

public class JoaoHenriqueRevisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean op = true;
        Paciente pacienteChamado = null;

        while (op) {
            System.out.println("Informe o nome do paciente:");
            String nomePaciente = scanner.nextLine();

            System.out.println("Informe o motivo da internacao:");
            String motivoInternacao = scanner.nextLine();

            System.out.println("Informe o nome do medico responsavel:");
            String nomeMedico = scanner.nextLine();

            System.out.println("Informe o nome do enfermeiro responsavel:");
            String nomeEnfermeiro = scanner.nextLine();

            System.out.println("Informe o valor por dia da internacao:");
            double valorDia = scanner.nextDouble();
            scanner.nextLine(); // Consumir a linha em branco

            System.out.println("Informe a quantidade de dias da internacao:");
            int quantidadeDias = scanner.nextInt();
            scanner.nextLine(); // Consumir a linha em branco

            Paciente paciente = new Paciente(nomePaciente, motivoInternacao);
            Medico medico = new Medico(nomeMedico);
            Enfermeiro enfermeiro = new Enfermeiro(nomeEnfermeiro);
            Internacao internacao = new Internacao(valorDia, quantidadeDias, enfermeiro, medico, paciente);

            System.out.println("Relatório da Internacao:\n" + internacao);

            

            System.out.println("Deseja cadastrar outra internacao? (s/n)");

            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                op = false;
            }
        }
        double valorTotalInternacoes = 0;
        for (Internacao internacao : pacienteChamado.getInternacoes()) {
            valorTotalInternacoes += internacao.calcularValorTotal();
        }
        System.out.println("Valor total de todas as internações do paciente: " + valorTotalInternacoes);

        scanner.close();

        
    }
}
