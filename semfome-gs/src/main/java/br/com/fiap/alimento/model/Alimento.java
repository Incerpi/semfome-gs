package br.com.fiap.alimento.model;

import br.com.fiap.empresa.model.Empresa;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "TB_ALIMENTO")
public class Alimento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "SQ_ALIMENTO")
    @SequenceGenerator(name = "SQ_ALIMENTO", sequenceName = "SQ_ALIMENTO", initialValue = 1, allocationSize = 1)
    @Column(name = "ID_ALIMENTO")
    Long id;

    @Column(name = "NOME_ALIMENTO")
    String nomeAlimento;

    @Column(name = "DESC_ALIMENTO")
    String descAlimento;

    @Column(name = "PRECO_ALIMENTO")
    String precoAlimento;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ID_EMPRESA",
            referencedColumnName = "ID_EMPRESA",
            foreignKey = @ForeignKey(name = "FK_ALIMENTO_EMPRESA")
    )
    private Empresa empresa;

    public Alimento(Long id, String nomeAlimento, String descAlimento, String precoAlimento, Empresa empresa) {
        this.id = id;
        this.nomeAlimento = nomeAlimento;
        this.descAlimento = descAlimento;
        this.precoAlimento = precoAlimento;
        this.empresa = empresa;
    }

    public Alimento(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeAlimento() {
        return nomeAlimento;
    }

    public void setNomeAlimento(String nomeAlimento) {
        this.nomeAlimento = nomeAlimento;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public String getPrecoAlimento() {
        return precoAlimento;
    }

    public void setPrecoAlimento(String precoAlimento) {
        this.precoAlimento = precoAlimento;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "id=" + id +
                ", nomeAlimento='" + nomeAlimento + '\'' +
                ", descAlimento='" + descAlimento + '\'' +
                ", precoAlimento='" + precoAlimento + '\'' +
                ", empresa=" + empresa +
                '}';
    }
}