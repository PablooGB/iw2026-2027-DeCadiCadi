
package es.uca.iw.decadicadi;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import es.uca.iw.decadicadi.view.MainLayout;

@Route(value = "", layout = MainLayout.class)
public class InicioView extends VerticalLayout {

    public InicioView() {

        setSizeFull();
        setPadding(true);
        setSpacing(true);

        // Presentación principal
        H1 titulo = new H1("Bienvenido a DeCadiCadi");

        Paragraph descripcion = new Paragraph(
                "Tu espacio para descubrir, gestionar y conservar "
                + "la historia del Concurso Oficial de Agrupaciones "
                + "Carnavalescas de Cádiz."
        );

        // Sección de contenidos
        H2 seccion = new H2("Explora DeCadiCadi");

        // Tarjetas principales
        Div tarjetas = new Div();

        tarjetas.getStyle()
                .set("display", "grid")
                .set("grid-template-columns",
                        "repeat(auto-fit, minmax(220px, 1fr))")
                .set("gap", "20px")
                .set("width", "100%");

        tarjetas.add(
                crearTarjeta(
                        "Edición en curso",
                        "Consulta las agrupaciones inscritas, "
                        + "las sesiones, el orden de actuación "
                        + "y los resultados publicados."
                ),
                crearTarjeta(
                        "Agrupaciones",
                        "Descubre las agrupaciones del Carnaval, "
                        + "sus modalidades, autores y componentes."
                ),
                crearTarjeta(
                        "Archivo histórico",
                        "Explora la memoria del Carnaval a través "
                        + "de sus diferentes ediciones."
                ),
                crearTarjeta(
                        "Calendario y resultados",
                        "Consulta la programación del concurso "
                        + "y las clasificaciones publicadas."
                )
        );

        Paragraph pie = new Paragraph(
                "DeCadiCadi - Memoria y gestión del Carnaval de Cádiz."
        );

        pie.getStyle()
                .set("margin-top", "30px")
                .set("color", "var(--lumo-secondary-text-color)");

        add(titulo, descripcion, seccion, tarjetas, pie);
    }

    private Div crearTarjeta(String titulo, String descripcion) {

        Div tarjeta = new Div();

        tarjeta.getStyle()
                .set("padding", "20px")
                .set("border", "1px solid var(--lumo-contrast-10pct)")
                .set("border-radius", "12px")
                .set("background", "var(--lumo-base-color)")
                .set("box-shadow", "var(--lumo-box-shadow-xs)");

        H3 encabezado = new H3(titulo);

        Paragraph texto = new Paragraph(descripcion);

        Span estado = new Span("Sección en desarrollo");

        estado.getStyle()
                .set("font-size", "var(--lumo-font-size-xs)")
                .set("color", "var(--lumo-secondary-text-color)");

        tarjeta.add(encabezado, texto, estado);

        return tarjeta;
    }
}
