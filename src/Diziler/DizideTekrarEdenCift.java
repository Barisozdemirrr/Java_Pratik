package Diziler;

public class DizideTekrarEdenCift {
    static boolean isFind(int[] arr,int value){//tekrar eden sayıları bulma metodu.
        for (int i : arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []list={1,2,55,2,99,-4,99,43,1,6,19,23,6,-4};//dizi oluşturuldu.
        int []duplicate= new int[list.length];//tekrar eden sayıları atacagımız dizi oluşturuldu.
        int startIndex=0;
        for (int i = 0;i< list.length;i++){
            for (int j =0;j< list.length;j++){
                if (i!=j &&(list[i]==list[j]) && list[i]%2==0){//tekrar eden çift sayıları bulacak koşul saglandı.
                    if (!isFind(duplicate,list[i])){
                        duplicate[startIndex++]=list[i];
                    }
                    break;
                }
            }
        }
        for (int value : duplicate){//duplicate dizisindeki 0 olmayan degerler ekrana yazıldı.
            if (value!=0){
                System.out.println(value);
            }
        }

    }
}
