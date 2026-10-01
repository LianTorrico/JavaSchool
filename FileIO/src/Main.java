//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    File test = new File("fileTest.txt");
    if (test.exists()){
        System.out.println("File trovato.");
    }
    else{
        try {
            test.createNewFile();
        }
        catch (IOException e){
            System.out.println("Errore! Impossibile creare file\nControllare i permessi ceduti e/o che ci sia spazio in memoria!");
        }

    }
    /* -    -   -   Reader   -    -   - */
    try {
        BufferedReader Reader = new BufferedReader(new FileReader(test));
        int counter=7;
        /* --- Lettura Linea --- */
        try {
            String riga = Reader.readLine();
            while(riga != null){
                Reader.reset();
                try {
                    Reader.mark(1024); //Massimo lettere int/2 (Max lettura)
                }
                catch (IOException e){
                    Reader.reset();
                    Reader.mark(1024); //Pulisce e riporta
                }
            }
        }
        catch (IOException e) {
        }
        /* ---               --- */
    }
    catch (FileNotFoundException e){
        System.out.println("Errore! File inesistente!");
    }

}