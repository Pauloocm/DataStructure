package br.ucsal.eventos.Utils;

import br.ucsal.eventos.Annotations.ValidEmail;
import br.ucsal.eventos.model.Participante;

import java.lang.reflect.Field;

public class Validations {
    public static boolean ValidateEmail(Participante participante) throws Exception {

        var fields = participante.getClass().getDeclaredFields();

        for(Field field : fields){
            field.setAccessible(true);

            if(field.isAnnotationPresent(ValidEmail.class)){
                try {
                    var fieldValue = field.get(participante).toString();
                    if(fieldValue.contains("@") && fieldValue.length() > 5){
                        return true;
                    }
                } catch (Exception e) {
                    throw new Exception("Email invalido!");
                }
            }
        }

        throw new Exception("Email invalido!");
    }
}
