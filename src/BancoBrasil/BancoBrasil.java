package bancobrasil;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoBrasil {

    public static void main(String[] args) {
        //Instanciando um objeto do tipo ContBancaria e referenciando nas
        //Variaveis ContaBancaria1 e ContaBancaria2
        /*
     ContaBancaria  contaBancaria1 =  new ContaBancaria();
     ContaBancaria contaBancaria2 = new ContaBancaria();
     Usuario user1 = new Usuario();
     Uso nas versões mais atuais da jdk
     Var contaBancaria = new ContaBancaria();
     
     
     //Atribuido Valores ao nosso objeto
    contaBancaria1.agencia = "0001";
    contaBancaria1.conta = "12344";
    contaBancaria1.proprietario = "Junior";
    contaBancaria1.saldo = 1.99;
    
    //Exibindo os Valores atribuidos
    System.out.println(contaBancaria1.agencia+"\n"
            + contaBancaria1.conta + "\n"
            + contaBancaria1.proprietario + "\n"
            + contaBancaria1.saldo);
    
    
     Scanner scan = new Scanner (System.in);
     
     System.out.println("BEM-VINDO AO BANCO BRASIL");
     System.out.println("CADASTRO DE CONTAS");
     System.out.println("Digite a agência -> ");
     contaBancaria1.agencia = scan.next();
     System.out.println("\nDigite a conta -> ");
     contaBancaria1.conta = scan.next();
     //Contrução e Inserção de dados do usuario
     System.out.println("\nDados do usuario");
     System.out.print("Digite o nome do cliente ->");
     user1.setNome(scan.next());
     System.out.print("Digite o sobrenome do cliente ->");
     user1.setSobrenome(scan.next());
     System.out.print("Digite o telefone do cliente -> ");
     user1.setTelefone(scan.next());
     contaBancaria1.proprietario = user1;
     System.out.println("\nDigite o valor de deposito -> ");
     contaBancaria1.depositar(scan.nextDouble());
        
        System.out.println(contaBancaria1.agencia+"\n"
                + contaBancaria1.conta + "\n"
                + contaBancaria1.proprietario.imprimirInfo() + "\n"
                + contaBancaria1.consultarSaldo());
        
        System.out.print("\n\n Digite o valor para saque ->");
                contaBancaria1.sacar(scan.nextDouble());
                
        System.out.println(contaBancaria1.consultarSaldo());
         */

        Scanner input = new Scanner(System.in);
        ContaBancaria cb = new ContaBancaria();
        Usuario user;
        int cc = 0;
        boolean existe = false;
        ArrayList<Usuario> users = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();
        GerenteRepository db_gerente = new GerenteRepository();
        boolean isLogin = false;
        gerentes = db_gerente.addGerente();

        int operacao = 0;
        int qtdcadastros = 0;
        //1ª tela
        do {
            System.out.println("- - - SEJA BEM VINDO AO BANCO BRASIL - - -");
            System.out.print("Login: ");
            String login = input.next();
            System.out.print("Password: ");
            String password = input.next();

            for (Gerente g : gerentes) {
                if (g.getLogin().equals(login) && g.getPassword().equals(password)) {
                    isLogin = true;
                }
            }
            while (isLogin != true);

            if (isLogin == false) {
                System.out.println("Login ou senha inválidos");
            }

            while (operacao != 3) {
                System.out.println("- - - BANCO BRASIL - - -\n");
                System.out.println("1 - Cadastro de Cliente");
                System.out.println("2 - Cadastro de Conta");
                System.out.println("3 - Sair");
                System.out.print("\nSelecione uma operação: ");
                operacao = input.nextInt();

                switch (operacao) {
                    case 1:
                        System.out.println("- - - Cadastro de Clientes - - -");
                        System.out.print("Quantidade de cadastros: ");
                        qtdcadastros = input.nextInt();
                        for (int i = 0; i < qtdcadastros; i++) {
                            user = new Cliente();
                            System.out.print("Nome: ");
                            user.setNome(input.next());
                            System.out.print("Sobrenome: ");
                            user.setSobrenome(input.next());
                            System.out.print("Telefone: ");
                            user.setTelefone(input.next());

                            users.add(user);
                        }
                        cc += 1;
                        break;
                    case 2:
                        System.out.println("- - - Cadastro de Conta - - - \n");
                        System.out.print("Agência: ");
                        cb.setagencia(input.next());
                        System.out.print("Conta: ");
                        cb.setconta(input.next());
                        if (cc == 0) {
                            System.out.println("Nenhum cliente cadastrado");
                        } else {
                            System.out.println("- - - Clientes Cadastrados- - -");
                            for (int i = 0; i < qtdcadastros; i++) {
                                System.out.printf("\n%d - %s %s", (i + 1), users.get(i).getNome(), users.get(i).getSobrenome());
                            }
                            System.out.print("\nSelecione o propretário: ");
                            int userOpcao = input.nextInt();
                            for (int i = 0; i < qtdcadastros; i++) {
                                if (userOpcao - 1 == i) {
                                    cb.setproprietario(users.get(userOpcao - 1));
                                    existe = true;
                                }
                            }
                            if (existe == false) {
                                System.out.println("Cliente não existe");
                                break;
                            }
                        }

                        //if (userOpcao == 1) {
                        //cb.setproprietario(user);
                        //}
                        break;

                    case 3:
                        System.out.println("- - - Saída - - -\n");
                        break;
                    default:
                        System.out.println("- - - Operacão inválida - - -\n");

                }

            }
