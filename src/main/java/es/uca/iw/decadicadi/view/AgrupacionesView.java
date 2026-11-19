
package es.uca.iw.decadicadi.view;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "agrupaciones", layout = MainLayout.class)
@PageTitle("Agrupaciones | DeCadiCadi")
public class AgrupacionesView extends VerticalLayout {

    public AgrupacionesView() {

        setSizeFull();
        setPadding(true);
        setSpacing(true);

        H1 titulo = new H1("Agrupaciones");

        Paragraph descripcion = new Paragraph(
                "Consulta las agrupaciones que forman parte "
                + "del Carnaval de Cádiz."
        );

        H2 informacion = new H2("Catálogo de agrupaciones");

        Paragraph contenido = new Paragraph(
                "En esta sección se podrán consultar las fichas "
                + "de las agrupaciones, incluyendo su nombre, "
                + "modalidad, localidad, autores y componentes."
        );

        add(titulo, descripcion, informacion, contenido);
    }
}
