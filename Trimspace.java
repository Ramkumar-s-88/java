package string;

public class Trimspace
{
    public static void main(String []args){
        String s="   hello  world  java    ";
        char a[]=s.toCharArray();
        int start=0,end=a.length,count;
        for(int i=0; i<a.length;i++){
            if(a[i]!=' '){
                start=i;
                break;
            }
        }
        for(int i=a.length;i<start-1;i--){
            if(a[i]!=' ')
            {
                end=i;
                break;
            }
        }
        count=end-start-1;
        String result= new String(a,start,count);
        System.out.println(result);

    }
}
