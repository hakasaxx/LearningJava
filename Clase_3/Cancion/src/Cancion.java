public class Cancion {
        private String titulo;
        private String interprete;
        private  double duracionMin;
        private String formato;
        private boolean enVivo;

    public Cancion() {
        String titulo;
        String interprete;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        //trim() elimina espacios en blanco
        // length() cuenta la cantidad de caracteres
        if(titulo.trim().length() > 0) {
            this.titulo = titulo.trim();
        }else {
            System.out.println("Error, no puede " + "ser texto vacio!!!");
        }
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public double getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(double duracionMin) {
        if (duracionMin >0) {
            this.duracionMin = duracionMin;
        }else {
            System.out.println("Error, debe ser" +
                    " mayor a cero!!!");
        }
        this.duracionMin = duracionMin;
    }

    public String getFormato() {
        return formato;
    }

    // Regla de negocio: Los formatos validos son MP3, WAV Y AAC

    public void setFormato(String formato) {
        if(formato.equals("MP3") ||
        formato.equalsIgnoreCase("wav") || formato.equalsIgnoreCase("AAC")) {
            this.formato = formato.trim().toUpperCase();
        }else {
             System.out.println("Error son válidos: " + "mp3, wav y aac");
        }
    }

    public boolean isEnVivo() {
        return enVivo;
    }

    public void setEnVivo(boolean enVivo) {
        this.enVivo = enVivo;
    }







}
