package za.ac.cput.baronmukenyi;

import java.util.Objects;

public class CollectionClass {
    public String gameName, genreName;
    public int price;

    protected CollectionClass(CollectionClassBuilder builder){
        this.gameName = builder.gameName;
        this.genreName = builder.genreName;
        this.price = builder.price;
    }

    public String getGameName() {
        return gameName;
    }

    public String getGenreName() {
        return genreName;
    }
    public int getPrice(){
        return price;
    }

    public static class CollectionClassBuilder{
        private String gameName, genreName;
        private int price;


        public CollectionClassBuilder setGameName(String gameName){
            this.gameName = gameName;
            return this;
        }

        public CollectionClassBuilder setGenreName(String genreName){
            this.genreName = genreName;
            return this;
        }

        public CollectionClassBuilder setPrice(int price){
            this.price = price;
            return this;
        }

        public CollectionClass build(){
            return new CollectionClass(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CollectionClass)) return false;
        CollectionClass that = (CollectionClass) o;
        return getPrice() == that.getPrice() && Objects.equals(getGameName(), that.getGameName()) && Objects.equals(getGenreName(), that.getGenreName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGameName(), getGenreName(), getPrice());
    }

    @Override
    public String toString() {
        return "CollectionClass{" +
                "gameName='" + gameName + '\'' +
                ", genreName='" + genreName + '\'' +
                ", price=" + price +
                '}'+ "\n";
    }
}
