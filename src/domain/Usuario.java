
package domain;


import domain.Usuarios;


/************************************************************/
/**
 * 
 */
public class Usuario extends Usuarios
 {

    public Usuario(String unicoNombre, String contraseña, String nombreCompleto, String tipoIdentificacion, String identificacion,String tipoUsuario) {
        super(unicoNombre, contraseña, nombreCompleto, tipoIdentificacion, identificacion,tipoUsuario);
    }
	/**
	 * 
	 */
	public void ListaObrasPrestadas() {
	}

	@Override
	public boolean Borrar() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public void Agregar() {
		// TODO Auto-generated method stub
	
	}

	@Override
	public boolean Buscar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void Mostrar() {
		// TODO Auto-generated method stub
		
	}

    @Override
    public void Agregar(Bibliotecarios bi, Autores au) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
};
