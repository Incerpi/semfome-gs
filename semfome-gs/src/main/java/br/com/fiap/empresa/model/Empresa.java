package br.com.fiap.empresa.model;

import jakarta.persistence.*;

@Entity
@Table(
        name = "TB_EMPRESA",
        uniqueConstraints = {
                @UniqueConstraint(name = "UK_CNPJ_EMPRESA", columnNames = "CNPJ_EMPRESA")
        }

)
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "SQ_EMPRESA")
    @SequenceGenerator(name = "SQ_EMPRESA", sequenceName = "SQ_EMPRESA", initialValue = 1, allocationSize = 1)
    @Column(name = "ID_EMPRESA")
    Long id;

    @Column(name = "CNPJ_EMPRESA")
    String cnpjEmpresa;

    @Column(name = "RS_EMPRESA")
    String rsEmpresa;

    @Column(name = "NM_FN_EMPRESA")
    String nmFnEmpresa;

    @Column(name = "SENHA_EMPRESA")
    String senhaEmpresa;

    @Column(name = "TIPO_EMPRESA")
    String tipoEmpresa;

    @Column(name = "CEP_EMPRESA")
    String cepEmpresa;

    @Column(name = "LOGRADOURO_EMPRESA")
    String logradouroEmpresa;

    @Column(name = "NUMERO_ENDERECO_EMPRESA")
    String numeroEnderecoEmpresa;

    @Column(name = "COMPLEMENTO_ENDERECO_EMPRESA")
    String complementoEnderecoEmpresa;

    @Column(name = "BAIRRO_ENDERECO_EMPRESA")
    String bairroEnderecoEmpresa;

    @Column(name = "CIDADE_ENDERECO_EMPRESA")
    String cidadeEnderecoEmpresa;

    @Column(name = "ESTADO_ENDERECO_EMPRESA")
    String estadoEnderecoEmpresa;

    public Empresa(Long id, String cnpjEmpresa, String rsEmpresa, String nmFnEmpresa, String senhaEmpresa, String tipoEmpresa, String cepEmpresa, String logradouroEmpresa, String numeroEnderecoEmpresa, String complementoEnderecoEmpresa, String bairroEnderecoEmpresa, String cidadeEnderecoEmpresa, String estadoEnderecoEmpresa) {
        this.id = id;
        this.cnpjEmpresa = cnpjEmpresa;
        this.rsEmpresa = rsEmpresa;
        this.nmFnEmpresa = nmFnEmpresa;
        this.senhaEmpresa = senhaEmpresa;
        this.tipoEmpresa = tipoEmpresa;
        this.cepEmpresa = cepEmpresa;
        this.logradouroEmpresa = logradouroEmpresa;
        this.numeroEnderecoEmpresa = numeroEnderecoEmpresa;
        this.complementoEnderecoEmpresa = complementoEnderecoEmpresa;
        this.bairroEnderecoEmpresa = bairroEnderecoEmpresa;
        this.cidadeEnderecoEmpresa = cidadeEnderecoEmpresa;
        this.estadoEnderecoEmpresa = estadoEnderecoEmpresa;
    }

    public Empresa() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }

    public String getRsEmpresa() {
        return rsEmpresa;
    }

    public void setRsEmpresa(String rsEmpresa) {
        this.rsEmpresa = rsEmpresa;
    }

    public String getNmFnEmpresa() {
        return nmFnEmpresa;
    }

    public void setNmFnEmpresa(String nmFnEmpresa) {
        this.nmFnEmpresa = nmFnEmpresa;
    }

    public String getSenhaEmpresa() {
        return senhaEmpresa;
    }

    public void setSenhaEmpresa(String senhaEmpresa) {
        this.senhaEmpresa = senhaEmpresa;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getCepEmpresa() {
        return cepEmpresa;
    }

    public void setCepEmpresa(String cepEmpresa) {
        this.cepEmpresa = cepEmpresa;
    }

    public String getLogradouroEmpresa() {
        return logradouroEmpresa;
    }

    public void setLogradouroEmpresa(String logradouroEmpresa) {
        this.logradouroEmpresa = logradouroEmpresa;
    }

    public String getNumeroEnderecoEmpresa() {
        return numeroEnderecoEmpresa;
    }

    public void setNumeroEnderecoEmpresa(String numeroEnderecoEmpresa) {
        this.numeroEnderecoEmpresa = numeroEnderecoEmpresa;
    }

    public String getComplementoEnderecoEmpresa() {
        return complementoEnderecoEmpresa;
    }

    public void setComplementoEnderecoEmpresa(String complementoEnderecoEmpresa) {
        this.complementoEnderecoEmpresa = complementoEnderecoEmpresa;
    }

    public String getBairroEnderecoEmpresa() {
        return bairroEnderecoEmpresa;
    }

    public void setBairroEnderecoEmpresa(String bairroEnderecoEmpresa) {
        this.bairroEnderecoEmpresa = bairroEnderecoEmpresa;
    }

    public String getCidadeEnderecoEmpresa() {
        return cidadeEnderecoEmpresa;
    }

    public void setCidadeEnderecoEmpresa(String cidadeEnderecoEmpresa) {
        this.cidadeEnderecoEmpresa = cidadeEnderecoEmpresa;
    }

    public String getEstadoEnderecoEmpresa() {
        return estadoEnderecoEmpresa;
    }

    public void setEstadoEnderecoEmpresa(String estadoEnderecoEmpresa) {
        this.estadoEnderecoEmpresa = estadoEnderecoEmpresa;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Empresa{" +
                "id=" + id +
                ", cnpjEmpresa='" + cnpjEmpresa + '\'' +
                ", rsEmpresa='" + rsEmpresa + '\'' +
                ", nmFnEmpresa='" + nmFnEmpresa + '\'' +
                ", senhaEmpresa='" + senhaEmpresa + '\'' +
                ", tipoEmpresa='" + tipoEmpresa + '\'' +
                ", cepEmpresa='" + cepEmpresa + '\'' +
                ", logradouroEmpresa='" + logradouroEmpresa + '\'' +
                ", numeroEnderecoEmpresa='" + numeroEnderecoEmpresa + '\'' +
                ", complementoEnderecoEmpresa='" + complementoEnderecoEmpresa + '\'' +
                ", bairroEnderecoEmpresa='" + bairroEnderecoEmpresa + '\'' +
                ", cidadeEnderecoEmpresa='" + cidadeEnderecoEmpresa + '\'' +
                ", estadoEnderecoEmpresa='" + estadoEnderecoEmpresa + '\'' +
                '}';
    }
}
