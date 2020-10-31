/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgv.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class PrincipalMDI extends JFrame implements ActionListener{
    
    public JDesktopPane getjDesktopPane() {
        return jDesktopPane;
    }

    public JMenuBar getMenuSistema() {
        return menuSistema;
    }

    public StatusBar getStatusBar() {
        return statusBar;
    }

    private final JDesktopPane jDesktopPane;
    private final JMenuBar menuSistema;
    private final StatusBar statusBar;
    
    private final JMenu cadastroMenu;
    private final JMenu operacaoMenu;
    private final JMenu relatorioMenu;
    private final JMenu sistemaMenu;
    private final JMenu ajudaMenu;
   
    private final JMenuItem fornecedorMenuItem;
    private final JMenuItem produtoMenuItem;
    private final JMenuItem clienteMenuItem;
    private final JMenuItem usuarioMenuItem;
    private final JMenuItem parametroMenuItem;
    private final JMenuItem compraMenuItemO;
    private final JMenuItem vendaMenuItemO;
    private final JMenuItem baixaMenuItemO;
    private final JMenuItem compraMenuItemR;
    private final JMenuItem vendaMenuItemR;
    private final JMenuItem baixaMenuItemR;
    private final JMenuItem ajudaMenuItem;
    private final JMenuItem sobreMenuItem;
    private final JMenuItem reiniciarMenuItem;
    private final JMenuItem sairMenuItem;
   
    public PrincipalMDI() {
        
        this.statusBar = new StatusBar();
        this.menuSistema = new JMenuBar();
        this.jDesktopPane = new JDesktopPane();
        
        cadastroMenu = new JMenu("Cadastro");
        operacaoMenu = new JMenu("Operação");
        relatorioMenu = new JMenu("Relatório");
        sistemaMenu = new JMenu("Sistema");
        ajudaMenu = new JMenu("Ajuda");
        
        fornecedorMenuItem = new JMenuItem("Fornecedor");
        produtoMenuItem = new JMenuItem("Produto");
        clienteMenuItem = new JMenuItem("Cliente");
        usuarioMenuItem = new JMenuItem("Usuário");
        parametroMenuItem = new JMenuItem("Parâmetro");
        
        compraMenuItemO = new JMenuItem("Compra");
        vendaMenuItemO = new JMenuItem("Venda");
        baixaMenuItemO = new JMenuItem("Baixa");

        compraMenuItemR = new JMenuItem("Compra");
        vendaMenuItemR = new JMenuItem("Venda");
        baixaMenuItemR = new JMenuItem("Baixa");

        ajudaMenuItem = new JMenuItem("Ajuda");
        sobreMenuItem = new JMenuItem("Sobre");

        reiniciarMenuItem= new JMenuItem("Reiniciar");
        sairMenuItem= new JMenuItem("Sair");

       
        cadastroMenu.add(fornecedorMenuItem);
        cadastroMenu.add(produtoMenuItem);
        cadastroMenu.add(clienteMenuItem);
        cadastroMenu.addSeparator();
        cadastroMenu.add(usuarioMenuItem);
        cadastroMenu.add(parametroMenuItem);

        operacaoMenu.add(compraMenuItemO);
        operacaoMenu.add(vendaMenuItemO);
        operacaoMenu.addSeparator();
        operacaoMenu.add(baixaMenuItemO);
        
        relatorioMenu.add(compraMenuItemR);
        relatorioMenu.add(vendaMenuItemR);
        relatorioMenu.addSeparator();
        relatorioMenu.add(baixaMenuItemR);

        sistemaMenu.add(reiniciarMenuItem);
        sistemaMenu.add(sairMenuItem);
        
        ajudaMenu.add(ajudaMenuItem);
        ajudaMenu.add(sobreMenuItem);

        menuSistema.add(cadastroMenu);
        menuSistema.add(operacaoMenu);
        menuSistema.add(relatorioMenu);
        menuSistema.add(sistemaMenu);
        menuSistema.add(ajudaMenu);
       
  /*      produtoMI.addActionListener((ActionEvent ev) -> {
         //  jDesktopPane.add(new Produto().getFrame());
        });
        marcaMI.addActionListener((ActionEvent ev) -> {
            //Marca marca = new Marca();
           // jDesktopPane.add(marca.getFrame());
        });
        sobreMI.addActionListener((ActionEvent ev) -> {
                // https://brunoagt.wordpress.com/2011/03/28/javax-swing-joptionpane-conhecendo-e-utilizando-a-classe-joptionpane/
            int option = JOptionPane.INFORMATION_MESSAGE + JOptionPane.OK_OPTION;
            JOptionPane.showMessageDialog(null, "Sistema de Controle de Suprimentos\nVersão: 1.0\n2020", "Sobre", option);
        });
        sairMI.addActionListener((ActionEvent ev) -> {
            
        });
       */
    }
    
    public void adicionaActionListener(){
        
        fornecedorMenuItem.addActionListener(this);
        produtoMenuItem.addActionListener(this);
        clienteMenuItem.addActionListener(this);
        usuarioMenuItem.addActionListener(this);
        parametroMenuItem.addActionListener(this);
        compraMenuItemO.addActionListener(this);
        vendaMenuItemO.addActionListener(this);
        baixaMenuItemO.addActionListener(this);
        compraMenuItemR.addActionListener(this);
        vendaMenuItemR.addActionListener(this);
        baixaMenuItemR.addActionListener(this);
        ajudaMenuItem.addActionListener(this);
        sobreMenuItem.addActionListener(this);
        reiniciarMenuItem.addActionListener(this);
        sairMenuItem.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
            
        if(evento.getSource().equals(fornecedorMenuItem)){
  
        }
        else if(evento.getSource().equals(produtoMenuItem)){
            jDesktopPane.add(new Produto().getFrame());
        }
        else if(evento.getSource().equals(clienteMenuItem)){
            
        }
        else if(evento.getSource().equals(usuarioMenuItem)){
            
        }
        else if(evento.getSource().equals(parametroMenuItem)){
            
        }
        else if(evento.getSource().equals(compraMenuItemO)){
            
        }
        else if(evento.getSource().equals(vendaMenuItemO)){
            
        }
        else if(evento.getSource().equals(baixaMenuItemO)){
            
        }
        else if(evento.getSource().equals(compraMenuItemR)){
            
        }
        else if(evento.getSource().equals(vendaMenuItemR)){
            
        }
        else if(evento.getSource().equals(baixaMenuItemR)){
            
        }
        else if(evento.getSource().equals(ajudaMenuItem)){
            
        }
        else if(evento.getSource().equals(sobreMenuItem)){
            int option = JOptionPane.INFORMATION_MESSAGE + JOptionPane.OK_OPTION;
            JOptionPane.showMessageDialog(null, "SGV - Sistema de Gerenciamento de Vendas\nVersão: 1.0", "Sobre", option);
        }
        else if(evento.getSource().equals(reiniciarMenuItem)){
            
        }
        else if(evento.getSource().equals(sairMenuItem)){
            System.exit(0);
        }
        
        
        
    }
    
}
