/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_final_aldo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Arthur Oliveira
 */
public class Projeto_Final_Aldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList();

        boolean rodando = true;
        while (rodando) {

// Menu do Programa
            System.out.println("1 - Cadastrar Usuario");
            System.out.println("2 - Listar todos os usuarios");
            System.out.println("3 - Procurar usuario pelo email");
            System.out.println("4 - Atualizar dados");
            System.out.println("5 - Remover Usuario");
            System.out.println("6 - Sair");
            System.out.println("Digite a opção:");

// Ler Opção 
            String opcao = ler.nextLine();

// Dependendo da opção que você escolhe ele entra no case.
            switch (opcao) {
                case "1": {

                    System.out.println("==== CADASTRAR USUARIOS ===");
                    System.out.println("Digite seu nome: ");
                    String nome = ler.nextLine();
                    System.out.println("Digite sua data de nascimento: ");
                    String datadenacimento = ler.nextLine();
                    System.out.println("Digite seu telefone: ");
                    String telefone = ler.nextLine();
                    System.out.println("Digite o email:");
                    String email = ler.nextLine();
                    System.out.println("Digite a senha:");
                    String senha = ler.nextLine();

// Instancia o que foi digitado dentro da classe Usuario.
                    Usuario u = new Usuario();

// Atribui os dados dentro da classe. 
                    u.setNome(nome);
                    u.setDatadenascimento(datadenacimento);
                    u.setTelefone(telefone);
                    u.setEmail(email);
                    u.setSenha(senha);

// Adiciona dentro da ArrayList.
                    usuarios.add(u);

                    break;
                }
                case "2": {
                    System.out.println("=== USUARIOS CADASTRADOS ===");

// O for ele esta pegando o valor de i, e verificando se o array do usuario estar menor que i.
                    for (int i = 0; i < usuarios.size(); i++) {

// O uTemp ele esta pegando o usuario da possição do array e mostrando para o usuario
                        Usuario uTemp = usuarios.get(i);
                        System.out.println("\t O nome e : " + uTemp.getNome());
                        System.out.println("\t A data de nascimento e: " + uTemp.getDatadenascimento());
                        System.out.println("\t O telefone e: " + uTemp.getTelefone());
                        System.out.println("\t O email e : " + uTemp.getEmail());
                        System.out.println("\t A senha e : " + uTemp.getSenha());
                    }

                    break;
                }
                case "3": {
                    System.out.println("=== PROCURAR USUARIO POR EMAIL ===");
                    System.out.println("Digite o email: ");
                    String email = ler.nextLine();

// Passando em cada um dos usuarios, dentro a array.
                    for (int i = 0; i < usuarios.size(); i++) {

// Guardando cada usuario dentro da uTemp.
                        Usuario uTemp = usuarios.get(i);

// Se email for equals = igual ao getEmail ele irá mostra 
                        if (email.equals(uTemp.getEmail())) {
                            System.out.println("Usuario Encontrado");
                            System.out.println("\t Nome: " + uTemp.getNome());
                            System.out.println("\t Data de Nascimento: " + uTemp.getDatadenascimento());
                            System.out.println("\t Telefone: " + uTemp.getTelefone());
                            System.out.println("\t Email: " + uTemp.getEmail());
                            System.out.println("\t Senha: " + uTemp.getSenha());

                        }
                    }
                    break;
                }

                case "4": {
                    System.out.println("=== ATUALIZACAO DE USUARIO ===");
                    {
// Passando em cada um dos usuarios, dentro a array.
                        for (int i = 0; i < usuarios.size(); i++) {

// Guardando cada usuario dentro da uTemp.
                            Usuario uTemp = usuarios.get(i);

                            System.out.println(" [ " + i + "]" + uTemp.getEmail());

                        }
                        System.out.println("Digite o valor de referencia: ");
                        int referencia = ler.nextInt();
// Limpando o buffer 
// Guardando os dados que foram digitados na referencia 
                        ler.nextLine();
                        System.out.println("Digite o novo nome :");
                        String novonome = ler.nextLine();
                        System.out.println("Digite sua nova data de nascimento:");
                        String novadata = ler.nextLine();
                        System.out.println("Digite o novo telefone : ");
                        String novotelefone = ler.nextLine();
                        System.out.println("Digite o novo email: ");
                        String novoemail = ler.nextLine();
                        System.out.println("Digite a nova senha: ");
                        String novasenha = ler.nextLine();

// Pegar o usuario que esta na referencia 
                        Usuario u = usuarios.get(referencia);
                        u.setNome(novonome);
                        u.setDatadenascimento(novasenha);
                        u.setTelefone(novotelefone);
                        u.setEmail(novoemail);
                        u.setSenha(novasenha);
                    }
                    break;

                }
                case "5": {
                    for (int i = 0; i < usuarios.size(); i++) {

                        Usuario uTemp = usuarios.get(i);

                        System.out.println(" [ " + i + "]" + uTemp.getEmail());
                        System.out.println("Digite o valor de referencia: ");
                        int referencia = ler.nextInt();
                        ler.nextLine();
                        usuarios.remove(referencia);
                    }
                    break;

                }
                case "6": {
                    rodando = false;
                    break;
                }
            }

        }

    }

}
