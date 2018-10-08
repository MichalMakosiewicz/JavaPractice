public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(574839847);
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(433347834);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes>0){
            int megaBytes = kiloBytes/1024;
            int restKiloBytes = kiloBytes%(megaBytes*1024);
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB" + " and " + restKiloBytes + " KB");
        }else if(kiloBytes == 0){
            System.out.println("0 KB = 0 MB and 0 KB");
        }else{
            System.out.println("Invalid Value");
        }

    }
}
