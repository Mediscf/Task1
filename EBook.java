class EBook extends Book{
    double FileSize;
    EBook(String Title, double Price,double FileSize){
       super(Title,Price);
       this.FileSize=FileSize;
    }
   void showInfo(){
       System.out.println("Book's title: " + Title);
       System.out.println("Book's price: " + Price);
       System.out.println("File size: " + FileSize + " MB");
   }

}

