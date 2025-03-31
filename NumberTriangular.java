class NumberTriangular{

  public static void main(String[] args) {
      
   int n=5;
 int index=1;
 int len =n;
   for(int i =1; i<=n; i++){

       for(int j =1; j<=len;j++){
          
           System.out.print(" ");

       }
       len--;

       for(int k =1; k<=index; k++){

        System.out.print(index+" ");
    
       }
    index++;
      
       System.out.println();

   }



  }


}