import java.util.Scanner;
    public class projeto {

        private static String[] titulos = new String[100];
        private static String[] autores = new String[100];
        private static int[] anosPublicacao = new int[100];
        private static int[] numPaginas = new int[100];
        private static int totalLivros = 0;

        private static String[] nomesUsuarios = new String[100];
        private static int[] idadesUsuarios = new int[100];
        private static int[] livrosEmprestados = new int[100];
        private static int totalUsuarios = 0;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcao;

            do {
                exibirMenu();
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        cadastrarLivro(scanner);
                        break;
                    case 2:
                        cadastrarUsuario(scanner);
                        break;
                    case 3:
                        relatorioLivros();
                        break;
                    case 4:
                        livroComMaisPaginas();
                        break;
                    case 5:
                        relatorioUsuarios();
                        break;
                    case 6:
                        usuarioComMaisLivrosEmprestados();
                        break;
                    case 7:
                        mediaPaginasLivros();
                        break;
                    case 8:
                        listarLivrosAutorEspecifico(scanner);
                        break;
                    case 9:
                        usuariosComMaisDe5Livros();
                        break;
                    case 10:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } while (opcao != 10);

            scanner.close();
        }

        private static void exibirMenu() {
            System.out.println("\n# NEW BIBLIOTECA");
            System.out.println("1 - Cadastrar livros");
            System.out.println("2 - Cadastrar usuarios");
            System.out.println("3 - Relatório de livros cadastrados");
            System.out.println("4 - Livro com maior número de páginas");
            System.out.println("5 - Relatório de usuários cadastrados");
            System.out.println("6 - Usuário com mais livros emprestados");
            System.out.println("7 - Média de páginas dos livros");
            System.out.println("8 - Listar livros de um autor específico");
            System.out.println("9 - Usuários com mais de 5 livros emprestados");
            System.out.println("10 - Sair");
            System.out.print("Escolha uma opção: ");
        }

        private static void cadastrarLivro(Scanner scanner) {
            System.out.println("\nCadastro de Livro");
            System.out.print("Título: ");
            titulos[totalLivros] = scanner.nextLine();
            System.out.print("Autor: ");
            autores[totalLivros] = scanner.nextLine();
            System.out.print("Ano de publicação: ");
            anosPublicacao[totalLivros] = scanner.nextInt();
            System.out.print("Número de páginas: ");
            numPaginas[totalLivros] = scanner.nextInt();

            totalLivros++;
            System.out.println("Livro cadastrado com sucesso!\n");
        }

        private static void cadastrarUsuario(Scanner scanner) {
            System.out.println("\nCadastro de Usuário");
            System.out.print("Nome: ");
            nomesUsuarios[totalUsuarios] = scanner.nextLine();
            System.out.print("Idade: ");
            idadesUsuarios[totalUsuarios] = scanner.nextInt();
            System.out.print("Número de livros emprestados: ");
            livrosEmprestados[totalUsuarios] = scanner.nextInt();

            totalUsuarios++;
            System.out.println("Usuário cadastrado com sucesso!\n");
        }

        private static void relatorioLivros() {
            System.out.println("\nRelatório de Livros Cadastrados");
            if (totalLivros == 0) {
                System.out.println("Nenhum livro cadastrado.");
            } else {
                for (int i = 0; i < totalLivros; i++) {
                    System.out.println("Livro " + (i + 1) + ":");
                    System.out.println("Título: " + titulos[i]);
                    System.out.println("Autor: " + autores[i]);
                    System.out.println("Ano de publicação: " + anosPublicacao[i]);
                    System.out.println("Número de páginas: " + numPaginas[i]);
                    System.out.println();
                }
            }
        }

        private static void livroComMaisPaginas() {
            if (totalLivros == 0) {
                System.out.println("\nNenhum livro cadastrado.");
                return;
            }

            int maxPaginas = numPaginas[0];
            String livroMaior = titulos[0];

            for (int i = 1; i < totalLivros; i++) {
                if (numPaginas[i] > maxPaginas) {
                    maxPaginas = numPaginas[i];
                    livroMaior = titulos[i];
                }
            }

            System.out.println("\nLivro com maior número de páginas:");
            System.out.println("Título: " + livroMaior);
            System.out.println("Número de páginas: " + maxPaginas + "\n");
        }

        private static void relatorioUsuarios() {
            System.out.println("\nRelatório de Usuários Cadastrados");
            if (totalUsuarios == 0) {
                System.out.println("Nenhum usuário cadastrado.");
            } else {
                for (int i = 0; i < totalUsuarios; i++) {
                    System.out.println("Usuário " + (i + 1) + ":");
                    System.out.println("Nome: " + nomesUsuarios[i]);
                    System.out.println("Idade: " + idadesUsuarios[i]);
                    System.out.println("Livros emprestados: " + livrosEmprestados[i]);
                    System.out.println();
                }
            }
        }

        private static void usuarioComMaisLivrosEmprestados() {
            if (totalUsuarios == 0) {
                System.out.println("\nNenhum usuário cadastrado.");
                return;
            }

            int maxLivros = livrosEmprestados[0];
            String usuarioMaisLivros = nomesUsuarios[0];

            for (int i = 1; i < totalUsuarios; i++) {
                if (livrosEmprestados[i] > maxLivros) {
                    maxLivros = livrosEmprestados[i];
                    usuarioMaisLivros = nomesUsuarios[i];
                }
            }

            System.out.println("\nUsuário com mais livros emprestados:");
            System.out.println("Nome: " + usuarioMaisLivros);
            System.out.println("Quantidade de livros emprestados: " + maxLivros + "\n");
        }

        private static void mediaPaginasLivros() {
            if (totalLivros == 0) {
                System.out.println("\nNenhum livro cadastrado para calcular a média.");
                return;
            }

            int soma = 0;
            for (int i = 0; i < totalLivros; i++) {
                soma += numPaginas[i];
            }

            double media = (double) soma / totalLivros;
            System.out.println("\nMédia de páginas dos livros: " + String.format("%.2f", media) + "\n");
        }

        private static void listarLivrosAutorEspecifico(Scanner scanner) {
            System.out.print("\nDigite o nome do autor: ");
            String autor = scanner.nextLine();

            boolean encontrado = false;
            System.out.println("\nLivros do autor " + autor + ":");

            for (int i = 0; i < totalLivros; i++) {
                if (autores[i].equalsIgnoreCase(autor)) {
                    System.out.println("Título: " + titulos[i]);
                    System.out.println("Ano de publicação: " + anosPublicacao[i]);
                    System.out.println("Número de páginas: " + numPaginas[i]);
                    System.out.println();
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("Nenhum livro encontrado para este autor.\n");
            }
        }

        private static void usuariosComMaisDe5Livros() {
            System.out.println("\nUsuários com mais de 5 livros emprestados:");
            boolean encontrado = false;

            for (int i = 0; i < totalUsuarios; i++) {
                if (livrosEmprestados[i] > 5) {
                    System.out.println("Nome: " + nomesUsuarios[i]);
                    System.out.println("Idade: " + idadesUsuarios[i]);
                    System.out.println("Livros emprestados: " + livrosEmprestados[i]);
                    System.out.println();
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("Nenhum usuário com mais de 5 livros emprestados.\n");
            }
        }
    }

