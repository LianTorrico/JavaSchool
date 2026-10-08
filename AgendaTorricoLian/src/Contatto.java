import java.time.LocalDate;

public class Contatto {
    private String cognome;
    private String nome;
    private LocalDate dataNascita;
    private String numeroTelefonico;
    private String email;

    public Contatto(String cognome, String nome, String numeroTelefonico, String email, LocalDate dataNascita){
        this.cognome = cognome;
        this.nome = nome;
        this.dataNascita = dataNascita;
        this.email = email;
        this.numeroTelefonico = numeroTelefonico;
    }
    public String getCognome(){
        return this.cognome;
    }
    public String getNome(){
        return this.nome;
    }
    public String getEmail(){
        return this.email;
    }
    public LocalDate getDataNascita(){
        return this.dataNascita;
    }
    public String getNumeroTelefonico(){
        return this.numeroTelefonico;
    }

}
