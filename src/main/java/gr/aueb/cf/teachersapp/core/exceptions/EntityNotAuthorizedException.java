package gr.aueb.cf.teachersapp.core.exceptions;

public class EntityNotAuthorizedException extends EntityGenericException {
    private static final String DEFAULT_CODE = "Not Authorized";

    public EntityNotAuthorizedException(String code, String message) {
        super(code + DEFAULT_CODE, message);
    }
}
