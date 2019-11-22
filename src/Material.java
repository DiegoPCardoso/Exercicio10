/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Material {
    private String nome;
    private int quantidade;

    public Material(String n, int q) {
        this.setNome(n);
        this.setQuantidade(q);
    }
    

    public String getNome() {
        return nome;
    }

    private void setNome(String n) {
        this.nome = n;
    }

    public int getQuantidade() {
        return quantidade;
    }

    private void setQuantidade(int q) throws QuantidadeInvalidaException{
        if(q<0){
            
            throw new QuantidadeInvalidaException("Quantidade Invalida.");
        }
        
        this.quantidade = q;
    }
    
}
