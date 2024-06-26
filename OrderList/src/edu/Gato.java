package edu;
import java.util.Comparator;

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome(){
        return this.nome;
    }
    public Integer getIdade(){

        return this.idade;
    }
    public String getCor(){
        return this.cor;
    }
    
    @Override
    public String toString(){
        return "{" +
                "nome='" + nome + '\''+
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }



    @Override
    public int compareTo(Gato gato){
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

    class ComparatorIdade implements Comparator<Gato> {
        @Override
        public int compare(Gato g1, Gato g2){
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }

    class ComparatorCor implements Comparator<Gato>{
        @Override
        public int compare(Gato g1, Gato g2) {
            return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
    }

    class ComparatorNomeCorIdade implements Comparator<Gato>{
        @Override
        public int compare(Gato g1, Gato g2){
            int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
            if (nome != 0) return nome;

            int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
            if (cor != 0) return cor;

            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }
}
