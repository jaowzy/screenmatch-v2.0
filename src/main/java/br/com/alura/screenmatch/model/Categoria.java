package br.com.alura.screenmatch.model;

public enum Categoria {
    ACAO("Action", "Ação"),
    ANIME("Anime", "Anime"),
    BRASILEIROS("Brazilian", "Brasileiros"),
    CLASSICOS("Classics", "Classicos"),
    COMEDIA("Comedy", "Comédia"),
    CURTAS("Shorts", "Curtas"),
    DOCUMENTARIOS("Documentaries", "Documentarios"),
    DRAMA("Drama", "Drama"),
    ESPORTES("Sports", "Esportes"),
    ESTRANGEIROS("Foreign", "Estrangeiros"),
    FANTASIA("Fantasy", "Fantasia"),
    HOLLYWOOD("Hollywood", "Hollywood"),
    INDEPENDENTES("Independent", "Independentes"),
    LGBTQIA("LGBTQIA+", "LGBTQIA+"),
    MUSICAS("Music", "Musica"),
    PARA_TODA_FAMILIA("Family", "Familia"),
    POLICAL("Police", "Policia"),
    ROMANCE("Romance", "Romance"),
    SUSPENSE("Suspense", "Suspense"),
    TERROR("Horror", "Terror");

    private String categoriaOmdb;

    private String categoriaPortugues;

    Categoria(String categoriaOmdb, String categoriaPortugues){
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaPortugues = categoriaPortugues;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }

    public static Categoria fromPortugeus(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaPortugues.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}
