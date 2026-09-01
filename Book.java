class Book {
    String Title;
    double Price;
    Book(String  Title, double Price){
        this.Price=Price;
        this.Title=Title;
    }
    void showInfo(){
        System.out.println("Book's tittle"+ Title);
        System.out.println("Book's price"+ Price);
    }

}
