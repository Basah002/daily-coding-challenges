public class AsciiCode {


    public static void printAsciiCode(int s){
        int tmp=0;
        for(int i=32; i<127;i++){


            if(tmp==s){
                System.out.println();
                tmp=0;
            }
            tmp++;
            System.out.format("%3d" + " %3c ",i,i);
        }


    }
}
