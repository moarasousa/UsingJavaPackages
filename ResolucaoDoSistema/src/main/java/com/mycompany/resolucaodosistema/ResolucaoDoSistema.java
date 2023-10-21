package com.mycompany.resolucaodosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDoSistema {

    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        System.out.println("A resolução do seu sistema é: " + screenSize.width + "x" + screenSize.height);
    }
}
