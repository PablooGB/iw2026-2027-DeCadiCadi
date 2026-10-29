
package es.uca.iw.decadicadi;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.router.Route;

@Route("")
public class InicioView extends com.vaadin.flow.component.orderedlayout.VerticalLayout {

    public InicioView() {
        add(
            new H1("DeCadiCadi"),
            new Paragraph("Plataforma de gestión e histórico del COAC de Cádiz."),
            new Paragraph("Bienvenido a la aplicación.")
        );
    }
}
