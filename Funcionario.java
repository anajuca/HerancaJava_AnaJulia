//criação da classe funcionário
public class Funcionario extends Pessoa {
    private String nome;
    private double salario;
    private String departamento;

//construtor
    public Funcionario(String nome, double salario, String departamento, String cpf, String dataNascimento){
        super(cpf, dataNascimento); //acessa métodos e atributos da superclasse Pessoa
        this.nome = nome;
        this.salario= salario;
        this.departamento = departamento;
    }

//metodo GET
    public String getNome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }
    public String getDepartamento(){
        return departamento;
    }
    
//metodo SET
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }
    public void setDepartamento(String departamento){
        this.departamento=departamento;
    }

//método utilizad para mostrar os dados do funcionário
    void mostrarDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Data de Nascimento: " + this.getDataNascimento());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Departamento: " + this.getDepartamento());
    }

//método que registra quando o funcionário bateu ponto
    void baterPonto(String h) {
        System.out.println("O funcionário "+this.getNome() + " bateu ponto às " +h);
    }
}

//criação da subclasse gerente
class Gerente extends Funcionario {
    public Gerente(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(nome, salario, departamento, cpf, dataNascimento); //acessa métodos e atributos das superclasses 
        //Funcionário e Pessoa
    }

//método que mostra que horas uma reunião será realizada, caso convocada
    void realizarReuniao(String h) {
        System.out.println(this.getNome() + " convocou uma reunião que será realizada às " + h);
    }

//sobrescrita do método baterPonto, especificando que tal funcionário é um gerente
    @Override
    void baterPonto(String h) {
        System.out.println("O gerente "+this.getNome() + " bateu ponto às " +h);
    }

//sobrescrita do método mostrarDados, novamente especificando o cargo do funcionário
    @Override
    void mostrarDados() {
        System.out.println("Cargo: Gerente");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Data de Nascimento: " + this.getDataNascimento());
        System.out.println("Salário: R$" + this.getSalario());
        System.out.println("Departamento: " + this.getDepartamento());
    }
}

//criação da subclasse desenvolvedor
class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(nome, salario, departamento, cpf, dataNascimento);  //acessa métodos e atributos das superclasses 
        //Funcionário e Pessoa
    }

//método que mostra qual o projeto sendo realizado pelo desenvolvedor no momento e em que linguagem
    void programar(String tarefa, String linguagem) {
        System.out.println("O desenvolvedor "+ this.getNome() +" está programando "+ tarefa +" em "+ linguagem);
    }

//sobrescrita do método baterPonto, especificando que tal funcionário é um desenvolvedor
    @Override
    void baterPonto(String h) {
        System.out.println("O desenvolvedor "+this.getNome() + " bateu ponto às " +h);
    }

//sobrescrita do método mostrarDados, novamente especificando o cargo do funcionário
    @Override
    void mostrarDados() {
        System.out.println("Cargo: Desenvolvedor");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Data de Nascimento: " + this.getDataNascimento());
        System.out.println("Salário: R$" + this.getSalario());
        System.out.println("Departamento: " + this.getDepartamento());
    }
}

//criação da subclasse estagiário
class Estagiario extends Funcionario {
    public Estagiario(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(nome, salario, departamento, cpf, dataNascimento);  //acessa métodos e atributos das superclasses 
        //Funcionário e Pessoa
    }

//método que especifica qual é a tarefa sendo realizada por um estagiário
    void fazerTarefa(String tarefa) {
        System.out.println("O estagiário "+ this.getNome() +" está fazendo "+ tarefa);
    }

//sobrescrita do método baterPonto, especificando que tal funcionário é um estagiário
    @Override
    void baterPonto(String h) {
        System.out.println("O estagiário "+this.getNome() + " bateu ponto às " +h);
    }

//sobrescrita do método mostrarDados, novamente especificando o cargo do funcionário
    @Override
    void mostrarDados() {
        System.out.println("Cargo: Estagiário");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Data de Nascimento: " + this.getDataNascimento());
        System.out.println("Salário: R$" + this.getSalario());
        System.out.println("Departamento: " + this.getDepartamento());
    }
}
