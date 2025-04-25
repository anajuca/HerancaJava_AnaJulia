//importação da biblioteca necessária para registrar a entrada de dados do usuário
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
    //declaráveis do funcionário
        String nomeFuncionario = "";
        double salarioFuncionario = 0;
        String departamentoFuncionario = "";
        String cpf = "";
        String dataNascimento = "";
    //instanciando objetos
        Funcionario funcionario = new Funcionario(nomeFuncionario, salarioFuncionario, departamentoFuncionario, cpf, dataNascimento);
        Gerente gerente = new Gerente(nomeFuncionario, salarioFuncionario, departamentoFuncionario, cpf, dataNascimento);
        Desenvolvedor desenvolvedor = new Desenvolvedor(nomeFuncionario, salarioFuncionario, departamentoFuncionario, cpf, dataNascimento);
        Estagiario estagiario = new Estagiario(nomeFuncionario, salarioFuncionario, departamentoFuncionario, cpf, dataNascimento);
    //declaração das variáveis necessárias para a implementação do menu e para os métodos específicos
    //de cada subclasse
        String hora = "";
        int tipo = 0;
        String horareuniao = "";
        String programa = "";
        String linguagem = "";
        String tarefa = "";
        int op=0;

    //laço de repetição while para manter o programa rodando
        while(op != 3){

        //opções do menu
            System.out.println("Escolha o que deseja fazer");
            System.out.println("1- Cadastrar um funcionário");
            System.out.println("2- Exibir os dados do funcionário");
            System.out.println("3- Sair do programa");
            op = scanner.nextInt();
            scanner.nextLine();

        //criação do laço switch-case
            switch(op){
                case 1:
                System.out.println("Cadastro de funcionário");
                System.out.println("Que tipo de funcionário você deseja cadastrar?");
                System.out.println("1- comum");
                System.out.println("2- gerente");
                System.out.println("3- desenvolvedor");
                System.out.println("4- estagiário");
                tipo = scanner.nextInt();
            
            //criação do segundo laço switch-case para o usuário decidir qual tipo de funcionário cadastrar
                switch(tipo){
                    case 1:
                    scanner.nextLine();
                    System.out.println("Cadastro de funcionário comum");
                    System.out.println("Digite o nome:");
                    nomeFuncionario = scanner.nextLine();
                    System.out.println("Digite o CPF:");
                    cpf = scanner.nextLine();
                    System.out.println("Digite a data de nascimento:");
                    dataNascimento = scanner.nextLine();
                    System.out.println("Digite o salário:");
                    salarioFuncionario = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite o departamento");
                    departamentoFuncionario = scanner.nextLine();

                //pergunta se o funcionário bateu o ponto, e se sim, que horas, para exibir junto com os
                //outros dados
                    System.out.println("O funcionário bateu ponto?");
                    System.out.println("1-Sim");
                    System.out.println("2-Não");
                    int opcao = scanner.nextInt();
                    scanner.nextLine();
                    if (opcao == 1){
                        System.out.println("Que horas o funcionário bateu ponto?");
                        hora = scanner.nextLine();
                    };
                
                //método SET
                    funcionario.setNome(nomeFuncionario);
                    funcionario.setCpf(cpf);
                    funcionario.setDataNascimento(dataNascimento);
                    funcionario.setSalario(salarioFuncionario);
                    funcionario.setDepartamento(departamentoFuncionario);
                
                //se tudo ocorrer como esperado, mostra que o funcionáiro foi cadastrado com sucesso e
                //exibe os dados cadastrados
                    System.out.println("\nFuncionário cadastrado com sucesso!");
                    funcionario.mostrarDados();
                    funcionario.baterPonto(hora);
                    break;

                    case 2:
                    scanner.nextLine();
                    System.out.println("Cadastro de gerente");
                    System.out.println("Digite o nome:");
                    nomeFuncionario = scanner.nextLine();
                    System.out.println("Digite o CPF:");
                    cpf = scanner.nextLine();
                    System.out.println("Digite a data de nascimento:");
                    dataNascimento = scanner.nextLine();
                    System.out.println("Digite o salário:");
                    salarioFuncionario = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite o departamento");
                    departamentoFuncionario = scanner.nextLine();
                //pergunta se o gerente bateu o ponto, e se sim, que horas, para exibir junto com os
                //outros dados
                    System.out.println("O gerente bateu ponto?");
                    System.out.println("1-Sim");
                    System.out.println("2-Não");
                    int opcao2 = scanner.nextInt();
                    scanner.nextLine();
                    if (opcao2 == 1){
                        System.out.println("Que horas o gerente bateu ponto?");
                        hora = scanner.nextLine();
                    };
                
                //oferece a opção do gerente marcar uma reunião para a hora que desejar
                    System.out.println("O gerente deseja marcar uma reunião?");
                    System.out.println("1-Sim");
                    System.out.println("2-Não");
                    int r = scanner.nextInt();
                    scanner.nextLine();
                    if(r==1){
                        System.out.println("Que horas acontecerá a reunião?");
                        horareuniao = scanner.nextLine();
                    };

                //método SET
                    gerente.setNome(nomeFuncionario);
                    gerente.setCpf(cpf);
                    gerente.setDataNascimento(dataNascimento);
                    gerente.setSalario(salarioFuncionario);
                    gerente.setDepartamento(departamentoFuncionario);

                //se tudo ocorrer como esperado, mostra que o funcionáiro foi cadastrado com sucesso e
                //exibe os dados cadastrados
                    System.out.println("\nGerente cadastrado com sucesso!");
                    gerente.mostrarDados();
                    gerente.baterPonto(hora);
                    gerente.realizarReuniao(horareuniao);
                    break;

                    case 3:
                    scanner.nextLine();
                    System.out.println("Cadastro de desenvolvedor");
                    System.out.println("Digite o nome:");
                    nomeFuncionario = scanner.nextLine();
                    System.out.println("Digite o CPF:");
                    cpf = scanner.nextLine();
                    System.out.println("Digite a data de nascimento:");
                    dataNascimento = scanner.nextLine();
                    System.out.println("Digite o salário:");
                    salarioFuncionario = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite o departamento");
                    departamentoFuncionario = scanner.nextLine();

                //pergunta se o desenvolvedor bateu o ponto, e se sim, que horas, para exibir junto com os
                //outros dados
                    System.out.println("O desenvolvedor bateu ponto?");
                    System.out.println("1-Sim");
                    System.out.println("2-Não");
                    int opcao3 = scanner.nextInt();
                    scanner.nextLine();
                    if (opcao3 == 1){
                        System.out.println("Que horas o desenvolvedor bateu ponto?");
                        hora = scanner.nextLine();
                    };

                //coleta as informações para o método programar da classe desenvolvedor
                    System.out.println("O que o desenvolvedor está programando no momento?");
                    programa = scanner.nextLine();
                    System.out.println("Em que linguagem ele está programando?");
                    linguagem = scanner.nextLine();

                //método SET
                    desenvolvedor.setNome(nomeFuncionario);
                    desenvolvedor.setCpf(cpf);
                    desenvolvedor.setDataNascimento(dataNascimento);
                    desenvolvedor.setSalario(salarioFuncionario);
                    desenvolvedor.setDepartamento(departamentoFuncionario);

                //se tudo ocorrer como esperado, mostra que o funcionáiro foi cadastrado com sucesso e
                //exibe os dados cadastrados
                    System.out.println("\nDesenvolvedor cadastrado com sucesso!");
                    desenvolvedor.mostrarDados();
                    desenvolvedor.baterPonto(hora);
                    desenvolvedor.programar(programa, linguagem);
                    break;

                    case 4:
                    scanner.nextLine();
                    System.out.println("Cadastro de estagiário");
                    System.out.println("Digite o nome:");
                    nomeFuncionario = scanner.nextLine();
                    System.out.println("Digite o CPF:");
                    cpf = scanner.nextLine();
                    System.out.println("Digite a data de nascimento:");
                    dataNascimento = scanner.nextLine();
                    System.out.println("Digite o salário:");
                    salarioFuncionario = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite o departamento");
                    departamentoFuncionario = scanner.nextLine();
                //pergunta se o estagiário bateu o ponto, e se sim, que horas, para exibir junto com os
                //outros dados
                    System.out.println("estagiário bateu ponto?");
                    System.out.println("1-Sim");
                    System.out.println("2-Não");
                    int opcao4 = scanner.nextInt();
                    scanner.nextLine();
                    if (opcao4 == 1){
                        System.out.println("Que horas o estagiário bateu ponto?");
                        hora = scanner.nextLine();
                    };

                //coleta a informação necessária para o método fazerTarefa
                    System.out.println("Que tarefa o estagiário está realizando?");
                    tarefa = scanner.nextLine();

                //método SET
                    estagiario.setNome(nomeFuncionario);
                    estagiario.setCpf(cpf);
                    estagiario.setDataNascimento(dataNascimento);
                    estagiario.setSalario(salarioFuncionario);
                    estagiario.setDepartamento(departamentoFuncionario);
                    
                //se tudo ocorrer como esperado, mostra que o funcionáiro foi cadastrado com sucesso e
                //exibe os dados cadastrados
                    System.out.println("\nEstagiário cadastrado com sucesso!");
                    estagiario.mostrarDados();
                    estagiario.baterPonto(hora);
                    estagiario.fazerTarefa(tarefa);
                    break;

                    default:
                //mensagem que aparecer caso o usuário digite uam opção que não está na lista
                    System.out.println("Essa opção não é válida, por favor, escolha outra opção!");
                }
                break;

                case 2:

            //utilização da mesma variável do switch(tipo) para determinar qual tipo de funcionário
            //foi cadastrado e exibir os dados com base nisso
                if(tipo==1){
                    System.out.println("Dados do funcionário:");
                    funcionario.mostrarDados();
                    funcionario.baterPonto(hora);
                }
                if(tipo==2){
                    System.out.println("Dados do gerente:");
                    gerente.mostrarDados();
                    gerente.baterPonto(hora);
                    gerente.realizarReuniao(horareuniao);
                }
                if(tipo==3){
                    System.out.println("Dados do desenvolvedor:");
                    desenvolvedor.mostrarDados();
                    desenvolvedor.baterPonto(hora);
                    desenvolvedor.programar(programa, linguagem);
                }
                if(tipo==4){
                    System.out.println("Dados do estagiário:");
                    estagiario.mostrarDados();
                    estagiario.baterPonto(hora);
                    estagiario.fazerTarefa(tarefa);
                }
                break;

                case 3:

            //mensagem para quando o usuário decidir sair do programa
                System.out.print("Você saiu do programa!");
                break;
    
                default:
            //mensagem que aparecer caso o usuário digite uam opção que não está na lista
                System.out.println("Essa opção não é válida, por favor, escolha outra opção!");
            }
        }
    }
}
