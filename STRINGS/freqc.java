public class freqc {
    public static void main(String[] args) {
        String name="oh kyon nhi jan ske kina pyar c nal udhe";
        char tar=' ';
        int freq=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==tar){
              freq++;
            }
        }
        System.out.println("Frequency of the target value "+freq);
    }
    
}