package br.com.alfa.desmonte.converter;

import br.com.alfa.desmonte.enumerator.TipoCredenciamentoEnum;
import br.com.alfa.desmonte.util.converter.SelectItemsBaseConverter;
import org.springframework.stereotype.Component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

@Component
public class EnumConverter extends SelectItemsBaseConverter {

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null || ((TipoCredenciamentoEnum) value).getDescricao() == null) {
            return "";
        }
        return ((TipoCredenciamentoEnum) value).getDescricao();
    }
}