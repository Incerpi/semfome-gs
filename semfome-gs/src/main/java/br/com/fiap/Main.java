package br.com.fiap;

import br.com.fiap.alimento.model.Alimento;
import br.com.fiap.empresa.model.Empresa;
import br.com.fiap.usuario.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle");
        EntityManager manager = factory.createEntityManager();

        var usuario = new Usuario();
        usuario.setNomeUsuario("Roberto");
        usuario.setEmailUsuario("roberto@hortifrutiuniao.com.br");
        usuario.setSenhaUsuario("91011121314");

        var empresa = new Empresa();
        empresa.setCnpjEmpresa(geraCNPJ());
        empresa.setRsEmpresa("HORTIFRUTI NOVA UNIAO LTDA");
        empresa.setNmFnEmpresa("HORTIFRUTI UNIAO");
        empresa.setSenhaEmpresa("12345678910");
        empresa.setTipoEmpresa("Alimentícia");
        empresa.setCepEmpresa("03.402-003");
        empresa.setLogradouroEmpresa("AVENIDA CONSELHEIRO CARRÃO");
        empresa.setNumeroEnderecoEmpresa("852");
        empresa.setComplementoEnderecoEmpresa("Supermercado");
        empresa.setBairroEnderecoEmpresa("VILA CARRÃO");
        empresa.setCidadeEnderecoEmpresa("São Paulo");
        empresa.setEstadoEnderecoEmpresa("São Paulo");

        var alimento = new Alimento();
        alimento.setNomeAlimento("Leite Ninho");
        alimento.setDescAlimento("Leite em pó Ninho");
        alimento.setPrecoAlimento("R$46,99");
        alimento.setEmpresa(empresa);

        List<Object> pedidos = Arrays.asList(usuario, empresa, alimento);


        try {
            manager.getTransaction().begin();
            pedidos.forEach(manager::persist);
            manager.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    """
                            Erro! 
                                        
                            Confira se todas as classes estão corretas!
                                        
                            """

            );
            e.printStackTrace();
            System.exit(1);
        }

        findAll(manager);

        Long id = Long.valueOf(JOptionPane.showInputDialog("digite o ID do alimento:"));

        Alimento alimentos = findByID(manager, id);

        if (alimentos != null) {
            System.out.println(alimentos);
        } else {
            JOptionPane.showMessageDialog(null, "Alimento não encontrado com o ID = " + id);
        }

        manager.close();
        factory.close();

    }
    
    private static Alimento findByID(EntityManager manager, Long id) {
        return manager.find(Alimento.class, id);
    }

    private static void findAll(EntityManager manager) {
        var hql = "FROM Alimento";
        List<?> list = manager.createQuery(hql).getResultList();
        list.forEach(System.out::println);
    }

    private static String geraCNPJ() {
        var sorteio = new Random();
        var digito = sorteio.nextLong(99);
        var numero = sorteio.nextLong(999999999);
        var cnpj = String.valueOf(numero) + "/0001-" + String.valueOf(digito);
        return cnpj;
    }
}


