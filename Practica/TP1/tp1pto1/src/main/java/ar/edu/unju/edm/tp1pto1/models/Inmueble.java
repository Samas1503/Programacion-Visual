package ar.edu.unju.edm.tp1pto1.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Inmueble {
    private int codigo,descriptcion;
    private String tipo, direccion, estado;
    double precio;
    @Autowired
    Provincia provincia;
    public Inmueble() {
    }
    /**
     * @param codigo
     * @param descriptcion
     * @param tipo
     * @param direccion
     * @param estado
     * @param precio
     * @param provincia
     */
    public Inmueble(int codigo, int descriptcion, String tipo, String direccion, String estado, double precio,
            Provincia provincia) {
        this.codigo = codigo;
        this.descriptcion = descriptcion;
        this.tipo = tipo;
        this.direccion = direccion;
        this.estado = estado;
        this.precio = precio;
        this.provincia = provincia;
    }
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * @return the descriptcion
     */
    public int getDescriptcion() {
        return descriptcion;
    }
    /**
     * @param descriptcion the descriptcion to set
     */
    public void setDescriptcion(int descriptcion) {
        this.descriptcion = descriptcion;
    }
    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }
    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * @return the provincia
     */
    public Provincia getProvincia() {
        return provincia;
    }
    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Inmueble [codigo=" + codigo + ", descriptcion=" + descriptcion + ", "
                + (direccion != null ? "direccion=" + direccion + ", " : "")
                + (estado != null ? "estado=" + estado + ", " : "") + "precio=" + precio + ", "
                + (provincia != null ? "provincia=" + provincia + ", " : "") + (tipo != null ? "tipo=" + tipo : "")
                + "]";
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        result = prime * result + descriptcion;
        result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        long temp;
        temp = Double.doubleToLongBits(precio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((provincia == null) ? 0 : provincia.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        return result;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Inmueble)) {
            return false;
        }
        Inmueble other = (Inmueble) obj;
        if (codigo != other.codigo) {
            return false;
        }
        if (descriptcion != other.descriptcion) {
            return false;
        }
        if (direccion == null) {
            if (other.direccion != null) {
                return false;
            }
        } else if (!direccion.equals(other.direccion)) {
            return false;
        }
        if (estado == null) {
            if (other.estado != null) {
                return false;
            }
        } else if (!estado.equals(other.estado)) {
            return false;
        }
        if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (provincia == null) {
            if (other.provincia != null) {
                return false;
            }
        } else if (!provincia.equals(other.provincia)) {
            return false;
        }
        if (tipo == null) {
            if (other.tipo != null) {
                return false;
            }
        } else if (!tipo.equals(other.tipo)) {
            return false;
        }
        return true;
    }
}
