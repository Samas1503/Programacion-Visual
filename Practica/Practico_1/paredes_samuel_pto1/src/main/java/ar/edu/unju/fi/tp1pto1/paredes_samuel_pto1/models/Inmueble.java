package ar.edu.unju.fi.tp1pto1.paredes_samuel_pto1.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Inmueble {
    private int codigo,descripcion;
    private String tipo,direccion,estado;
    private double precio;
    @Autowired
    Provincia prov;
    public Inmueble() {
    }
    /**
     * @param codigo
     * @param descripcion
     * @param tipo
     * @param direccion
     * @param estado
     * @param precio
     * @param prov
     */
    public Inmueble(int codigo, int descripcion, String tipo, String direccion, String estado, double precio,
            Provincia prov) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.direccion = direccion;
        this.estado = estado;
        this.precio = precio;
        this.prov = prov;
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
     * @return the descripcion
     */
    public int getDescripcion() {
        return descripcion;
    }
    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
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
     * @return the prov
     */
    public Provincia getProv() {
        return prov;
    }
    /**
     * @param prov the prov to set
     */
    public void setProv(Provincia prov) {
        this.prov = prov;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Inmueble [codigo=" + codigo + ", descripcion=" + descripcion + ", "
                + (direccion != null ? "direccion=" + direccion + ", " : "")
                + (estado != null ? "estado=" + estado + ", " : "") + "precio=" + precio + ", "
                + (prov != null ? "prov=" + prov + ", " : "") + (tipo != null ? "tipo=" + tipo : "") + "]";
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        result = prime * result + descripcion;
        result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        long temp;
        temp = Double.doubleToLongBits(precio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((prov == null) ? 0 : prov.hashCode());
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
        if (descripcion != other.descripcion) {
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
        if (prov == null) {
            if (other.prov != null) {
                return false;
            }
        } else if (!prov.equals(other.prov)) {
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
