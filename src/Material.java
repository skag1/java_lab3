public enum Material {
    CONCRETE("бетона"),
    BRICK("кирпича"),
    WOOD("дерева"),
    STEEL("стали");

    private String rusString;

    Material(String rusString){
        this.rusString = rusString;
    }
    @Override
    public String toString(){
        return rusString;
    }
}