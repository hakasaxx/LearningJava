import java.util.ArrayList;
public class CorredoraPropiedades {
    private ArrayList<Propiedad> propiedades = new ArrayList<>();
    public void agregarPropiedad(Propiedad prop){
        this.propiedades.add(prop);
        System.out.println("...Propiedad agregada");
    }
    public void buscarPropiedadesPorComuna(String comuna){
        //para recorrer datos se usa foreach
        // "iter" + enter
        for (Propiedad propiedade : propiedades) {
            if(propiedade.getDireccion().getComuna().equalsIgnoreCase(comuna)){
                encontrado = true;
                System.out.println("Direccion: " + propiedade.getDireccion().toString());
                System.out.println("Valor: " + propiedade.calcularTasacion());
            }
        }
        if(encontrado == false){
            System.out.println("No encontrado");
        }
    }
}
