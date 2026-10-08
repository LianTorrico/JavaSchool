import java.io.File;
import java.io.IOException;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static LocalDate dateInput(String userInput) {

    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
    LocalDate date = LocalDate.parse(userInput, dateFormat);


    System.out.println(date);
    return date ;
}


void main() {

    File archivio = new File("agenda.txt");
        if (archivio.exists()){
    }
        else {
        try {
            archivio.createNewFile();
        } catch (IOException e) {
            System.out.println("Errore! Impossibile creare file\n Controllare i permessi ceduti e/o spazio disponibile nel disco!");
        }
    }
    void salva(){
            Scanner inputhandler = new Scanner(System.in);
            System.out.println("Inserire nome: ");
            String nomepersona = inputhandler.nextLine();
            System.out.println("Inserire cognome: ");
            String cognomepersona = inputhandler.nextLine();
            System.out.println("Inserire email: ");
            String emailpersona = inputhandler.nextLine();
            System.out.println("Inserire numero di telefono: ");
            String numeropersona = inputhandler.nextLine();
            System.out.println("Inserire data di nascita");
            LocalDate datapersona = dateInput(inputhandler.nextLine());

            Contatto persona = new Contatto(cognomepersona,nomepersona,numeropersona,emailpersona,datapersona);
        try {
            BufferedReader Reader = new BufferedReader(new FileReader(archivio));
            int counter=0;
            try {
                String contatto = Reader.readLine();
                while (contatto!=null){
                    counter++;
                }
                if (contatto==null){
                    FileWriter Writer = new FileWriter(archivio,true);
                    Writer.write();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }





        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
