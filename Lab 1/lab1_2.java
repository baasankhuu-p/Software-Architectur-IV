// !!!! Niit 4n davtalt ashglasan ygd 1 davtalt ashglaaguive gevel
    //input: {1,2,3,4,5} 
    //iim massiv bailaa gehed 
    
    //2t huvaagddag {0+1+0+1+0} 2
    //3t huvaagddag {0+0+1+0+0} 1
    //5t huvaagddag {0+0+0+0+1} 1
    
    //235t zereg huvaagdahgui {1+0+0+0+0} 1
    //output: 2+1+1+1
    //ehleed niit massivaas 2d huvaagdah massiv-g toolno. Duussanii daraa ene shig 3,5d huvaagdah index-uudiig neg burchlen toolno
    //4 deh davtalt ni ene 3ni toond zereg huvaagdahgui indexiig
public class Main
{
	public static boolean is235Array(int a[]) {
        int i,//davtaltiin huvisagch
        s = 0,
        view = 0;
        for(i = 0,view = 0;i<a.length;i++){
            if(a[i]%2==0){
                s++;
                view++;
            }
        }
            System.out.print(view);
        for(i = 0,view = 0;i<a.length;i++){
            if(a[i]%3==0){
                s++;
                view++;
            }
        }
            System.out.print("+"+view);
        for(i = 0,view = 0;i<a.length;i++){
            if(a[i]%5==0){
                s++;
                view++;
            }
        }
            System.out.print("+"+view);
        for(i = 0,view = 0;i<a.length;i++){
            if(a[i]%2!=0 && a[i]%3!=0 && a[i]%5!=0){
                s++;
                view++;
            }
        }
            System.out.print("+"+view+"=");
            System.out.println(s);
        
        System.out.print(s+"~"+a.length);
        if(s==a.length){
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
	    int[] a = {1,2,3,4,5};
	    System.out.print("\n"+is235Array(a));
	}
}
