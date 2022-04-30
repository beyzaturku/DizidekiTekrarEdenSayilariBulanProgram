
package dizidetekraredensayilaribulanprogram;

public class DizideTekrarEdenSayilariBulanProgram {

    
    public static void main(String[] args) {
        int[] dizi = {1,7,9,8,7,8,3,2,2};
        
        for(int i=0; i<dizi.length; i++)
        {
            for(int j=i; j<dizi.length; j++)
            {
                if(dizi[i]==dizi[j] && i!=j)
                {
                    if(dizi[i]%2==0)
                    {
                        System.out.println("Tekrar eden çift sayı:" + dizi[i]);
                    }
                }
            }
        }
    }
    
}
