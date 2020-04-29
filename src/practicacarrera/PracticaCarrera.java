
package practicacarrera;
public class PracticaCarrera extends Thread{

    //private String conejo, hipo, jaguar;
    Thread t;
    
    public PracticaCarrera() {
        
    }
    
    public static void main(String[] args) {
       PracticaCarrera ob = new PracticaCarrera();
       ob.start();
    }
    
    @Override
    public void run(){
        int conejo=0,hipo=0,puma=0;
        do{                        
           conejo=conejo+2;
           hipo=hipo+4;
           puma=puma+6;
            //System.out.println(conejo);
            //System.out.println(hipo);
            if(puma<100){
            System.out.println("Puma: "+puma);
            }else{
                System.out.println("Puma llegó");
            }
            if(hipo<100){
                    System.out.println("Hipo: "+hipo);
                }else{
                System.out.println("Hipo llegó");
            }
            if(conejo<100){
                System.out.println("Rabbit: "+conejo);
            }else{
                System.out.println("Conejo llegó");
            }
        }while(conejo<=100);
    }
    
}
