package logica;

public enum TipoUsuario {
	PROFESOR("PROFESOR"),
	ESTUDIANTE("ESTUDIANTE"),
	BIBLIOTECARIO("BIBLIOTECARIO");
	
	private String text;

    TipoUsuario(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static TipoUsuario fromString(String text) {
        for (TipoUsuario i : TipoUsuario.values()) {
            if (i.text.equalsIgnoreCase(text)) {
                return i;
            }
        }
        return null;
    }
}
