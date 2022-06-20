public class Dog {
    public String nome;
    public int idade;
    public String pelo;

    Dog(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    Dog(String nome, int idade, String pelo){
        this.nome = nome;
        this.idade = idade;
        this.pelo = pelo;
    }

    public boolean Andar(int vel) {
        return vel >= 5 ? true : false;
    }

    public void AndaOuCorre(boolean Andar){
        if(this.idade < 2 && Andar){
            System.out.println(this.nome + " nao anda, apenas corre!");
        }
        else if(this.idade >= 2 && Andar){
            System.out.println(this.nome + " nao corre, apenas anda!");
        }
        else{
            System.out.println(this.nome + " ele esta parado!");
        }
    }

    public void Latir(){
        System.out.println(this.nome + " falou: Au au? Miau!\n");
    }
}
