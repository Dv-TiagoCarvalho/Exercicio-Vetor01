public class vetor01 {
    public static void main(String[] args) throws Exception {
        
        int[] vetor ={1,2,3,4,5,6,7,8,9,10};

        int soma=0;

      for (int i = 0; i < vetor.length; i++) {
        System.out.println(vetor[i]);

        
       soma+=vetor[i];
        
      }

       System.out.println("Soma: " + soma);


    }
}
