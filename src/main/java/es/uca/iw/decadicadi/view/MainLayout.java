
package es.uca.iw.decadicadi.view;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.router.PageTitle;

public class MainLayout extends AppLayout {

    public MainLayout() {

        // Cabecera
        DrawerToggle toggle = new DrawerToggle();

        H1 logo = new H1("DeCadiCadi");
        logo.getStyle()
                .set("font-size", "var(--lumo-font-size-xl)")
                .set("margin", "0");

        Span subtitle = new Span("Memoria del Carnaval de Cádiz");
        subtitle.getStyle()
                .set("font-size", "var(--lumo-font-size-s)");

        HorizontalLayout header = new HorizontalLayout(
                toggle, logo, subtitle
        );

        header.setDefaultVerticalComponentAlignment(
                HorizontalLayout.Alignment.CENTER
        );
        header.setWidthFull();
        header.setPadding(true);

        addToNavbar(header);

        // Navegación
        SideNav navigation = new SideNav();

        navigation.addItem(
                new SideNavItem("Inicio", "")
        );

        navigation.addItem(
                new SideNavItem("Edición en curso", "edicion")
        );

        navigation.addItem(
                new SideNavItem("Agrupaciones", "agrupaciones")
        );

        navigation.addItem(
                new SideNavItem("Archivo histórico", "archivo")
        );

        navigation.addItem(
                new SideNavItem("Calendario", "calendario")
        );

        navigation.addItem(
                new SideNavItem("Resultados", "resultados")
        );

        addToDrawer(navigation);
    }
}
