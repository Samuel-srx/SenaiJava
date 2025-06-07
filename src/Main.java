import Model.Aluno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produto produtos = new Produto();

        produtos.nome = "Placa mãe";
        produtos.quantidade = 37;
        produtos.preco = 780.99;


        produtos.adicionarProduto(10);
        produtos.venderProduto(37);
        produtos.venderProduto(37);


        Student student1 = new Student();
        student1.name = "Bob";
        student1.grade1 = 7.0;
        student1.grade2 = 6.5;

        Student student2 = new Student();
        student2.name = "Bob";
        student2.grade1 = 7.0;
        student2.grade2 = 6.5;

        System.out.println(student1.name + " tem média: " + student1.calculaMedia());
        System.out.println(student2.name + " tem média: " + student2.calculaMedia());

        Bond bond = new Bond();
        bond.name = "tesouro";
        bond.balance = 100000.45;

        bond.buyBond(60);
        bond.simulateInterest();


        System.out.println();


        Aluno aluno = new Aluno();
        aluno.nome = "Paulo";
        aluno.altura = 1.70;
        aluno.anoMatricula = 2024;


        System.out.println(aluno.nome + " tem " + aluno.altura + "m de altura");

        aluno.estudar();


    }
}

